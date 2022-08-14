package teachmeskills.lesson9.service;

import teachmeskills.lesson9.entity.VectorTwoDimensional;

public class VectorTwoDimensionalService {
    public double findVectorLong(VectorTwoDimensional vector) {
        double vectorX = vector.getCoordinateX();
        double vectorY = vector.getCoordinateY();
        double vectorLong;

        vectorLong = Math.sqrt((vectorX * vectorX) + (vectorY * vectorY));

        return vectorLong;
    }

    public double findVectorScalarMultiplication(VectorTwoDimensional vectorOne, VectorTwoDimensional vectorTwo) {
        double vectorOneX = vectorOne.getCoordinateX();
        double vectorOneY = vectorOne.getCoordinateY();
        double vectorTwoX = vectorTwo.getCoordinateX();
        double vectorTwoY = vectorTwo.getCoordinateY();
        double scalarMultiplication;

        scalarMultiplication = (vectorOneX * vectorTwoX) + (vectorOneY * vectorTwoY);

        return scalarMultiplication;
    }

    public VectorTwoDimensional findVectorSum(VectorTwoDimensional vectorOne, VectorTwoDimensional vectorTwo) {
        double vectorOneX = vectorOne.getCoordinateX();
        double vectorOneY = vectorOne.getCoordinateY();
        double vectorTwoX = vectorTwo.getCoordinateX();
        double vectorTwoY = vectorTwo.getCoordinateY();

        VectorTwoDimensional vectorSum = new VectorTwoDimensional();

        vectorSum.setCoordinateX(vectorOneX + vectorTwoX);
        vectorSum.setCoordinateY(vectorOneY + vectorTwoY);

        return vectorSum;
    }

    public VectorTwoDimensional findVectorDifference(VectorTwoDimensional vectorOne, VectorTwoDimensional vectorTwo) {
        double vectorOneX = vectorOne.getCoordinateX();
        double vectorOneY = vectorOne.getCoordinateY();
        double vectorTwoX = vectorTwo.getCoordinateX();
        double vectorTwoY = vectorTwo.getCoordinateY();

        VectorTwoDimensional vectorDifference = new VectorTwoDimensional();

        vectorDifference.setCoordinateX(vectorOneX - vectorTwoX);
        vectorDifference.setCoordinateY(vectorOneY - vectorTwoY);

        return vectorDifference;
    }

    public String vectorComparison(VectorTwoDimensional vectorOne, VectorTwoDimensional vectorTwo) {
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

    public String vectorInfo(VectorTwoDimensional vector) {
        return vector.getDescription();
    }
}
