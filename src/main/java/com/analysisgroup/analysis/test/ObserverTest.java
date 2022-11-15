package com.analysisgroup.analysis.test;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.controller.*;
import com.analysisgroup.analysis.service.*;
import com.analysisgroup.analysis.view.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.Assert.*;

public class ObserverTest {
    public ObserverTest(){
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
		room1.setScreenType("3D");
		room1.setSeatsTaken(new ArrayList<String>(Arrays.asList("a1","c1")));

		room1.setMovies(new ArrayList<Movie>(Arrays.asList(movie1, movie2)));
		rooms.add(room1);

        movie1.events.subscribe("save", new UpdateRoomListener(movie1));

		movie1.setType("4D");

        try {
            movie1.saveMovie(movie1);
        } catch (Exception e) {
            e.printStackTrace(); 
        }

        for(int i = 0; i < rooms.size(); i++){
            for(int j = 0; j < rooms.get(i).getMovies().size(); j++){
                if(rooms.get(i).getMovies().get(j).getId() == movie1.getId()){
					assertTrue(rooms.get(i).getMovies().get(j).getType().equals(movie1.getType()));
					System.out.println("Here: " + movie1.getType());
					System.out.println(rooms.get(i).getMovies().get(j).getType());
				}
            }
        }
		BookingSystemView sys = new BookingSystemView(rooms);
    }
}