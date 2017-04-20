
package com.project.android.cainong.cainong;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

public class MainCustomChat extends AppCompatActivity {

    private ExpandableListView elv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maincustom);
        elv = (ExpandableListView) findViewById(R.id.elv1);
        List<ContactGroup> group = new ArrayList<ContactGroup>();
        String[] groupNames = {"上帝", "朋友", "客户"};
        for(int i = 0; i < 3; i++) {
            group.add(new ContactGroup(groupNames[i], getRandomPortrait()));
            for(int j = 0; j < 10; j++) {
                Contact contact = new Contact(getRandomName(), getRandomNumber(), getRandomPortrait());
                group.get(i).add(contact);
            }
        }
        MyExpendableListAdapter adapter = new MyExpendableListAdapter(this, group);
        elv.setAdapter(adapter);
    }

    private int getRandomPortrait() {
        int[] portraits = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
        return portraits[(int) Math.floor(Math.random() * 3)];
    }

    private String getRandomName() {
        String[] names = {"杀杀", "大柱子", "叶子", "菜菜", "土豪金", "门受", "音受", "思雨", "李月月", "吃剩"};
        return names[(int) Math.floor(Math.random() * 10)];
    }

    @NonNull
    private String getRandomNumber() {
        return String.valueOf((int) (Math.random() * 100000));
    }
}
