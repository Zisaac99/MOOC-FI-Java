import java.util.*;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<String>();
    }

    public void start() {
        while(true){
            System.out.print("Enter a word: ");
            String word = this.scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }
            
            this.words.add(word);
        }

        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
        return this.words.contains(word);
    }
}