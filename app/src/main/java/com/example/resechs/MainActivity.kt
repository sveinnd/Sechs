package com.example.resechs

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fb.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.facebook.com/muhammadandika.pratama.1" )
            )
            startActivity(i)

        })
        ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.instagram.com/sveinndd/" )
            )
            startActivity(i)
        })


        var MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.thefa)

       play.setOnClickListener{
           MediaPlayer?.start()
       }
        pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        stop.setOnClickListener{
            MediaPlayer?.stop()
            MediaPlayer?.seekTo(0)
        }
    }
}
