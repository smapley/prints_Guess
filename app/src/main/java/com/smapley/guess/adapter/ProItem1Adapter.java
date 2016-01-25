package com.smapley.guess.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smapley.guess.R;
import com.smapley.guess.holder.Pro_Item1_Holder;
import com.smapley.guess.mode.Pro_Item1_Mode;

import java.util.List;

/**
 * Created by smapley on 15/11/17.
 */
public class ProItem1Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<Pro_Item1_Mode> list;
    private LayoutInflater inflater;


    public ProItem1Adapter(Context context, List<Pro_Item1_Mode> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }


    public void addAll(List<Pro_Item1_Mode> obj) {
        list = obj;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case 0:
            case 1:
            case 2:
                view = inflater.inflate(R.layout.adapter_pro_item1_item, parent, false);
                return new Pro_Item1_Holder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        switch (getItemViewType(position)) {
            case 0:
            case 1:
            case 2:
                ((Pro_Item1_Holder) holder).setData(context, list.get(position));
                break;

        }
    }

    @Override
    public int getItemCount() {
        if (list == null)
            return 0;
        else
            return list.size();
    }


    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }
}