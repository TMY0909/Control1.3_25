<<<<<<< HEAD
//Adrian Pulido Ortega
=======
//uvus:tmy0909
//pass:1741335195

package us.dit;

public class Control {

    public static void main(String[] args) {
        int numero = 5; 
        int resultado = factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    // Calcular el factorial de un número
    public static int factorial(int num) {
        if (num == 0) {
            return 1; // El factorial de 0 es 1
        } else {
            return num * factorial(num - 1);
        }
    }
}
>>>>>>> refs/heads/tmy0909
