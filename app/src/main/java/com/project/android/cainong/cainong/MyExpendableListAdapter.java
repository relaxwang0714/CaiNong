package com.project.android.cainong.cainong;

/**
 * Created by 13zqn on 2017/4/11.
 */



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pananping on 2017/4/10.
 */

public class MyExpendableListAdapter extends BaseExpandableListAdapter {

    private List<ContactGroup> mContactGroup;
    private Context mContext;

    public MyExpendableListAdapter(Context context, List<ContactGroup> contactGroup) {
        mContext = context;
        mContactGroup = contactGroup;
    }

    @Override
    public int getGroupCount() {
        return mContactGroup.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return mContactGroup.get(i).getChildCount();
    }

    @Override
    public Object getGroup(int i) {
        return mContactGroup.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return mContactGroup.get(i).getChild(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.custom_listitem, null);
        }
        ((ImageView) view.findViewById(R.id.groupPortrait)).setImageResource(mContactGroup.get(i).getPortraitRes());
        ((TextView) view.findViewById(R.id.groupName)).setText(mContactGroup.get(i).getName());
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        if(view == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.custom_listsubmit, null);
        }
        ((ImageView) view.findViewById(R.id.childPortrait)).setImageResource(mContactGroup.get(i).getChild(i1).getPortraitRes());
        ((TextView) view.findViewById(R.id.childName)).setText(mContactGroup.get(i).getChild(i1).getName());
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}

