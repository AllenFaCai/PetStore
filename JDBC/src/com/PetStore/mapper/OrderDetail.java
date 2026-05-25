package com.PetStore.mapper;

public class OrderDetail {
    private long orderid;
    private String proudctid;
    private int quantity;
    private double unitcost;

    public long getOrderid(){
    return orderid;

    }
    public void setOrderid(long orderid){
        this.orderid = orderid;
    }

    public double getUnitcost(){
        return unitcost;
    }
    public String getProudctid(){
        return proudctid;
    }
    public  void setProudctid(String proudctid){
        this.proudctid = proudctid;
    }
    public int getQuantity(){
        return  quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

