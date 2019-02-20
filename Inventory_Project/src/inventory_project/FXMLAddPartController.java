/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project;

import inventory_project.Parts_Folder.InHouse;
import inventory_project.Parts_Folder.OutSourced;
import inventory_project.Parts_Folder.Part;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
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
    @FXML private ToggleGroup partTypeToggleGroup;
    
    @FXML private TextField idTextfield;
    @FXML private TextField nameTextfield;
    @FXML private TextField qtyTextfield;
    @FXML private TextField priceTextfield;
    @FXML private TextField maxTextfield;
    @FXML private TextField minTextfield;
    @FXML private TextField companyTextfield;
    @FXML private Label errorMsg;
    
    @FXML private Button savePartButton;
    @FXML private Button cancelPartButton;    
    @FXML private Button resetButton;    
    private String sourceType;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        //Default source type
        sourceType ="InHouse";
        
        //Toggle Group for radio buttons
        partTypeToggleGroup =  new ToggleGroup();
        this.inHouseRadioButton.setToggleGroup(partTypeToggleGroup);
        this.outSourcedRadioButton.setToggleGroup(partTypeToggleGroup);
        
       // Radio Button Event Listeners
       //OutSourced Radio Button - Event Listener lambda 
       inHouseRadioButton.selectedProperty().addListener((ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) -> {
           if (isNowSelected) {
               //System.out.println("In House selected: "+isNowSelected);
               companyTextfield.setDisable(isNowSelected);
               companyTextfield.setText("");
               sourceType = "InHouse";
           }
        });
       
       //OutSourced Radio Button - Event Listener lambda
       outSourcedRadioButton.selectedProperty().addListener((ObservableValue<? extends Boolean> obs, Boolean wasPreviouslySelected, Boolean isNowSelected) -> {
           if (isNowSelected) {
               //System.out.println("Outsourced is selected: "+ isNowSelected);
               companyTextfield.setDisable(!isNowSelected);
               sourceType = "OutSourced";
           }
        });
    }    
    
    public ArrayList<String> getFormValues(){
        
        ArrayList<String> formValues = new ArrayList<>();
        
        String partSourceType   = sourceType;
        String partID           = idTextfield.getText();
        String partName         = nameTextfield.getText();
        String partQty          = qtyTextfield.getText();
        String partPrice        = priceTextfield.getText();
        String partMax          = maxTextfield.getText();
        String partMin          = minTextfield.getText();
        String companyName      = companyTextfield.getText(); 
        
        formValues.add(partSourceType);
        formValues.add(partID);
        formValues.add(partName);
        formValues.add(partQty);
        formValues.add(partPrice);
        formValues.add(partMax);
        formValues.add(partMin);
        formValues.add(companyName);
    
        return formValues;
    }
    
    public void validateFormValues(ArrayList<String> formValues){
       
      
        if(isInHouseObjectValid(formValues)){
            //create inhouse obj
        }
        
        if(isOutSourcedObjectValid(formValues)){
            //create outsourced obj
        }
       

    }
    
    public boolean isInHouseObjectValid(ArrayList<String> formValues){
            boolean isValid = false;
            
            try{
                if(formValues.get(0).equals("InHouse")){ 
                   int partId = Integer.parseInt(formValues.get(1));
                   int partQty = Integer.parseInt(formValues.get(3));
                   double partPrice = Double.parseDouble(formValues.get(4));
                   int partMax = Integer.parseInt(formValues.get(5));
                   int partMin = Integer.parseInt(formValues.get(6));
                   isValid = true;
                   System.out.println("isInHouseObjectValid: "+ isValid);
                }
                
            }catch(NumberFormatException e){
                System.out.println("Number exception-> isInHouseObjectValid: "+ isValid);
                resetToDefault();
            }catch(Exception e){
                System.out.println("General Exception->i sInHouseObjectValid: "+ isValid);
                resetToDefault();
            }
        
        return isValid;
    }
    
    public boolean isOutSourcedObjectValid(ArrayList<String> formValues){
         boolean isValid = false;
            
            try{
                if(formValues.get(0).equals("OutSourced")){
                    
                }
                
            }catch(Exception e){
                
            }
           
        
        return isValid;
    }
    

    //Needs cleaning up 
    public void createPart()  {
        //TODO: Machine id and instock implementation?????
        try{
            
            String partSourceType = sourceType;
            int partID = Integer.parseInt(idTextfield.getText());
            String partName = nameTextfield.getText();
            int partQty = Integer.parseInt(qtyTextfield.getText());
            double partPrice = Double.parseDouble(priceTextfield.getText());
            int partMax = Integer.parseInt(maxTextfield.getText());
            int partMin = Integer.parseInt(minTextfield.getText());
            String companyName = companyTextfield.getText();

            if("InHouse".equals(partSourceType)){
                InHouse part = new InHouse(partID, 4567 , partName, partPrice, true , partMax, partMin);
                System.out.println(part.toString());
            }
            if("OutSourced".equals(partSourceType)){
                OutSourced part = new OutSourced(partID, companyName, partName, partPrice,true, partMax, partMin);
                System.out.println(part.toString());
            }
        }catch(NumberFormatException e){
            this.errorMsg.setText("Error: # frmt Please try again...");
        }catch(Exception e){
            this.errorMsg.setText("Error: Please try again...");
        }
    }
    
     /**
     * @info: Add Part - reset form values to default
     */
    public void resetToDefault(){
        this.idTextfield.setText("");
        this.nameTextfield.setText("");
        this.qtyTextfield.setText("");
        this.priceTextfield.setText("");
        this.maxTextfield.setText("");
        this.minTextfield.setText("");
        this.companyTextfield.setText("");
        this.inHouseRadioButton.setSelected(true);
        this.companyTextfield.setDisable(true);
//        this.errorMsg.setText("");
        
    }
    
    /**
     * @info: Add Part - save button event
     * @param event
     * @throws IOException
     */
    public void savePartButtonClicked(ActionEvent event) throws IOException{
        //TODO: Implement
        System.out.println("Add Part - Save button clicked");
        
        //Get Form Values
        ArrayList<String> formValues = getFormValues();
        isInHouseObjectValid(formValues);
        
        
        //Switch back to the main tab pane
//        changeTo_mainTabViewView(event);
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
