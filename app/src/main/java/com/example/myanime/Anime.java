package com.example.myanime;

import android.os.Parcel;
import android.os.Parcelable;

public class Anime implements Parcelable {
    private String title;
    private String tags;
    private String image;
    private String detail;

    public Anime(String title, String tags, String image, String detail) {
        this.title = title;
        this.tags = tags;
        this.image = image;
        this.detail = detail;
    }

    public Anime() {
    }

    protected Anime(Parcel in) {
        title = in.readString();
        tags = in.readString();
        image = in.readString();
        detail = in.readString();
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel in) {
            return new Anime(in);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() { return detail; }

    public void setDetail(String detail) { this.detail = detail; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(tags);
        parcel.writeString(image);
        parcel.writeString(detail);
    }
}
