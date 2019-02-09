/**
 * Created by anshul on 10/02/19.
 */
public class MessageSubscriberOne implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne: " + m.getMessageContent());
    }
}
