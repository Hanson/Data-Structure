package line;

/**
 * Created by HanSon on 2015/6/29.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public interface IList {
    public void clear();
    public boolean isEmpty();
    public int length();
    public Object get(int i) throws Exception;
    public void insert(int i, Object x) throws Exception;
    public void remove(int i) throws Exception;
    public int indexOf(Object x);
    public void display();
}
