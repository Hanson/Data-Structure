package BiTree;

/**
 * Created by HanSon on 2015/7/20.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class BiTreeNode {
    private Object data;
    private BiTreeNode lchild, rchild;

    public BiTreeNode() {
        this(null);
    }

    public BiTreeNode(Object data) {
        this(data, null, null);
    }

    public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public Object getData() {
        return data;
    }

    public BiTreeNode getLchild() {
        return lchild;
    }

    public BiTreeNode getRchild() {
        return rchild;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setLchild(BiTreeNode lchild) {
        this.lchild = lchild;
    }

    public void setRchild(BiTreeNode rchild) {
        this.rchild = rchild;
    }
}