package Queue.QueuePriority;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(new PriorityQData(1, 20));
        pq.offer(new PriorityQData(2, 30));
        pq.offer(new PriorityQData(3, 20));
        pq.display();
    }
}
