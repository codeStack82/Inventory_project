package inventory_project.Parts_Folder;

public abstract class Part {
    
    public abstract int getPartID();

    public abstract void setPartID(int partID);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public abstract boolean getInStock();

    public abstract void setInStock(boolean inStock);

    public abstract int getMin();

    public abstract void setMin(int min);

    public abstract int getMax();

    public abstract void setMax(int max);
    
    public abstract String toString();
    
}
