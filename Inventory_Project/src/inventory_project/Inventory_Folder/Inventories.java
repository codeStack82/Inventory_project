/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Inventory_Folder;
import java.util.ArrayList;
import inventory_project.Products_Folder.Product;
import inventory_project.Parts_Folder.Part;
import inventory_project.Products_Folder.Product;

/**
 *
 * @author Ty
 */
public class Inventories {
    ArrayList products = new ArrayList<Product>();
    ArrayList allParts = new ArrayList<Part>();
    
    //TODO: implement
    public void addProduct(Product product){
    
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
    public void addPart(int partID){
    
    }
    
    //TODO: implement
    public boolean deletePart(Part part){
        boolean isDeleted = false;
        
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
}
