package com.project.android.cainong.cainong;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 13zqn on 2017/4/17.
 */

public class DaiFaHuo extends Fragment {
    private RecyclerView mRecyclerView;
    private OrderAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_order_daifahuo_list,container,false);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.daifahuo_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private void updateUI() {
        OrderLab orderLab = OrderLab.get(getActivity());
        List<OrderContain.Order> orders = orderLab.getOrders();
        mAdapter = new OrderAdapter(orders);
        mRecyclerView.setAdapter(mAdapter);
    }

    private class OrderHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public OrderHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView;
        }
    }
        private class OrderAdapter extends RecyclerView.Adapter<OrderHolder>{
            private List<OrderContain.Order> mOrders;
            public OrderAdapter(List<OrderContain.Order> orders){
                mOrders = orders;
            }

            @Override
            public OrderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
                View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,parent,false);
                return new OrderHolder(view);
            }

            @Override
            public void onBindViewHolder(OrderHolder holder, int position) {
                OrderContain.Order order = mOrders.get(position);
                holder.mTextView.setText(order.getTitle());
            }

            @Override
            public int getItemCount() {
                return mOrders.size();
            }
    }
}
