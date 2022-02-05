package library;

import people.Actor;
import people.Director;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private String genre;
    private int date;
    private List<Actor> actors;

    public Movie(JSONObject movieObjectJSON) {
        this.title = movieObjectJSON.get("title").toString();
        this.director = new Director(new JSONObject(movieObjectJSON.get("director").toString()));
        this.genre = movieObjectJSON.get("genre").toString();
        this.date = Integer.parseInt(movieObjectJSON.get("date").toString());
        JSONArray actorsJSON = new JSONArray(movieObjectJSON.get("actors").toString());
        actors = new ArrayList<>();
        for (Object actorJSON : actorsJSON) {
            JSONObject pActorJSON = new JSONObject(actorJSON.toString());
            actors.add(new Actor(pActorJSON));
        }
    }

    public int getDate() {
        return date;
    }

    public List<Actor> getActors() {
        return actors;
    }


    @Override
    public String toString() {
        String allInfo = "Title: " + title + '\n' +
                "Director: " + director + '\n' +
                "Genre: " + genre + '\n' +
                "Date: " + date + '\n' +
                "Actors: " + actors;
        allInfo = allInfo.replaceAll("[\\[\\](){}]","");
        return allInfo;
    }
}
