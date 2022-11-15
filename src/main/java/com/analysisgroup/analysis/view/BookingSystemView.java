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
            for(int j = 0; j < 100; j++){
                System.out.println();
            }
            Room room = rooms.get(i);
            System.out.println(room.getName());
            System.out.println("Seats available:");
            ArrayList<String> slotsAvailable = roomController.getSlotsAvailable(room);
            for(int y = 0; y < slotsAvailable.size(); y++){
                if(y == slotsAvailable.size() - 1){
                    System.out.print(slotsAvailable.get(y) + ".");
                } else {
                    System.out.print(slotsAvailable.get(y) + ", ");
                }
            }
        }
        
        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}
