package enzo;

/**
 * Package: enzo
 * Description: 找出树和克隆树的公共节点
 *
 * @Author ENZO
 * @Create 2024/4/3 9:01
 */
public class Test1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null){
            return null;
        }
        if (original == target){
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left,cloned.left,target);
        if (left != null){
            return left;
        }
        return getTargetCopy(original.right,cloned.right,target);
    }
}
