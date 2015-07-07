package list;

import line.IList;

import java.util.Scanner;

/**
 * Created by HanSon on 2015/6/29.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class LinkList implements IList {

    private Node head;                      //单链表的头指针

    public LinkList(){                      //单链表的构造函数
        head = new Node();                  //初始化头结点
    }

    public LinkList(int n, boolean Order) throws Exception{
        this();                             //初始化头结点
        if (Order)                          //用尾插法顺序建立单链表
            create1(n);
        else                                //用头插法逆位序建立单链表
            create2(n);
    }

    //用尾插法顺序建立单链表，其中 n 为单链表的结点个数
    public void create1(int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(length(), sc.next());
    }

    //用头插法逆位序建立单链表，其中 n 为单链表的结点个数
    public void create2(int n) throws Exception{
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(0, sc.next());
    }

    //将一个已经存在的带头结点单链表置成空表
    @Override
    public void clear() {
        head.setData(null);
        head.setNext(null);
    }

    //判断带头结点的单链表是否为空
    @Override
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    //求带头结点的单链表的长度
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

    //读取带头结点的单链表中的第 i 个结点
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

    //在带头结点的单链表中的第 i 个结点之前插入一个值为 x 的新结点
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

    //删除带头结点的单链表中的第 i 个结点
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

    //在带头结点的单链表中查找值为 x 的结点
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

    //输出单链表中的所有结点
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
