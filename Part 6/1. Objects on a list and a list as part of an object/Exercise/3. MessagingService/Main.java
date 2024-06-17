import java.util.*;

public class Main{
    public static void main(String[] args){
        MessagingService whatsapp = new MessagingService();
        whatsapp.add(new Message("Isaac","eh what time R"));
        whatsapp.add(new Message("Jeff","8.30++"));
        System.out.println(whatsapp.getMessages());
    }
}