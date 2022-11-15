package com.analysisgroup.analysis.service;
import com.analysisgroup.analysis.model.*;
public class UpdateRoomListener implements EventListener{
    private Movie movie;

    public UpdateRoomListener(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void update(String eventType, Movie movie) {
        System.out.println("Hello world");
    }
}
