/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Parts_Folder;

/**
 *
 * @author Ty
 */
public class InHouse {
    //Class variables
    private int machineID;

    //Constructor(s)
    public InHouse(int machineID) {
        this.machineID = machineID;
    }
    
    //Getters and Setters
    public int getMachineID(){return this.machineID;}
    
    public void setMachineID(int machineID){
        this.machineID = machineID;
    }
  
}
