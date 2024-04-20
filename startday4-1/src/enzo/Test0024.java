package enzo;

/**
 * Package: enzo
 * Description: �������������еĽڵ�
 *
 * @Author ENZO
 * @Create 2024��4��8�� 11:28
 */
public class Test0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);//��һ������
        res.next = head;
        // cur -> head -> next -> temp
        ListNode cur = res;// ͷָ��

        while (cur.next != null && cur.next.next != null) {
            ListNode ahead = cur.next;//�ڶ�������
            ListNode next = cur.next.next;
            // ����
            cur.next = next;
            ahead.next = next.next;
            next.next = ahead;
            cur = ahead;
        }
        return res.next;
    }
}
