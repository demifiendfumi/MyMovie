package sg.edu.rp.c346.mymovie;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieRow> movieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = (ListView) findViewById(R.id.listViewMovie);
        movieList = new ArrayList<MovieRow>();

        caMovie = new CustomAdapter(this, R.layout.movie_row, movieList);
        lvMovie.setAdapter(caMovie);

        MovieRow m1 = new MovieRow("The Avengers", "2012", "Action | Sci-Fi", "pg13");
        movieList.add(m1);

        MovieRow m2 = new MovieRow("Planes", "2013", "Animation | Comedy", "pg");
        movieList.add(m2);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i == 0){
                    Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                    intent.putExtra("title", "The Avengers");
                    startActivity(intent);
                }
                else if(i == 1){
                    Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                    intent.putExtra("title", "Planes");
                    startActivity(intent);
                }


            }
        });

    }

}
