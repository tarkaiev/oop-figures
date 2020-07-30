public class Circle extends Figure {
    private int radius;
    private Color color;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
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
        return color;
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }
}
