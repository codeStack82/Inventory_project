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
import inventory_project.Tests.Test_Parts;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ty Hunt
 */
public class Inventory_Project extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("FXMLMainTabPane.fxml"));
//        
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();

            //In house parts
            InHouse part1 = new InHouse(1,23, "Bolt", 0.55, true, 10, 500);
            System.out.println(part1.toString());

            //Outsourced Parts
            OutSourced part2 = new OutSourced(2,"Ty Tools 123", "Bolt", 0.55, true, 10, 500);
            System.out.println(part2.toString());

            OutSourced part3 = new OutSourced(3,"Brad Tools 456", "Washers", 0.55, true, 10, 500);
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
            System.out.println("\nAdd Part - Product with 3 parts---------------------");
            try{
                boltKit.addAssociatedPart(part3);
                System.out.println(boltKit.toString());
                boltKit.printPartsInProduct();
            }catch(Exception e){
                System.out.print("\tPart number: "+ part3.getName() +" -> was not added!\n");
            }
            
            //Test -> Remove Part from Product - Print product info - 3->2 Parts
            System.out.println("\nRemove Part - Product with 3 parts---------------------");
            int removePartID = 2;
            try{
                boltKit.removeAssocatedPart(removePartID);
                System.out.println(boltKit.toString());
                boltKit.printPartsInProduct();
            }catch(Exception e){
                 System.out.print("\tPart number: "+ removePartID + " -> not available in this product!\n");
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

    /**
     * @param args the command line arguments
     */
    
//    public static void main(String[] args) {
//        launch(args);
//    }
    
}
