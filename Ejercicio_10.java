import java.util.Scanner;
class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(dimension);
        System.out.println("Matriz simétrica generada:");
        imprimirMatriz(matriz);

        scanner.close();
    }
    public static int[][] generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = (int) (Math.random() * 100) + 1;
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio;
            }
        }

        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
