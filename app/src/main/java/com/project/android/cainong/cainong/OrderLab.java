package com.project.android.cainong.cainong;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by 13zqn on 2017/4/17.
 */

class OrderLab {
private static OrderLab sOrderLab;
    private List<OrderContain.Order> mOrders;
    public static OrderLab get(Context context){
        if (sOrderLab == null){
            sOrderLab = new OrderLab(context);
        }
        return sOrderLab;
    }
    private OrderLab(Context context){
        mOrders = new ArrayList<>();
        for (int i = 0;i<50;i++){
        OrderContain.Order order = new OrderContain.Order();
        order.setTitle("Order#"+i);
        mOrders.add(order);
        }
    }
    public List<OrderContain.Order> getOrders(){
        return mOrders;
    }
    public OrderContain.Order getOrder(UUID id){
        for(OrderContain.Order order:mOrders){
            if(order.getId().equals(id)){
                return order;
            }
        }
        return null;
    }
}
