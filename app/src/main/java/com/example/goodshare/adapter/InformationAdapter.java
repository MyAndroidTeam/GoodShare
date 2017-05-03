package com.example.goodshare.adapter;

import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.goodshare.R;
import com.example.goodshare.db.Information;

import java.util.List;

/**
 * Created by pc on 2017/5/3.
 */

public class InformationAdapter extends RecyclerView.Adapter<InformationAdapter.ViewHolder> {

    private List<Information> mInnformation;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView informationImage;
        TextView informationName;
        public ViewHolder(View itemView) {
            super(itemView);
            informationImage = (ImageView) itemView.findViewById(R.id.infor_image);
            informationName = (TextView) itemView.findViewById(R.id.infor_text);
        }
    }

    public InformationAdapter(List<Information> informationList) {
        mInnformation = informationList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_information, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Information information = mInnformation.get(position);
        holder.informationImage.setImageResource(information.getImageId());
        holder.informationName.setText(information.getName());
    }

    @Override
    public int getItemCount() {
        return mInnformation.size();
    }
}
