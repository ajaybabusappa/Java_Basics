package OOPS_practise;
import Interfaces.Test;

public class Vehicle implements Test{
    int secretId;
    static int count;
    String modelName;
    int price;
    int numTyres;
    boolean canFly;

    static{
        System.out.println("Static block is printed");
        count = 0;
    }
    public Vehicle(){}
    

    public Vehicle(String modelName, int price, int numTyres, boolean canFly) {
        count++;
        this.modelName = modelName;
        this.price = price;
        this.numTyres = numTyres;
        this.canFly = canFly;
    }


    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getNumTyres() {
        return numTyres;
    }
    public void setNumTyres(int numTyres) {
        this.numTyres = numTyres;
    }
    public boolean isCanFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }


    @Override
    public String toString() {
        return "Vehicle [modelName=" + modelName + ", price=" + price + ", numTyres=" + numTyres + ", canFly=" + canFly
                + "]";
    }

    @Override
    public void show() {
        System.out.println("Vehicle Show");
    }

    //Thus operator overloading exists in Java?
    
}
