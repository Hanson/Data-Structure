package Queue.QueuePriority;

import Queue.IQueue;
import list.Node;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class PriorityQueue implements IQueue {

    private Node front;
    private Node rear;

    public PriorityQueue(){
        front = rear = null;
    }

    @Override
    public void clear() {
        front = rear = null;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public int length() {
        Node p = front;
        int length = 0;
        while (p != null){
            p = p.getNext();
            ++length;
        }
        return length;
    }

    @Override
    public Object peek() {
        if (front == null)
            return null;
        else
            return front.getData();
    }

    @Override
    public void offer(Object x) throws Exception {
        PriorityQData pn = (PriorityQData) x;
        Node s = new Node(pn);
        if (front == null)
            front = rear = s;
        else {
            Node p = front, q = front;
            while (p != null && pn.getPriority() >= ((PriorityQData)p.getData()).getPriority()){
                q = p;
                p = p.getNext();
            }
            if (p == null){
                rear.setNext(s);
                rear = s;
            }else if (p == front){
                s.setNext(front);
                front = s;
            }else {
                q.setNext(s);
                s.setNext(p);
            }
        }
    }

    @Override
    public Object poll() {
        if (front == null)
            return null;
        else
            return front.getData();
    }

    public void display(){
        if (!isEmpty()){
            Node p = front;
            while (p != rear.getNext()){
                PriorityQData q = (PriorityQData) p.getData();
                System.out.println(q.getElem() + " " + q.getPriority());
                p = p.getNext();
            }
        }else {
            System.out.println("此队列为空");
        }
    }
}
