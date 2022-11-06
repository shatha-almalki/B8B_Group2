package classes;

import java.util.ArrayList;


public class Cart {
  double  totalPrice ;
  double tax ;

ArrayList<Order> flower = new ArrayList<>();
     

    public Cart(ArrayList<Order> flower) {
        this.flower = flower;     
    }
        public double calculateBill() {
            double total =0.0;
        for (int i = 0; i < flower.size(); i++) {
            total = flower.get(i).QTY * flower.get(i).price;
           
            totalPrice += total; 
        }
        return totalPrice;
    }
    
    public double calculateTax() {
        
        tax = totalPrice * 0.15;
        return tax;
        
    }
}
