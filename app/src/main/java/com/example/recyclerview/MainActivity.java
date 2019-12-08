package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String>mNames=new ArrayList<>();
    private ArrayList<String>mMovieDates=new ArrayList<>();
    private ArrayList<String>mMovieTypes=new ArrayList<>();
    private ArrayList<String>mImageUrls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initRecyclerView();
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing Bitmaps");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMjIwMjE1Nzc4NV5BMl5BanBnXkFtZTgwNDg4OTA1NzM@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        mNames.add("The lion king");
        mMovieDates.add("2019");
        mMovieTypes.add("Animation");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMTg4ODg5NzkzNl5BMl5BanBnXkFtZTcwNzAyODM5Mw@@._V1_SY1000_CR0,0,673,1000_AL_.jpg");
        mNames.add("Takers");
        mMovieDates.add("2010");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMjA5ODkzNTA0NV5BMl5BanBnXkFtZTcwMjU1NTQwMg@@._V1_.jpg");
        mNames.add("Taken");
        mMovieDates.add("2008");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMDExMTAzYmEtZjMwOC00MjIxLTkyNjMtOTZjOWIwMTI0YTc0XkEyXkFqcGdeQXVyMjU3NTI0Mg@@._V1_SX675_CR0,0,675,999_AL_.jpg");
        mNames.add("OverDrive");
        mMovieDates.add("2017");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BOGZhM2FhNTItODAzNi00YjA0LWEyN2UtNjJlYWQzYzU1MDg5L2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,671,1000_AL_.jpg");
        mNames.add("Shrek");
        mMovieDates.add("2001");
        mMovieTypes.add("Animation");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BYjQ5NjM0Y2YtNjZkNC00ZDhkLWJjMWItN2QyNzFkMDE3ZjAxXkEyXkFqcGdeQXVyODIxMzk5NjA@._V1_SY1000_CR0,0,699,1000_AL_.jpg");
        mNames.add("Coco");
        mMovieDates.add("2017");
        mMovieTypes.add("Animation");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMjM1OTMxNzUyM15BMl5BanBnXkFtZTgwNjYzMTIzOTE@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        mNames.add("Suicide squad");
        mMovieDates.add("2016");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BNzAwNzUzNjY4MV5BMl5BanBnXkFtZTgwMTQ5MzM0NjM@._V1_.jpg");
        mNames.add("Venom");
        mMovieDates.add("2018");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMDQ2ZjUxMGUtMDg1Yy00ZWE4LWIyZTMtNThiN2IwZmE4ZDVkXkEyXkFqcGdeQXVyOTg4MDYyNw@@._V1_.jpg");
        mNames.add("Escape plan");
        mMovieDates.add("2019");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BZDNjYmY1ZDEtM2I3YS00MDhmLTk5NDYtYzU5MTA4ZjIyYzJiL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,674,1000_AL_.jpg");
        mNames.add("The score");
        mMovieDates.add("2001");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BYzY0YjAxZDEtMmFkZC00Yzc3LWFiNWYtMDQwOGNmY2NjZDIyXkEyXkFqcGdeQXVyODc0OTEyNDU@._V1_SY1000_CR0,0,666,1000_AL_.jpg");
        mNames.add("Transporter");
        mMovieDates.add("2002");
        mMovieTypes.add("Action");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMTAxNDYxMjg0MjNeQTJeQWpwZ15BbWU3MDcyNTk2OTM@._V1_.jpg");
        mNames.add("Tangled");
        mMovieDates.add("2010");
        mMovieTypes.add("Animation");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SY1000_CR0,0,671,1000_AL_.jpg");
        mNames.add("Titanic");
        mMovieDates.add("1997");
        mMovieTypes.add("Romantic");
        mImageUrls.add("https://m.media-amazon.com/images/M/MV5BMTUwODg2OTA4OF5BMl5BanBnXkFtZTgwOTE5MTE4MzE@._V1_.jpg");
        mNames.add("Focus");
        mMovieDates.add("2015");
        mMovieTypes.add("Drama");
        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init Recyclerview.");
        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,mImageUrls,mMovieDates,mMovieTypes);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

}
