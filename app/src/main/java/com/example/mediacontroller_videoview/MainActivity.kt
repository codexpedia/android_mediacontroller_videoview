package com.example.mediacontroller_videoview

import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // http://techslides.com/demos/sample-videos/small.mp4
        // http://www.ebookfrenzy.com/android_book/movie.mp4
        // val videoPath = "android.resource://" + packageName + "/" + R.raw.sample_video

        video_view.setVideoPath("http://techslides.com/demos/sample-videos/small.mp4")
        var mediaController = MediaController(this)
        mediaController.requestFocus()
        video_view.setOnPreparedListener(MediaPlayer.OnPreparedListener { mediaController.show(0) })
        mediaController.setAnchorView(video_view)
        video_view.setMediaController(mediaController)
        video_view.start()
    }
}
