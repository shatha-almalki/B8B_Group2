/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author st
 */
public class Flower {
    String FlowerType;
    int numOfFlower; 
    double price;

    public Flower(String FlowerType, int numOfFlower, double price) {
        this.FlowerType = FlowerType;
        this.numOfFlower = numOfFlower;
        this.price = price;
    }

   
    
    public void setFlowerType(String FlowerType) {
        this.FlowerType = FlowerType;
    }

    public void setNumOfFlower(int numOfFlower) {
        this.numOfFlower = numOfFlower;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlowerType() {
        return FlowerType;
    }

    public int getNumOfFlower() {
        return numOfFlower;
    }

    public double getPrice() {
        return price;
    }
    
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    
//    File flowers = new File("flower.txt");
//    Scanner input = new Scanner(flowers);
//    while(input.hasNextLine()){
//        
//    }
    
    
}
