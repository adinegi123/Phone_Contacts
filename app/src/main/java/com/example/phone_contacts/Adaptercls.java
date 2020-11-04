package com.example.phone_contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptercls extends RecyclerView.Adapter<Adaptercls.Dataviewholder>{
    private String text1[];
    private String text2[];
    private int image_icon[];
    private Context context;
    public Adaptercls(String text1[], String text2[], int image_icon[], Context context){
        this.text1=text1;
        this.text2=text2;
        this.image_icon=image_icon;
        this.context=context;


    }
    @NonNull
    @Override
    public Dataviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.contacts_list_layout,parent,false);
        return new Dataviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Dataviewholder holder, int position) {
          final String person_name=text1[position];
          String phn_no=text2[position];
          int image1=image_icon[position];

          holder.t1.setText(person_name);
          holder.t2.setText(phn_no);
          holder.im1.setImageResource(image1);

          holder.itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(context, person_name, Toast.LENGTH_SHORT).show();
              }
          });

          holder.im1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

              }
          });
    }

    @Override
    public int getItemCount() {
        return text1.length;
    }

    class Dataviewholder extends RecyclerView.ViewHolder {
        TextView t1;
        TextView t2;
        ImageView im1;

        public Dataviewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.text1);
            t2=itemView.findViewById(R.id.text2);
            im1=itemView.findViewById(R.id.image1);

        }
    }
}
