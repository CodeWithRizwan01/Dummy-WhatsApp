package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.example.whatsapp.AdaptersClasses.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

        TabLayout tabs;
        ViewPager viewPager;
//        RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = findViewById(R.id.Tab_layout);
        viewPager = findViewById(R.id.View_pager);
//        recyclerView = findViewById(R.id.Chat_recyclerview);

// fragment adapter work
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabs.setupWithViewPager(viewPager);

// chats fragment recyclerview work

//        ArrayList<FragmentChatModel> list = new ArrayList<>();
//
//        list.add(new FragmentChatModel(R.drawable.bhatti,"Moon Bhatti","Suna tu dasya hi ni","2:19 AM"));
//        list.add(new FragmentChatModel(R.drawable.cool,"VirGinity is Cool ","kya hal ha saad Bhi","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.hammad,"Hammad Aslam","Ok","10/11/12"));
//        list.add(new FragmentChatModel(R.drawable.hamzauthia,"Hamza Ch","Account ma kr dyta hon","11:19 PM"));
//        list.add(new FragmentChatModel(R.drawable.hamzai,"Hamza Kamalia","Message delete krta kr ky","10/18/22"));
//        list.add(new FragmentChatModel(R.drawable.hamza,"Hamza Safdar","Ok","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.kashif,"Kashif","Park ma aa ja abi","10/14/22"));
//        list.add(new FragmentChatModel(R.drawable.mansoor,"Mansoor Mazhar","Jani kya hal ha","10/8/22"));
//        list.add(new FragmentChatModel(R.drawable.muneeb,"Muneeb fr","Racket lzmi ly kr ana","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.noman,"Noman Rajput","Kal uni ana ky nhi","10/17/22"));
//        list.add(new FragmentChatModel(R.drawable.papa,"PaPa G","Assalikum kya hal ha","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.saad,"Hafiz Saad","Game ma aa abi noob","10:15 PM"));
//        list.add(new FragmentChatModel(R.drawable.usama,"Usama Sheikh","Apa team dty wa","2:19 AM"));
//        list.add(new FragmentChatModel(R.drawable.waseem,"Waseem Shahzad","Ameen","10/12/22"));
//        list.add(new FragmentChatModel(R.drawable.ali,"Rana Ali","Hostel aa ja ","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.bhatti,"Moon Bhatti","Suna tu dasya hi ni","2:19 AM"));
//        list.add(new FragmentChatModel(R.drawable.cool,"VirGinity is Cool ","kya hal ha saad Bhi","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.hammad,"Hammad Aslam","Ok","10/11/12"));
//        list.add(new FragmentChatModel(R.drawable.hamzauthia,"Hamza Ch","Account ma kr dyta hon","11:19 PM"));
//        list.add(new FragmentChatModel(R.drawable.hamzai,"Hamza Kamalia","Message delete krta kr ky","10/18/22"));
//        list.add(new FragmentChatModel(R.drawable.hamza,"Hamza Safdar","Ok","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.kashif,"Kashif","Park ma aa ja abi","10/14/22"));
//        list.add(new FragmentChatModel(R.drawable.mansoor,"Mansoor Mazhar","Jani kya hal ha","10/8/22"));
//        list.add(new FragmentChatModel(R.drawable.muneeb,"Muneeb fr","Racket lzmi ly kr ana","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.noman,"Noman Rajput","Kal uni ana ky nhi","10/17/22"));
//        list.add(new FragmentChatModel(R.drawable.papa,"PaPa G","Assalikum kya hal ha","Yesterday"));
//        list.add(new FragmentChatModel(R.drawable.saad,"Hafiz Saad","Game ma aa abi noob","10:15 PM"));
//        list.add(new FragmentChatModel(R.drawable.usama,"Usama Sheikh","Apa team dty wa","2:19 AM"));
//        list.add(new FragmentChatModel(R.drawable.waseem,"Waseem Shahzad","Ameen","10/12/22"));
//        list.add(new FragmentChatModel(R.drawable.ali,"Rana Ali","Hostel aa ja ","Yesterday"));
//
//        FragmentChatAdapter fragmentChatAdapter = new FragmentChatAdapter(this,list);
//        recyclerView.setAdapter(fragmentChatAdapter);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
    }

}