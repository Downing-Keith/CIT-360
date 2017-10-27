package jsonexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 *
 * @author Keith Downing
 */
public class JSONExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = input.nextLine();

        // New JSON Object
        JSONObject root = new JSONObject();

        // Puts the name value pair
        root.put("name", name);

        JSONArray courses = new JSONArray();

        while (true) {
            // Get the Course Name
            System.out.println("Enter Course Name: ");
            String course = input.nextLine();

            // See if enter is pushed
            if (course.length() == 0) {
                break;
            }

            // Get the grade
            System.out.println("Enter the grade: ");
            int grade = input.nextInt();

            // Will cause to continue to loop until enter is hit
            if (input.hasNextLine()) {
                input.nextLine();
            }

            // Create a JSON object/array and store the class object
            JSONObject bookObject = new JSONObject();
            bookObject.put("grade", grade);
            bookObject.put("name", course);

            // Add the courses to array        
            courses.add(bookObject);
        }

        // Add the Array to the root object
        root.put("courses", courses);

        System.out.println(root.toJSONString());

        // Create External File to write JSON
        File file = new File("Grades.txt");
        //
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(root.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }

        System.out.println("Congratulations it is a success!!!!\n\n Hit Enter to continue");
        input.nextLine();

        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while (input.hasNextLine()) {
                jsonIn.append(input.nextLine());
            }
            System.out.println(jsonIn.toString());

            //Ensure that the correct one is used. I used the simple one
            JSONParser parser = new JSONParser();

            JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());

            System.out.printf("Student name is %s\n", objRoot.get("name").toString());

            JSONArray coursesIn = (JSONArray) objRoot.get("courses");

            for (int i = 0; i < coursesIn.size(); i++) {
                JSONObject courseIn = (JSONObject) coursesIn.get(i);
                long gradeIn = (long) courseIn.get("grade");
                String nameIn = (String) courseIn.get("name");

                System.out.printf("Course %s; grade %d\n", nameIn, gradeIn);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
    }
}
