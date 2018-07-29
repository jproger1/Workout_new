package com.jproger.workout_new;

import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements WorkoutListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            //TODO add fragment code
            WorkoutDetailFragment fragment = new WorkoutDetailFragment();
           FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
           fragment.setWorkoutId(id);
           transaction.replace(R.id.fragment_container, fragment);
           transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
           transaction.addToBackStack(null);
           transaction.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
            startActivity(intent);
        }
    }
}
