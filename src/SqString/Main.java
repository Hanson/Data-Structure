package SqString;

/**
 * Created by HanSon on 2015/7/11.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {
    public static void main(String[] args) {
        SeqString s = new SeqString("abcdefghijkee");
        SeqString s1 = new SeqString("abcdefghijk");
        s.display();
        System.out.println();
        System.out.println(s.compareTo(s1));
        s.insert(3, s1);
        s.display();
    }
}
