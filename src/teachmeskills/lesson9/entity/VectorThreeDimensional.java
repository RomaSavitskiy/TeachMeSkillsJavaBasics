package teachmeskills.lesson9.entity;

public class VectorThreeDimensional extends Vector {
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private final static String VECTOR_THREE_DIMENSION_DESCRIPTION = "Это вектор для трёхмерной системы координат";

    public VectorThreeDimensional(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public VectorThreeDimensional() {
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

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public void setCoordinateZ(double coordinateZ) {
        this.coordinateZ = coordinateZ;
    }

    public String getDescription() {
        return VECTOR_THREE_DIMENSION_DESCRIPTION;
    }
}