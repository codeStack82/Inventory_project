/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Tests;
import inventory_project.Parts_Folder.*;
import inventory_project.Products_Folder.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Ty
 */
public class Test_Product {
    public static void main(String[] args){

    //Test part examples
    Bolt longBolt = new Bolt(0,"Long Bolt", 0.77, true, 10,500);
    Washer bigWasher = new Washer(1,"Large Washer", 0.57, true, 50 ,500);
    Nut bigNut = new Nut(2,"Large Nut", 0.47, true, 50 ,500);

    //Build Products
    ArrayList largeBoltKit = new ArrayList<Part>();
        largeBoltKit.add(longBolt);
        largeBoltKit.add(bigWasher);


    //Build Initial Product 
    Product large_boltKitProduct = new Product(largeBoltKit, 1,"Large Bolt Kit", 3.99, true, 10,75);
    System.out.println("-------Initial Product-------\n"+large_boltKitProduct.toString());

    String productParts = large_boltKitProduct.printPartsInProduct(); 
    System.out.println(productParts);
        
    
    //---------Test addAssociatedPart method
    large_boltKitProduct.addAssociatedPart(bigNut);
    System.out.println("-------Add Associated Part Method Test-------\n"+large_boltKitProduct.toString());
        
    String productParts1 = large_boltKitProduct.printPartsInProduct(); 
    System.out.println(productParts1);
        
    
    ////---------Test removeAssociatedPart method
    System.out.println("------Remove Associated Part Method Test-------\n"+large_boltKitProduct.toString());
    
    //Remove part by ID
    boolean wasPartRemoved = large_boltKitProduct.removeAssocatedPart(1);
    
    System.out.println("\tWas part Removed?:\t" + wasPartRemoved);
    String productParts2 = large_boltKitProduct.printPartsInProduct(); 
    System.out.println(productParts2);
        
    }
}
