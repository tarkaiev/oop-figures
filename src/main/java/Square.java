public class Square extends Figure {

    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public String toString() {
        return "Figure: Square, area size - "
                + getArea() + "; side length - "
                + side
                + "; color - "
                + getColor();
    }

    public double getArea() {
        return side * side;
    }

    public Color getColor() {
        return super.color;
    }
}
