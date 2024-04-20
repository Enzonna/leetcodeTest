package enzo;

/**
 * Package: enzo
 * Description: 两两交换链表中的节点
 *
 * @Author ENZO
 * @Create 2024年4月8日 11:28
 */
public class Test0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);//第一个错误
        res.next = head;
        // cur -> head -> next -> temp
        ListNode cur = res;// 头指针

        while (cur.next != null && cur.next.next != null) {
            ListNode ahead = cur.next;//第二个错误
            ListNode next = cur.next.next;
            // 交换
            cur.next = next;
            ahead.next = next.next;
            next.next = ahead;
            cur = ahead;
        }
        return res.next;
    }
}
