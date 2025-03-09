import java.util.Scanner;

class Counter {
    private int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }

    void decrement() {
        if (count < 0) {
            return;
        }
        count--;
    }

    int getValue() {
        return this.count;
    }
    // Implement increment() method to increase count by 1.
    // Implement decrement() method to decrease count by 1 but ensure it does not go
    // below zero.
    // Implement getValue() method to return the current value of count.
    //
    // Hint: Use an if condition in decrement() to prevent negative values.
}

public class W07_2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println(counter.getValue()); // Output: 1
    }
}