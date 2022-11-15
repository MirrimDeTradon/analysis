package com.analysisgroup.analysis.model;

public class ThreeDimensional extends TicketDecorator{

    public ThreeDimensional(Ticket ticket) {
        super(ticket);
       // System.out.println("Upgrading Viewing Format to 3D");
    }

    @Override
    public String getDescription(){
        return movieTicket.getDescription() + ", 3D";
    }
    @Override
    public double getCost(){
        System.out.println("Cost of viewing 3D movie: " + 2.0);
        return movieTicket.getCost() + 2.0;
    }

}
