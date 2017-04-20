package com.project.android.cainong.cainong;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 13zqn on 2017/4/17.
 */

public class ingFragment extends Fragment {
    private TextView mDaifahuo;
    private TextView mDaiFuKuan;
    private TextView mYiFaHuo;
    private TextView mTuiKuanZhong;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.ing_frame,container,false);
        mDaifahuo = (TextView) v.findViewById(R.id.ing_page_daifahuo);
        mDaifahuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.ing_container , new DaiFaHuo()).commit();
            }
        });
        mDaiFuKuan = (TextView) v.findViewById(R.id.ing_page_daifukuan);
        mDaiFuKuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.ing_container , new DaiFuKuan()).commit();
            }
        });
        mYiFaHuo = (TextView) v.findViewById(R.id.ing_page_fahuo);
        mYiFaHuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.ing_container , new YiFaHuo()).commit();
            }
        });
        mTuiKuanZhong = (TextView) v.findViewById(R.id.ing_page_tuikuan);
        mTuiKuanZhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.ing_container , new TuiKuanZhong()).commit();
            }
        });
        return v;
    }
}
