/**
 * Created by anshul on 10/02/19.
 */
public class MessageSubscriberThree implements Observer {

    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberThree: " + m.getMessageContent());
    }
}
