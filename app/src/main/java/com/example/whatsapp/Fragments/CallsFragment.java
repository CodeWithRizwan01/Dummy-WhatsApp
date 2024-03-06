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

import com.example.whatsapp.AdaptersClasses.FragmentCallsAdapter;
import com.example.whatsapp.ModelClasses.CallsModel;
import com.example.whatsapp.R;

import java.util.ArrayList;


public class CallsFragment extends Fragment {

    RecyclerView recyclerView;

    public CallsFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_calls, container, false);

        recyclerView = rootView.findViewById(R.id.calls_recyclerView);

        ArrayList<CallsModel> list1= new ArrayList<>();

        list1.add(new CallsModel(R.drawable.mansoor,"Mansoor Mazhar","Yesterday, 7:10 PM"));
        list1.add(new CallsModel(R.drawable.saad,"Hafiz Saad","Today, 8:10 PM"));
        list1.add(new CallsModel(R.drawable.waseem,"Waseem Shahzad","yesterday, 9:10 AM"));
        list1.add(new CallsModel(R.drawable.noman,"Noman Rajput","Today, 5:10 PM"));

        FragmentCallsAdapter adapter2 = new FragmentCallsAdapter(getActivity().getApplicationContext(),list1);
        recyclerView.setAdapter(adapter2);

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
        inflater.inflate(R.menu.calls_menu, menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}