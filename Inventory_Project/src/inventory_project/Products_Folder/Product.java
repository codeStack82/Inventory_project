package inventory_project.Products_Folder;
import inventory_project.Parts_Folder.Part;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
    private int productPartCount = this.associatedParts.size();
    
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
    }
    
    //Getters and Setters     
    public int getProductCount(){return this.productCount;}
    
    public int getProductPartCount(){return this.associatedParts.size();}
    
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

    //TODO: implement Error handling
    public void addAssociatedPart(Part part) throws IndexOutOfBoundsException{
        try{
            this.associatedParts.add(part);
        }catch(Exception e){
            throw new IndexOutOfBoundsException("The part: "+part.getName()+" was not addded to the Product!");
        }
    }
    
    //TODO: implement Error handling
    public boolean removeAssocatedPart(int partID) {        
        try{
            this.associatedParts.remove(partID);
            return true;
        }catch(IndexOutOfBoundsException e){
            return false;
        }
    }
    
    ///TODO: implement Error handling
    public Part lookUpAssociatedPart(int partID) throws IndexOutOfBoundsException {
        try{
            Part part = (Part)this.associatedParts.get(partID);
            return part;
        }catch(IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("The part: "+partID+" is not available in this product!");
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Product information: \n");
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
        sb.append(", Product Count: ");
        sb.append(this.getProductCount());
        sb.append(", Product Part Count: ");
        sb.append(this.getProductPartCount());
        return sb.toString();
    }
    
    public String printPartsInProduct(){
        StringBuilder sb = new StringBuilder();
  
        //Iterate Parts List
       Iterator iter = this.associatedParts.iterator();
       System.out.println("   Product Parts:");
        while(iter.hasNext()){
            System.out.println("\t"+iter.next().toString());
        }
        return sb.toString();
    }
      
}
