package Queue.QueueList;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {
    public static void main(String[] args) throws Exception{
        LinkQueue lq = new LinkQueue();
        lq.offer(3);
        lq.offer(4);
        lq.poll();
        System.out.println(lq.peek());
        System.out.println(lq.length());
    }
}
