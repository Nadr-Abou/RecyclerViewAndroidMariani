package com.example.listaprogetto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Project[] projects = {
            new Project(
                    "progetto_1",
                    "lorem ipsum",
                    R.drawable.img_1
            ),
            new Project(
                    "progetto_2",
                    "lorem ipsum",
                    R.drawable.img_2
                    ),
            new Project(
                    "progetto_3",
                    "lorem ipsum",
                    R.drawable.img_3
                    ),
            new Project(
                    "progetto_4",
                    "lorem ipsum",
                    R.drawable.img_4
                    ),
            new Project(
                    "progetto_5",
                    "lorem ipsum",
                    R.drawable.img_5
                    ),
            new Project(
                    "progetto_1",
                    "lorem ipsum",
                    R.drawable.img_1
            ),
            new Project(
                    "progetto_2",
                    "lorem ipsum",
                    R.drawable.img_2
            ),
            new Project(
                    "progetto_3",
                    "lorem ipsum",
                    R.drawable.img_3
            ),
            new Project(
                    "progetto_4",
                    "lorem ipsum",
                    R.drawable.img_4
            ),
            new Project(
                    "progetto_5",
                    "lorem ipsum",
                    R.drawable.img_5
            ),
            new Project(
                    "progetto_1",
                    "lorem ipsum",
                    R.drawable.img_1
            ),
            new Project(
                    "progetto_2",
                    "lorem ipsum",
                    R.drawable.img_2
            ),
            new Project(
                    "progetto_3",
                    "lorem ipsum",
                    R.drawable.img_3
            ),
            new Project(
                    "progetto_4",
                    "lorem ipsum",
                    R.drawable.img_4
            ),
            new Project(
                    "progetto_5",
                    "lorem ipsum",
                    R.drawable.img_5
            )
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_projects);
        ProjectsAdapter projectsAdapter = new ProjectsAdapter(projects);
        recyclerView.setAdapter(projectsAdapter);
    }
}