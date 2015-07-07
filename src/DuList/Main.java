package DuList;

/**
 * Created by HanSon on 2015/7/7.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {

    public static void main(String[] args) throws Exception{
        DuLinkList duLinkList = new DuLinkList(10);
        duLinkList.display();
        duLinkList.insert(5, "x");
        duLinkList.display();
        duLinkList.remove(2);
        duLinkList.display();
    }
}
