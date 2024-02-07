import java.util.Scanner;
class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = recibirNumerosPorTeclado();

        if (numeros.length > 0) {
            double media = calcularMedia(numeros);
            int minimo = calcularMinimo(numeros);
            int maximo = calcularMaximo(numeros);

            System.out.println("Media: " + media);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Máximo: " + maximo);
        } else {
            System.out.println("No se introdujeron números.");
        }

        scanner.close();
    }
    public static int[] recibirNumerosPorTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce números enteros (introduce 0 para finalizar):");

        int[] numeros = new int[0];
        int numero;

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                numeros = agregarElemento(numeros, numero);
            }

        } while (numero != 0);

        return numeros;
    }
    public static double calcularMedia(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int suma = 0;
        for (int numero : array) {
            suma += numero;
        }

        return (double) suma / array.length;
    }
    public static int calcularMinimo(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int minimo = array[0];
        for (int numero : array) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }
    public static int calcularMaximo(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int maximo = array[0];
        for (int numero : array) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }
    public static int[] agregarElemento(int[] array, int elemento) {
        int[] nuevoArray = new int[array.length + 1];
        System.arraycopy(array, 0, nuevoArray, 0, array.length);
        nuevoArray[array.length] = elemento;
        return nuevoArray;
    }
}