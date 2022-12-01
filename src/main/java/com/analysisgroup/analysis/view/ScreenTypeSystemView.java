package com.analysisgroup.analysis.view;

import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.controller.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class ScreenTypeSystemView {
    public ScreenTypeSystemView(ArrayList<Room> rooms){
        RoomController roomController = new RoomController();
        Room room1 = rooms.get(0);
        room1.getScreenType().printType();
        
        System.out.println("Pressing the ScreenType Button");
        roomController.screenTypeButtonPressed(room1);
        room1.getScreenType().printType();
        assertTrue(room1.getScreenType().getType().equals("3D"));
    }
}
