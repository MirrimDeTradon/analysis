package com.analysisgroup.analysis.model;

public class AdultTicket implements Ticket{

    public String getDescription(){
        return "AdultTicket";
    }

    public double getCost(){
        System.out.println("Cost of adult ticket:" + 6.00);
        return 6.00;
    }

}
