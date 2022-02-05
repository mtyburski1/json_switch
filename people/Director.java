package people;

import org.json.JSONObject;

public class Director {
    private String firstName;
    private String lastName;

    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Director(JSONObject director) {
        this.firstName = director.get("firstName").toString();
        this.lastName = director.get("lastName").toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }

}
