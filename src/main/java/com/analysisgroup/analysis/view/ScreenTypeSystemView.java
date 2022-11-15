package com.analysisgroup.analysis.view;

import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.controller.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class ScreenTypeSystemView {
    public ScreenTypeSystemView(ArrayList<Room> rooms){
        RoomController roomController = new RoomController();
        Room room1 = rooms.get(0);
        room1.setScreenType("2D");
        System.out.println("ScreenType is equal to: " + room1.getScreenType());
        room1.setScreenType(roomController.screenTypeButtonPressed(room1.getScreenType()));
        System.out.println("Pressing the ScreenType Button");
        System.out.println("ScreenType is equal to: " + room1.getScreenType());
        assertTrue(room1.getScreenType().equals("3D"));
    }
}
