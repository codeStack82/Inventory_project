/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import inventory_project.Inventory_Folder.Inventory;
import inventory_project.Parts_Folder.InHouse;
import inventory_project.Parts_Folder.OutSourced;
import inventory_project.Parts_Folder.Part;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    
    //Parts Table View
    @FXML private TableView<Part> partsTableView;
    @FXML private TableColumn<Part, String> partIDColumn;
    @FXML private TableColumn<Part, String> partNameColumn;
    @FXML private TableColumn<Part, String> partQtyColumn;
    @FXML private TableColumn<Part, String> partPriceColumn;

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

    public Inventory partsInventory;
    public Inventory productsInventory;

//    private Alert alert;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Initialize Inventories
        partsInventory = new Inventory();
        productsInventory =  new Inventory();
        
        //Test - Initialize Parts TableView
        initializePartsTable();        
    }   
    
    /**
     * @info: Setup Parts Table View
     */
    public void initializePartsTable(){ 
        //Setup column in table
        partIDColumn.setCellValueFactory( new PropertyValueFactory<>("partID"));
        partNameColumn.setCellValueFactory( new PropertyValueFactory<>("name"));
        //TODO: Need to get qty in this cell factory
        partQtyColumn.setCellValueFactory(  new PropertyValueFactory<>("max"));
        partPriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        
        //Load dummy data
        partsTableView.setItems(getParts());
    }
     
    /**
     * @info: Populate Parts Table with Observable list
     * @return ObservableList
     */
    public ObservableList<Part> getParts(){
        
        ObservableList<Part> partsList = FXCollections.observableArrayList();
        
        InHouse smallbolt = new InHouse(1,23, "Small Bolt", 0.55, 4, 10, 500);
        InHouse smallerbolt = new InHouse(2,23, "Smaller Bolt", 0.52, 4, 10, 500);

        OutSourced mediumBolt = new OutSourced(3,"Ty\'s Tools Shop", "Medium Bolt", 0.65, 4, 10, 500);
        OutSourced largeBolt = new OutSourced(4,"Ty\'s Tools Shop", "Large Bolt", 0.69, 4, 10, 500);
        
        partsList.add(smallbolt);
        partsList.add(smallerbolt);
        partsList.add(mediumBolt);
        partsList.add(largeBolt);
        
        partsInventory();
        
        return partsList;
    }
    

    //Test initialize partInventory
    public static void partsInventory(){
        Inventory partsInventory = new Inventory();
        
        InHouse smallbolt = new InHouse(15,23, "Small Bolt", 0.55, 4, 10, 500);
        InHouse smallerbolt = new InHouse(25,23, "Smaller Bolt", 0.52, 4, 10, 500);

        OutSourced mediumBolt = new OutSourced(5,"Ty\'s Tools Shop", "Medium Bolt", 0.65, 4, 10, 500);
        OutSourced largeBolt = new OutSourced(55,"Ty\'s Tools Shop", "Large Bolt", 0.69, 4, 10, 500);
        
        //Add Part method test
        partsInventory.addPart(smallbolt);
        partsInventory.addPart(smallerbolt);
        partsInventory.addPart(mediumBolt);
        partsInventory.addPart(largeBolt);
        
 

    }
    
    
    /**
     * @info: Search Part button clicked
     * @TODO: Implement alert message system
     */
    public void searchPartButtonClicked(){
    
        String searchID = searchPartsTextfield.getText();
        
         try{
            //Get part to search 
            int searchPart = Integer.parseInt(searchID); 
            
            //Search for part
            try{
                Part p = (Part)partsInventory.lookUpParts(searchPart);
                System.out.println("Looked up part:\n\t"+ p.toString());
            }catch(Exception e){
                 System.out.println("Looked up part:\n\tPart is not available");
            }finally{
                searchPartsTextfield.setText("");
            }
            
        }catch(NumberFormatException numFrmt){
            searchPartsTextfield.setText("");
            searchPartsTextfield.setPromptText("Please, Try again...!");
        }catch(Exception e){
            System.out.println("Error: Search Part button General Exception");
        }
    }
    
     /**
     * @info: Search Product button clicked
     */
    public void searchProductButtonClicked(){
    
        String searchProductText = searchProductTextfield.getText();
        searchProductTextfield.setText("");
        
        //TODO: implement search part logic
        
        System.out.println("Search Text: "+ searchProductText);
    }
    
    /**
     * @info: Switches the scene to the Add Part view
     * @param event
     * @throws IOException
     */
    public void changeTo_addPartView(ActionEvent event) throws IOException{
        
        try{
            Parent addPart = FXMLLoader.load(getClass().getResource("FXMLAddPart.fxml"));
            Scene addPartScene = new Scene(addPart);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            // App Part window properties
            window.setTitle("Add Part Menu");
            window.setResizable(false);

            window.setScene(addPartScene);
            window.show();
            
        }catch(IOException e){
            System.out.println("Can't load Add Part window?");
        }
    
    }
    
     /**
     * @info: Switches the scene to the Add Part view
     * @param event
     * @throws IOException
     */
    public void changeTo_modifyPartView(ActionEvent event) throws IOException{
        // TODO: Need to get part number to modify
        try{
            Parent addPart = FXMLLoader.load(getClass().getResource("FXMLModifyPart.fxml"));
            Scene addPartScene = new Scene(addPart);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            // Modify Part window properties
            window.setTitle("Modify Part Menu");
            window.setResizable(false);
            
            window.setScene(addPartScene);
            window.show();
        }catch(IOException e){
            System.out.println("Can't load Modify Part window?");
        }
    
    }
    
    
    /**
     * @info: Switches the scene to the Add Product view
     * @param event
     * @throws IOException
     */
    public void changeTo_addProductView(ActionEvent event) throws IOException{
        
        try{
            Parent addPart = FXMLLoader.load(getClass().getResource("FXMLAddProduct.fxml"));
            Scene addPartScene = new Scene(addPart);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            // Add Product window properties
            window.setTitle("Add Product Menu");
            window.setResizable(false);
            
            window.setScene(addPartScene);
            window.show();
        }catch(IOException e){
            System.out.println("Can't load Add Product window?");
        }     
    
    }
    
     /**
     * @info: Switches the scene to the Add Product view
     * @param event
     * @throws IOException
     */
    public void changeTo_modifyProductView(ActionEvent event) throws IOException{
        // TODO: Need to get part number to modify
        try{
            Parent addPart = FXMLLoader.load(getClass().getResource("FXMLModifyProduct.fxml"));
            Scene addPartScene = new Scene(addPart);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
             // Modify Product window properties
            window.setTitle("Modify Product Menu");
            window.setResizable(false);
            
            window.setScene(addPartScene);
            window.show();
        }catch(IOException e){
            System.out.println("Can't load Modify Product window?");
        }     
    
    }
   
    
    /**
     * @info: Menu Bar - Exit Application
     */
    public void close_main_window(){
        Platform.exit();
        System.exit(0);
    }
    
    /**
     * @info: Menu Bar - Exit Application
     */
    public void exitButton(){
        Platform.exit();
        System.exit(0);
    }
    
}
