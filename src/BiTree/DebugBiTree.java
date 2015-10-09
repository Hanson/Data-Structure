package BiTree;

/**
 * Created by HanSon on 2015/7/20.
 * GitHub: http://github.com/hanccc
 * Blog: http://hanc.cc
 * Resume: http://hanccc.github.io
 */
public class DebugBiTree {

    //创建二叉树
    public BiTree createBiTree(){
        BiTreeNode d = new BiTreeNode('D');
        BiTreeNode g = new BiTreeNode('G');
        BiTreeNode h = new BiTreeNode('H');
        BiTreeNode e = new BiTreeNode('E', g, null);
        BiTreeNode b = new BiTreeNode('B', d, e);
        BiTreeNode f = new BiTreeNode('F', null, h);
        BiTreeNode c = new BiTreeNode('C', f, null);
        BiTreeNode a = new BiTreeNode('A', b, c);
        return new BiTree(a);
    }

    public static void main(String[] args) throws Exception {
        DebugBiTree debugBiTree = new DebugBiTree();
        BiTree biTree = debugBiTree.createBiTree();
        BiTreeNode root = biTree.root;

        System.out.print("递归先根遍历序列为：");
        biTree.preRootTraverse(root);
        System.out.println();
        System.out.print("非递归先根遍历序列为：");
        biTree.preRootTraverse();
        System.out.println();

        System.out.print("递归中根遍历序列为：");
        biTree.inRootTraverse(root);
        System.out.println();
        System.out.print("非递归中根遍历序列为：");
        biTree.inRootTraverse();
        System.out.println();

        System.out.print("递归后根遍历序列为：");
        biTree.postRootTraverse(root);
        System.out.println();
        System.out.print("非递归后根遍历序列为：");
        biTree.postRootTraverse();
        System.out.println();

        //先根遍历查找G
        BiTreeNode result = searchNode(root, 'G');
        System.out.println(result.getData());

        //计算二叉树中结点个数
        System.out.println(countNode(root));

    }

    //二叉树先根遍历查找
    public static BiTreeNode searchNode(BiTreeNode T, Object x){
        if (T != null){
            if (T.getData().equals(x))
                return T;
            else{
                BiTreeNode lresult = searchNode(T.getLchild(), x);
                return  lresult != null?lresult:searchNode(T.getRchild(), x);
            }
        }
        return null;
    }

    //计算二叉树中结点个数
    public static int countNode(BiTreeNode T){
        int count = 0;
        if (T != null){
            ++count;
            count += countNode(T.getLchild());
            count += countNode(T.getRchild());
        }
        return count;
    }



}
