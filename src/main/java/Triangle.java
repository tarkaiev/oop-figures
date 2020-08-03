public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA,int sideB, int sideC, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public String toString() {
        return "Figure: Triangle, area size - " + String.format("%.2f",getArea())
                + "; sideA length - " + sideA
                + "; sideB length - " + sideB
                + "; sideC length - " + sideC
                + ";sum of all sides - "
                + getSideSum()
                + "; color - " + getColor();
    }

    public double getArea() {
        double halfPerimeter = ((double)sideA + (double)sideB + (double)sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - (double)sideA)
                * (halfPerimeter - (double)sideB)
                * (halfPerimeter - (double)sideC));
    }

    public Color getColor() {
        return super.color;
    }

    public int getSideSum() {
        return sideA + sideB + sideC;
    }
}
