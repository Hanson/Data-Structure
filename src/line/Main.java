package line;

import java.util.Scanner;

/**
 * Created by HanSon on 2015/6/29.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class Main {

    public static void main1(String[] args) throws Exception{

        int n = 10;
        SqList l = new SqList(80);
        for (int i = 0; i < n; i++)
            l.insert(i, i);
        System.out.println("请输入i的值：");
        int i = new Scanner(System.in).nextInt();
        if (0 < i && i <= n)
            System.out.println("第" + i + "个元素的前驱是：" + l.get(i-1));
        else
            System.out.println("第" + i + "个元素的前驱不存在");
        System.exit(0);
        SqList L = new SqList(10);
        L.insert(0, 'a');
        L.insert(1, 'b');
        L.insert(2, 'c');
        L.insert(3, 'd');
        L.insert(4, 'e');
        L.insert(5, 'f');

        int order = L.indexOf('e');
        if (order != -1)
            System.out.println("第一次出现'e'的位置为："+ order);
        else
            System.out.println("没有'e'的元素");
    }
}
