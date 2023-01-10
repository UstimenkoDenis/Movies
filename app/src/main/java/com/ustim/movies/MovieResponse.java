package com.ustim.movies;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovieResponse {

    @SerializedName("docs")
    private List<Movie> movies;

    public MovieResponse(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
