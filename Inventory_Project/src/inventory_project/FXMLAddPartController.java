/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ty
 */
public class FXMLAddPartController implements Initializable {

    /**
     * Initializes the controller class.
     */
//    
//    @FXML private RadioButton inHouseRadioButton;
//    @FXML private RadioButton OutSourcedRadioButton;
//    
//    @FXML private ButtonGroup = new ButtonGroup<>();
    
    @FXML private TextField idTextfield;
    @FXML private TextField nameTextfield;
    @FXML private TextField qtyTextfield;
    @FXML private TextField priceTextfield;
    @FXML private TextField maxTextfield;
    @FXML private TextField minTextfield;
    @FXML private TextField companyTextfield;
    
    @FXML private Button addPartButton;
    @FXML private Button cancelPartButton;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void addButtonClicked(){
        //TODO: Implement
        System.out.println("Add button blicked");
    }
    
      public void cancelButtonClicked(){
        //TODO: Implement
        System.out.println("Cancel button blicked");
    }
    
}
