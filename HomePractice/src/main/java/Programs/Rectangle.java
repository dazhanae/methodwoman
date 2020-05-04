package Programs;

public class Rectangle {

    protected double length;
    protected double width;
    protected double sides = 4;

    public double getWidth() {
        return width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public void print(){
        System.out.println("I am a rectangle");
    }
}
