package com.kleberaluizio.api.model;

public class Item {

    private String productName;
    private double unitGrossValue;
    private double unitDiscount;
    private int quantity;
    private boolean cancel;

    public Item(String productName, double unitGrossValue, int quantity){
        this(productName,unitGrossValue, 0, quantity);
    }

    public Item(String productName, double unitGrossValue, double unitDiscount, int quantity){
        this.productName = productName;
        this.unitGrossValue = unitGrossValue;
        this.unitDiscount = unitDiscount;
        this.quantity = quantity;
        this.cancel = false;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getItemTotalItemValue(){
        return (unitGrossValue - unitDiscount) * quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", unitGrossValue=" + unitGrossValue +
                ", unitDiscount=" + unitDiscount +
                ", quantity=" + quantity +
                ", cancel=" + cancel +
                '}';
    }
}
