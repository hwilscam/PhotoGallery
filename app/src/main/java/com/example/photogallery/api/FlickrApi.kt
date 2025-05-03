package com.example.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "e5546d770fd32be0dda67ae54f7bce3c"

interface FlickrApi {
    @GET(
        "service/rest/?method=flickr.interestingness.getList" +
        "&api_key=$API_KEY" +
        "&format=json" +
        "&nojsoncallback=1" +
        "&extras=url_s"
    )
    fun fetchPhotos(): FlickrResponse
}

