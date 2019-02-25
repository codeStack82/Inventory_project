/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import inventory_project.Inventory_Folder.Inventory;
import inventory_project.Parts_Folder.InHouse;
import inventory_project.Parts_Folder.OutSourced;
import java.io.IOException;
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
public class main extends Application {
    public Inventory partsInventory;
    public Inventory productsInventory;
    
    @Override
    public void start(Stage stage) throws Exception {
        //Launch main tab pane
        showMain(stage);
        

    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        launch(args);
    }
   
    public void showMain(Stage stage) throws IOException{
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMainTabPane.fxml"));
        Scene scene = new Scene(root);
        
        //Root stage properties
        stage.setResizable(false);
        stage.setTitle("Inventory Management System - v1.0");
        
        stage.setScene(scene);
        stage.show();
    }
}
