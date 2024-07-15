import java.util.*;

public class Main{
    public static void main(String[] args){
        TextMessage message = new TextMessage("ope", "Something cool's about to happen");
        Readable readable = new TextMessage("ope", "The text message is Readable!");

        ArrayList<Readable> readingList = new ArrayList<>();

        readingList.add(new TextMessage("ope", "never been programming before..."));
        readingList.add(new TextMessage("ope", "gonna love it i think!"));
        readingList.add(new TextMessage("ope", "give me something more challenging! :)"));
        readingList.add(new TextMessage("ope", "you think i can do it?"));
        readingList.add(new TextMessage("ope", "up here we send several messages each day"));


        ArrayList<String> pages = new ArrayList<>();
        pages.add("A method can call itself.");

        readingList.add(new Ebook("Introduction to Recursion.", pages));

        for (Readable r: readingList) {
            System.out.println(r.read());
        }

        Readable readables = new TextMessage("ope", "TextMessage is Readable!"); // works
        //TextMessage messages = readable; // doesn't work

        TextMessage castMessage = (TextMessage) readables; // works if, and only if, readable is of text message type
    }
}