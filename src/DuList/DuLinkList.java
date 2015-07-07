package DuList;

import list.Node;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/30.
 */
public class DuLinkList {

    private DuLNode head;

    //双向循环链表的构造函数
    public DuLinkList(){
        head = new DuLNode();
        head.setPrior(head);
        head.setNext(head);
    }

    //从表尾到表头逆向创建双向循环链表的算法，其中 n 为该双向循环链表的结点个数
    public DuLinkList(int n) throws Exception{
        this();
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(0, sc.next());
    }

    //在带头结点的双向循环链表中的插入操作
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

    //将带头结点的双向循环链表中的删除操作
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

    public void clear(){
        head.setPrior(head);
        head.setNext(head);
    }

    public boolean isEmpty(){
        return head.getNext() == head || head.getPrior() == head;
    }

    public Object get(int i) throws Exception{
        DuLNode p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i){
            p = p.getNext();
            ++j;
        }
        if (j > i || p.equals(head))
            throw new Exception("第" + i + "个元素不存在");
        return p.getData();
    }

    public int length(){
        DuLNode p = head.getNext();
        int length = 0;
        while (p != head){
            p = p.getNext();
            ++length;
        }
        return length;
    }

    public int indexOf(Object x){
        DuLNode p =head.getNext();
        int j = 0;
        while (p != head && !p.getData().equals(x)){
            p = p.getNext();
            ++j;
        }
        if (p != head)
            return j;
        else
            return -1;
    }

    public void display(){
        DuLNode node = head.getNext();
        while (!node.equals(head)){
            System.out.println(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    public DuLNode getHead() {
        return head;
    }

    public void setHead(DuLNode head) {
        this.head = head;
    }
}
