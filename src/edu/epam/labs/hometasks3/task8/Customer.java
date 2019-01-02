package edu.epam.labs.hometasks3.task8;

public class Customer {

    private int id;
    private String name;
    private String address;
    private long creditCardsNumber;
    private long bankAccountsNumber;

    public Customer() {

    }

    public Customer(int id, String name, String address, long creditCardsNumber, long bankAccountsNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.creditCardsNumber = creditCardsNumber;
        this.bankAccountsNumber = bankAccountsNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardsNumber() {
        return creditCardsNumber;
    }

    public void setCreditCardsNumber(long creditCardsNumber) {
        this.creditCardsNumber = creditCardsNumber;
    }

    public long getBankAccountsNumber() {
        return bankAccountsNumber;
    }

    public void setBankAccountsNumber(long bankAccountsNumber) {
        this.bankAccountsNumber = bankAccountsNumber;
    }


}
