package ac.th.ssru.m.myapplication3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class second extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        list = (ListView)findViewById(R.id.listView);
        String data[] = {"M","N","O","P"};
        ListAdapter adt = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adt);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                String s =(String)list.getItemAtPosition(i);
                Toast.makeText(second.this,"position :"+i+" ]"+s,Toast.LENGTH_SHORT).show();
            }
        });
    }
}