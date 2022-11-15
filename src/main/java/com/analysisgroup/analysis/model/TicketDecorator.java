package com.analysisgroup.analysis.model;

abstract class TicketDecorator implements Ticket {
    protected Ticket movieTicket;

    public TicketDecorator(Ticket ticket){
        movieTicket = ticket;
    }

    public String getDescription(){
        return movieTicket.getDescription();
    }

    public double getCost(){
        return movieTicket.getCost();
    }

}
