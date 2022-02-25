package com.rakibstudiohindicartoontv.hindicartoontv.apiModel;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {

    @GET("playlistItems")
    Call<Playitemlist> getVideoPlaylist(
            @Query("part") String part,
            @Query("playlistId") String playlistId,
            @Query("maxResults") String maxResults,
            @Query("key") String key


    );

}
