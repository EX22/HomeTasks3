package edu.epam.labs.hometasks3.task5;

import java.util.Random;

public class DecimalCounter {
    private int min;
    private int max;
    private int count;

    DecimalCounter(){
        this.min = 0;
        this.max = 200;
        this.count = 0;
    }

    DecimalCounter(int min, int max){
        this.min = min;
        this.max = max;
        int diff = this.max - this.min;
        Random random = new Random();
        this.count = random.nextInt(diff + 1) + min;
    }

    public void increment(){
        count++;
    }

    public void decrement(){
        count--;
    }

    public int getCount() {
        return count;
    }
}
