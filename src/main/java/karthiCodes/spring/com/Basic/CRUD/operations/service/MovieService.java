package karthiCodes.spring.com.Basic.CRUD.operations.service;

import karthiCodes.spring.com.Basic.CRUD.operations.Entity.Movie;
import karthiCodes.spring.com.Basic.CRUD.operations.dto.MovieRequestDTO;
import karthiCodes.spring.com.Basic.CRUD.operations.dto.MovieResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import karthiCodes.spring.com.Basic.CRUD.operations.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieResponseDTO saveMovie(MovieRequestDTO movie) {
        Movie m = new Movie();

        m.setTitle(movie.getTitle());
        m.setGenre(movie.getGenre());
        m.setRating(movie.getRating());
        m.setReleaseYear(movie.getReleaseYear());

        Movie savedMovie = movieRepository.save(m);

        return new MovieResponseDTO(
                        savedMovie.getGenre(),
                savedMovie.getId(),
                        savedMovie.getRating(),
                        savedMovie.getReleaseYear(),
                savedMovie.getTitle()
                );
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) { return movieRepository.findById(id).orElse(null); }

    public Movie updateMovie(Movie params) { return movieRepository.saveAndFlush(params); }

    public void deleteMovieById(Long id) {  movieRepository.deleteById(id);    }
}
