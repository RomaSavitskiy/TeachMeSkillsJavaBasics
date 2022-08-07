package teachmeskills.lesson9;

import teachmeskills.lesson9.entity.VectorThreeDimensional;
import teachmeskills.lesson9.entity.VectorTwoDimensional;
import teachmeskills.lesson9.service.VectorThreeDimensionalService;
import teachmeskills.lesson9.service.VectorTwoDimensionalService;

public class Main {
    public static void main(String[] args) {
        // Работа с трёхмерными векторами
        // Создание новых векторов
        VectorTwoDimensional vectorOne = new VectorTwoDimensional(3,5);
        VectorTwoDimensional vectorTwo = new VectorTwoDimensional(4,6);

        // Создание объекта сервиса
        VectorTwoDimensionalService vectorTwoDimensionalService = new VectorTwoDimensionalService();

        // Нахождение длинны вектора
        System.out.println(vectorTwoDimensionalService.findVectorLong(vectorOne));

        // Скалярное произведение двух векторов
        System.out.println(vectorTwoDimensionalService.findVectorScalarMultiplication(vectorOne, vectorTwo));

        // Нахождение суммы векторов
        vectorTwoDimensionalService.findVectorSum(vectorOne, vectorTwo);

        System.out.println(vectorTwoDimensionalService.findVectorSum(vectorOne, vectorTwo).getCoordinateX());
        System.out.println(vectorTwoDimensionalService.findVectorSum(vectorOne, vectorTwo).getCoordinateY());

        // Нахождение разности векторов
        System.out.println(vectorTwoDimensionalService.findVectorDifference(vectorOne, vectorTwo).getCoordinateX());
        System.out.println(vectorTwoDimensionalService.findVectorDifference(vectorOne, vectorTwo).getCoordinateY());

        // Сравнение векторов
        System.out.println(vectorTwoDimensionalService.vectorComparison(vectorOne, vectorTwo));

        // Вывод информации о векторе
        System.out.println(vectorTwoDimensionalService.vectorInfo(vectorOne));

        // Работа с трёхмерными векторами
        // Cоздание новых векторов
        VectorThreeDimensional vectorThreeDimensionalOne = new VectorThreeDimensional(2,3,4);
        VectorThreeDimensional vectorThreeDimensionalTwo = new VectorThreeDimensional(5,6,7);

        // Создание объекта сервиса
        VectorThreeDimensionalService vectorThreeDimensionalService = new VectorThreeDimensionalService();

        // Нахождение длинны вектора
        System.out.println(vectorThreeDimensionalService.findVectorLong(vectorThreeDimensionalOne));

        // Скалярное произведение двух векторов
        System.out.println(vectorThreeDimensionalService.findVectorScalarMultiplication
                (vectorThreeDimensionalOne, vectorThreeDimensionalTwo));

        // Сумма двух векторов
        System.out.println(vectorThreeDimensionalService.findVectorSum
                (vectorThreeDimensionalOne, vectorThreeDimensionalTwo));

        // Разность двух векторов
        System.out.println(vectorThreeDimensionalService.findVectorDifference(vectorThreeDimensionalOne, vectorThreeDimensionalTwo));

        // Сравнение двух векторовъ
        System.out.println(vectorThreeDimensionalService.vectorComparison(vectorThreeDimensionalOne, vectorThreeDimensionalTwo));

        // Вывод информации о векторе
        System.out.println(vectorThreeDimensionalService.vectorInfo(vectorThreeDimensionalOne));
    }
}
