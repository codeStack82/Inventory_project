/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
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
public class FXMLAddPartController implements Initializable {

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
    
    @FXML private Button savePartButton;
    @FXML private Button cancelPartButton;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Toggle Group for radio buttons
        partTypeToggleGroup =  new ToggleGroup();
        this.inHouseRadioButton.setToggleGroup(partTypeToggleGroup);
        this.outSourcedRadioButton.setToggleGroup(partTypeToggleGroup);
        
    }    
    
    /**
     * @info: Add Part - save button event
     * @param event
     * @throws IOException
     */
    public void savePartButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Add Part - Save button clicked");
        
        //Switch back to the main tab pane
        changeTo_mainTabViewView(event);
    }
    
    /**
     * @info: Add Part - Cancel button event
     * @param event
     * @throws IOException
     */
    public void cancelPartButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Add Part - Cancel button clicked");
        
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
        try{
            Parent root = FXMLLoader.load(getClass().getResource("FXMLMainTabPane.fxml"));
            Scene rootView = new Scene(root);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(rootView);
            window.show();
        }catch(IOException e){
            System.out.println("In Add Part - Can't load Main Tab window?");
        }
    
    }  

    
}
