/**
 * Created by anshul on 10/02/19.
 */
public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
