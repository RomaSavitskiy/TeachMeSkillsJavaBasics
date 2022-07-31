package teachmeskills.lesson7.figures;

public class Starter {
    public static void main(String[] args) {
        long sumPerimeterFigure = 0;

        Figure[] figureArray = {
                new Rectangle(5, 10),
                new Rectangle(2,4),
                new Circle(10),
                new Circle(5),
                new Triangle(3, 4, 5)};

        for (int i = 0; i < figureArray.length; i++) {
            System.out.println("Площадь фигуры " + (i+1) + " = " + figureArray[i].getFigureSquare(figureArray[i]));
            System.out.println("Периметер фигуры " + (i+1) + " = " + figureArray[i].getFigurePerimeter(figureArray[i]));

            sumPerimeterFigure += figureArray[i].getFigurePerimeter(figureArray[i]);
        }

        System.out.println("Сумма периметров всех фигур = " + sumPerimeterFigure);
    }
}
