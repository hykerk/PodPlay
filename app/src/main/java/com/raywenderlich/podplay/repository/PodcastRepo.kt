package com.raywenderlich.podplay.repository

import com.raywenderlich.podplay.model.Podcast

class PodcastRepo {
    fun getPodcast(feedUrl: String): Podcast? {
        return Podcast(feedUrl, "No Name","No description", "No image")
    }
}