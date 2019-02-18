/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import inventory_project.Parts_Folder.InHouse;
import inventory_project.Parts_Folder.OutSourced;
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

        InHouse part1 = new InHouse(1,23, "Bolt", 0.55, true, 10, 500);
        System.out.println(part1.toString());

        OutSourced part2 = new OutSourced(1,"Company 123", "Big Bolt", 0.55, true, 10, 500);
        System.out.println(part2.toString());
         OutSourced part3 = new OutSourced(2,"Company 456", "Bigger Bolt", 0.55, true, 10, 500);
        System.out.println(part3.toString());

        System.exit(1);


    }

    /**
     * @param args the command line arguments
     */
    
//    public static void main(String[] args) {
//        launch(args);
//    }
    
}
