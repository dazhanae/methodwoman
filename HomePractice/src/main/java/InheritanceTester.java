
import Programs.Rectangle;
import Programs.Square;

public class InheritanceTester {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();
    }
    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
