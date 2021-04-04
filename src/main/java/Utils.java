public class Utils {

    public static ListNode arrayToListNode(int[] nums) {
        ListNode current = null;
        ListNode previous = null;
        for (int i = 0; i < nums.length; i++) {
            if (current == null) {
                current = new ListNode(nums[i]);
            } else {
                current = new ListNode(nums[i], previous);
            }
            previous = current;
        }
        return current;
    }

    public static void displayListNode(ListNode list) {
        while (list != null) {
            if (list.next != null) {
                System.out.print(list.val + ",");
            } else {
                System.out.println(list.val);
            }
            list = list.next;
        }
    }

    public static void displayListNodeByTopic(String topic, ListNode list) {
        System.out.print(topic + ":");
        while (list != null) {
            if (list.next != null) {
                System.out.print(list.val + ",");
            } else {
                System.out.println(list.val);
            }
            list = list.next;
        }
    }

    public static boolean isListNodeAllElementEqual(ListNode l1, ListNode l2) {

        while (l1 != null && l2 != null) {
            if(l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;

            if(l1 == null && l2 != null) {
                return false;
            } else if(l1 != null && l2 == null) {
                return false;
            }
        }
        return true;
    }

}
