package com.studioghiblimovies.repository;

import com.studioghiblimovies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movie, Long> {
}
