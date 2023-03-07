import Strategy.DriveStrategy;
//import Strategy.NormalDriveStrategy;
//import Strategy.SportsDriveStrategy;


public class Vehicle {
    DriveStrategy driveObject;
    
    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
    
}
