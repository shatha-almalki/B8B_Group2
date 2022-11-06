
import java.util.ArrayList;

public class Cart {

    private int itemCount = 0;
    private double totalPrice = 0.0;
    private ArrayList<Flower> cart = new ArrayList<>();
    Flower f;

    public void addToCart(String flowerType, int quantity, double price) {
        Flower f = new Flower(flowerType, quantity, price);
        itemCount += quantity;
        cart.add(f);
    }

// LAMA calculate bills (total)
    public double calculateBills(int quantity, double price) {
        for (int i = 0; i < cart.size(); i++) {
            double totalprice = quantity * price;
            this.totalPrice += totalPrice;
        }
        return totalPrice;
    }

    // SHATHA 
    // Check item status
    public boolean checkItem(){
        return false;
        // check item type
        
        // xheck quantity
    }
}
