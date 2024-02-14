package com.studioghiblimovies.services;

import com.studioghiblimovies.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studioghiblimovies.repository.MoviesRepository;

import java.util.List;

@Service
public class MovieService {

    private final MoviesRepository moviesRepository;

    @Autowired
    public MovieService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movie> getMovies(){
        return moviesRepository.findAll();
    }
}
