package com.simplemovie.repository;

import com.simplemovie.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {

    List<Show> findByMovie_MovieId(Long movieId);
}