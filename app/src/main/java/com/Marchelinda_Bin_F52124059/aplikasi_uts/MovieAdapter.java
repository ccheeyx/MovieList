package com.Marchelinda_Bin_F52124059.aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieAdapter extends BaseAdapter {

    private Context context;
    private String[] judulFilm;
    private String[] genreFilm;
    private String[] tahunFilm;
    private String[] ratingFilm;
    private int[] posterFilm;

    public MovieAdapter(
            Context context,
            String[] judulFilm,
            String[] genreFilm,
            String[] tahunFilm,
            String[] ratingFilm,
            int[] posterFilm) {

        this.context = context;
        this.judulFilm = judulFilm;
        this.genreFilm = genreFilm;
        this.tahunFilm = tahunFilm;
        this.ratingFilm = ratingFilm;
        this.posterFilm = posterFilm;
    }

    @Override
    public int getCount() {
        return judulFilm.length;
    }

    @Override
    public Object getItem(int position) {
        return judulFilm[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_movie, parent, false);
        }

        ImageView imgPoster = convertView.findViewById(R.id.imgPoster);
        TextView txtJudul = convertView.findViewById(R.id.txtJudul);
        TextView txtGenre = convertView.findViewById(R.id.txtGenre);
        TextView txtTahun = convertView.findViewById(R.id.txtTahun);
        TextView txtRating = convertView.findViewById(R.id.txtRating);

        imgPoster.setImageResource(posterFilm[position]);
        txtJudul.setText(judulFilm[position]);
        txtGenre.setText(genreFilm[position]);
        txtTahun.setText("Tahun: " + tahunFilm[position]);
        txtRating.setText("⭐ " + ratingFilm[position] + " / 10");

        return convertView;
    }
}