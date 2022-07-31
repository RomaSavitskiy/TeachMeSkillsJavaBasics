package teachmeskills.lesson7.figures;

public class Circle extends  Figure {
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double getFigureSquare(Figure figure) {
        double circleRadius;
        double circleSquare;

        circleRadius = getCircleRadius();
        circleSquare = 3.14 * circleRadius * circleRadius;

        return circleSquare;
    }

    @Override
    public double getFigurePerimeter(Figure figure) {
        double circleRadius;
        double circlePerimeter;

        circleRadius = getCircleRadius();
        circlePerimeter = 2 * 3.14 * circleRadius;

        return circlePerimeter;
    }
}
