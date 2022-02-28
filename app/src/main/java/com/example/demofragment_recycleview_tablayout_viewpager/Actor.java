package com.example.demofragment_recycleview_tablayout_viewpager;

public class Actor {
private String actorName;
private int actorPhotoId;

    public Actor(String actorName, int actorPhotoId) {
        this.actorName = actorName;
        this.actorPhotoId = actorPhotoId;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getActorPhotoId() {
        return actorPhotoId;
    }

    public void setActorPhotoId(int actorPhotoId) {
        this.actorPhotoId = actorPhotoId;
    }
}
