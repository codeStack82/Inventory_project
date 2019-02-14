/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Products_Folder;
import java.util.ArrayList;
import inventory_project.Parts_Folder.Part;

/**
 *
 * @author Ty
 */
public class Products {
    
    //Class Variables
    private ArrayList associatedParts = new ArrayList<Part>();
    private int productID;
    private String name; //
    private double price;
    private boolean inStock;
    private int min;
    private int max;
    
    public Products(int productID, String name, double price, boolean inStock, int min, int max) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
    }
    

    //Getters and Setters  
    public void setName(String name){this.name = name;}
    
    public String getName(){return this.name;}
    
    public void setPrice (double price){this.price = price;}
    
    public double getPrice(){return this.price;}
    
    public void setInStock(boolean inStock){this.inStock = inStock;}
    
    public boolean getInstock(){return this.inStock;}
    
    public void setMin(int min){this.min = min;}
    
    public int getMin(){return this.min;}
    
    public void setMax(int max){this.max = max;}
    
    public int getMax(){return this.max;}
    
    public void setProductID(int productID){this.productID = productID;}
    
    public int getProductID(){return this.productID;}
        
    //TODO: implement 
    public void addAssociatedPart(Part part){

    }
    
    //TODO: implement
    public boolean removeAssocatedPart(int partID){
        boolean partRemoved = false;
        
        return partRemoved;
    }
    
    //TODOD: implement
    public int lookUpAssociatedPart(int partID){
    
        return partID;
    }
    
    //TODO: implement
    public String toString(Products product){
        return "In Products .toSring() method";
    }
      
}
