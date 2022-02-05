package people;

import org.json.JSONObject;

public class Actor  {
    private String firstName;
    private String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(JSONObject actor) {
        this.firstName = actor.get("firstName").toString();
        this.lastName = actor.get("lastName").toString();
    }
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
