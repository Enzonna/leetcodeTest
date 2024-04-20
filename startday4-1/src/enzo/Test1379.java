package enzo;

/**
 * Package: enzo
 * Description: �ҳ����Ϳ�¡���Ĺ����ڵ�
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
