import Strategy.SportsDriveStrategy;

public class SportsVechile extends Vehicle{

    public SportsVechile(){

        super (new SportsDriveStrategy());

    }
}
