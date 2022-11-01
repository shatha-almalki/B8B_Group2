/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author st
 */
public class Admin {
    
    ArrayList<Flower>flowers = new ArrayList<>();
    int indx = 0;
    // LINA
    public boolean addFlower(Flower f) throws FileNotFoundException{
       flowers.add(f);
       return flowers.get(indx).equals(f); 
   }
    //LINA
    public boolean deleteFlower(String FlowerType) throws FileNotFoundException{
       for(int i=0;i<flowers.size();i++){
        if(flowers.get(i).FlowerType.equalsIgnoreCase(FlowerType))
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
