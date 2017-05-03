package com.example.goodshare.ui.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goodshare.R;
import com.example.goodshare.adapter.InformationAdapter;
import com.example.goodshare.db.Information;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2017/5/3.
 */

public class InformationFragment extends Fragment {

    private RecyclerView recyclerView;
    private InformationAdapter adapter;
    private static final List<Information> informationList = new ArrayList<>();
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        if (view != null) {
            return view;
        }

        view = inflater.inflate(R.layout.fragmennt_information, container, false);
        initInformation();
        recyclerView = (RecyclerView) view.findViewById(R.id.infor_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new InformationAdapter(informationList);
        recyclerView.setAdapter(adapter);

        return view;

    }

    private void initInformation() {
            Information infor1 = new Information("我的发布", R.mipmap.edit);
            informationList.add(infor1);
            Information infor2 = new Information("我的钱包", R.mipmap.edit);
            informationList.add(infor2);
    }
}
