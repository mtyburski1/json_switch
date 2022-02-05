import library.MovieLibrary;
import readers.JsonReader;
import readers.UserReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException {
        MovieLibrary readJsonPath = JsonReader.readJson("movies.json");
        UserReader userReader = new UserReader();
        while (true) {
            System.out.println("1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami" +
                    "\n" + "2. Wyświetl wszystkie informacje o losowym filmie" +
                    "\n" + "3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał" +
                    "\n" + "4. Wyjście z programu.");
            switch (userReader.getReadFromKeyboard()) {
                case "1":
                    userReader.enterADateRange(readJsonPath);
                    break;
                case "2":
                    System.out.println(readJsonPath.movieLottery());
                    break;
                case "3":
                    userReader.enterTheActorsName(readJsonPath);
                    break;
                case "4":
                    System.out.println("Wychodzenie z programu....");
                    return;
                default:
                    System.out.println("Podano złą wartość.");
                    break;
            }
        }
    }
}


