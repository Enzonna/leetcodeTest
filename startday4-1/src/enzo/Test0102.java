package enzo;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Package: enzo
 * Description: 层次遍历
 *
 * @Author ENZO
 * @Create 2024/4/2 19:31
 */
public class Test0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();        //结果集
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();     //队列

        queue.offer(root);      //offer是进队，把root入队

        while (!queue.isEmpty()) {      //如果队列不是空的话，继续层次遍历

            List<Integer> list = new ArrayList<>();     //临时数组，存储每一层的节点值
            int cur = queue.size();     //每次都动态变化

            for (int i = 0; i <= cur; i++) {
                TreeNode treeNode = queue.poll();       //poll是出队，操作这个节点
                list.add(treeNode.val);     //把该根节点 添加到 临时数组

                if (treeNode.left != null) {         //树有左节点
                    queue.offer(treeNode.left);         //左节点进入递归
                }
                if (treeNode.right != null) {        //树有右节点
                    queue.offer(treeNode.right);        //右节点进入递归
                }
            }

            ret.add(list);      //这一层的list进结果集
        }
        return ret;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cur = queue.size();


            for (int i = 0; i < cur; i++) {
                TreeNode treeNode = queue.poll();
                temp.add(treeNode.val);

                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
            }

            result.add(temp);
        }

        return result;
    }


    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cur = queue.size();

            for (int i = 0; i < cur; i++) {
                TreeNode treeNode = queue.poll();
                temp.add(treeNode.val);

                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(temp);
        }
        return result;
    }

}
