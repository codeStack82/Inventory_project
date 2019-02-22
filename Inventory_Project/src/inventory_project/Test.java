/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import inventory_project.Parts_Folder.InHouse;
import inventory_project.Parts_Folder.OutSourced;
import inventory_project.Parts_Folder.Part;
import inventory_project.Products_Folder.Product;
import java.util.ArrayList;

/**
 *
 * @author Ty
 */
public class Test {
    
    public static void main(String args[]){
        
        //In house parts
        InHouse part1 = new InHouse(1,23, "Bolt", 0.55, 4, 10, 500);
        System.out.println(part1.toString());

        //Outsourced Parts
        OutSourced part2 = new OutSourced(2,"Ty Tools 123", "Bolt", 0.55, 4, 10, 500);
        System.out.println(part2.toString());

        OutSourced part3 = new OutSourced(3,"Brad Tools 456", "Washers", 0.55, 4, 10, 500);
        System.out.println(part3.toString());

        //Build Products
        ArrayList productList_BoltKit = new ArrayList<Part>();
            productList_BoltKit.add(part1);
            productList_BoltKit.add(part2);
            
            //Create product
            Product boltKit = new Product(productList_BoltKit, 1, "BoltKit", 4.99, true, 10,500);
            
            //Test -> Add Parts to Product - Print product info - 2 Parts
            System.out.println("\nAdd Part - Product with 2 parts---------------------");
            System.out.println(boltKit.toString());
            boltKit.printPartsInProduct();
            
            //Test -> Add Parts to Product - Print product info - 3 Parts
            System.out.println("\nAdd Part - Product now with 3 parts---------------------");
            try{
                boltKit.addAssociatedPart(part3);
                System.out.println(boltKit.toString());
                boltKit.printPartsInProduct();
            }catch(Exception e){
                System.out.print("\tPart number: "+ part3.getName() +" -> was not added!\n");
            }
            
            //Test -> Remove Part from Product - Print product info - 3->2 Parts
            System.out.println("\nRemove Part - Product now with 2 parts---------------------");
            int removePartID = 2;
      
            boolean wasRemoved = boltKit.removeAssocatedPart(removePartID);
            
            if (!wasRemoved){
                System.out.println("\tPart #: "+removePartID+ " was NOT removed \n");
            }else{
                System.out.println("\tPart #: "+removePartID+ " was removed \n"+boltKit.toString());
                boltKit.printPartsInProduct();
            }
           
            
            //Test -> Lookup Part from Product - Print product info - 2 Parts
            System.out.println("\nLooked up Part - Product with 3 parts---------------------");
            int lookUpPartID = 1;
            
            try{
                Part lookedUpPart = (Part)boltKit.lookUpAssociatedPart(lookUpPartID);
                System.out.println("Looked Up Part: "+lookedUpPart.toString());
            }catch(Exception e){
                System.out.print("\tPart number: "+ lookUpPartID + " -> not available in this product!\n");
            }
            
            
            

            //Exit
            System.exit(0);
        
    }
    
    
}
