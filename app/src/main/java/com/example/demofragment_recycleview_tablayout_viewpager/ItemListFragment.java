package com.example.demofragment_recycleview_tablayout_viewpager;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ItemListFragment extends Fragment {
    private List<Actor> actorList;
    private RecyclerView recyclerView;
    private ActorAdapter actorAdapter;

    private static final String Tab = "tab";


    // TODO: Rename and change types and number of parameters
    public static ItemListFragment newInstance(int tab) {
        ItemListFragment fragment = new ItemListFragment();
        Bundle args = new Bundle();
        args.putInt(Tab, tab);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            int tab = getArguments().getInt("tab");
            createData(tab);
        }
    }

    private void createData(int tab) {
        actorList = new ArrayList<>();
        if(tab==0){
            Actor actor = new Actor("Thanh Hằng",R.drawable.thanhhang);
            actorList.add(actor);
             actor = new Actor("Công Phượng",R.drawable.congphuong);
            actorList.add(actor);
            actor = new Actor("Mỹ Tâm",R.drawable.mytam);
            actorList.add(actor);
             actor = new Actor("Ronadol",R.drawable.cr7);
            actorList.add(actor);
        }
        else {
            Actor actor = new Actor("Siêu nhân",R.drawable.sieunhan);
            actorList.add(actor);
            actor = new Actor("Người nhện",R.drawable.nguoinhen);
            actorList.add(actor);
        }
        actorAdapter = new ActorAdapter(actorList,this);
        actorAdapter.notifyDataSetChanged();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewDS);
        recyclerView.setLayoutManager(new LinearLayoutManager(context.getApplicationContext()));
        recyclerView.setAdapter(actorAdapter);
        return view;
    }
}