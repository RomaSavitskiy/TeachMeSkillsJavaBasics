package teachmeskills.lesson9.entity;

public class VectorTwoDimensional extends Vector {
    private double coordinateX;
    private double coordinateY;
    private final static String VECTOR_TWO_DIMENSION_DESCRIPTION = "Это вектор для двумерной системы координат";

    public VectorTwoDimensional(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public VectorTwoDimensional() {
        super();
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getDescription() {
        return VECTOR_TWO_DIMENSION_DESCRIPTION;
    }
}
