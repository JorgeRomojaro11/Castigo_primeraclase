import java.util.Scanner;
class ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }

        scanner.close();
    }
    public static int[] descomponerEnFactoresPrimos(int numero) {
        int[] factoresPrimos = new int[0];

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                // i es un factor primo
                factoresPrimos = agregarElemento(factoresPrimos, i);
                numero /= i;
            }
        }

        return factoresPrimos;
    }
    public static int[] agregarElemento(int[] array, int elemento) {
        int[] nuevoArray = new int[array.length + 1];
        System.arraycopy(array, 0, nuevoArray, 0, array.length);
        nuevoArray[array.length] = elemento;
        return nuevoArray;
    }
}