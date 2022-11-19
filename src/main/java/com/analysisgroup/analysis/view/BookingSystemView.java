package com.analysisgroup.analysis.view;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.controller.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingSystemView {
    public BookingSystemView(ArrayList<Room> rooms){
        RoomController roomController = new RoomController();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < rooms.size(); i++){
            System.out.println();
            Room room = rooms.get(i);
            System.out.println(room.getName());
            System.out.println("Seats available:");
            ArrayList<String> slotsAvailable = roomController.getSlotsAvailable(room);
            for(int y = 0; y < slotsAvailable.size(); y++){
                if(y == slotsAvailable.size() - 1){
                    System.out.println(slotsAvailable.get(y) + ".");
                } else {
                    System.out.print(slotsAvailable.get(y) + ", ");
                }
            }
            int h = 0;
            while(h==0){
                System.out.println("What seat would you like to book?");
                String s = in.nextLine();
                if(slotsAvailable.contains(s)){
                    roomController.getSlotsAvailable(room).remove(s);
                    h++;
                } else {
                    System.out.println("");
                    System.out.println("Unrecognised Seat, please try again!");
                    
                    System.out.println("Seats available:");
                    for(int y = 0; y < slotsAvailable.size(); y++){
                        if(y == slotsAvailable.size() - 1){
                            System.out.println(slotsAvailable.get(y) + ".");
                        } else {
                            System.out.print(slotsAvailable.get(y) + ", ");
                        }
                    }
                }
            }
        }
    }
}
