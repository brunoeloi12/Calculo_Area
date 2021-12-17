public class Calculo_Area {

    public static void area(double lados){

        System.out.println("A área do quadrado é: " + lados * lados);

    }

    public static void area(double altura, double base){

        System.out.println("A área do retângulo é: " + altura * base);

    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("A área do trapézio é: " + ((baseMaior + baseMenor)* altura)/2);
    }

}
