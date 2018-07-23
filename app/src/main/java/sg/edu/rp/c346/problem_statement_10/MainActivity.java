package sg.edu.rp.c346.problem_statement_10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItems> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2014,12,15);
        Calendar date2 = Calendar.getInstance();
        date2.set(2015,10,15);

        final MovieItems item1 = new MovieItems("The Avengers","2012","pg13","Action | Sci-Fi", date1, "Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.",4);
        MovieItems item2 = new MovieItems("Planes","2013","pg","Animation | Comedy",date2,"cathy - AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",3);
        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this,R.layout.movie_item,alMovieList);

        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), movieActivity.class);
                MovieItems pos = alMovieList.get(position);

                intent.putExtra("Mylist", (Serializable) pos);


                intent.putExtra("title", pos.getTitle());
                intent.putExtra("year", pos.getYear());
                intent.putExtra("genre", pos.getGenre());
                intent.putExtra("rated",pos.getRated());
                intent.putExtra("date", pos.getDateString());
                intent.putExtra("in_theatre", pos.getIn_theatre());
                intent.putExtra("description", pos.getDescription());
                intent.putExtra("rating",pos.getRating());

                startActivity(intent);
            }});
    }

}
