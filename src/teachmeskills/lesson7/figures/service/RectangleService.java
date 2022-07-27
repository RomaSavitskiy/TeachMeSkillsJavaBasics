package teachmeskills.lesson7.figures.service;

import teachmeskills.lesson7.figures.entity.Figures;

public class RectangleService implements FindableSquareAndPerimeter {

    @Override
    public double findSquare(Figures figures) {
        double heightRectangle = figures.getRectangle().getHeight();
        double widthRectangle = figures.getRectangle().getWidth();
        double squareRectangle;

        squareRectangle = heightRectangle * widthRectangle;

        return  squareRectangle;
    }

    @Override
    public double findPerimeter(Figures figures) {
        double heightRectangle = figures.getRectangle().getHeight();
        double widthRectangle = figures.getRectangle().getWidth();
        double perimeterRectangle;

        perimeterRectangle = (heightRectangle + widthRectangle) * 2;

        return perimeterRectangle;
    }
}
