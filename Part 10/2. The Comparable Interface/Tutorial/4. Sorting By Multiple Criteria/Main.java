import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        for (Film e: films) {
            System.out.println(e);
        }

        Comparator<Film> comparator = Comparator
                    .comparing(Film::getReleaseYear)
                    .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        for (Film e: films) {
            System.out.println(e);
        }
    }
}
