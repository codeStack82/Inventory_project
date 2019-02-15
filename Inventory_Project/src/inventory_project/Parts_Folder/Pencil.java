package inventory_project.Parts_Folder;
import inventory_project.Parts_Folder.Part;
import java.lang.StringBuilder;
/**
 *
 * @author Ty
 */
public class Pencil {
    
    //Class Variables
    private int partID;
    private String name;
    private double price;
    private boolean inStock;
    private int min;
    private int max;
    private static int pencilCount = 0;

    //Constructor(s)
    public Pencil(int partID, String name, double price, boolean inStock, int min, int max) {
        this.partID = partID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
        this.pencilCount += 1;
    }
    
    //Getters and Setters
    public int getPartCount(){return this.pencilCount;}
    
    public int getPartID() {return this.partID;}

    public void setPartID(int partID) {this.partID = partID;}

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return this.price;}

    public void setPrice(double price) {this.price = price;}

    public boolean getInStock() {return this.inStock;}

    public void setInStock(boolean inStock) {this.inStock = inStock;}

    public int getMin() {return this.min;}

    public void setMin(int min) {this.min = min;}

    public int getMax() {return this.max;}

    public void setMax(int max) {this.max = max;}
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Pencil information: ");
        sb.append("\tPart Id: ");
        sb.append(this.getPartID());
        sb.append(", Name: ");
        sb.append(this.getName());
        sb.append(", Price: ");
        sb.append(this.getPrice());
        sb.append(", In Stock: ");
        sb.append(this.getInStock());
        sb.append(", Min: ");
        sb.append(this.getMin());
        sb.append(", Max: ");
        sb.append(this.getMax());
        
        return sb.toString();
  
    }
      
}
