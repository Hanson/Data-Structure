package line;

/**
 * Created by Administrator on 2015/6/29.
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
