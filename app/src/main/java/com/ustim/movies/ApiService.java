package com.ustim.movies;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("movie?token=E0M4KS3-D6NMC93-HP2S1RF-BSSKKQG&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=30")
    Single<MovieResponse> loadMovies(@Query("page") int page);

    @GET("movie?token=E0M4KS3-D6NMC93-HP2S1RF-BSSKKQG&field=id")
    Single<TrailerResponse> loadTrailers(@Query("search") int id);

    @GET("review?token=E0M4KS3-D6NMC93-HP2S1RF-BSSKKQG&field=movieId")
    Single<ReviewResponse> loadReviews(@Query("search") int id);
}
