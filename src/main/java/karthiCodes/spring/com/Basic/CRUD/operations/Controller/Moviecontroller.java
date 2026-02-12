package karthiCodes.spring.com.Basic.CRUD.operations.Controller;

import jakarta.validation.Valid;
import karthiCodes.spring.com.Basic.CRUD.operations.Entity.Movie;
import karthiCodes.spring.com.Basic.CRUD.operations.dto.MovieRequestDTO;
import karthiCodes.spring.com.Basic.CRUD.operations.dto.MovieResponseDTO;
import karthiCodes.spring.com.Basic.CRUD.operations.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import karthiCodes.spring.com.Basic.CRUD.operations.service.MovieService;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class Moviecontroller {

    @Autowired
    private MovieService movieService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieResponseDTO createMovie(@Valid @RequestBody MovieRequestDTO movie) { return movieService.saveMovie(movie); }

    @GetMapping
    public List<Movie> getAllMovies()  {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PutMapping("/id")
    public Movie updateMovie(@RequestParam Movie param) {return movieService.updateMovie(param);}

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {  movieService.deleteMovieById(id); }

}
