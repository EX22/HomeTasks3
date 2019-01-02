package edu.epam.labs.hometasks3.task8;

import java.util.Arrays;

public class MainCustomer {
    public static void main(String[] args) {
        Customer [] customers = new Customer[5];
        customers[0] = new Customer();
        customers[1] = new Customer(2, "NameTwo Two B", "AddressSecond 2",
                2234567891234567L, 2023456789123456L);
        customers[2] = new Customer(3, "NameThree Three C", "AddressThird 3",
                3345678901234567L, 3045678901234567L);
        customers[3] = new Customer(4, "NameFour Four D", "AddressFourth 4",
                4567890123456789L, 4067890123456789L);
        customers[4] = new Customer();

    }

    public Customer [] customersInAlphabetOrder(Customer [] customers){
        
        return null;
    }
}
