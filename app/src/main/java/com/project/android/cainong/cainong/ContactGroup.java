package com.project.android.cainong.cainong;

/**
 * Created by 13zqn on 2017/4/11.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pananping on 2017/4/10.
 */

public class ContactGroup {

    private List<Contact> mContacts = new ArrayList<Contact>();
    private String mGroupName;
    private int mPortraitRes;

    public ContactGroup(String groupName, int portraitRes) {
        mGroupName = groupName;
        mPortraitRes = portraitRes;
    }

    public int getChildCount() {
        return mContacts.size();
    }

    public Contact getChild(int index) {
        return mContacts.get(index);
    }

    public void add(Contact contact) {
        mContacts.add(contact);
    }

    public String getName() {
        return mGroupName;
    }

    public int getPortraitRes() {
        return mPortraitRes;
    }
}

