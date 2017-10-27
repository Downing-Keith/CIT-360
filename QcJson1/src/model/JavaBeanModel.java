package model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

/*
 *
 * @author Keith Downing
 */
public class JavaBeanModel implements Serializable {

    private String authorFirstName;
    private String authorLastName;
    private int newAge;

    public JavaBeanModel() {
        super();
    }

    public JavaBeanModel(String authorFirstName, String authorLastName, int age) {
        super();
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.newAge = age;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public int getNewAge() {
        return newAge;
    }

    public void setNewAge(int age) {
        this.newAge = age;
    }
}
