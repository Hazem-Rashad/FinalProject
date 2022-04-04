package com.example.distination;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class VideoAdapter extends ArrayAdapter<Video> {
    List<Video>video ;
    public VideoAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        video = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.video, parent , false);
        Video thisvideo = video.get(position);

        TextView namecon=view.findViewById(R.id.namecon);
        TextView namecit= view.findViewById(R.id.namecit);
        ImageView flag = view.findViewById(R.id.imageflag);


        namecon.setText(thisvideo.getNameofcountry());
        namecit.setText(thisvideo.getNameofcity());
        flag.setImageResource(thisvideo.getImageflag());



        return view ;
    }
}
