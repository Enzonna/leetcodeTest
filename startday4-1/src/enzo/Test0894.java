package enzo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Test0894 {
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> treeList = new ArrayList<>();
        if (n == 1) {
            treeList.add(new TreeNode(0));
            return treeList;
        }

        for (int i = 1; i < n - 1; i += 2) {
            List<TreeNode> leftTrees = allPossibleFBT(i);
            List<TreeNode> rightTrees = allPossibleFBT(n - i - 1);

            for (int left = 0; left < leftTrees.size(); left++) {
                for (int right = 0; right < rightTrees.size(); right++) {
                    TreeNode curTree = new TreeNode(0);
                    curTree.left = leftTrees.get(left);
                    curTree.right = rightTrees.get(right);
                    treeList.add(curTree);
                }
            }
        }
        return treeList;
    }

    @Test
    public void test() {
        int n = 7;
        for (TreeNode tree : allPossibleFBT(n)){
            System.out.println(tree.val);
        }
    }

}
