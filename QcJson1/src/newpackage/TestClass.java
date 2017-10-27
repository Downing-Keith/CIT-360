package newpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import model.JavaBeanModel;
import qcJson.*;


/*
 *
 * @author Keith Downing
 */
public class TestClass {

    public static void main(String[] args) {

        JavaBeanModel author = new JavaBeanModel("Keith", "Downing", 37);
        File authorFile = new File("authorFile.json");

        try {

            String jsonString = JSONUtilities.stringify(author);
            System.out.printf("This is the conversion: %n");
            System.out.println(jsonString);

            FileOutputStream fileStream = new FileOutputStream(authorFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
            jsonOut.writeObject(author);
            jsonOut.close();
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileStream = new FileInputStream(authorFile);
            JSONInputStream jsonIn = new JSONInputStream(fileStream);

            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();

            JavaBeanModel testIn = new JavaBeanModel();
            testIn.setAuthorFirstName((String) jsonMap.get("authorFirstName"));
            testIn.setAuthorLastName((String) jsonMap.get("authorLastName"));
            long newAge = (long)jsonMap.get("newAge");
            testIn.setNewAge((int)newAge);

            String jsonString = JSONUtilities.stringify(testIn);
            System.out.printf("%n<--This is the JSON string in the authorFile:-->");
            System.out.printf("%n" + jsonString + "%n");
            System.out.printf("%n<--JSON string converted back to java from the employeeFile and values are added to EmployeeBean java object:-->");
            System.out.printf("%n" + testIn.getAuthorFirstName() + " " + testIn.getAuthorLastName() + " " + testIn.getNewAge() + " " + "%n");

        } catch (JSONException | IOException | ParseException e) {
            e.printStackTrace();
        }

    }

}
