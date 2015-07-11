package String;

/**
 * Created by HanSon on 2015/7/11.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public interface IString {
    public void clear();
    public boolean isEmpty();
    public int length();
    public char charAt(int index);
    public IString substring(int begin, int end);
    public IString insert(int offset, IString str);
    public IString delete(int begin, int end);
    public IString concat(IString str);
    public int compareTo(SeqString str);
    public int indexOf(IString str, int begin);
}
