public class Main {

    public static void main(String[] args){

        //Metodo de retorno
        double areaQuadrado = Calculo_Area.area(4);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        double areaRetangulo = Calculo_Area.area(3,5);
        System.out.println("A área do retângulo é: "+ areaRetangulo);
        double areaTrapezio = Calculo_Area.area(8,4,4);
        System.out.println("A área do trapézio é: " + areaTrapezio);
        double areaLosango = Calculo_Area.area(5,8);
        System.out.println("A área do losango é: " + areaLosango);

    }

}
