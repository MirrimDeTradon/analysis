package com.analysisgroup.analysis.controller;
import com.analysisgroup.analysis.model.*;
import java.util.ArrayList;

public class RoomController {
    public RoomController(){
    }
    public ArrayList<String> getSlotsAvailable(Room room) {
        ArrayList<String> slotsAvailable = new ArrayList<String>();
        slotsAvailable = room.getSeatNames();
        for(int y = 0; y < room.getSeatsTaken().size(); y++){
            if(slotsAvailable.contains(room.getSeatsTaken().get(y))){
                slotsAvailable.remove(room.getSeatsTaken().get(y));
            }
        }
        return slotsAvailable;
    }
}
