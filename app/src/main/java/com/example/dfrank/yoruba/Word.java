package com.example.dfrank.yoruba;

/**
 * Created by dfrank on 6/20/17.
 */

public class Word {
    private String english;
    private String yoruba;
    private int images;
    private int audio;
    private static final int msetImages = -1;

    public Word(String english, String yoruba, int images, int audio) {
        this.english = english;
        this.yoruba = yoruba;
        this.images = images;
        this.audio=audio;
    }
    public Word(String english, String yoruba, int audio){
        this.english=english;
        this.yoruba=yoruba;
        this.audio=audio;
    }

    public String getEnglish() {
        return english;
    }

    public String getYoruba() {
        return yoruba;
    }

    public int getImages() {
        return images;
    }
    public  Boolean hasImage(){
        return images!=msetImages;
    }
    public int getAudio(){
        return audio;
    }
}
