package figurageometrica;

import java.util.Scanner;

public class Interaccion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        double largo, ancho, lado1, lado2, lado;
        System.out.println("Bienvenido");

        do {
            System.out.println("Seleccione la opción que desee");
            System.out.println("1 - Rectangulo");
            System.out.println("2 - Triangulo");
            System.out.println("3 - Cuadrado");
            System.out.println("4 - Salir");
            System.out.print("Digite la opcion: ");
            opcion = Integer.parseInt(teclado.next());

            switch (opcion) {
                case 1:

                    System.out.println("Digite el valor de la base");
                    largo = Integer.parseInt(teclado.next());
                    ;
                    System.out.println("Digite el valor de la altura");
                    ancho = Integer.parseInt(teclado.next());
                    ;
                    Rectangulo rec = new Rectangulo(largo, ancho);
                    System.out.println("El area del rectangulo es: " + rec.Area());
                    System.out.println("El perimetro del rectangulo es: " + rec.Perimetro());

                    break;
                case 2:
                    System.out.println("Digite el valor de la base");
                    largo = Integer.parseInt(teclado.next());
                    ;
                    System.out.println("Digite el valor de la altura");
                    ancho = Integer.parseInt(teclado.next());
                    ;
                    System.out.println("Digite el valor del lado1");
                    lado1 = Integer.parseInt(teclado.next());
                    ;
                    System.out.println("Digite el valor del lado2");
                    lado2 = Integer.parseInt(teclado.next());
                    ;
                    Triangulo tri = new Triangulo(largo, ancho, lado1, lado2);
                    System.out.println("El area del Triangulo es: " + tri.Area());
                    System.out.println("El perimetro del Triangulo es: " + tri.Perimetro());
                    break;
                case 3:
                    System.out.println("Digite el valor del lado");
                    lado = Integer.parseInt(teclado.next());
                    ;
                    Cuadrado cua = new Cuadrado(lado);
                    System.out.println("El area del Cuadrado es: " + cua.Area());
                    System.out.println("El perimetro del Cuadrado es: " + cua.Perimetro());
                   
                    break;
                default:
                    System.out.println("La opción seleccionada no es correcta");
            }
        } while (opcion != 4);

    }
}
