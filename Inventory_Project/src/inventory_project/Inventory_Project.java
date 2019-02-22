/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import inventory_project.Inventory_Folder.Inventory;
import inventory_project.Parts_Folder.InHouse;
import inventory_project.Parts_Folder.OutSourced;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Ty Hunt
 */
public class Inventory_Project extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMainTabPane.fxml"));
        
        Scene scene = new Scene(root);
        
        //Root stage properties
        stage.setResizable(false);
        stage.setTitle("Inventory Management System - v1.0");
        
        stage.setScene(scene);
        stage.show();

    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //launch(args);
        partsInventory();
    }
    public static void partsInventory(){
        Inventory partsInventory = new Inventory();
        
        InHouse smallbolt = new InHouse(15,23, "Small Bolt", 0.55, 4, 10, 500);
        InHouse smallerbolt = new InHouse(25,23, "Smaller Bolt", 0.52, 4, 10, 500);

        OutSourced mediumBolt = new OutSourced(5,"Ty\'s Tools Shop", "Medium Bolt", 0.65, 4, 10, 500);
        OutSourced largeBolt = new OutSourced(55,"Ty\'s Tools Shop", "Large Bolt", 0.69, 4, 10, 500);
        
        partsInventory.addPart(smallbolt);
        partsInventory.addPart(smallerbolt);
        partsInventory.addPart(mediumBolt);
        partsInventory.addPart(largeBolt);
        
        partsInventory.printInventoryParts();
        
//        partsInventory.deletePart(smallbolt);
//        partsInventory.deletePart(largeBolt);
        
//        partsInventory.printInventoryParts();
    
        System.exit(0);
    }
    
}
