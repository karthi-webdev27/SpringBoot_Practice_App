package karthiCodes.spring.com.Basic.CRUD.operations.dto;

public class MovieResponseDTO {

    private Long id;
    private String title;
    private String genre;
    private Double rating;
    private Integer releaseYear;

    public MovieResponseDTO(String genre, Long id, Double rating, Integer releaseYear, String title) {
        this.genre = genre;
        this.id = id;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
