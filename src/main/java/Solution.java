class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s = sumListNode(new ListNode(), l1, l2, 0);
        return s;
    }

    private ListNode sumListNode(ListNode lr, ListNode l1, ListNode l2, int temp) {
        int sum = temp;

        if(l1 != null && l2 != null) {
            sum += l1.val + l2.val;
            int newTemp = getTemp(sum);

            if(l1.next == null && l2.next == null && newTemp <= 0) {
                lr.val = getSingleNumber(sum);
                return lr;
            }
            return new ListNode(getSingleNumber(sum), sumListNode(lr, ((l1.next != null)? l1.next : null), ((l2.next != null)? l2.next : null), newTemp));
        } else if(l1 != null && l2 == null) {
            sum += l1.val;
            int newTemp = getTemp(sum);

            if(l1.next == null && newTemp <= 0) {
                lr.val = getSingleNumber(sum);
                return lr;
            }
            return new ListNode(getSingleNumber(sum), sumListNode(lr, ((l1.next != null)? l1.next : null), null, newTemp));
        } else if(l1 == null && l2 != null) {
            sum += l2.val;
            int newTemp = getTemp(sum);

            if(l2.next == null && newTemp <= 0) {
                lr.val = getSingleNumber(sum);
                return lr;
            }
            return new ListNode(getSingleNumber(sum), sumListNode(lr, null, ((l2.next != null)? l2.next: null),  getTemp(sum)));
        } else if(l1 == null && l2 == null && temp > 0) {
            int newTemp = getTemp(sum);
            if(newTemp > 9) {
                return new ListNode(getSingleNumber(sum), sumListNode(lr, null, null, newTemp));
            } else {
                lr.val = getSingleNumber(sum);
                return lr;
            }
        } else {
            return lr;
        }
    }

    private int getSingleNumber(int sum) {
        return (sum > 9) ? (sum % 10) : sum;
    }

    private int getTemp(int sum) {
        return sum / 10;
    }
}