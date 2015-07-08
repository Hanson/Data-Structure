package Stack.StackLine;

import Stack.IStack;

/**
 * Created by HanSon on 2015/7/8.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class SqStack implements IStack {

    private Object[] stackElem;                     //对象数组
    private int top;                                //在非空栈中，top 始终指向栈顶元素的下一个存储位置；当栈为空时，top 值为 0

    //栈的构造函数，构造一个存储空间容量为 maxSize 的空栈
    public SqStack(int maxSize){
        top = 0;
        stackElem = new Object[maxSize];
    }

    //置空栈
    @Override
    public void clear() {
        top = 0;
    }

    //判断栈是否为空
    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public Object peek() {
        if (!isEmpty())
            return stackElem[top - 1];
        else
            return null;
    }

    @Override
    public void push(Object x) throws Exception {
        if (top == stackElem.length)
            throw new Exception("栈已满");
        else stackElem[top++] = x;
    }

    @Override
    public Object pop() {
        if (isEmpty())
            return null;
        else
            return stackElem[--top];
    }

    public void display(){
        for (int i = top - 1; i >= 0; i --){
            System.out.println(stackElem[i].toString() + " ");
        }
    }
}
