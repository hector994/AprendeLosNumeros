package com.hmurillo.aprendelosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView imageView, imageView2;
    Button button1, button2, button3, button4, button5, button6, button7,button8,button9,button10;
    Button button11, button12, button13, button14, button15, button16, button17,button18,button19,button20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageButtonpausar);
        imageView2 = findViewById(R.id.imageButtondetener);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    imageView.setImageResource(R.drawable.boton_reproducir);
                    imageView2.setVisibility(View.VISIBLE);

                } else {
                    mediaPlayer.start();
                    imageView.setImageResource(R.drawable.boton_pausar);
                    imageView2.setVisibility(View.VISIBLE);
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.boton_reproducir);

                mediaPlayer.seekTo(0);
                mediaPlayer.pause();

                imageView2.setVisibility(View.INVISIBLE);
            }
        });
        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/1.mp3";
                playAudio(url);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/2.mp3";
                playAudio(url);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/3.mp3";
                playAudio(url);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/4.mp3";
                playAudio(url);
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/5.mp3";
                playAudio(url);
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/6.mp3";
                playAudio(url);
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/7.mp3";
                playAudio(url);
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/8.mp3";
                playAudio(url);
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/9.mp3";
                playAudio(url);
            }
        });
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_ingles/10.mp3";
                playAudio(url);
            }
        });
        //https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/1.mp3
        button11 = findViewById(R.id.button31);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/1.mp3";
                playAudio(url);
            }
        });
        button12 = findViewById(R.id.button32);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/2.mp3";
                playAudio(url);
            }
        });
        button13 = findViewById(R.id.button33);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/3.mp3";
                playAudio(url);
            }
        });
        button14 = findViewById(R.id.button34);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/4.mp3";
                playAudio(url);
            }
        });
        button15 = findViewById(R.id.button35);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/5.mp3";
                playAudio(url);
            }
        });
        button16 = findViewById(R.id.button36);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/6.mp3";
                playAudio(url);
            }
        });
        button17 = findViewById(R.id.button37);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/7.mp3";
                playAudio(url);
            }
        });
        button18 = findViewById(R.id.button38);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/8.mp3";
                playAudio(url);
            }
        });
        button19 = findViewById(R.id.button39);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/9.mp3";
                playAudio(url);
            }
        });
        button20 = findViewById(R.id.button40);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://superatejugando.com/images/idiomas/loteria/audio/numeros_espanol/10.mp3";
                playAudio(url);
            }
        });
    }

    public void playAudio(String link){
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.release();
                mediaPlayer=null;
            }
        }

        mediaPlayer = new MediaPlayer();

        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).build());
        try {
            mediaPlayer.setDataSource(link);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mediaPlayer.start();
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.boton_pausar);
        imageView2.setVisibility(View.VISIBLE);
        
    }

}