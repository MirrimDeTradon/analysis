package com.analysisgroup.analysis.model;
import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.service.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long primaryId;
    public EventManager events;
    public Movie(){
        this.events = new EventManager("save");
    }
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name="movie_id", nullable=false)
    private Room room;
    private int length;
    private String rating;
    private String genre;
    private String type;

    public Movie(String name, Room room, int length, String rating, String genre, String type) {
        this.name = name;
        this.length = length;
        this.rating = rating;
        this.genre = genre;
        this.type = type;
    }

    public void saveMovie(Movie movie) throws Exception {
        events.notify("save", movie);
    }

    public Long getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Long primaryId) {
        this.primaryId = primaryId;
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


    @Override
    public String toString() {
        return "Movie{" +
                "primaryId=" + primaryId +
                ", events=" + events +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", room=" + room +
                ", length=" + length +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return Objects.equals(primaryId, movie.primaryId);
    }

    @Override
    public int hashCode() {
        return primaryId != null ? primaryId.hashCode() : 0;
    }
}