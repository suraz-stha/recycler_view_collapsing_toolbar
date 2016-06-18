package com.example.lazyboy.recycle_view;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.lazyboy.recycle_view.Rest.Response.MovieDetail;
import com.example.lazyboy.recycle_view.Rest.RetrofitManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private LinearLayoutManager linearLayoutManager;
    private GridLayoutManager gridLayoutManager;
    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);


        getSupportActionBar().setTitle("Popular Movies");





        /*RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);*/

//        gridLayoutManager = new GridLayoutManager(this, 2);
//
//        linearLayoutManager = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
////
////        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
//        recyclerView.setLayoutManager(gridLayoutManager);
//
//        List<ItemObjects> gaggredList = getListItemData();
//
//        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(MainActivity.this, gaggredList);
//        recyclerView.setAdapter(rcAdapter);

        RetrofitManager.getInstance().getMoviesDetail("500", "1f808486068440f0d080c45cd4803363", new Callback<MovieDetail>() {
            @Override
            public void onResponse(Call<MovieDetail> call, Response<MovieDetail> response) {
                Log.i("Success", "onResponse: " + response.body().getOriginal_title());

            }

            @Override
            public void onFailure(Call<MovieDetail> call, Throwable t) {

            }
        });



    }
    protected void initView(){button_sbm = (Button) findViewById(R.id.start);}
    public void start(View view){
        Intent startCollapseActivity = new Intent(MainActivity.this,Info_activity.class);
        startActivity(startCollapseActivity);
    }

    private List<ItemObjects> getListItemData() {
        List<ItemObjects> listViewItems = new ArrayList<>();
        listViewItems.add(new ItemObjects("Alkane", R.drawable.one));
        listViewItems.add(new ItemObjects("Ethane", R.drawable.two));
        listViewItems.add(new ItemObjects("Alkyne", R.drawable.three));
        listViewItems.add(new ItemObjects("Benzene", R.drawable.four));
        listViewItems.add(new ItemObjects("Amide", R.drawable.one));

        return listViewItems;
    }
}
