/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ty
 */
public class FXMLModifyPartController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML private RadioButton inHouseRadioButton;
    @FXML private RadioButton outSourcedRadioButton;  
    private ToggleGroup partTypeToggleGroup;
    
    @FXML private TextField idTextfield;
    @FXML private TextField nameTextfield;
    @FXML private TextField qtyTextfield;
    @FXML private TextField priceTextfield;
    @FXML private TextField maxTextfield;
    @FXML private TextField minTextfield;
    @FXML private TextField companyTextfield;
    
    @FXML private Button saveModifiedPartButton;
    @FXML private Button cancelModifiedPartButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Toggle group for radio buttons
        partTypeToggleGroup =  new ToggleGroup();
        this.inHouseRadioButton.setToggleGroup(partTypeToggleGroup);
        this.outSourcedRadioButton.setToggleGroup(partTypeToggleGroup);
    }    
    
     /**
     * @info: Part - Save button clicked
     * @param event
     * @throws IOException
     */
    public void saveModifiedPartButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Modify Part - Save button clicked");
        
        //Switch back to the main tab pane
        changeTo_mainTabViewView(event);
    }
    
     /**
     * @info: Part - Cancel button clicked
     * @param event
     * @throws IOException
     */
    public void cancelModifiedPartButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Modify Part - Cancel button clicked");
        
        //Switch back to the main tab pane
        changeTo_mainTabViewView(event);
    }
    
    /**
     * @info: Helper method Switches the scene back to the main Tab Pane view
     * @param event
     * @throws IOException
     */
    public void changeTo_mainTabViewView(ActionEvent event) throws IOException{
        // TODO: Need to get part number to modify
        
        Parent addPart = FXMLLoader.load(getClass().getResource("FXMLMainTabPane.fxml"));
        Scene addPartScene = new Scene(addPart);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(addPartScene);
        window.show();
    
    }  
    
    
}
