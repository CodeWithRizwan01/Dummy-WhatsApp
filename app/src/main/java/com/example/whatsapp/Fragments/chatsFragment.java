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
import android.widget.Toast;

import com.example.whatsapp.AdaptersClasses.FragmentChatAdapter;
import com.example.whatsapp.MainActivity;
import com.example.whatsapp.ModelClasses.FragmentChatModel;
import com.example.whatsapp.R;

import java.util.ArrayList;


public class chatsFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<FragmentChatModel> list = new ArrayList<>();


    public chatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView = rootView.findViewById(R.id.Chat_recyclerview);
        list.add(new FragmentChatModel(R.drawable.bhatti, "Moon Bhatti", "Suna tu dasya hi ni", "2:19 AM"));
        list.add(new FragmentChatModel(R.drawable.cool, "VirGinity is Cool ", "kya hal ha saad Bhi", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.hammad, "Hammad Aslam", "Ok", "10/11/12"));
        list.add(new FragmentChatModel(R.drawable.hamzauthia, "Hamza Ch", "Account ma kr dyta hon", "11:19 PM"));
        list.add(new FragmentChatModel(R.drawable.hamzai, "Hamza Kamalia", "Message delete krta kr ky", "10/18/22"));
        list.add(new FragmentChatModel(R.drawable.hamza, "Hamza Safdar", "Ok", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.kashif, "Kashif", "Park ma aa ja abi", "10/14/22"));
        list.add(new FragmentChatModel(R.drawable.mansoor, "Mansoor Mazhar", "Jani kya hal ha", "10/8/22"));
        list.add(new FragmentChatModel(R.drawable.muneeb, "Muneeb fr", "Racket lzmi ly kr ana", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.noman, "Noman Rajput", "Kal uni ana ky nhi", "10/17/22"));
        list.add(new FragmentChatModel(R.drawable.papa, "PaPa G", "Assalikum kya hal ha", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.saad, "Hafiz Saad", "Game ma aa abi noob", "10:15 PM"));
        list.add(new FragmentChatModel(R.drawable.usama, "Usama Sheikh", "Apa team dty wa", "2:19 AM"));
        list.add(new FragmentChatModel(R.drawable.waseem, "Waseem Shahzad", "Ameen", "10/12/22"));
        list.add(new FragmentChatModel(R.drawable.ali, "Rana Ali", "Hostel aa ja ", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.bhatti, "Moon Bhatti", "Suna tu dasya hi ni", "2:19 AM"));
        list.add(new FragmentChatModel(R.drawable.cool, "VirGinity is Cool ", "kya hal ha saad Bhi", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.hammad, "Hammad Aslam", "Ok", "10/11/12"));
        list.add(new FragmentChatModel(R.drawable.hamzauthia, "Hamza Ch", "Account ma kr dyta hon", "11:19 PM"));
        list.add(new FragmentChatModel(R.drawable.hamzai, "Hamza Kamalia", "Message delete krta kr ky", "10/18/22"));
        list.add(new FragmentChatModel(R.drawable.hamza, "Hamza Safdar", "Ok", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.kashif, "Kashif", "Park ma aa ja abi", "10/14/22"));
        list.add(new FragmentChatModel(R.drawable.mansoor, "Mansoor Mazhar", "Jani kya hal ha", "10/8/22"));
        list.add(new FragmentChatModel(R.drawable.muneeb, "Muneeb fr", "Racket lzmi ly kr ana", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.noman, "Noman Rajput", "Kal uni ana ky nhi", "10/17/22"));
        list.add(new FragmentChatModel(R.drawable.papa, "PaPa G", "Assalikum kya hal ha", "Yesterday"));
        list.add(new FragmentChatModel(R.drawable.saad, "Hafiz Saad", "Game ma aa abi noob", "10:15 PM"));
        list.add(new FragmentChatModel(R.drawable.usama, "Usama Sheikh", "Apa team dty wa", "2:19 AM"));
        list.add(new FragmentChatModel(R.drawable.waseem, "Waseem Shahzad", "Ameen", "10/12/22"));
        list.add(new FragmentChatModel(R.drawable.ali, "Rana Ali", "Hostel aa ja ", "Yesterday"));

        FragmentChatAdapter fragmentChatAdapter = new FragmentChatAdapter(getActivity().getApplicationContext(), list);
        recyclerView.setAdapter(fragmentChatAdapter);

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
        inflater.inflate(R.menu.chats_menu, menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
