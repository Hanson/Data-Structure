package Queue;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public interface IQueue {
    public void clear();
    public boolean isEmpty();
    public int length();
    public Object peek();
    public void offer(Object x) throws Exception;
    public Object poll();
}
