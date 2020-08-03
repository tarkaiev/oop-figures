public abstract class Figure {

    public Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract Color getColor();

}
