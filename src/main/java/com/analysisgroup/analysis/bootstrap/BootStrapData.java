package com.analysisgroup.analysis.bootstrap;

import com.analysisgroup.analysis.model.*;
import com.analysisgroup.analysis.repositories.MovieRepository;
import com.analysisgroup.analysis.repositories.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final RoomRepository roomRepository;

    public BootStrapData(MovieRepository movieRepository, RoomRepository roomRepository) {
        this.movieRepository = movieRepository;
        this.roomRepository = roomRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Room  mainOne = new Room("mainOne", 300, true, new Screen3D());
        Movie lordOfTheRings = new Movie("LOTR Twin Towers", mainOne, 180, "good", "fantasy", "3D");
        mainOne.getMovies().add(lordOfTheRings);

        //Saves entities to h2 database
        roomRepository.save(mainOne);
        movieRepository.save(lordOfTheRings);

        Room  mainTwo = new Room("mainTwo", 265, true, new ScreenIMAX());
        Movie theHobbit = new Movie("The Hobbit: An Unexpected Journey", mainTwo, 165, "great", "fantasy", "Imax");
        mainOne.getMovies().add(theHobbit);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Movies" + movieRepository.count());

        roomRepository.save(mainTwo);
        movieRepository.save(theHobbit);
    }
}
