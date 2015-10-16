package BiTree;

import Queue.QueueList.LinkQueue;
import Stack.StackList.LinkStack;

/**
 * Created by HanSon on 2015/7/20.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class BiTree {
    public BiTreeNode root;
    private static int index = 0;

    public BiTree(){
        this.root = null;
    }

    public BiTree(BiTreeNode root){
        this.root = root;
    }

    //先根遍历&中根遍历确定树
    public BiTree(String preOrder, String inOrder, int preIndex, int inIndex, int count){
        if (count > 0){
            char r = preOrder.charAt(preIndex);
            int i = 0;
            for (;i < count;i++)
                if (r == inOrder.charAt(i + inIndex))
                    break;
            root = new BiTreeNode(r);
            root.setLchild(new BiTree(preOrder, inOrder, preIndex + 1, inIndex, i).root);
            root.setRchild(new BiTree(preOrder, inOrder, preIndex + i + 1, inIndex + i + 1, count - i - 1).root);
        }
    }

    //由标明空子树的先根遍历建立一棵二叉树，并返回根节点
    public BiTree(String preStr){
        char c = preStr.charAt(index++);
        if (c != '#'){
            root = new BiTreeNode(c);
            root.setLchild(new BiTree(preStr).root);
            root.setRchild(new BiTree(preStr).root);
        }else
            root = null;
    }

    //先根遍历二叉树基本操作的非递归算法
    public void preRootTraverse() throws Exception {
        BiTreeNode T = root;
        if(T!=null){
            LinkStack S = new LinkStack();
            S.push(T);
            while (!S.isEmpty()){
                T = (BiTreeNode) S.pop();
                System.out.print(T.getData());
                while (T != null){
                    if (T.getLchild()!=null)
                        System.out.print(T.getLchild().getData());
                    if (T.getRchild()!=null)
                        S.push(T.getRchild());
                    T = T.getLchild();
                }
            }

        }
    }

    //先根遍历二叉树基本操作的递归算法
    public void preRootTraverse(BiTreeNode T){
        if (T != null){
            System.out.print(T.getData());
            preRootTraverse(T.getLchild());
            preRootTraverse(T.getRchild());
        }
    }

    //中根遍历二叉树基本操作的非递归算法
    public void inRootTraverse() throws Exception {
        BiTreeNode T = root;
        if(T != null){
            LinkStack S = new LinkStack();
            S.push(T);
            while (!S.isEmpty()){
                while (S.peek()!=null)
                    S.push(((BiTreeNode) S.peek()).getLchild());
                S.pop();
                if (!S.isEmpty()){
                    T = (BiTreeNode) S.pop();
                    System.out.print(T.getData());
                    S.push(T.getRchild());
                }
            }
        }
    }

    //中根遍历二叉树基本操作的递归算法
    public void inRootTraverse(BiTreeNode T){
        if(T != null){
            inRootTraverse(T.getLchild());
            System.out.print(T.getData());
            inRootTraverse(T.getRchild());
        }
    }

    //后根遍历二叉树基本操作的非递归算法
    public void postRootTraverse() throws Exception {
        BiTreeNode T = root;
        if(T != null){
            LinkStack S = new LinkStack();
            S.push(T);
            Boolean flag;
            BiTreeNode p = null;
            while (!S.isEmpty()){
                while (S.peek() != null)
                    S.push(((BiTreeNode) S.peek()).getLchild());
                S.pop();
                while (!S.isEmpty()){
                    T = (BiTreeNode) S.peek();
                    if (T.getRchild() == null || T.getRchild() == p){
                        System.out.print(T.getData());
                        S.pop();
                        p = T;
                        flag = true;
                    }else{
                        S.push(T.getRchild());
                        flag = false;
                    }
                    if (!flag)
                        break;
                }
            }
        }
    }

    //后根遍历二叉树基本操作的递归算法
    public void postRootTraverse(BiTreeNode T){
        if(T!= null){
            postRootTraverse(T.getLchild());
            postRootTraverse(T.getRchild());
            System.out.print(T.getData());
        }
    }

    //层次遍历二叉树基本操作的算法（自左向右）
    public void levelTraverse() throws Exception {
        BiTreeNode T = root;
        if (T != null){
            LinkQueue L = new LinkQueue();
            L.offer(T);
            while (!L.isEmpty()){
                T = (BiTreeNode) L.poll();
                System.out.print(T.getData());
                if (T.getLchild() != null)
                    L.offer(T.getLchild());
                if(T.getRchild() != null)
                    L.offer(T.getRchild());
            }
        }
    }

    public BiTreeNode getRoot() {
        return root;
    }

    public void setRoot(BiTreeNode root) {
        this.root = root;
    }
}
