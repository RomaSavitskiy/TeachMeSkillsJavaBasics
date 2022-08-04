package teachmeskills.lesson7.figures;

public class Triangle extends Figure {
    double triangleSideA;
    double triangleSideB;
    double triangleSideC;

    public Triangle(double triangleSideA, double triangleSideB, double triangleSideC) {
        this.triangleSideA = triangleSideA;
        this.triangleSideB = triangleSideB;
        this.triangleSideC = triangleSideC;
    }

    public double getTriangleSideA() {
        return triangleSideA;
    }

    public void setTriangleSideA(double triangleSideA) {
        this.triangleSideA = triangleSideA;
    }

    public double getTriangleSideB() {
        return triangleSideB;
    }

    public void setTriangleSideB(double triangleSideB) {
        this.triangleSideB = triangleSideB;
    }

    public double getTriangleSideC() {
        return triangleSideC;
    }

    public void setTriangleSideC(double triangleSideC) {
        this.triangleSideC = triangleSideC;
    }

    @Override
    public double getFigureSquare(Figure figure) {
        double triangleSideA = getTriangleSideA();
        double triangleSideB = getTriangleSideB();
        double triangleSideC = getTriangleSideC();
        double triangleHalfPerimeter;
        double triangleSquare;

        triangleHalfPerimeter = (triangleSideA + triangleSideB + triangleSideC) / 2;

        triangleSquare = Math.sqrt(triangleHalfPerimeter * (triangleHalfPerimeter - triangleSideA) *
                (triangleSideB - triangleSideB) * (triangleHalfPerimeter - triangleSideC));

        return triangleSquare;
    }

    @Override
    public double getFigurePerimeter(Figure figure) {
        double triangleSideA = getTriangleSideA();
        double triangleSideB = getTriangleSideB();
        double triangleSideC = getTriangleSideC();
        double trianglePerimeter;

        trianglePerimeter = triangleSideA + triangleSideB + triangleSideC;

        return trianglePerimeter;

    }
}
