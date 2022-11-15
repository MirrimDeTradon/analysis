package com.analysisgroup.analysis.model;

public class Birthday extends TicketDecorator{

    public Birthday(Ticket ticket) {
        super(ticket);
      //  System.out.println("50% Discount applied");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Discount Applied";
    }

    @Override
    public double getCost() {
        return super.getCost() - 2.0;
    }
}
