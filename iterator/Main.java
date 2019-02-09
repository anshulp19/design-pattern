import java.util.*;

/**
 * Created by anshul on 10/02/19.
 */
public class Main {
    public static void main(String[] args) {
        Topic[] topics = new Topic[5];
        topics[0] = new Topic("topic 0");
        topics[1] = new Topic("topic 1");
        topics[2] = new Topic("topic 2");
        topics[3] = new Topic("topic 3");
        topics[4] = new Topic("topic 4");

        List<Topic> list = new TopicList(topics);
        Iterator<Topic> iter = list.iterator();

        while (iter.hasNext()) {
            Topic currentTopic = iter.next();
            System.out.println(currentTopic.getName());
        }
    }
}
