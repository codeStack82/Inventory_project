/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Parts_Folder;
import inventory_project.Parts_Folder.Part;
import java.lang.StringBuilder;
/**
 *
 * @author Ty
 */
public class Nut extends Part {
     
    //Class Variables
    int partID;
    String name;
    double price;
    boolean inStock;
    int min;
    int max;

    //Constructor(s)
    public Nut(int partID, String name, double price, boolean inStock, int min, int max) {
        this.partID = partID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
    }
    
    //Getters and Setters
    public int getPartID() {return this.partID;}

    public void setPartID(int partID) {this.partID = partID;}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return this.price;}

    public void setPrice(double price) {this.price = price;}

    public boolean getInStock() {return this.inStock;}

    public void setInStock(boolean inStock) {this.inStock = inStock;}

    public int getMin() {return this.min;}

    public void setMin(int min) {this.min = min;}

    public int getMax() {return this.max;}

    public void setMax(int max) {this.max = max;}
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Nut information:\n");
        sb.append("\tPart Id: ");
        sb.append(this.getPartID());
        sb.append(", Name: ");
        sb.append(this.getName());
        sb.append(", Price: ");
        sb.append(this.getPrice());
        sb.append(", In Stock: ");
        sb.append(this.getInStock());
        sb.append(", Min: ");
        sb.append(this.getMin());
        sb.append(", Max: ");
        sb.append(this.getMax());
        
        return sb.toString();
  
    }
    
}