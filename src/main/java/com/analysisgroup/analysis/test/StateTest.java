package com.analysisgroup.analysis.test;

import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.controller.*;
import com.analysisgroup.analysis.service.*;
import com.analysisgroup.analysis.view.*;

import java.util.Arrays;
import java.util.ArrayList;

public class StateTest {
    public StateTest(){
		ArrayList<Room> rooms = new ArrayList<Room>();
		Movie movie1= new Movie();
		Room room1 = new Room();
		movie1.setId(0);
		movie1.setName("Jaws");
		movie1.setRoom(room1);
		movie1.setLength(150);
		movie1.setRating("12a");
		movie1.setGenre("Comedy");
		movie1.setType("3D");
		Movie movie2= new Movie();
		movie2.setId(1);
		movie2.setName("The Shining");
		movie2.setRoom(room1);
		movie2.setLength(180);
		movie2.setRating("18");
		movie2.setGenre("Horror");
		movie2.setType("2D");
		room1.setId(0);
		room1.setName("RoomOne");
		room1.setCapacity(5);
		room1.setSeatNames(new ArrayList<String>(Arrays.asList("a1","a2","b1","b2","c1")));
		room1.setDisabledSeats(new ArrayList<String>(Arrays.asList("a1","a2")));
		room1.setDisabledAccess(true);
		room1.setSeatsTaken(new ArrayList<String>(Arrays.asList("a1","c1")));

		room1.setMovies(new ArrayList<Movie>(Arrays.asList(movie1, movie2)));
		rooms.add(room1);

        ScreenTypeSystemView screenTypeSystemView = new ScreenTypeSystemView(rooms);
    }
}
