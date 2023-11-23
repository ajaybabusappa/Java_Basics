package OOPS_practise;
import Interfaces.Test;
import com_package2.*;
public class Start {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.print("Hi there");

        //Class.forName("Vehicle");
        Vehicle v1 = new Vehicle("Renault", 500000, 4, false);
        //Here v1 is Just a reference and not the object
        Vehicle plane = (Vehicle)new Plane("Indigo", 1000000, 8, true, 10000);
        //System.out.print(v1);
        System.out.println(plane);

        //Abstraction
        LivingObj lv = new Human();

        //Anonymous Inner Class
        LivingObj lv1 = new LivingObj() {
            protected boolean isAlive(){
                return true;
            }
        };

        Animal anm = new Animal("Ranbeer Kapoor", 90);

        Animal.Type anm1 = anm.new Type("Humans", "Apes");

        Test tst = () ->{
            System.out.println("Test");
        };

        tst.show();

    }
}
