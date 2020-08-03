public class Trapezoid extends Figure {
    // рассматриваю здесь равнобедренную трапецию
    private int sideA;
    private int sideB;
    private int sideC;

    public Trapezoid(int sideA, int sideB, int sideC, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

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
        double halfPerimeter = ((double)sideA + (double)sideB + 2 * (double)sideC) / 2;
        return Math.sqrt((halfPerimeter - (double)sideA)
                * (halfPerimeter - (double)sideB)
                * Math.pow((halfPerimeter - (double)sideC),2));
    }

    public Color getColor() {
        return super.color;
    }

    public int getPerimeter() {
        return sideA + sideB + sideC + sideC;
    }
}
