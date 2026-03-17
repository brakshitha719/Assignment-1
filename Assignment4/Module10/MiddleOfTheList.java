package Assignment.Ass1and2.Assignment4.Module10;

//LeetCode 876 – Middle of the Linked List
public class MiddleOfTheList {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}



