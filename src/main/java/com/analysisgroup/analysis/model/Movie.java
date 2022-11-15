package com.analysisgroup.analysis.model;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.service.*;

public class Movie {
    public EventManager events;
    public Movie(){
        this.events = new EventManager("save");
    }
    private int id;
    private String name;
    private Room room;
    private int length;
    private String rating;
    private String genre;
    private String type;

    public void saveMovie(Movie movie) throws Exception {
        events.notify("save", movie);
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Room getRoom(){
        return this.room;
    }
    public int getLength(){
        return this.length;
    }
    public String getRating(){
        return this.rating;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getType(){
        return this.type;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRoom(Room room){
        this.room = room;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setType(String type){
        this.type = type;
    }
}
