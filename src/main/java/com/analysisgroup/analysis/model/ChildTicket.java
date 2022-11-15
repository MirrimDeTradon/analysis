package com.analysisgroup.analysis.model;

public class ChildTicket implements Ticket{

    public String getDescription(){
        return "Child Ticket";
    }

    public double getCost(){
        System.out.println("Cost of child ticket:" + 4.00);
        return 4.00;
    }
}
