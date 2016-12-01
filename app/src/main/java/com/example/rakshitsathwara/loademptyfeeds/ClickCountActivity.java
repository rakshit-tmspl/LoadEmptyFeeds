package com.example.rakshitsathwara.loademptyfeeds;

import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rakshitsathwara.loademptyfeeds.databinding.ActivityClickCountBinding;

import butterknife.ButterKnife;
import butterknife.OnClick;
import mvvmlibrary.activity.ViewModelActivity;
import mvvmlibrary.viewmodel.ViewModel;
import viewmodel.ClickCountViewModel;

public class ClickCountActivity extends ViewModelActivity {

    private ClickCountViewModel clickCountViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityClickCountBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_click_count);
        binding.setViewModel(clickCountViewModel);
        ButterKnife.bind(this);
    }

    @Nullable
    @Override
    protected ViewModel createViewModel(@Nullable ViewModel.State savedViewModelState) {
        clickCountViewModel = new ClickCountViewModel(this, savedViewModelState);
        return clickCountViewModel;
    }

    @OnClick(R.id.clickButton)
    void onClickButton() {
        clickCountViewModel.onClickButton();
    }
}
