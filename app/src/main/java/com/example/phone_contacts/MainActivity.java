package com.example.phone_contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView Phonecontacts=findViewById(R.id.Phone_contacts_2_0);
        Phonecontacts.setLayoutManager(new LinearLayoutManager(this));
        String perso_nm[]={"JOHN","MICHAEL","JOHHNY","MARTHA","LOIS","AMBER","TONY","EMILY"};
        String ph_no[]={"9456315624","2314256347","3546271890","3425163847","3645263733","3546342516","4455336622","7465664455"};
        int image_first[]={R.drawable.person_9,R.drawable.person_10,R.drawable.person_11,R.drawable.person_12,R.drawable.person_13,R.drawable.person_14,R.drawable.person_15,R.drawable.person_16};
        Phonecontacts.setAdapter(new Adaptercls(perso_nm,ph_no,image_first,this));




    }
}
