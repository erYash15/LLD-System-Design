import Shape.*;

public class ShapeFactory{

    private Shape shp;

    public ShapeFactory(String shape_str) {
        this.shp = getShape(shape_str);
    }

    public Shape getShape(String shape_str) {

        switch (shape_str) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                System.out.println("Throwing Exception");

                if (true)
                    throw new RuntimeException();
                System.out.println("Exception Thrown, This line must not print");
        }
        System.out.println("This line must not print, 2");
        return null;
    }

    public Shape returnShape(){
        return this.shp;
    }



    }
