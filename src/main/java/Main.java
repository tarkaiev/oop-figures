public class Main {
    private static final int MAX_SIZE = 10;
    private static final int MAX_COLOR_ID = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[1 + (int) (Math.random() * MAX_SIZE)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = randomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    private static int randomSize() {
        return 1 + (int) (Math.random() * MAX_SIZE);
    }

    private static Figure randomFigure() {
        int randomizer = 1 + (int) (Math.random() * 4);
        switch (randomizer) {
            case (1) :
                return new Square(randomSize(), randomColor());
            case (2) : {
                int sideA;
                int sideB;
                int sideC;
                do {
                    sideA = randomSize();
                    sideB = randomSize();
                    sideC = randomSize();
                } while ((sideA > sideB + sideC) | (sideB > sideA + sideC)
                    | (sideC > sideA + sideB));

                return new Triangle(sideA, sideB, sideC, randomColor()); }
            case(3) :
                return new Circle(randomSize(), randomColor());
            case(4) :
                return new Trapezoid(randomSize(), randomSize(), randomSize(), randomColor());
            default :
                return null;
        }
    }

    private static Color randomColor() {
        int randomizer = 1 + (int) (Math.random() * MAX_COLOR_ID);
        switch (randomizer) {
            case (1):
                return Color.White;
            case (2):
                return Color.Black;
            case (3):
                return Color.Blue;
            case (4):
                return Color.Red;
            case (5):
                return Color.Green;
            default :
                return null;
        }
    }
}

