package teachmeskills.lesson7.figures.service;

import teachmeskills.lesson7.figures.entity.Figures;

public class CircleService implements FindableSquareAndPerimeter {
    @Override
    public double findSquare(Figures figures) {
        double radius = figures.getCircle().getRadius();
        double squareCircle;

        squareCircle = 3.14 * radius * radius;

        return squareCircle;
    }

    @Override
    public double findPerimeter(Figures figures) {
        double radius = figures.getCircle().getRadius();
        double perimeterCircle;

        perimeterCircle = 2 * 3.14 * radius;

        return perimeterCircle;
    }
}
