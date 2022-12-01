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
    public Room screenTypeButtonPressed(Room room){
        String state = room.getScreenType().getType();
        switch(state){
            case "2D":
                room.setScreenType(new Screen3D());
                return room;
            case "3D":
                room.setScreenType(new Screen4D());
                return room;
            case "4D":
                room.setScreenType(new ScreenIMAX());
                return room;
            case "IMAX":
                room.setScreenType(new Screen2D());
                return room;
            default:
                room.setScreenType(new Screen2D());
                return room;
        }
    }
}
