import java.util.Scanner;

class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de los vectores (N): ");
        int N = scanner.nextInt();

        int[] vector1 = leerVectorDesdeTeclado(N);

        int[] vector2 = leerVectorDesdeTeclado(N);

        int productoEscalar = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        scanner.close();
    }
    public static int[] leerVectorDesdeTeclado(int dimension) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los elementos del vector separados por espacios:");

        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Los vectores deben tener la misma dimensión.");
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
