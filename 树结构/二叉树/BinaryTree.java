/**
 * @Author 杨栋
 * @Date 2020/10/24 18:04
 */

public class BinaryTree {
    
    treeNode root;

    public void setRoot(treeNode root) {
        this.root = root;
    }

    public treeNode getRoot() {
        return root;
    }

    public void frontShow() {
        root.frontShow();
    }

    public void minShow() {
        root.minShow();
    }

    public void afterShow() {
        root.afterShow();
    }

    public treeNode frontSearch(int i) {
        return root.frontSearch( i);
    }

    public treeNode delete(int i) {
        if(root.value == i){
            root = null ;
        }else {
            return root.delete(i); 
        }
        return null;
    }
}
