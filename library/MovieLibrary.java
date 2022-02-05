package library;

import people.Actor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
        private List<Movie> movies;

        public MovieLibrary(JSONArray movieArray) {
            movies = new ArrayList<>();
            for (Object movie : movieArray) {
                JSONObject movieObjectJSON = new JSONObject(movie.toString());
                movies.add(new Movie(movieObjectJSON));
            }
        }

        public List<Movie> getMoviesByFirstAndLastName(String firstName, String lastName){
            List<Movie> moviesWithAnames = new ArrayList<>();
            for (Movie movie: movies) {
                for(Actor actor: movie.getActors()){
                    if(firstName.equals(actor.getFirstName()) && lastName.equals(actor.getLastName()))
                        moviesWithAnames.add(movie);
                }
            }
            return moviesWithAnames;
        }

        public List<Movie> getMoviesByDate(int from, int to){
            List<Movie> moviesByDate= new ArrayList<>();
            for (Movie movie: movies) {
                if(from <= movie.getDate() && movie.getDate() <= to){
                    moviesByDate.add(movie);
                }
            }
            return moviesByDate;
        }
    public Movie movieLottery(){
        Random random = new Random();
        return movies.get(random.nextInt(movies.size()));
    }
    }