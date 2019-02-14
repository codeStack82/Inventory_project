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
import inventory_project.Parts_Folder.Washer;

/**
 *
 * @author Ty
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Bolt longBolt = new Bolt(1,"test", 34.99, true, 3,5);
        Washer bigSprocket = new Washer(1,"test", 35.00, true, 3 ,5);
        
        System.out.println(longBolt.toString());
        System.out.println(bigSprocket.toString());
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
