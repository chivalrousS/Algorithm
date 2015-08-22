package chapter9;
import java.util.*;
/*
 *题目描述

请实现一个函数，检查一棵二叉树是否为二叉查找树。
给定树的根结点指针TreeNode* root，请返回一个bool，代表该树是否为二叉查找树。 
 */
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}*/
public class Checker {
    public static int last_num = Integer.MIN_VALUE;
    public boolean checkBST(TreeNode root) {
        // write code here
                // write code here
        if(root == null)
            return true;
         
        //检查左子树节点
        if(!checkBST(root.left))
            return false;
         
        if(root.val < last_num)
            return false;
        last_num = root.val;
         
        //检查右字数节点
        if(!checkBST(root.right))
            return false;
         
        return true;
    }
}