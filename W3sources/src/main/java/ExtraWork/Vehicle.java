package ExtraWork;


//Access Modifier | Class name
public class Vehicle {

    private int doors;
    private int speed;
    private String color;

    //^Instance variable
    public static void run(){
        //^ instance method
        // Run method implementation
    }
    public void stop(){
        //Implementation of stop method
    }
}

class  Maruti {
    public void TestVehicleClass(){
        //To Access run() method we don't need object of vehicle class
        Vehicle.run();
        //To Access stop() method we need object of vehicle class, else compilation fails.
        new Vehicle().stop();
    }
}