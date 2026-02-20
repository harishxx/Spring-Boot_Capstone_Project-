package com.simplemovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemovie.entity.Movie;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.MovieRepository;
import com.simplemovie.repository.ShowRepository;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private MovieRepository movieRepository;

    public Show createShow(Show show) {

        Long movieId = show.getMovie().getMovieId();

        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        show.setMovie(movie);
        show.setAvailableSeats(show.getTotalSeats());

        return showRepository.save(show);
    }

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}