package teachmeskills.lesson7.figures;

public class Rectangle extends Figure {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getFigureSquare(Figure figure) {
        double rectangleHeight = getHeight(), rectangleWidth = getWidth(), rectangleSquare;

        rectangleSquare = (rectangleHeight + rectangleWidth) * 2;

        return  rectangleSquare;
    }

    @Override
    public double getFigurePerimeter(Figure figure) {
        double rectangleHeight = getHeight(), rectangleWidth = getWidth(), rectanglePerimeter;

        rectanglePerimeter = rectangleHeight * rectangleWidth;

        return rectanglePerimeter;
    }
}
