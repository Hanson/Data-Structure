package Stack.StackList;

import Stack.IStack;
import list.Node;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class LinkStack implements IStack{

    private Node top;
    @Override
    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int length() {
        Node p = top;
        int length = 0;
        while (p != null){
            p = p.getNext();
            ++length;
        }
        return length;
    }

    @Override
    public Object peek() {
        if (!isEmpty())
            return top.getData();
        else
            return null;
    }

    @Override
    public void push(Object x) throws Exception {
        Node p = new Node(x);
        p.setNext(top);
        top = p;
    }

    @Override
    public Object pop() {
        if (isEmpty())
            return null;
        else{
            Node p = top;
            top = top.getNext();
            return p.getData();
        }
    }

    public void display(){
        Node p = top;
        while (p != null){
            System.out.println(p.getData().toString() + " ");
            p = p.getNext();
        }
    }
}
