import Strategy.NormalDriveStrategy;

public class GoodsVechile extends Vehicle{

    GoodsVechile(){

        super (new NormalDriveStrategy());

    }
}
