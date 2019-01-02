package edu.epam.labs.hometasks3.task1;

public class MainTest1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        test1.printOut();
        System.out.println("maximum = " + test1.maximum());
        test1.setX(6);
        test1.setY(10);

        test1.printOut();
        System.out.println("sum = " + test1.sum());

    }
}
