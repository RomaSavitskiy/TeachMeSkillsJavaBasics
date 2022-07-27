package teachmeskills.lesson7.figures;

import teachmeskills.lesson7.figures.entity.Figures;
import teachmeskills.lesson7.figures.entity.Rectangle;
import teachmeskills.lesson7.figures.entity.Triangle;
import teachmeskills.lesson7.figures.entity.Circle;
import teachmeskills.lesson7.figures.service.CircleService;
import teachmeskills.lesson7.figures.service.FindableSquareAndPerimeter;
import teachmeskills.lesson7.figures.service.RectangleService;
import teachmeskills.lesson7.figures.service.TriangleService;

public class Starter {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4, 5);
        Rectangle rectangleTwo = new Rectangle(4, 10);
        Triangle triangleOne = new Triangle(5,4,3);
        Triangle triangleTwo = new Triangle(5,10,5);
        Circle circle = new Circle(3);

        Figures figureOne = new Figures(rectangleOne);
        Figures figureTwo = new Figures(rectangleTwo);
        Figures figureThree = new Figures(triangleOne);
        Figures figureFour = new Figures(triangleTwo);
        Figures figureFive = new Figures(circle);

        Figures[] arrayFigures = {figureOne, figureTwo, figureThree, figureFour, figureFive};

        FindableSquareAndPerimeter[] findableSquareAndPerimeter = {new RectangleService(), new TriangleService(),
                new CircleService()};

        System.out.println("Периметер прямоугольника №1 - " + findableSquareAndPerimeter[0].findPerimeter(figureOne));
        System.out.println("Площадь прямоугольника №1 - " + findableSquareAndPerimeter[0].findSquare(figureOne));
        System.out.println("Периметер прямоугольника №2 - " + findableSquareAndPerimeter[0].findPerimeter(figureTwo));
        System.out.println("Площадь прямоугольника №2 - " + findableSquareAndPerimeter[0].findSquare(figureTwo));
        System.out.println("Периметер треугольника №1 - " + findableSquareAndPerimeter[1].findPerimeter(figureThree));
        System.out.println("Площадь треугольника №1 - " + findableSquareAndPerimeter[1].findSquare(figureThree));
        System.out.println("Периметер треугольника №1 - " + findableSquareAndPerimeter[1].findPerimeter(figureFour));
        System.out.println("Площадь треугольника №2 - " + findableSquareAndPerimeter[1].findSquare(figureFour));
        System.out.println("Периметер треугольника №2 - " + findableSquareAndPerimeter[2].findPerimeter(figureFive));
        System.out.println("Площадь круга №1 - " + findableSquareAndPerimeter[2].findSquare(figureFive));

        double perimeterFigures = findableSquareAndPerimeter[0].findPerimeter(figureOne) +
                findableSquareAndPerimeter[0].findPerimeter(figureTwo) +
                findableSquareAndPerimeter[1].findPerimeter(figureThree) +
                findableSquareAndPerimeter[1].findPerimeter(figureFour) +
                findableSquareAndPerimeter[2].findPerimeter(figureFive);

        System.out.println("Периметер всех фигур равен: " + perimeterFigures);
    }
}
