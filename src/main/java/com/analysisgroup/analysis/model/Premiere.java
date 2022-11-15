package com.analysisgroup.analysis.model;

public class Premiere extends TicketDecorator{

    public Premiere(Ticket ticket) {
        super(ticket);
        //System.out.println("Day of first screening");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Premiere";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of movie on its premiere: " + 2.0);
        return super.getCost() + 2.0;
    }
}
