package enzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: ÖÐÐò±éÀú
 *
 * @Author ENZO
 * @Create 2024/4/2 15:53
 */
public class Test0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if (root == null) return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

}
