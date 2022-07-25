package www.sanju.mydashboard;

import android.content.Intent;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class Activity2 extends AppCompatActivity {

    private OnScreenLog log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        log = new OnScreenLog(this, R.id.content_2);
        log.log("Started log on Activity 2");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity1.class);
                startActivity(intent);
                log.log("Starting Activity 1");
                Snackbar.make(view, "Starting Activity 1", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        String data = getIntent().getStringExtra("data");

        log.log("");
        log.log("Data received from Activity 1: " + data);
        log.log("");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
    }

}
