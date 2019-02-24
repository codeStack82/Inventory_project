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
import java.util.Iterator;

/**
 *
 * @author Ty
 */
public class Inventory {
    
    //Class declarations
    ArrayList allproducts = new ArrayList<Product>();
    ArrayList allParts = new ArrayList<Part>();
    
    //Constrctor(s)
    public Inventory(){};
    public Inventory(ArrayList parts){};
    
    //TODO: implement
    public void addProduct(Product product){
        allproducts.add(product);
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
    
     /**
     * @info: Method to add new part
     * @param part
     */
    public void addPart(Part part){
        try{
            allParts.add(part);
            System.out.println("Part:\t\'"+ part.getName() + "\' was added");
        }catch(Exception e){
            System.out.println("Part:\t\'"+ part.getName() + "\' was NOT added");
        }
    }
    
    /**
     * @info: Method to delete part
     * @param part
     * @return boolean isDeleted
     */
    public boolean deletePart(Part part){
        boolean isDeleted = false;

        System.out.println("Removing part: "+ part.getName());
        try{
            allParts.remove(part);
            isDeleted = true;
        }catch(Exception e){
            System.out.println("Error: the part " + part.getName() + "was not removed");
        }
        
        return isDeleted;
    }
    
     /**
     * @info: Method to lookup part
     * @param part
     * @return part info
     */
    public Part lookUpParts(int partID){
        Part part = null;
        int getAllPartsID = -1;
        try{
            for(int i = 0; i < allParts.size(); i++){
                Part partTest = (Part)allParts.get(i);
                
                //Get arraylist id of part if exists
                if(partTest.getPartID() == partID){
                   getAllPartsID = i;
                }
            }
            // Set part id if exists
            if(getAllPartsID != -1){
                part = (Part)allParts.get(getAllPartsID);
            }
        }catch(Exception e){
            System.out.println("Error: Lookup parts method");
        }
        
        return part;
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
