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
                return new Square(randomSize(),randomColor());
            case (2) : {
                int sideA = randomSize() + 1;
                int sideB = sideA + 1;
                int sideC = sideB + 1;
                return new Triangle(sideA, sideB, sideC,randomColor()); }
                //в треугольнике обходится ограничение,
                // что 2 стороны в сумме должны всегда быть больше третьей
                //криво, но как сделать лучше не придумал
            case(3) :
                return new Circle(randomSize(),randomColor());
            case(4) :
                return new Trapezoid(randomSize(),randomSize(),randomSize(),randomColor());
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

