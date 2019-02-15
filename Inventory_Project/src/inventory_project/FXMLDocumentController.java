/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import inventory_project.Parts_Folder.Bolt;
import inventory_project.Parts_Folder.Part;
import inventory_project.Parts_Folder.Washer;
import inventory_project.Products_Folder.Product;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Ty
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //Build Test parts
        Bolt longBolt = new Bolt(1,"test", 34.99, true, 3,5);
//        System.out.println(longBolt.toString());
        
        Washer bigSprocket = new Washer(1,"test", 35.00, true, 3 ,5);
//        System.out.println(bigSprocket.toString());
        
        ArrayList boltKit = new ArrayList<Part>();
            boltKit.add(new Bolt(1,"test", 34.99, true, 3,5));
            boltKit.add(new Washer(1,"test", 34.99, true, 3,5));
        System.out.println(boltKit.toString());
        
        //Build Test products  
        Product boltKitProduct = new Product(boltKit, 1,"Bolt Kit", 2.99, true, 1,7);
        System.out.println(boltKitProduct.toString());

        
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
