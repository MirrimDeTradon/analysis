package com.analysisgroup.analysis.test;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.view.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class DecoratorTest {
    public DecoratorTest(){
        Ticket ticketOne = new ThreeDimensional(new ChildTicket());
		Ticket ticketTwo  = new Imax(new Premiere(new StudentTicket()));
		Ticket ticketThree = new Premiere(new Imax(new Birthday(new AdultTicket())));

		TicketSystemView test = new TicketSystemView(ticketOne, ticketTwo, ticketThree);
    }
}
