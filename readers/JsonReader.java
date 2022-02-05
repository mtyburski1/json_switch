package readers;

import library.MovieLibrary;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonReader {
    public static MovieLibrary readJson(String jsonPath) throws IOException {
        File file = new File(jsonPath);
        String json = Files.readString(Path.of(file.toString()));
        JSONObject moviesL = new JSONObject(json);
        JSONArray moviesA = new JSONArray(moviesL.getJSONArray("movies"));
        return new MovieLibrary(moviesA);
    }
}
