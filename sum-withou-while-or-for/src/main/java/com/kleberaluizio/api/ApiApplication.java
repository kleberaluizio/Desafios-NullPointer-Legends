package com.kleberaluizio.api;

import com.kleberaluizio.api.model.Client;
import com.kleberaluizio.api.model.Item;
import com.kleberaluizio.api.model.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ApiApplication.class, args);

		Client bob = new Client("Robert");
		ShoppingCart bobPurchases = new ShoppingCart(bob);

		Item item1 = new Item("soda",1.5,0.10,2);
		bobPurchases.addItem(item1);
		Item item2 = new Item("cake",9.49,1);
		bobPurchases.addItem(item2);
		Item item3 = new Item("milk",2.35,0.3,4);
		bobPurchases.addItem(item3);
		Item item4 = new Item("apple",1,4);
		bobPurchases.addItem(item4);

		bobPurchases.cancelItem(item2);
		bobPurchases.updateItemQuantity(item4, 9);

		for (Item purchase : bobPurchases.getPurchases()) {
			System.out.println(purchase);
		}

		System.out.println(bobPurchases.getPurchaseTotalValue());

	}

}
