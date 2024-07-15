import java.util.*;

public class Main{
    public static void main(String[] args){
        // TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");

        // ArrayList<String> pages = new ArrayList<>();
        // pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
        // Ebook book = new Ebook("Introduction to University Mathematics.", pages);

        // Printer printer = new Printer();
        // printer.print(message);
        // printer.print(book);

        // ReadingList jonisList = new ReadingList();
        // jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        // jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));

        // System.out.println("Joni's to-read: " + jonisList.toRead());

        ReadingList jonisList = new ReadingList();
        int i = 0;
        while (i < 1000) {
            jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
            i = i + 1;
        }

        for(i = 0; i < 1000; i++){
            jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        }

        System.out.println("Joni's to-read: " + jonisList.toRead());
        System.out.println("Delegating the reading to Verna");

        ReadingList vernasList = new ReadingList();
        vernasList.add(jonisList);
        vernasList.read();

        System.out.println();
        System.out.println("Joni's to-read: " + jonisList.toRead());
    }
}