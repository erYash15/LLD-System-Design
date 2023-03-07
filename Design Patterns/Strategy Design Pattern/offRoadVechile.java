import Strategy.SportsDriveStrategy;

public class offRoadVechile extends Vehicle{

    public offRoadVechile(){

        super (new SportsDriveStrategy());

    }
}
