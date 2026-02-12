package karthiCodes.spring.com.Basic.CRUD.operations.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class MovieRequestDTO {

    private String genre;
    @Size(min=3)
    @NotBlank(message = "Title should not be blank")
    private String title;

    @Min(value = 1, message = "Minimum rating should be 1")
    @Max(value = 10, message = "Maximum rating should be 10")
    private Double rating;
    private Integer releaseYear;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
