package com.analysisgroup.analysis.repositories;

import com.analysisgroup.analysis.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
