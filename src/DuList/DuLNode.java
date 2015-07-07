package DuList;

/**
 * Created by Administrator on 2015/6/30.
 */
public class DuLNode {

    private Object data;
    private DuLNode prior;
    private DuLNode next;

    public DuLNode(){
        this(null);
    }

    public DuLNode(Object data){
        this.data = data;
        this.prior = null;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public DuLNode getNext() {
        return next;
    }

    public DuLNode getPrior() {
        return prior;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(DuLNode next) {
        this.next = next;
    }

    public void setPrior(DuLNode prior) {
        this.prior = prior;
    }
}
