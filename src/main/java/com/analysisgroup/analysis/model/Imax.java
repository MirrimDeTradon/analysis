package com.analysisgroup.analysis.model;

public class Imax extends TicketDecorator{

    public Imax(Ticket ticket) {
        super(ticket);
      //  System.out.println("Upgrading Viewing Format to Imax");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Imax";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of viewing Imax movie: " + 2.5);
        return super.getCost() + 2.5;
    }
}
