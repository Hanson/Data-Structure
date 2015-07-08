package Queue.QueueLine;

import Queue.IQueue;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class CircleSqQueue implements IQueue {

    private Object[] queueElem;
    private int front;
    private int rear;

    public CircleSqQueue(int maxSize){
        front = rear = 0;
        queueElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        front = rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public int length() {
        return (rear - front + queueElem.length) % queueElem.length;
    }

    @Override
    public Object peek() {
        if (front == rear)
            return null;
        else
            return queueElem[front];
    }

    @Override
    public void offer(Object x) throws Exception {
        if ((rear + 1) % queueElem.length == front)
            throw new Exception("队列已满");
        else {
            queueElem[rear] = x;
            rear = (rear + 1) % queueElem.length;
        }
    }

    @Override
    public Object poll() {
        if (front == rear)
            return null;
        else {
            Object t = queueElem[front];
            front = (front + 1) % queueElem.length;
            return t;
        }
    }

    public void display() {
        if (!isEmpty()){
            for (int i = front; i != rear; i = (i + 1) % queueElem.length)
                System.out.println(queueElem[i].toString() + " ");
        }else{
            System.out.println("此队列为空");
        }
    }
}
