package Stack.StackList;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {
    public static void main(String[] args) throws Exception {
        LinkStack linkStack = new LinkStack();
        linkStack.push(5);
        linkStack.push(3);
        linkStack.display();
        System.out.println(linkStack.peek());
        linkStack.pop();
        linkStack.display();
    }
}
