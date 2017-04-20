package com.project.android.cainong.cainong;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.TextView;

import java.util.UUID;

/**
 * Created by 13zqn on 2017/4/17.
 */

public class OrderContain extends FragmentActivity {
    private TextView ing;
    private TextView ed;
    private TextView all;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        ing = (TextView)findViewById(R.id.ing);
        ed = (TextView)findViewById(R.id.ed);
        all = (TextView)findViewById(R.id.all);
        ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                Fragment fragment = fm.findFragmentById(R.id.order_contain);
                if (fragment == null) {
                    fragment = new ingFragment();
                    fm.beginTransaction().add(R.id.order_contain, fragment).commit();
                }else {
                    fragment = new ingFragment();
                    fm.beginTransaction().replace(R.id.order_contain, fragment).commit();
                }
            }
        });
        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                Fragment fragment = fm.findFragmentById(R.id.order_contain);
                if (fragment == null){
                    fragment = new edFragment();
                    fm.beginTransaction().add(R.id.order_contain,fragment).commit();
                }else {
                    fragment = new edFragment();
                    fm.beginTransaction().replace(R.id.order_contain, fragment).commit();
                }
            }
        });
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                Fragment fragment = fm.findFragmentById(R.id.order_contain);
                if (fragment == null){
                    fragment = new allFragment();
                    fm.beginTransaction().add(R.id.order_contain,fragment).commit();
                }else {
                    fragment = new allFragment();
                    fm.beginTransaction().replace(R.id.order_contain, fragment).commit();
                }
            }
        });

    }

    /**
     * Created by 13zqn on 2017/4/17.
     */

    static class Order {
        private UUID mId;
        private String mTitle;
        public Order(){
            mId = UUID.randomUUID();
        }

        public UUID getId() {
            return mId;
        }

        public String getTitle() {
            return mTitle;
        }

        public void setTitle(String title) {
            mTitle = title;
        }
    }
}
