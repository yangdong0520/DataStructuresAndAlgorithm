/**
 * @Author 杨栋
 * @Date 2020/10/24 18:25
 */

public class treeNode {
    // 节点的权
    int value;
    treeNode lNode; // 左节点
    treeNode rNode; // 右节点

    public treeNode(int value) {
        this.value = value;
    }
     
    // 设置左儿子
    public void setrNode(treeNode rNode) {
        this.rNode = rNode;
    }
    // 设置右儿子
    public void setlNode(treeNode lNode) {
        this.lNode = lNode;
    }
    
    // 前序遍历
    public void frontShow() {
        System.out.print(value);
        if(lNode != null){
            lNode.frontShow();
        }
        if (rNode != null){
            rNode.frontShow();
        }
    }
    
    // 中序遍历
    public void minShow() {
        if (lNode != null){
            lNode.minShow();
        }
        System.out.print(value);
        if(rNode != null){
            rNode.minShow();
        }
        
    }

    public void afterShow() {
        if(lNode != null){
            lNode.afterShow();
        }
        if(rNode != null){
            rNode.afterShow();
        }
        System.out.print(value);
    }

    public treeNode frontSearch(int i) {
        treeNode target = null;
        // 对比当前节点
        if(this.value == i){
            return this;
            // 当前节点不是要找的节点
        } else {
            // 查找左儿子
            if (lNode != null) {
                // 可能找到，可能找不到，找不到还是空
                target = lNode.frontSearch(i);
            }
            // 如果不为空，说明左儿子已经找到
            if (target != null){
                return  target;
            }
            // 查找右儿子
            if (rNode != null){
                target = rNode.frontSearch(i);
            }
        }
        return target;
    }

    // 删除二叉树的节点
    public treeNode delete(int i) {
        treeNode parent = this;
        if(parent.lNode != null && parent.lNode.value == i){
            parent.lNode = null;
            return parent;
        }
        if(parent.rNode != null && parent.rNode.value == i){
            parent.rNode = null;
            return parent;
        }
        parent = lNode;
        if(parent != null){
            parent.delete(i);
        }
        parent = rNode;
        if(parent != null){
            parent.delete(i);
        }
        return parent;


    }
   
}
