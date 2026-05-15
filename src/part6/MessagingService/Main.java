package part6.MessagingService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MessagingService bbm = new MessagingService();

        bbm.add(new Message("Lil Jimmy", "What's up bro?"));
        bbm.add(new Message("Hector", "Where going nuclear!"));

        System.out.println(bbm.getMessages());
    }
}
