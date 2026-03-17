package Assignment.Ass1and2.Assignment4.Module10;

//LeetCode 206 – Reverse Linked List
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}
public class ReverseList {
    public ListNode1 reverseList(ListNode1 head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode1 newHead = reverseList(head.next);
        head.next.next = head;

        head.next = null;
        return newHead;
    }
}



