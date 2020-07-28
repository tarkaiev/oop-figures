public class Square extends Figure {

    private int side;
    private Color color;

    public Square(int side, Color color){
        this.side = side;
        this.color = color;
    }

    public String toString() {
        return "Figure: Square, area size - " + getArea() + "; side length - " + side + "; color - " + getColor();
    }

    public double getArea() {
        return side * side;
    }

    public Color getColor() {
        return color;
    }
}
