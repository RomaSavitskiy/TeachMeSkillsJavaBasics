package teachmeskills.lesson9.service;

import teachmeskills.lesson9.entity.VectorThreeDimensional;

public class VectorThreeDimensionalService {
    private double vectorOneX;
    private double vectorOneY;
    private double vectorOneZ;
    private double vectorTwoX;
    private double vectorTwoY;
    private double vectorTwoZ;

    void getCoordinates(VectorThreeDimensional vector) {
        vectorOneX = vector.getCoordinateX();
        vectorOneY = vector.getCoordinateY();
        vectorOneZ = vector.getCoordinateZ();
    }

    void getCoordinates(VectorThreeDimensional vectorOne, VectorThreeDimensional vectorTwo) {
        vectorOneX = vectorOne.getCoordinateX();
        vectorOneY = vectorOne.getCoordinateY();
        vectorOneZ = vectorOne.getCoordinateZ();
        vectorTwoX = vectorTwo.getCoordinateX();
        vectorTwoY = vectorTwo.getCoordinateY();
        vectorTwoZ = vectorTwo.getCoordinateZ();
    }

    public double findVectorLong(VectorThreeDimensional vector) {
        getCoordinates(vector);

        double vectorLong;

        vectorLong = Math.sqrt((vectorOneX * vectorOneX) + (vectorOneY * vectorOneY) + (vectorOneZ * vectorOneZ));

        return vectorLong;
    }

    public double findVectorScalarMultiplication(VectorThreeDimensional vectorOne, VectorThreeDimensional vectorTwo) {
        getCoordinates(vectorOne, vectorTwo);

        double scalarMultiplication;

        scalarMultiplication = (vectorOneX * vectorTwoX) + (vectorOneY * vectorTwoY) + (vectorOneZ * vectorTwoZ);

        return scalarMultiplication;
    }

    public VectorThreeDimensional findVectorSum(VectorThreeDimensional vectorOne, VectorThreeDimensional vectorTwo) {
        getCoordinates(vectorOne, vectorTwo);

        VectorThreeDimensional vectorSum = new VectorThreeDimensional();

        vectorSum.setCoordinateX( vectorOneX + vectorTwoX);
        vectorSum.setCoordinateY(vectorOneY + vectorTwoY);
        vectorSum.setCoordinateZ(vectorOneZ + vectorTwoZ);

        return vectorSum;
    }

    public VectorThreeDimensional findVectorDifference(VectorThreeDimensional vectorOne, VectorThreeDimensional vectorTwo) {
        getCoordinates(vectorOne, vectorTwo);

        VectorThreeDimensional vectorDifference = new VectorThreeDimensional();

        vectorDifference.setCoordinateX(vectorOneX - vectorTwoX);
        vectorDifference.setCoordinateY(vectorOneY - vectorTwoY);
        vectorDifference.setCoordinateY(vectorOneZ - vectorTwoZ);

        return vectorDifference;
    }

    public String vectorComparison(VectorThreeDimensional vectorOne, VectorThreeDimensional vectorTwo) {
        double vectorOneLong = findVectorLong(vectorOne);
        double vectorTwoLong = findVectorLong(vectorTwo);
        String answer;

        if (vectorOneLong > vectorTwoLong) {
            answer = "Первый вектор больше чем второй";
        }
        else if (vectorTwoLong > vectorOneLong) {
            answer = "Второй вектор больше чем первый";
        }
        else {
            answer = "Вектора равны";
        }

        return answer;
    }

    public String vectorInfo(VectorThreeDimensional vector) {
        String vectorInfo = vector.getDescription();

        return vectorInfo;
    }
}
