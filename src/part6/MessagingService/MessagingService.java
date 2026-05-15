package part6.MessagingService;

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messages = new ArrayList<>();

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        messages.add(message);
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
