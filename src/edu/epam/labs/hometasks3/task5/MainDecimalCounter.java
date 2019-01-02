package edu.epam.labs.hometasks3.task5;

public class MainDecimalCounter {
    public static void main(String[] args) {
        DecimalCounter decimalCounter = new DecimalCounter();

        System.out.println("count = " + decimalCounter.getCount());
        decimalCounter.decrement();
        System.out.println("count = " + decimalCounter.getCount());
        for (int i = 0; i < 20; i++){
            decimalCounter.increment();
        }
        System.out.println("count = " + decimalCounter.getCount());

        DecimalCounter dc = new DecimalCounter(20, 70);

        System.out.println("count = " + dc.getCount());
    }

}
