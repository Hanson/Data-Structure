package DuList;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/30.
 */
public class DuLinkList {

    private DuLNode head;

    public DuLinkList(){
        head = new DuLNode();
        head.setPrior(head);
        head.setNext(head);
    }

    public DuLinkList(int n) throws Exception{
        this();
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(0, sc.next());
    }

    public void insert(int i, Object x) throws Exception{
        DuLNode p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.getNext();
            ++j;
        }
        if (j != i && p.equals(head))
            throw new Exception("插入的位置不合法");
        DuLNode s = new DuLNode(x);
        p.getPrior().setNext(s);
        s.setPrior(p.getPrior());
        s.setNext(p);
        p.setPrior(s);
    }

    public void remove(int i) throws Exception{
        DuLNode p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.getNext();
            ++j;
        }
        if (j != i)
            throw new Exception("删除位置不合理");
        p.getPrior().setNext(p.getNext());
        p.getNext().setPrior(p.getPrior());
    }
}
