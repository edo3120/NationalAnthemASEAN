package com.example.nationalanthemasean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvState;
    private ArrayList<State> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvState = findViewById(R.id.rv_asean);
        rvState.setHasFixedSize(true);

        list.addAll(StateData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvState.setLayoutManager(new LinearLayoutManager(this));
        ListStateAdapter listStateAdapter = new ListStateAdapter(list);
        rvState.setAdapter(listStateAdapter);
    }
}
