package ac.th.ssru.m.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radio1,radio2,radio3;
    private Button but , butBG;
    private View app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio1 = (RadioButton) findViewById(R.id.radioButton1);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        but = (Button) findViewById(R.id.button1);
        butBG = (Button) findViewById(R.id.button2);
        app = (View)findViewById(R.id.myapp);
        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,radio1.getText()+"",Toast.LENGTH_SHORT).show();
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,radio2.getText()+"",Toast.LENGTH_SHORT).show();
            }
        });
        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,radio3.getText()+"",Toast.LENGTH_SHORT).show();
            }
        });
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse("https://www.google.co.th/"));
                startActivity(web);
            }
        });
        butBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                app.setBackgroundResource(R.drawable.bg1);
                app.getBackground().setAlpha(80);
            }
        });
    }
}
