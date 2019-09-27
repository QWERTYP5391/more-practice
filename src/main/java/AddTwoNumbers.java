public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode pointer = head;
        int remainder = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int sum = l1.val + l2.val + remainder;

                if (sum >= 10) {
                    pointer.next = new ListNode(sum % 10);
                    remainder = 1;
                } else {
                    pointer.next = new ListNode(sum);
                    remainder = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                int sum = l2.val + remainder;
                if (sum >= 10) {
                    pointer.next = new ListNode(sum % 10);
                    remainder = 1;
                } else {
                    pointer.next = new ListNode(sum);
                    remainder = 0;
                }
                l2 = l2.next;
            } else {
                int sum = l1.val + remainder;
                if (sum >= 10) {
                    pointer.next = new ListNode(sum % 10);
                    remainder = 1;
                } else {
                    pointer.next = new ListNode(sum);
                    remainder = 0;
                }
                l1 = l1.next;
            }

            pointer = pointer.next;
        }

        if (remainder == 1) {
            pointer.next = new ListNode(1);
        }
        return head.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

