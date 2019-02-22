/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Inventory_Folder;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import inventory_project.Products_Folder.Product;
import inventory_project.Parts_Folder.Part;
import inventory_project.Products_Folder.Product;

/**
 *
 * @author Ty
 */
public class Inventory {
    ArrayList products = new ArrayList<Product>();
    ArrayList allParts = new ArrayList<Part>();
    Map partsMap = new HashMap<>();
    Map productsMap = new HashMap<>();
    private static int partsKey = 1000;
    private static int productsKey = 2000;
    
    //TODO: implement
    public void addProduct(Product product){
        products.add(product);
        
    }
    
    //TODO: implement
    public  boolean removeProduct(){
        boolean isRemoved = true;
        
        return isRemoved;
        
    }
    
    //TODO: implement -> needs to return Product
    public void lookupProduct(int partID){
        //roducts product = new Procduct();
        
        //returns product;
    }

    //TODO: implement
    public void updateProduct(int partID){
        
    }
    
    //TODO: implement
    public void addPart(Part part){
        allParts.add(part);
        int id = part.getPartCount()-1;
        System.out.println("Part id: "+ id+ " was added");
    }
    
    //TODO: implement
    public boolean deletePart(Part part){
        boolean isDeleted = false;
        int id = part.getPartCount();
        allParts.remove(id);
        System.out.println("Part id: "+ id+ " was removed");
        isDeleted = true;
        
        return isDeleted;
    }
    
    //TODO: implement -> needs to return Part
    public void lookUpParts(int partID){
    
        
        //return parts;
    }
    
    //TODO: implement
    public void updatePart(int partID){
        
    }
    
    //TODO: implement
    public String toString(Product product){
        return "In Inventory .toSring() method";
    }
    
    public void printInventoryParts(){
        System.out.println(this.allParts);
    }
}
