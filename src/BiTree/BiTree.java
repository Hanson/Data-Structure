package BiTree;

/**
 * Created by HanSon on 2015/7/20.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class BiTree {
    private  BiTreeNode root;
    private static int index = 0;

    public BiTree(){
        this.root = null;
    }

    public BiTree(BiTreeNode root){
        this.root = root;
    }

    public BiTree(String preOrder, String inOrder, int preIndex, int inIndex, int count){

    }

    public BiTree(String preStr){

    }

    //先根遍历二叉树基本操作的非递归算法
    public void preRootTraverse(){

    }

    //先根遍历二叉树基本操作的递归算法
    public void preRootTraverse(BiTreeNode T){

    }

    //中根遍历二叉树基本操作的非递归算法
    public void inRootTraverse(){

    }

    //中根遍历二叉树基本操作的递归算法
    public void inRootTraverse(BiTreeNode T){

    }

    //后根遍历二叉树基本操作的非递归算法
    public void postRootTraverse(){

    }

    //后根遍历二叉树基本操作的递归算法
    public void postRootTraverse(BiTreeNode T){

    }

    //层次遍历二叉树基本操作的算法（自左向右）
    public void levelTraverse(){

    }

    public BiTreeNode getRoot() {
        return root;
    }

    public void setRoot(BiTreeNode root) {
        this.root = root;
    }
}
