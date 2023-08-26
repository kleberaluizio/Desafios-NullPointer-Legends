import java.time.LocalDate;

public class Item {


    private String procuctName;
    private double unitGrossValue;
    private double unitDiscount;
    private int quantity;
    private boolean cancel;
    private double totalValue;

    public Item (String productName, double unitGrossValue, int quantity){
        this(productName, unitGrossValue, 0, quantity);
    }
    public Item (String productName, double unitGrossValue, double unitDiscount, int quantity){
        this.procuctName = productName;
        this.unitGrossValue = unitGrossValue;
        this.unitDiscount = unitDiscount;
        this.quantity = quantity;
        this.cancel = false;

        calculateItemTotalValue();
    }
    public void calculateItemTotalValue(){
        this.totalValue = (unitGrossValue - unitDiscount) * quantity;
    }

    public double getTotalValue(){
        return this.totalValue;
    }

    public void cancel() {
        this.cancel = true;
    }

    @Override
    public String toString() {
        return "Item{" +
                "procuctName='" + procuctName + '\'' +
                ", unitGrossValue=" + unitGrossValue +
                ", unitDiscount=" + unitDiscount +
                ", quantity=" + quantity +
                ", cancel=" + cancel +
                ", totalValue=" + totalValue +
                '}';
    }
}
