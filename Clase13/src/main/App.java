package main;

import java.util.Scanner;

import staticmethods.Operaciones;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el area del circulo");
        Double radius = sc.nextDouble();

        System.out.println("El area del ciculo con radio " + radius + " es " + Operaciones.circleArea(radius));
        System.out.println(
                "El perimetro del circulo con radio " + radius + "0 es: " + Operaciones.circlePerimeter(radius));

        // Temperatura
        System.out.println("Ingrese grados en farenheit ");
        double farenheit = sc.nextDouble();
        System.out.println(farenheit + "° son " + Operaciones.farenheitToCelsius(farenheit) + "° en celsius");

        System.out.println("Ingrese grados en celsius ");
        Double celsius = sc.nextDouble();

        System.out.println(celsius + "° celsius son " + Operaciones.celsiusToFarenheeit(celsius) + "° en farenheit");

        // Hipotenusa
        System.out.println("Ingrese el largo del cateto opuesto del triangulo");
        Double oposite = sc.nextDouble();
        System.out.println("Ingrese el largo del cateto adyacente del triangulo");
        Double adjacent = sc.nextDouble();

        System.out.println("La hipotenusa de un triangulo con lados " + oposite + " y " + adjacent + " es "
                + Operaciones.hypotenuse(oposite, adjacent));

        sc.close();
    }
}
