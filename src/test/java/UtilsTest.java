import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void displayListNodeTest() {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Utils.displayListNode(node1);

    }

    @Test
    public void arrayToListNodeTest1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        ListNode list = Utils.arrayToListNode(nums);
        Utils.displayListNode(list);
    }

    @Test
    public void arrayToListNodeTest2() {
        int[] nums = new int[1000];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        ListNode list = Utils.arrayToListNode(nums);
        Utils.displayListNode(list);
    }

    @Test
    public void isListNodeAllElementEqualTest1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        ListNode l1 = Utils.arrayToListNode(nums);
        ListNode l2 = Utils.arrayToListNode(nums);

        boolean result = Utils.isListNodeAllElementEqual(l1, l2);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isListNodeAllElementEqualTest2() {
        int[] nums = new int[1000];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        ListNode l1 = Utils.arrayToListNode(nums);
        ListNode l2 = Utils.arrayToListNode(nums);

        boolean result = Utils.isListNodeAllElementEqual(l1, l2);
        System.out.println(result);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isListNodeAllElementNotEqualTest1() {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        int[] nums2 = new int[] {0, 2, 3, 4, 5};
        ListNode l1 = Utils.arrayToListNode(nums);
        ListNode l2 = Utils.arrayToListNode(nums2);

        boolean result = Utils.isListNodeAllElementEqual(l1, l2);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void isListNodeAllElementNotEqualTest2() {
        int[] nums = new int[1000];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        int[] nums2 = new int[999];

        for(int i = 0; i < nums2.length; i++) {
            nums2[i] = i + 1;
        }

        ListNode l1 = Utils.arrayToListNode(nums);
        ListNode l2 = Utils.arrayToListNode(nums2);

        boolean result = Utils.isListNodeAllElementEqual(l1, l2);
        System.out.println(result);
        Assertions.assertEquals(false, result);
    }
}
