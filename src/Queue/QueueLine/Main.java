package Queue.QueueLine;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {
    public static void main(String[] args) throws Exception{
        CircleSqQueue csq = new CircleSqQueue(6);
        csq.offer(1);
        csq.offer(2);
        csq.offer(3);
        csq.offer(4);
        csq.offer(5);
        csq.display();
        csq.poll();
        csq.poll();
        csq.display();
        csq.clear();
        csq.display();
    }
}
