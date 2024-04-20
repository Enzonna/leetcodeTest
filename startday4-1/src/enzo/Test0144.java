package enzo;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: enzo
 * Description: œ»–Ú±È¿˙
 *
 * @Author ENZO
 * @Create 2024/4/2 18:10
 */
public class Test0144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode root,List<Integer> res){
        if (root == null){
            return;
        }
        res.add(root.val);
        inorder(root.left,res);
        inorder(root.right,res);
    }
}
