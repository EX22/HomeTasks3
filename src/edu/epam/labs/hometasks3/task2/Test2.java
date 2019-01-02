package edu.epam.labs.hometasks3.task2;

public class Test2 {

    private int a;
    private int b;

    Test2(int a, int b){
        this.a = a;
        this.b = b;
    }

    Test2(){
        a = 8;
        b = 5;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
