import Strategy.SportsDriveStrategy;

public class SportsVechile extends Vehicle{

    SportsVechile(){

        super (new SportsDriveStrategy());

    }
}
