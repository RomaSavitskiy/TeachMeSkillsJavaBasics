package teachmeskills.lesson7.figures.service;

import teachmeskills.lesson7.figures.entity.Figures;

public class TriangleService implements FindableSquareAndPerimeter {
    @Override
    public double findSquare(Figures figures) {
        double triangleSideA = figures.getTriangle().getA();
        double triangleSideB = figures.getTriangle().getB();
        double triangleSideC = figures.getTriangle().getC();
        double halfPerimeter;
        double squareTriangle;

        halfPerimeter = (triangleSideA + triangleSideB + triangleSideC) / 2;

        squareTriangle = Math.sqrt((double)(halfPerimeter * (halfPerimeter - triangleSideA) *
                (halfPerimeter - triangleSideB) * (halfPerimeter - triangleSideC)));

        return (int)squareTriangle;
    }

    @Override
    public double findPerimeter(Figures figures) {
        double triangleSideA = figures.getTriangle().getA();
        double triangleSideB = figures.getTriangle().getB();
        double triangleSideC = figures.getTriangle().getC();
        double trianglePerimeter;

        trianglePerimeter = triangleSideA + triangleSideB + triangleSideC;

        return trianglePerimeter;
    }
}
