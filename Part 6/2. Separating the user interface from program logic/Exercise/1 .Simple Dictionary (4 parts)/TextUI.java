import java.util.*;

public class TextUI{
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict){
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            if(input.equals("add")){
                System.out.print("Word: ");
                String word = this.scanner.nextLine();

                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();

                this.dict.add(word,translation);
                continue;
            }

            if(input.equals("search")){
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                String translation = "";
                String returned = this.dict.translate(word);

                if(returned == null){
                    translation = "Word " + word + " was not found";
                }else{
                    translation = returned;
                }

                System.out.println("Tranlsation: " + translation);
                continue;
            }

            System.out.println("Unknown command");
        }

        System.out.println("Bye bye!");
    }
}