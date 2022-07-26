package www.sanju.mydashboard;

import android.content.Intent;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class Activity2 extends AppCompatActivity {

    private static final String TAG = "Activity2";

    private OnScreenLog log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        log = new OnScreenLog(this, R.id.content_2);
        log = new OnScreenLog(this, R.id.log_text_view_2);
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


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Started Activity 2 onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG,"Started Activity 2 onDestroy");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.i(TAG,"Started Activity 2 onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Started Activity 2 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Started Activity 2 onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Started Activity 2 onRestart");
    }
}
