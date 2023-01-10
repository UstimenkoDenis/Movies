package com.ustim.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {

    @GET("movie?token=E0M4KS3-D6NMC93-HP2S1RF-BSSKKQG&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&page=2&limit=5")
    Single<MovieResponse> loadMovies();

}
