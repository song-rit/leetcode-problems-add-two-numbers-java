class SolutionNotWork {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long sum = Long.sum(listNodeToNumber(l1, 1), listNodeToNumber(l2, 1));
        return getResultNodeResult(new ListNode(), sum);
    }

    private long listNodeToNumber(ListNode list, long n) {
        long sum = list.val * n;
        if(list.next != null) {
            return sum + (listNodeToNumber(list.next, (n * 10)));
        } else {
            return sum;
        }
    }

    private long getNumberPosition(long number, long numberPosition) {
        long total = numberPosition * 10;
        if(number > 9) {
            return total * getNumberPosition(number / 10, numberPosition);
        } else {
            return total / 10;
        }
    }

    private ListNode getResultNodeResult(ListNode list, long number) {
        if(number > 9) {
            int sigleNumber = getSingleNumber(number);
            return new ListNode(sigleNumber, getResultNodeResult(list, number / 10));
        } else {
            list.val = (int)number;
            return list;
        }
    }

    private int getSingleNumber(long number) {
        if(number > 9) {
            long numberPosition = 1;
            numberPosition = getNumberPosition(number, numberPosition);
            return getSingleNumber(number % numberPosition);
        } else {
            return (int)number;
        }
    }
}