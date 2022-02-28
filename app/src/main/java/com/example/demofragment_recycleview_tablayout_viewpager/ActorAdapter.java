package com.example.demofragment_recycleview_tablayout_viewpager;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    private List<Actor> actorList;
    private Fragment fragment;

    public ActorAdapter(List<Actor> actorList, Fragment fragment) {
        this.actorList = actorList;
        this.fragment = fragment;
    }

    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ActorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActorViewHolder holder, int position) {
//set value
        Actor actor = actorList.get(position);
        holder.txtActorName.setText(actor.getActorName());
        holder.imgActorPhoto.setImageResource(actor.getActorPhotoId());


        //sự kiện click vào item
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),actor.getActorName().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return actorList.size();
    }

    public class ActorViewHolder extends RecyclerView.ViewHolder{
        private TextView txtActorName;
        private ImageView imgActorPhoto;

        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);
            txtActorName = (TextView) itemView.findViewById(R.id.textViewActorName);
            imgActorPhoto = (ImageView) itemView.findViewById(R.id.imageViewActorPhoto);
        }
    }
}
