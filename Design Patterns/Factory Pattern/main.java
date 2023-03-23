import Shape.*;

public class main {
    public static void main(String args[]){

        Shape shape = new ShapeFactory("CIRCL").returnShape();
        shape.draw();

    }

}
