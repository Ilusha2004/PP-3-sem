package com.control;

import java.util.StringTokenizer;

public class Student{

    private String FirstName;
    private String SecondName;
    private String LastName;
    private Double srAmount;
    private String ID;

    public Student(String firstName, String secondName, String lastName, Double srAmount, String iD) {
        FirstName = firstName;
        SecondName = secondName;
        LastName = lastName;
        this.srAmount = srAmount;
        ID = iD;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Double getSrAmount() {
        return srAmount;
    }

    public void setSrAmount(Double srAmount) {
        this.srAmount = srAmount;
    }

    public String getID() {
        return ID;
    }
    
    public void setID(String iD) {
        ID = iD;
    }

    @Override
    public String toString() {
        return "Student [FirstName=" + FirstName + ", SecondName=" + SecondName + ", LastName=" + LastName
                + ", srAmount=" + srAmount + ", ID=" + ID + "]";
    }

    public Integer compareTo(Student temp) {
        Integer item_0 = Integer.valueOf(temp.getID().substring(1, temp.getID().length()));
        Integer item_1 = Integer.valueOf(this.getID().substring(1, this.getID().length()));

        if(this.getFirstName().compareTo(temp.getFirstName()) == 0) {
            return item_1.compareTo(item_0);
        }

        return this.getSrAmount().compareTo(temp.getSrAmount());
    }

    public String checkID() {
        StringTokenizer tokenizer = new StringTokenizer(ID, "/\"№%:?*()+");
        String temp = "";

        while(tokenizer.hasMoreTokens()) {
            temp += tokenizer.nextElement().toString();
        }

        return temp;
    }

}