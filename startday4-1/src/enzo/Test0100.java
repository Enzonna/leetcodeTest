package enzo;

/**
 * Package: enzo
 * Description: ÏàµÈµÄÊ÷
 *
 * @Author ENZO
 * @Create 2024/4/2 16:17
 */
public class Test0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }else if (p == null || q == null){
            return false;
        }else if (p.val != q.val){
            return false;
        }else {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}
