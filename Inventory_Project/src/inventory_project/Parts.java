/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

/**
 *
 * @author Ty
 */
public abstract class Parts {
    
    //Class Variables
//    int partID;
//    String name;
//    double price;
//    boolean inStock;
//    int min;
//    int max;

    //Constructor(s)
//    public Parts(int partID, String name, double price, boolean inStock, int min, int max) {
//        this.partID = partID;
//        this.name = name;
//        this.price = price;
//        this.inStock = inStock;
//        this.min = min;
//        this.max = max;
//    }
    
       //Getters and Setters
    public abstract int getPartID();

    public abstract void setPartID(int partID);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public abstract boolean isInStock();

    public abstract void setInStock(boolean inStock);

    public abstract int getMin();

    public abstract void setMin(int min);

    public abstract int getMax();

    public abstract void setMax(int max);
    
    public abstract String toString();
    
    

//    //Getters and Setters
//    public int getPartID() {return this.partID;}
//
//    public void setPartID(int partID) {this.partID = partID;}
//
//    public String getName() {return this.name;}
//
//    public void setName(String name) {this.name = name;}
//
//    public double getPrice() {return this.price;}
//
//    public void setPrice(double price) {this.price = price;}
//
//    public boolean isInStock() {return this.inStock;}
//
//    public void setInStock(boolean inStock) {this.inStock = inStock;}
//
//    public int getMin() {return this.min;}
//
//    public void setMin(int min) {this.min = min;}
//
//    public int getMax() {return this.max;}
//
//    public void setMax(int max) {this.max = max;}
//    
//    public String toString(Parts part){
//        return "In Parts .toSring() method";
//    }
    
}
