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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ty
 */
public class FXMLMainTabPaneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //Parts View
    @FXML private TextField searchPartsTextfield;
    @FXML private Button    searchPartSystemButton; 
    @FXML private TableView partsTableView;
    
    @FXML private Button addPartSystemButton;
    @FXML private Button modifyPartSystemButton;
    @FXML private Button deletePartSystemButton;
    
    //Products View
    @FXML private TextField searchProductTextfield;
    @FXML private Button    searchProductSystemButton; 
    @FXML private TableView ProductTableView;
    
    @FXML private Button addProductSystemButton;
    @FXML private Button modifyProductystemButton;
    @FXML private Button deleteProductSystemButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    /**
     *
     * @param event
     * @throws IOException
     */
    public void changeTo_addPartView(ActionEvent event) throws IOException{
        
        Parent addPart = FXMLLoader.load(getClass().getResource("FXMLAddPart.fxml"));
        Scene addPartScene = new Scene(addPart);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(addPartScene);
        window.show();
    
    }
    public void changeTo_addProductView(ActionEvent event) throws IOException{
        
        Parent addPart = FXMLLoader.load(getClass().getResource("FXMLModifysPart.fxml"));
        Scene addPartScene = new Scene(addPart);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(addPartScene);
        window.show();
    
    }
}
