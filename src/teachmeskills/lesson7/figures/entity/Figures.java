package teachmeskills.lesson7.figures.entity;

public class Figures {
    private Rectangle rectangle;
    private Triangle triangle;
    private Circle circle;

    public Figures(Rectangle rectangle, Triangle triangle, Circle circle) {
        this.rectangle = rectangle;
        this.triangle = triangle;
        this.circle = circle;
    }

    public Figures(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Figures(Triangle triangle) {
        this.triangle = triangle;
    }

    public Figures(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
