package sg.edu.rp.c346.mymovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);
        TextView tvTitle;
        TextView tvDescript;
        TextView tvWatch;
        TextView tvTheatre;
        TextView tvYear;
        TextView tvGenre;
        ImageView boxRate;

        tvDescript = (TextView) findViewById(R.id.textViewDescript);
        tvWatch = (TextView) findViewById(R.id.textViewWatchOn);
        tvTheatre = (TextView) findViewById(R.id.textViewInTheatre);
        tvTitle = (TextView) findViewById(R.id.textViewHead);
        tvYear = (TextView) findViewById(R.id.textViewDate);
        tvGenre = (TextView) findViewById(R.id.textViewType);
        boxRate = (ImageView) findViewById(R.id.imageViewRate);

        Bundle intentReceived = getIntent().getExtras();
        if(intentReceived != null){
            String title = (String) intentReceived.get("title");
            if(title.equals("The Avengers")){
                tvTitle.setText("The Avengers");
                tvYear.setText("2012");
                tvGenre.setText("Action | Sci-Fi");
                tvDescript.setText("Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
                tvWatch.setText("15/11/2014");
                tvTheatre.setText("Golden Village - Bishan");
                boxRate.setImageResource(R.drawable.rating_pg13);
            }
            else if(title.equals("Planes")){
                tvTitle.setText("Planes");
                tvYear.setText("2013");
                tvGenre.setText("Animation | Comedy");
                tvDescript.setText("A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
                tvWatch.setText("15/5/2015");
                tvTheatre.setText("Cathay - AMK Hub");
                boxRate.setImageResource(R.drawable.rating_pg);
            }

        }
    }
}
