public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[1 + (int) (Math.random() * 10)];
        //массив, содержащий от 1 до 10 фигур
        for (int i = 0;i < figures.length;i++) {
            figures[i] = randomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    public static int randomSize() {
        return 1 + (int) (Math.random() * 10); // делаю рандомный размер от 1 до 10
    }
    //генерирую рандомную фигуру

    public static Figure randomFigure() {
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
    // метод устанавливает рандомный цвет. понимаю, что выглядит криво, но работает

    public static Color randomColor() {
        int randomizer = 1 + (int) (Math.random() * 5);
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

