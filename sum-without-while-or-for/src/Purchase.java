import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private List<Item> purchases;
    private final LocalDate date;
    private final String client;
    private double purchaseTotalValue;

    public Purchase(String clientName){
        this.client = clientName;
        this.date = LocalDate.now();
        this.purchases = new ArrayList<>();
        this.purchaseTotalValue = 0;
    }

    public List<Item> getPurchases(){
        return purchases;
    }

    public void addItem(Item item){
        this.purchases.add(item);
        this.purchaseTotalValue += item.getTotalValue();
    }

    public double getPurchaseTotalValue(){
     return this.purchaseTotalValue;
    }

    public boolean cancelItem(Item item){
        item.cancel();
        boolean removed = this.purchases.remove(item);
        this.purchaseTotalValue -= item.getTotalValue();
        return removed;
    }
}
