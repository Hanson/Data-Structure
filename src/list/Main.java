package list;

/**
 * Created by Administrator on 2015/6/29.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("请输入单链表中的10个结点值");
        LinkList l = new LinkList(10, true);
        System.out.println("删除重复结点前单链表中的各个结点值为：");
        l.display();
        removeRepeatElem(l);
        System.out.println("删除重复结点后单链表中的各个结点值为：");
        l.display();
    }

    public static void removeRepeatElem(LinkList l) throws Exception{
        Node p = l.getHead().getNext(), q;
        while (p != null){
            int order = l.indexOf(p.getData());
            q = p.getNext();
            while (q != null){
                if (p.getData().equals(q.getData()))
                    l.remove(order + 1);
                else
                    ++order;
                q = q.getNext();
            }
            p = p.getNext();
        }
    }
}
