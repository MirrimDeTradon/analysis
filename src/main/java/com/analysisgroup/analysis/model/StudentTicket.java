package com.analysisgroup.analysis.model;

public class StudentTicket implements Ticket{

    public String getDescription(){
        return "Student Ticket";
    }

    public double getCost(){
        System.out.println("Cost of student ticket:" + 5.00);
        return 5.00;
    }

}
