/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author st
 */
public class Admin {
     private static ArrayList<Flower>flowers = new ArrayList<>(); // to store all flowers avaiable in the store
    private static int indx = 0; // to track the flowers that have been added

    public static ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public static int getIndx() {
        return indx;
    }

    public static void setFlowers(ArrayList<Flower> flowers) {
        Admin.flowers = flowers;
    }

    public static void setIndx(int indx) {
        Admin.indx = indx;
    }
    
    // this method is responsible to add any new flower to the store
    // it will require first to create a flower object (new Flower) then call this method to insert the flower into the store
    public static boolean addFlower(Flower f) {
        
        flowers.add(f); // add the flower to the store (array)
        // if the flower has been added sucessfully, it will be equal to the latest flower in the array
        boolean isAdded = flowers.get(indx).equals(f); 
        indx++; // increase the variable to track the next flower
        return isAdded; // true if added & false if not 
       
    
   }
    
    public static boolean deleteFlower(String FlowerType) {
       for(int i=0;i<flowers.size();i++){
        if(flowers.get(i).getFlowerType().equalsIgnoreCase(FlowerType))
            flowers.remove(i);
        return true;
    }
       return false;
   }
    
    public void checkMessages(){
       
   }
    public void contactDeliveryMan() {
       
   }
    public void perpareOrder() {
       
   }
    public void generateReport() {
       
   }
 
}