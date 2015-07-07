package line;

/**
 * Created by HanSon on 2015/6/29.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class SqList implements IList {

    private Object[] listElem;
    private int curLen;

    //順序表类的构造函数，构造一个存储空间容量为 maxSize 的线性表
    public SqList(int maxSizze){
        curLen = 0;
        listElem = new Object[maxSizze];
    }

    //将一个已经存在的线性表置成空表
    @Override
    public void clear() {
        curLen = 0;
    }

    //判断线性表中的数据元素的个数是否为 0 ，若为 0 则返回 true; 否则返回 false
    @Override
    public boolean isEmpty() {
        return curLen == 0;
    }

    //求线性表中的数据元素的个数并返回其值
    @Override
    public int length() {
        return curLen;
    }

    //读取到线性表中的第 i 个数据元素并由函数返回其值， 其中 i 的取值范围为 0<= i <= length() - 1, 若 i 值不在此范围则抛出异常
    @Override
    public Object get(int i) throws Exception{
        if(i<0 || i>curLen-1)
            throw new Exception("第"+i+"个元素不存在");
        return listElem[i];
    }

    //在线性表的第 i 个数据元素执勤啊插入一个值为 x 的数据元素
    @Override
    public void insert(int i, Object x) throws Exception{
        if(curLen == listElem.length)                 //判断顺序表是否已满
            throw new Exception("顺序表已满");        //抛出异常
        if(i < 0 || i > curLen)    //i不合法
            throw new Exception("插入位置不合法");    //抛出异常
        for (int j = curLen; j > i; j--)
            listElem[j] = listElem[j-1];              //插入位置及其之后的所有数据元素后移一位
        listElem[i] = x;                              //插入 x
        curLen++;                                     //表长+1
    }

    //删除并返回线性表中第 i 个数据元素
    @Override
    public void remove(int i) throws Exception{
        if(i < 0 || i > curLen-1)
            throw new Exception("删除位置不合法");
        for (int j = i; j < curLen - 1; j++)
            listElem[j] = listElem[j+1];
        curLen--;
    }

    //返回线性表中首次出现指定的数据元素的位序号，若线性表中不包含此数据元素，则返回 -1
    @Override
    public int indexOf(Object x) {
        int j = 0;
        while (j < curLen && !listElem[j].equals(x))
            j++;
        if (j < curLen)
            return j;
        else return -1;
    }

    //输出线性表中的数据元素
    @Override
    public void display() {
        for(int j = 0;j<curLen;j++)
            System.out.println(listElem[j]+"");
        System.out.println();
    }
}
