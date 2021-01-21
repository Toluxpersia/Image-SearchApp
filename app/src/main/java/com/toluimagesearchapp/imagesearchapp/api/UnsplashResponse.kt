package com.toluimagesearchapp.imagesearchapp.api

import com.toluimagesearchapp.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)