package com.analysisgroup.analysis.model;
import java.util.ArrayList;

public class Room {
    public Room(){
    }
    private int id;
    private String name;
    private int capacity;
    private ArrayList<String> seatNames;
    private ArrayList<String> disabledSeats;
    private boolean disabledAccess;
    private String screenType;
    private ArrayList<String> seatsTaken;
    private ArrayList<Movie> movies;

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public ArrayList<String> getSeatNames(){
        return this.seatNames;
    }
    public ArrayList<String> getDisabledSeats(){
        return this.disabledSeats;
    }
    public boolean getDisabledAccess(){
        return this.disabledAccess;
    }
    public String getScreenType(){
        return this.screenType;
    }
    public ArrayList<String> getSeatsTaken(){
        return this.seatsTaken;
    }
    public ArrayList<Movie> getMovies(){
        return this.movies;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setSeatNames(ArrayList<String> seatNames){
        this.seatNames = seatNames;
    }
    public void setDisabledSeats(ArrayList<String> disabledSeats){
        this.disabledSeats = disabledSeats;
    }
    public void setDisabledAccess(boolean disabledAccess){
        this.disabledAccess = disabledAccess;
    }
    public void setScreenType(String screenType){
        this.screenType = screenType;
    }
    public void setSeatsTaken(ArrayList<String> seatsTaken){
        this.seatsTaken = seatsTaken;
    }
    public void setMovies(ArrayList<Movie> movies){
        this.movies = movies;
    }
}
