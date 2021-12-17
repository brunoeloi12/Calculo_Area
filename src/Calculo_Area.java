public class Calculo_Area {

    public static double area(double lados){

        return lados * lados;

    }

    public static double area(double altura, double base){

        return altura * base;

    }

    public static double area(double baseMaior, double baseMenor, double altura){

        return ((baseMaior + baseMenor)* altura)/2;

    }
    public static float area(float diagonal1, float diagonal2){

        return (diagonal1 * diagonal2)/2;

    }

}
