package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    protected static final int startNumber = -1;
    protected static final int finalNumber = 11;
    protected static final int count = 12;
    private final int[] numbers = new int[count];

    private int total = startNumber;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == startNumber;
    }

    public boolean isFull() {
        return total == finalNumber;
    }

    protected int peekaboo() {
        if (callCheck())
            return startNumber;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return startNumber;
        return numbers[total--];
    }

}
