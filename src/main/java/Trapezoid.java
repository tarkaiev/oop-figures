public class Trapezoid extends Figure {
    // рассматриваю здесь равнобедренную трапецию
    private int sideA;
    private int sideB;
    private int sideC;
    private Color color;

    public Trapezoid(int sideA, int sideB, int sideC, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    public String toString() {
        return "Figure: Trapezoid, area size - " + String.format("%.2f",getArea())
                + "; sideA length - " + sideA
                + "; sideB length - " + sideB
                + "; sideC length - " + sideC
                + "; trapezoid perimeter - " + getPerimeter()
                + "; color - " + getColor();
    }

    public double getArea() {
        double p = ((double)sideA + (double)sideB + 2 * (double)sideC) / 2;
        return Math.sqrt((p - (double)sideA)
                * (p - (double)sideB) * Math.pow((p - (double)sideC),2));
    }

    public Color getColor() {
        return color;
    }

    public int getPerimeter() {
        return sideA + sideB + sideC + sideC;
    }
}
