package com.project.android.cainong.cainong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by 13zqn on 2017/4/10.
 */

public class MainContain extends AppCompatActivity {
    private ImageButton mgoods;
    private ImageButton mcustomer;
    private ImageButton mincome;
    private ImageButton morder;
    private ImageButton mcount;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maincontain);
        mgoods = (ImageButton)findViewById(R.id.goods);
        mcustomer = (ImageButton)findViewById(R.id.customer);
        mgoods.setOnClickListener(new mgoodsButton());
        mcustomer.setOnClickListener(new mcustomerButton());
        mincome = (ImageButton)findViewById(R.id.income);
        mincome.setOnClickListener(new mincomeButton());
        morder = (ImageButton)findViewById(R.id.order);
        morder.setOnClickListener(new morderButton());
        mcount = (ImageButton)findViewById(R.id.count);
        mcount.setOnClickListener(new mcountButton());
    }

    private class mgoodsButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainContain.this,Goods.class);
            MainContain.this.startActivity(intent);
        }
    }

    private class mcustomerButton implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainContain.this,MainCustomChat.class);
            MainContain.this.startActivity(intent);
        }
    }
    private class mincomeButton implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainContain.this,InCome.class);
            MainContain.this.startActivity(intent);
        }
    }
    private class morderButton implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainContain.this,OrderContain.class);
            MainContain.this.startActivity(intent);
        }
    }
    private class mcountButton implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainContain.this,Count.class);
            MainContain.this.startActivity(intent);
        }
    }
}
