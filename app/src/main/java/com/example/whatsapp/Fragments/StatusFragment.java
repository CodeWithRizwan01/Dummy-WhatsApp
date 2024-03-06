package com.example.whatsapp.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp.AdaptersClasses.FragmentStatusAdapter;
import com.example.whatsapp.ModelClasses.FragmentStatusModel;
import com.example.whatsapp.R;

import java.util.ArrayList;


public class StatusFragment extends Fragment {

RecyclerView recyclerView;
ArrayList<FragmentStatusModel> list = new ArrayList<>();
    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_status, container, false);

        recyclerView = rootView.findViewById(R.id.status_fragment_recyclerview);
        list.add(new FragmentStatusModel(R.drawable.ali,"Rana Ali","Today, 3:16 PM"));
        list.add(new FragmentStatusModel(R.drawable.noman,"Noman Rajput","Just Now"));
        list.add(new FragmentStatusModel(R.drawable.waseem,"Waseem Shahzad","2 minutes ago"));
        list.add(new FragmentStatusModel(R.drawable.mansoor,"Mansoor Mazhar","Just Now"));

        FragmentStatusAdapter adapter = new FragmentStatusAdapter(getActivity().getApplicationContext(),list);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        return rootView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.status_menu, menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}