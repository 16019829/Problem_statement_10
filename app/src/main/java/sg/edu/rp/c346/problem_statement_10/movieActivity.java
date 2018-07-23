package sg.edu.rp.c346.problem_statement_10;

import android.content.Intent;
import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class movieActivity extends AppCompatActivity {
    TextView tvTitle;
    TextView tvGenreandyear;
    TextView tvDescription;
    TextView tvWatched;
    TextView tvtheatre;
    ImageView ivRated;
    RatingBar rbRating;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ivRated = findViewById(R.id.imageView);
        tvTitle = findViewById(R.id.textViewTitle);
        tvGenreandyear = findViewById(R.id.textViewGenre);
        tvDescription = findViewById(R.id.textViewdescription);
        tvWatched = findViewById(R.id.textViewdate);
        tvtheatre = findViewById(R.id.textViewtheatre);
        rbRating = findViewById(R.id.ratingBar);


        Intent intentReceived = getIntent();

        ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("Mylist");

        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String description = intentReceived.getStringExtra("description");
        String theatre = intentReceived.getStringExtra("in_theatre");
        String watched = intentReceived.getStringExtra("date");
        String rated = intentReceived.getStringExtra("rated");

        tvTitle.setText(title);
        tvGenreandyear.setText(year + " - " + genre);
        tvDescription.setText(description);
        tvWatched.setText("Watch on: " + watched);
        tvtheatre.setText("In Theatre: " + theatre);
        int rating = intentReceived.getIntExtra("rating",0);

        rbRating.setNumStars(5);
        rbRating.setRating(rating);
        rbRating.setIsIndicator(true);

        if(rated.equals("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        }
        else if(rated.equals("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if(rated.equals("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if(rated.equals("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if(rated.equals("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        }
        else if(rated.equals("r21")){
            ivRated.setImageResource(R.drawable.rating_r21);
        }


    }
}
