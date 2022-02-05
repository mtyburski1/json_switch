package readers;

import library.MovieLibrary;
import java.util.Scanner;

public class UserReader {
     private Scanner sc = new Scanner(System.in);
     private String readFromKeyboard = "";

    public void enterADateRange(MovieLibrary moviesPath) {
        System.out.println("Podaj początkowy zakres daty:");
        int from = sc.nextInt();
        System.out.println("Podaj końcowy zakres daty: ");
        int to = sc.nextInt();
        sc.nextLine();
        System.out.println(moviesPath.getMoviesByDate(from, to));
    }
    public void enterTheActorsName(MovieLibrary moviesPath) {
        System.out.println("Podaj imię aktora");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko aktora");
        String lastName = sc.nextLine();
        System.out.println(moviesPath.getMoviesByFirstAndLastName(firstName, lastName));
    }

    public String getReadFromKeyboard() {
        return readFromKeyboard = sc.nextLine();
    }
}
