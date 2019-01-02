package edu.epam.labs.hometasks3.task3;

public class Student {

    private String surnameNP;
    private int groupNumber;
    private int [] subjectsMarks;

    Student(){
        surnameNP = null;
        groupNumber = 0;
        subjectsMarks = new int[5];
    }

    Student(String surnameNP, int groupNumber, int [] subjectsMarks){
        this.surnameNP = surnameNP;
        this.groupNumber = groupNumber;
        this.subjectsMarks = subjectsMarks;

    }

    public String getSurnameNP() {
        return surnameNP;
    }

    public void setSurnameNP(String surnameNP) {
        this.surnameNP = surnameNP;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getSubjectsMarks() {
        return subjectsMarks;
    }

    public void setSubjectsMarks(int[] subjectsMarks) {
        this.subjectsMarks = subjectsMarks;
    }
}
