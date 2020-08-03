public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public String toString() {
        return "Figure: Circle, area size - "
                + String.format("%.2f", getArea())
                + "; circle perimeter - "
                + String.format("%.2f",getPerimeter())
                + "; color - " + getColor();
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public Color getColor() {
        return super.color;
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }
}
