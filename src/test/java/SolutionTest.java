import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testCase1() {
//      list node structure: [2,4,3]
        ListNode l1 = Utils.arrayToListNode(new int[]{3, 4, 2});
//      list node structure: [5,6,4]
        ListNode l2 = Utils.arrayToListNode(new int[]{4, 6, 5});

        ListNode lr = solution.addTwoNumbers(l1, l2);

        Utils.displayListNodeByTopic("l1", l1);
        Utils.displayListNodeByTopic("l2", l2);
        Utils.displayListNodeByTopic("lr", lr);
//      list node structure: [7,0,8]
        ListNode la = Utils.arrayToListNode(new int[]{8, 0, 7});
        Assertions.assertTrue(Utils.isListNodeAllElementEqual(la, lr));
    }

    @Test
    public void testCase2() {
//        list node structure: [0]
        ListNode l1 = Utils.arrayToListNode(new int[]{0});
//        list node structure: [0]
        ListNode l2 = Utils.arrayToListNode(new int[]{0});

        ListNode lr = solution.addTwoNumbers(l1, l2);

        Utils.displayListNodeByTopic("l1", l1);
        Utils.displayListNodeByTopic("l2", l2);
        Utils.displayListNodeByTopic("lr", lr);

//      list node structure: [0]
        ListNode la = Utils.arrayToListNode(new int[]{0});
        Assertions.assertTrue(Utils.isListNodeAllElementEqual(la, lr));
    }

    @Test
    public void testCase3() {
//      list node structure: [9,9,9,9,9,9,9]
        ListNode l1 = Utils.arrayToListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
//      list node structure: [9,9,9,9]
        ListNode l2 = Utils.arrayToListNode(new int[]{9, 9, 9, 9});

        ListNode lr = solution.addTwoNumbers(l1, l2);

        Utils.displayListNodeByTopic("l1", l1);
        Utils.displayListNodeByTopic("l2", l2);
        Utils.displayListNodeByTopic("lr", lr);

//      list node structure: [8,9,9,9,0,0,0,1]
        ListNode la = Utils.arrayToListNode(new int[]{1, 0, 0, 0, 9, 9, 9, 8});
        Assertions.assertTrue(Utils.isListNodeAllElementEqual(la, lr));
    }

    @Test
    public void testCase4() {
//      list node structure: [9]
        ListNode l1 = Utils.arrayToListNode(new int[]{9});
//      list node structure: [1,9,9,9,9,9,9,9,9,9]
        ListNode l2 = Utils.arrayToListNode(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 1});

        ListNode lr = solution.addTwoNumbers(l1, l2);

        Utils.displayListNodeByTopic("l1", l1);
        Utils.displayListNodeByTopic("l2", l2);
        Utils.displayListNodeByTopic("lr", lr);

//      list node structure: [0,0,0,0,0,0,0,0,0,0,1]
        ListNode la = Utils.arrayToListNode(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        Assertions.assertTrue(Utils.isListNodeAllElementEqual(la, lr));
    }

    @Test
    public void testCase5() {
//      list node structure: [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        ListNode l1 = Utils.arrayToListNode(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
//      list node structure: [5,6,4]
        ListNode l2 = Utils.arrayToListNode(new int[]{4, 6, 5});

        ListNode lr = solution.addTwoNumbers(l1, l2);

        Utils.displayListNodeByTopic("l1", l1);
        Utils.displayListNodeByTopic("l2", l2);
        Utils.displayListNodeByTopic("lr", lr);

//      list node structure: [6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        ListNode la = Utils.arrayToListNode(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 6});
        Assertions.assertTrue(Utils.isListNodeAllElementEqual(la, lr));
    }
}
