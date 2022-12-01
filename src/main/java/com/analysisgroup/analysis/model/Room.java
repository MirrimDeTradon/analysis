package com.analysisgroup.analysis.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Room {
    public Room(){
        this.screenType = new Screen2D();
    }

    public Room(String name, int capacity, boolean disabledAccess, ScreenType screenType) {
        this.name = name;
        this.capacity = capacity;
        this.disabledAccess = disabledAccess;
        this.screenType = screenType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long primaryID;
    private int id;
    private String name;
    private int capacity;
    private ArrayList<String> seatNames;
    private ArrayList<String> disabledSeats;
    private boolean disabledAccess;
    private ScreenType screenType;
    private ArrayList<String> seatsTaken;

    @OneToMany(mappedBy="movie")
    private ArrayList<Movie> movies = new ArrayList<>(); //initialize property by default


    public Long getPrimaryID() {
        return primaryID;
    }

    public void setPrimaryID(Long primaryID) {
        this.primaryID = primaryID;
    }

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
    public ScreenType getScreenType(){
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
    public void setSeatsTaken(ArrayList<String> seatsTaken){
        this.seatsTaken = seatsTaken;
    }
    public void setMovies(ArrayList<Movie> movies){
        this.movies = movies;
    }
    public void setScreenType(ScreenType screenType){
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "primaryID=" + primaryID +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", seatNames=" + seatNames +
                ", disabledSeats=" + disabledSeats +
                ", disabledAccess=" + disabledAccess +
                ", screenType='" + screenType + '\'' +
                ", seatsTaken=" + seatsTaken +
                ", movies=" + movies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return Objects.equals(primaryID, room.primaryID);
    }

    @Override
    public int hashCode() {
        return primaryID != null ? primaryID.hashCode() : 0;
    }
}
