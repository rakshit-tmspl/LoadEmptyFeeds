package viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.example.rakshitsathwara.loademptyfeeds.ClickCountActivity;

import mvvmlibrary.viewmodel.ViewModel;

/**
 * Created by rakshit.sathwara on 12/1/2016.
 */

public class MainViewModel extends ViewModel {

    public MainViewModel(@Nullable State savedInstanceState) {
        super(savedInstanceState);
    }

    public void onClickButtonClicks(Activity activity) {
        activity.startActivity(new Intent(activity, ClickCountActivity.class));
    }
}
