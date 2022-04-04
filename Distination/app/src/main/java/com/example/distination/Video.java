package com.example.distination;


import java.io.Serializable;

public class Video implements Serializable {
    private String nameofcountry ;
    private String nameofcity ;
    private int imageflag;
    private String video;

    public String getNameofcountry() {
        return nameofcountry;
    }

    public void setNameofcountry(String nameofcountry) {
        this.nameofcountry = nameofcountry;
    }

    public String getNameofcity() {
        return nameofcity;
    }

    public void setNameofcity(String nameofcity) {
        this.nameofcity = nameofcity;
    }

    public int getImageflag() {
        return imageflag;
    }

    public void setImageflag(int imageflag) {
        this.imageflag = imageflag;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }



    public Video(String nameofcountry, String nameofcity, int imageflag, String video) {
        this.nameofcountry = nameofcountry;
        this.nameofcity = nameofcity;
        this.imageflag = imageflag;
        this.video = video;
    }
}
