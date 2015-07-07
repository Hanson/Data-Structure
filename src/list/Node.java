package list;

/**
 * Created by HanSon on 2015/6/29.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Node {

    private Object data;     //存放结点的值
    private Node next;       //后继结点的引用

    //无参数时的构造函数
    public Node(){
        this(null, null);
    }

    //带一个参数时的构造函数
    public Node(Object data){
        this(data, null);
    }

    //带两个参数时的构造函数
    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData(){
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
