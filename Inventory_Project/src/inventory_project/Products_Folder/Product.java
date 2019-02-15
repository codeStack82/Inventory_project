package inventory_project.Products_Folder;
import java.util.ArrayList;
import inventory_project.Parts_Folder.Part;

public class Product {
    
    //Class Variables
    private ArrayList associatedParts = new ArrayList<Part>();
    private int productID;
    private String name; //
    private double price;
    private boolean inStock;
    private int min;
    private int max;
    private static int productCount = 0;
    private static int productPartCount = 0;
    
    public Product(ArrayList associatedParts, int productID, String name, double price, boolean inStock, int min, int max) {
        this.associatedParts = associatedParts;
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
        
        //Additional Product Fields
        this.productCount += 1;
        this.productPartCount = associatedParts.size();
    }
    
    //Getters and Setters     
    public int getProductCount(){return this.productCount;}
    
    public int getProductPartsCount(){return this.productPartCount;}
    
    public void setName(String name){this.name = name;}
    
    public String getName(){return this.name;}
    
    public void setPrice (double price){this.price = price;}
    
    public double getPrice(){return this.price;}
    
    public void setInStock(boolean inStock){this.inStock = inStock;}
    
    public boolean getInStock(){return this.inStock;}
    
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
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Product information:\n");
        sb.append("\tProduct Id: ");
        sb.append(this.getProductID());
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
