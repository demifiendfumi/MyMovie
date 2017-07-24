package sg.edu.rp.c346.mymovie;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;

    ArrayList<MovieRow> movieList;

    public CustomAdapter(Context context, int resource,
                         ArrayList<MovieRow> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = (TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = (TextView) rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = (TextView) rowView.findViewById(R.id.textViewGenre);
        ImageView boxRating = (ImageView) rowView.findViewById(R.id.imageViewRating);

        MovieRow currentItem = movieList.get(position);

        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());

        if(currentItem.getRating().equals("g")){
            boxRating.setImageResource(R.drawable.rating_g);
        }
        else if(currentItem.getRating().equals("pg")){
            boxRating.setImageResource(R.drawable.rating_pg);
        }
        else if(currentItem.getRating().equals("pg13")){
            boxRating.setImageResource(R.drawable.rating_pg13);
        }
        else if(currentItem.getRating().equals("nc16")){
            boxRating.setImageResource(R.drawable.rating_nc16);
        }
        else if(currentItem.getRating().equals("m18")){
            boxRating.setImageResource(R.drawable.rating_m18);
        }
        else{
            boxRating.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
