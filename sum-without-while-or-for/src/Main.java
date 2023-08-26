public class Main {
    public static void main(String[] args) {

        Purchase bobPurchase = new Purchase("Robert");
        
        Item item1 = new Item("soda",1.5,0.10,2);
        bobPurchase.addItem(item1);
        Item item2 = new Item("cake",9.49,1);
        bobPurchase.addItem(item2);
        Item item3 = new Item("milk",2.35,0.3,4);
        bobPurchase.addItem(item3);

        bobPurchase.cancelItem(item2);

        for (Item purchase : bobPurchase.getPurchases()) {
            System.out.println(purchase);
        }

        System.out.println(bobPurchase.getPurchaseTotalValue());

    }
}