package enzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: ∫Û–Ú±È¿˙
 *
 * @Author ENZO
 * @Create 2024/4/2 18:15
 */
public class Test0145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if (root == null){
            return;
        }
        inorder(root.left,res);
        inorder(root.right,res);
        res.add(root.val);
    }
}
