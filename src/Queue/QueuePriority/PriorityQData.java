package Queue.QueuePriority;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class PriorityQData {

    private Object elem;
    private int priority;

    public PriorityQData(Object elem, int priority){
        this.elem = elem;
        this.priority = priority;
    }

    public Object getElem() {
        return elem;
    }

    public int getPriority() {
        return priority;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
