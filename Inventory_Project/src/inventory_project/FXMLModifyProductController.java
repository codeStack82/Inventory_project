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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ty
 */
public class FXMLModifyProductController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private Button saveModifiedProductButton;
    @FXML private Button cancelModifiedProductButton;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     /**
     * @info: Product - Add button clicked
     * @param event
     * @throws IOException
     */
    public void saveModifiedPartButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Modify Product - Save button clicked");
        
        //Switch back to the main tab pane
        changeTo_mainTabViewView(event);
    }
    
     /**
     * @info: Product - Cancel button clicked
     * @param event
     * @throws IOException
     */
    public void cancelModifiedProductButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Modify Product - Cancel button clicked");
        
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
            Scene addScene = new Scene(root);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(addScene);
            window.show();
        }catch(IOException e){
            System.out.println("In Modify Product - Can't load Main Tab window?");
        }
    
    }  
    
    
}
