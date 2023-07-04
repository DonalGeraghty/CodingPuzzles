import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testObjects.ListNode;

public class AddTwoNumbers {

    //    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    //    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    @Test
    @DisplayName("TEST X")
    public void firstTest() {
        ListNode l1v1 = new ListNode(9);
        ListNode l1v2 = new ListNode(9, l1v1);
        ListNode l1v3 = new ListNode(9, l1v2);
        ListNode l1v4 = new ListNode(9, l1v3);
        ListNode l1v5 = new ListNode(9, l1v4);
        ListNode l1v6 = new ListNode(9, l1v5);
        ListNode l1v7 = new ListNode(9, l1v6);

        ListNode l2v1 = new ListNode(9);
        ListNode l2v2 = new ListNode(9, l2v1);
        ListNode l2v3 = new ListNode(9, l2v2);
        ListNode l2v4 = new ListNode(9, l2v3);

        addTwoNumbers(l1v7, l2v4);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carryOver = 0;

        while (l1 != null || l2 != null){

            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;

            int sum = val1 + val2 + carryOver;

            int digit = sum % 10;
            carryOver = sum / 10;

            System.out.print("digit: " + digit);

            current.next = new ListNode(digit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carryOver != 0) {
            current.next = new ListNode(carryOver);
        }

        return dummyHead.next;
    }
}

