package edu.epam.labs.hometasks3.task1;

public class Test1 {

    private int x = 2;
    private int y = 7;

    public void printOut(){
        System.out.println("x = " + x + "\n" + "y = " + y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int sum(){
        return x + y;
    }

    public int maximum(){
        int result = 0;
        if (x > y){
            result = x;
        }
        if (x < y){
            result = y;
        }
        return result;
    }
}
