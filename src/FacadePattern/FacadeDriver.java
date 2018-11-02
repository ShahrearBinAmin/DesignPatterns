package FacadePattern;

public class FacadeDriver {

    public static void main(String[] args) {

        Shapemaker shapemaker=new Shapemaker();

        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }
}
