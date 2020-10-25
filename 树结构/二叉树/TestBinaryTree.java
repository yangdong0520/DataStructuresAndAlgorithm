/**
 * @Author 杨栋
 * @Date 2020/10/24 18:04
 */

// 测试二叉树类
public class TestBinaryTree {
    public static void main(String[] args) {
        // 创建一颗树
        BinaryTree binaryTree = new BinaryTree();
        // 创建一个根节点
        treeNode root = new treeNode(1);
        // 把根节点赋给树
        binaryTree.setRoot(root);
        // 为根节点创建左节点
        treeNode rootL = new treeNode(2);
        root.setlNode(rootL);
        // 为根节点创建右节点
        treeNode rootR = new treeNode(3);
        root.setrNode(rootR);
        
        // 为第二层左节点创建两个节点
        rootL.setlNode(new treeNode(4));
        rootL.setrNode(new treeNode(5));
        
        // 为第二层的右节点创建两个节点
        rootR.setlNode(new treeNode(6));
        rootR.setrNode(new treeNode(7));
        
        // 前序遍历
        binaryTree.frontShow();
        System.out.println("");
        // 中序遍历
        binaryTree.minShow();
        System.out.println("");
        // 后序遍历
        
        binaryTree.afterShow();
        System.out.println("");
        // 查找某一节点的值
        treeNode result = binaryTree.frontSearch(3);
        System.out.println(result);
        
        // 删除二叉树的节点
        binaryTree.delete(7);
        binaryTree.frontShow();
       
    }
}
