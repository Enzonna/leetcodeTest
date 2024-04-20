package enzo;

/**
 * Package: enzo
 * Description: 两数相加
 *
 * @Author ENZO
 * @Create 7/4/2024 下午7:57
 */

import org.testng.annotations.Test;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Test0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();//链表,头节点
        ListNode cur = result;
        int total = 0, next1 = 0;//总和，是否进一

        while (l1 != null && l2 != null) {

            total = l1.val + l2.val + next1;
            next1 = total / 10;

            l1 = l1.next;
            l2 = l2.next;

            cur.next = new ListNode(total % 10);
            cur = cur.next;
        }

        while (l1 != null) {
            total = l1.val + next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10;
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            total = l2.val + next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10;
            l2 = l2.next;
            cur = cur.next;
        }

        if (next1 != 0){
            cur.next = new ListNode(next1);
        }
        return result.next;
    }

    @Test
    public void test(){
        int m = 84;
        System.out.println(m/10);
        System.out.println(m%10);
    }
}
