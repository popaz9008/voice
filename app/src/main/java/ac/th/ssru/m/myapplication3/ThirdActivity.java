package ac.th.ssru.m.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    private Button play;
    private Button stop;
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        play = (Button) findViewById(R.id.butplay);
        stop = (Button) findViewById(R.id.butstop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media = MediaPlayer.create(ThirdActivity.this,R.raw.song);
                media.setAudioStreamType(AudioManager.STREAM_MUSIC);
                media.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                media.stop();
                media.release();
            }
        });
    }
}
