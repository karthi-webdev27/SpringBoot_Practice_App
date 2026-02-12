package karthiCodes.spring.com.Basic.CRUD.operations.repository;

import karthiCodes.spring.com.Basic.CRUD.operations.Entity.Movie;
import karthiCodes.spring.com.Basic.CRUD.operations.dto.MovieResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
