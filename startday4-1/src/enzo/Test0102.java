package enzo;

import org.testng.annotations.Test;

import java.util.*;

/**
 * Package: enzo
 * Description: ��α���
 *
 * @Author ENZO
 * @Create 2024/4/2 19:31
 */
public class Test0102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();        //�����
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<>();     //����

        queue.offer(root);      //offer�ǽ��ӣ���root���

        while (!queue.isEmpty()) {      //������в��ǿյĻ���������α���

            List<Integer> list = new ArrayList<>();     //��ʱ���飬�洢ÿһ��Ľڵ�ֵ
            int cur = queue.size();     //ÿ�ζ���̬�仯

            for (int i = 0; i <= cur; i++) {
                TreeNode treeNode = queue.poll();       //poll�ǳ��ӣ���������ڵ�
                list.add(treeNode.val);     //�Ѹø��ڵ� ��ӵ� ��ʱ����

                if (treeNode.left != null) {         //������ڵ�
                    queue.offer(treeNode.left);         //��ڵ����ݹ�
                }
                if (treeNode.right != null) {        //�����ҽڵ�
                    queue.offer(treeNode.right);        //�ҽڵ����ݹ�
                }
            }

            ret.add(list);      //��һ���list�������
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
