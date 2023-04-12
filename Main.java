public class Main {
    public static void main(String[] args) {

        Triangulo T = new Triangulo(3,4);
        Quadrado Q = new Quadrado (4,4);

        System.out.println("Area do Quadrado" + Q.calcularArea());
        System.out.println("Area do Triangulo" + T.calcularArea());

        System.out.println("Perimetro do Quadrado" + Q.calcularPerimetro());
        System.out.println("Perimetro do Triangulo" + T.calcularPerimetro());






        }


    }
