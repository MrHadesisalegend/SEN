package exercise2;

public class Counter {

    // Overview: A Counter is an integer value that can be incremented.
    //           Counter objects have an integer value that starts from 0 and can be incremented.

    public int value;

    /**
     * @effects Makes this contain 0
     */
    public Counter() {
        value = 0;
    }

    /**
     * @effects Returns the value of this
     */
    public int get() {
        return value;
    }

    /**
     * @modifies this
     * @effects Increments the value of this
     */
    public void incr() {
        value++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("Initial value: " + counter.get());
        counter.incr();
        System.out.println("After increment: " + counter.get());
    }
}
