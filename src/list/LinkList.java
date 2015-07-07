package list;

import line.IList;

import java.util.Scanner;

/**
 * Created by Administrator on 2015/6/29.
 */
public class LinkList implements IList {

    private Node head;

    public LinkList(){
        head = new Node();
    }

    public LinkList(int n, boolean Order) throws Exception{
        this();
        if (Order)
            create1(n);
        else
            create2(n);
    }

    public void create1(int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(length(), sc.next());
    }

    public void create2(int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(0, sc.next());
    }

    @Override
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }

    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    @Override
    public int length() {
        Node p = head.getNext();
        int length = 0;
        while (p != null){
            p = p.getNext();
            ++length;
        }
        return length;
    }

    @Override
    public Object get(int i) throws Exception {
        Node p =head.getNext();
        int j = 0;
        while (p != null && j < i){
            p = p.getNext();
            ++j;
        }
        if (j > i || p == null){
            throw new Exception("第" + i + "个元素不存在");
        }
        return p.getData();
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        Node p =head;
        int j = -1;
        while (p != null && j < i - 1){
            p = p.getNext();
            ++j;
        }
        if (j > i - 1 || p == null)
            throw new Exception("插入位置不合法");
        Node s = new Node(x);
        s.setNext(p.getNext());
        p.setNext(s);
    }

    @Override
    public void remove(int i) throws Exception {
        Node p = head;
        int j = -1;
        while (p.getNext() != null && j < i - 1){
            p = p.getNext();
            ++j;
        }
        if (j > i - 1 || p.getNext() == null)
            throw new Exception("删除位置不合理");
        p.setNext(p.getNext().getNext());
    }

    @Override
    public int indexOf(Object x) {
        Node p =head.getNext();
        int j = 0;
        while (p != null && !p.getData().equals(x)){
            p = p.getNext();
            ++j;
        }
        if (p != null)
            return j;
        else
            return -1;
    }

    @Override
    public void display() {
        Node node = head.getNext();
        while (node != null){
            System.out.print(node.getData() + "");
            node = node.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }
}
