/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author st
 */
public class FlowerShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        File flowers = new File("flowers.txt");
        Scanner input = new Scanner(flowers);
        String type = "";
        int quantity = 0;
        double price = 0;
        ArrayList<Flower> flower = new ArrayList<>();

        while (input.hasNext()) {
            String str = input.next();
            switch (str) {
                case "Type":
                    type = input.next();
                    break;
                case "quantity":
                    quantity = Integer.parseInt(input.next());
                    break;
                case "price":
                    price = Double.parseDouble(input.next());
                    break;
            }
            Flower theFlower = new Flower(type, quantity, price);
            flower.add(theFlower);

        }
        PrintWriter output = new PrintWriter("output.txt");
        Admin admin = new Admin();
        for (Flower flower1 : flower) {
            admin.addFlower(flower1);
            output.write("flower " + flower1.getFlowerType() + " has been added successfully");
        }
        // -------------------------------------------------------------
        CashPayment cash = new CashPayment(100.00);

        CreditCardPayment credit = new CreditCardPayment(1000.00, "name1", "04/27", "123456789");

        cash.paymentDetails();
        credit.paymentDetails();

    }

}
