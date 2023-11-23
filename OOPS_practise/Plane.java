package OOPS_practise;

public class Plane extends Vehicle {
    int totalTravelHR;
    Plane(String modelName, int price, int numTyres, boolean canFly, int totalTravelHR){
        super(modelName, price, numTyres, canFly);
        this.totalTravelHR = totalTravelHR;
    }
    @Override
    public String toString() {
        String res = super.toString() + totalTravelHR;
        return res;
    }


}
