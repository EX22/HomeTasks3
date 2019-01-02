package edu.epam.labs.hometasks3.task2;

public class MainTest2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println("a = " + test2.getA() + "\n"+ "b = " + test2.getB());

        test2.setA(14);
        test2.setB(9);
        System.out.println("a = " + test2.getA() + "\n"+ "b = " + test2.getB());

        Test2 test21 = new Test2(1, 50);
        System.out.println("a = " + test21.getA() + "\n"+ "b = " + test21.getB());

    }
}
