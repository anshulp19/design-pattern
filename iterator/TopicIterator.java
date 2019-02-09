/**
 * Created by anshul on 10/02/19.
 */
public class TopicIterator implements Iterator<Topic> {
    private Topic[] topics;
    private int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        this.position = 0;
    }

    @Override
    public void reset() {
        this.position = 0;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }

    @Override
    public boolean hasNext() {
        if (position >= topics.length)
            return false;
        return true;
    }
}
