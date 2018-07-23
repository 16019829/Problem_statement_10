package sg.edu.rp.c346.problem_statement_10;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16020089 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<MovieItems> MovieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MovieItems> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        MovieList = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.

        ImageView ivImpt = rowView.findViewById(R.id.imageView);
        TextView title = rowView.findViewById(R.id.textViewTitle);
        TextView desciption = rowView.findViewById(R.id.textViewDesc);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        MovieItems currentItem = MovieList.get(position);

        title.setText(currentItem.getTitle());
        desciption.setText(currentItem.getYear() + " " + currentItem.getGenre());
        if (currentItem.getRated() == "g"){
            ivImpt.setImageResource(R.drawable.rating_g);
        }
        else if (currentItem.getRated() == "pg"){
            ivImpt.setImageResource(R.drawable.rating_pg);
        }
        else if (currentItem.getRated() == "pg13"){
            ivImpt.setImageResource(R.drawable.rating_pg13);
        }
        else if (currentItem.getRated() == "nc16"){
            ivImpt.setImageResource(R.drawable.rating_nc16);
        }
        else if (currentItem.getRated() == "m18"){
            ivImpt.setImageResource(R.drawable.rating_m18);
        }
        else {
            ivImpt.setImageResource(R.drawable.rating_r21);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
