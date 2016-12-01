package com.example.rakshitsathwara.loademptyfeeds;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import adapter.MasterAdapter;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mvvmlibrary.activity.ViewModelActivity;
import mvvmlibrary.viewmodel.ViewModel;
import viewmodel.MainViewModel;

public class MainActivity extends ViewModelActivity {

    private RecyclerView rvFlightSearchResult;

    private FrameLayout flLoading;

    Context context;

    public MasterAdapter adapter;

    private LinearLayoutManager llm;

    public boolean loading = true;


    private MainViewModel mainViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        flLoading = (FrameLayout) findViewById(R.id.fl_loading);
//        flLoading.setVisibility(View.GONE);
//
//        rvFlightSearchResult = (RecyclerView) findViewById(R.id.rv_flightSearchResult);
//        rvFlightSearchResult.setHasFixedSize(true);
//
//        llm = new LinearLayoutManager(MainActivity.this);
//
//        rvFlightSearchResult.setLayoutManager(llm);
//
//        adapter = new MasterAdapter(MainActivity.this);
//
//        rvFlightSearchResult.setAdapter(adapter);
//
//        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
//        itemAnimator.setAddDuration(500);
//        itemAnimator.setRemoveDuration(500);
//        rvFlightSearchResult.setItemAnimator(itemAnimator);
//
//        if (loading) {
//            for (int i = 0; i < 10; i++) {
//                adapter.addEmptyView();
//            }
//        }
        ButterKnife.bind(this);
    }

    @Nullable
    @Override
    protected ViewModel createViewModel(@Nullable ViewModel.State savedViewModelState) {
        mainViewModel = new MainViewModel(savedViewModelState);
        return mainViewModel;
    }

    @OnClick(R.id.buttonClicks)
    void onClickButtonClicks() {
        mainViewModel.onClickButtonClicks(this);
    }

//    @OnClick(R.id.buttonRecyclerView)
//    void onClickButtonRecyclerView() {
//        mainViewModel.onClickButtonRecyclerView(this);
//    }
}