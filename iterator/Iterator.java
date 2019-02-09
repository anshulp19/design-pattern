/**
 * Created by anshul on 10/02/19.
 */
public interface Iterator<E> {
    void reset();
    E next();
    E currentItem();

    boolean hasNext();
}
