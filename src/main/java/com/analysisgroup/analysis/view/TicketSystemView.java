package com.analysisgroup.analysis.view;

import com.analysisgroup.analysis.model.*;

public class TicketSystemView {

    public Ticket ticketOne;
    public Ticket ticketTwo;
    public Ticket ticketThree;

    public TicketSystemView(Ticket ticketOne, Ticket ticketTwo, Ticket ticketThree) {
        this.ticketOne = ticketOne;
        this.ticketTwo = ticketTwo;
        this.ticketThree = ticketThree;

        //Ticket ticketOne = new ThreeDimensional(new ChildTicket());
        System.out.println("Ticket Type: " + ticketOne .getDescription());
        System.out.println("Total Ticket Price: " + ticketOne .getCost());

       // Ticket ticketTwo  = new Imax(new Premiere(new StudentTicket()));
        System.out.println("Ticket Type: " + ticketTwo.getDescription());
        System.out.println("Total Ticket Price: " + ticketTwo.getCost());

        //Ticket ticketThree = new Premiere(new Imax(new Birthday(new AdultTicket())));
        System.out.println("Ticket Type: " + ticketThree.getDescription());
        System.out.println("Total Ticket Price: " + ticketThree.getCost());
    }
}
