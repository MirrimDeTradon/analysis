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
    public String screenTypeButtonPressed(String state){
        switch(state){
            case "2D":
                return "3D";
            case "3D":
                return "4D";
            case "4D":
                return "2D";
            default:
                return "2D";
        }
    }
}
