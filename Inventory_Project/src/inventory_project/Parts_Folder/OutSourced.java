/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Parts_Folder;

/**
 *
 * @author Ty
 */
public class OutSourced extends Part {

   //Class variables
    private int partID;
    private String companyName;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;
    private static int outSourcedPartCount = 0;
    
    
    //Constructor(s)
    public OutSourced(int partID, String companyName, String name, double price, int inStock, int min, int max) {
        this.partID = partID;
        this.companyName = companyName;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
        this.outSourcedPartCount += 1;
    }
    
    //Getters and Setters
    public String getCompanyName() {return this.companyName;}

    public void setCompanyName(String companyName) {this.companyName = companyName;}

    public int getPartID() {return this.partID;}

    public void setPartID(int partID) {this.partID = partID;}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return this.price;}

    public void setPrice(double price) {this.price = price;}

    public int getInStock() {return this.inStock;}

    public void setInStock(int inStock) {this.inStock = inStock;}

    public int getMin() {return this.min;}

    public void setMin(int min) {this.min = min;}

    public int getMax() {return this.max;}

    public void setMax(int max) {this.max = max;}
    
    public int getPartCount(){return this.outSourcedPartCount;}
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Out sourced part information:\n");
        sb.append("\tPart Id: ");
        sb.append(this.getPartID());
        sb.append("\tCompany Name: ");
        sb.append(this.getCompanyName());
        sb.append(", Name: ");
        sb.append(this.getName());
        sb.append(", Price: ");
        sb.append(this.getPrice());
        sb.append(", In Stock: ");
        sb.append(this.getInStock());
        sb.append(", OutSourced Part Count: ");
        sb.append(this.getPartCount());
        sb.append(", Min: ");
        sb.append(this.getMin());
        sb.append(", Max: ");
        sb.append(this.getMax());
        
        return sb.toString();
  
    }    
}
