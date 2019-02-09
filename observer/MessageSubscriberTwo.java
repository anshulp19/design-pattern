/**
 * Created by anshul on 10/02/19.
 */
public class MessageSubscriberTwo implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberTwo: " + m.getMessageContent());
    }
}
