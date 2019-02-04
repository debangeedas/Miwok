package com.example.android.miwok;

public class Words {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    //Drawable resource ID
    private int mImageResourceid = N0_IMAGE_PROVIDED;
    //Raw resource ID of audio clips

    private static final int N0_IMAGE_PROVIDED = -1;

    private int mAudioResourceid;

    //Constructor which takes in 2 strings and 1 integer image resource id as parameters and creates a word object
    public Words(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceid = imageResourceID;
        mAudioResourceid = audioResourceID;
    }

    //Constructor which takes in 2 string parameters and creates a word object
    public Words(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceid = audioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceid() { return mImageResourceid; }

    public boolean hasImage() {
        return mImageResourceid != N0_IMAGE_PROVIDED;
    }

    public int getAudioResourceid() { return mAudioResourceid; }
}
