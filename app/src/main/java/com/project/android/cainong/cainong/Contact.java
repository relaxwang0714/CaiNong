package com.project.android.cainong.cainong;

/**
 * Created by 13zqn on 2017/4/11.
 */

public class Contact {

    private String mName;
    private String mPhoneNumber;
    private int mPortraitRes;

    public Contact(String name, String number, int protraitRes) {
        mName = name;
        mPhoneNumber = number;
        mPortraitRes = protraitRes;
    }

    public int getPortraitRes() {
        return mPortraitRes;
    }

    public void setPortraitRes(int portraitRes) {
        mPortraitRes = portraitRes;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNumber() {
        return mPhoneNumber;
    }

    public void setNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }
}
