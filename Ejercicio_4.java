import java.util.Scanner;

class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

        int numero;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }

            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }

        } while (true);

        if (minimo == Integer.MAX_VALUE && maximo == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
        }

        scanner.close();
    }
}