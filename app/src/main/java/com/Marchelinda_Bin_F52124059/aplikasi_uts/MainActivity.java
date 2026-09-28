package com.Marchelinda_Bin_F52124059.aplikasi_uts;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Array data film
    String[] judulFilm = {
            "Interstellar",
            "Inception",
            "Your Name",
            "Coco",
            "Avengers: Endgame",
            "Spider-Man: No Way Home",
            "How to Train Your Dragon",
            "The Conjuring"
    };

    String[] genreFilm = {
            "Sci-Fi",
            "Sci-Fi",
            "Romance",
            "Animation",
            "Action",
            "Action",
            "Animation",
            "Horror"
    };

    String[] tahunFilm = {
            "2014",
            "2010",
            "2016",
            "2017",
            "2019",
            "2021",
            "2010",
            "2013"
    };

    String[] ratingFilm = {
            "8.7",
            "8.8",
            "8.4",
            "8.4",
            "8.4",
            "8.2",
            "8.1",
            "7.5"
    };

    int[] posterFilm = {
            R.drawable.interstellar,
            R.drawable.inception,
            R.drawable.your_name,
            R.drawable.coco,
            R.drawable.avengers_endgame,
            R.drawable.spiderman_no_way_home,
            R.drawable.how_to_train_your_dragon,
            R.drawable.the_conjuring
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        ListView listViewMovies = findViewById(R.id.listViewMovies);

        MovieAdapter adapter = new MovieAdapter(
                this,
                judulFilm,
                genreFilm,
                tahunFilm,
                ratingFilm,
                posterFilm
        );

        listViewMovies.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );

            return insets;
        });
    }
}