package Queue.QueueList;

import Queue.IQueue;
import list.Node;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class LinkQueue implements IQueue {

    private Node front;
    private Node rear;

    public LinkQueue(){
        front = rear = null;
    }

    @Override
    public void clear() {
        front = rear = null;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int length() {
        int length = 0;
        if (!isEmpty()){
            Node p = front;
            while (p != null){
                p = p.getNext();
                ++length;
            }
        }
        return length;
    }

    @Override
    public Object peek() {
        if (front != null)
            return front.getData();
        else
            return null;
    }

    @Override
    public void offer(Object x) throws Exception {
        Node p = new Node(x);
        if (front != null){
            rear.setNext(p);
            rear = p;
        }else
            front = rear = p;
    }

    @Override
    public Object poll() {
        if (front != null){
            Node  p = front;
            front = front.getNext();
            if (p == rear)
                rear = null;
            return p.getData();
        }else
            return null;
    }

}
