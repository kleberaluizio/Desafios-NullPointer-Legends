package com.kleberaluizio.api.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Client client;
    private final LocalDate date;
    private List<Item> purchases;
    private double purchaseTotalValue;

    public ShoppingCart(Client client){
        this.client = client;
        this.date = LocalDate.now();
        this.purchases = new ArrayList<>();
        this.purchaseTotalValue = 0;
    }

    public List<Item> getPurchases(){
        return purchases;
    }

    public double getPurchaseTotalValue(){
        return this.purchaseTotalValue;
    }


    public void addItem(Item item){
        this.purchases.add(item);
        updatePurchaseTotalValue(item.getItemTotalItemValue());
    }

    public boolean cancelItem(Item item){
        boolean removed = this.purchases.remove(item);
        updatePurchaseTotalValue(-item.getItemTotalItemValue());
        return removed;
    }

    public void updateItemQuantity(Item item, int quantity){
        updatePurchaseTotalValue(-item.getItemTotalItemValue());
        item.setQuantity(quantity);
        updatePurchaseTotalValue(item.getItemTotalItemValue());
    }

    protected void updatePurchaseTotalValue(double itemTotalValue){
        this.purchaseTotalValue += itemTotalValue;
    }
}
