package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

import component.FeedsComponents;
import viewholder.EmptyVH;


/**
 * Created by rakshit.sathwara on 12/1/2016.
 */

public class MasterAdapter extends RecyclerView.Adapter {

    public List<FeedsComponents> feedsComponentsList;
    private Context context;

    public MasterAdapter(final Context context) {
        this.context = context;
        feedsComponentsList = new LinkedList<>();
    }

    public void addEmptyView() {
        final FeedsComponents component = new FeedsComponents(null, FeedsComponents.EMPTY_VIEW);
        feedsComponentsList.add(component);
        Log.i("MasterAdapter", "addEmptyView: ADDING EMPTY VIEW: " + feedsComponentsList.size());

        notifyItemInserted(feedsComponentsList.size());
    }

    @Override
    public int getItemViewType(int position) {
        return feedsComponentsList.get(position).getViewtype();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case FeedsComponents.EMPTY_VIEW:
                return EmptyVH.create(context, parent);
        }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)) {
            case FeedsComponents.EMPTY_VIEW:
                EmptyVH.bind((EmptyVH) holder);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return feedsComponentsList.size();
    }
}
