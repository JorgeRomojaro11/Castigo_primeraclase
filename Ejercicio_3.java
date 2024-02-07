class Ejercicio_3 {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);
        System.out.println("Múltiplos de 5 entre " + begin + " y " + end + ":");
        mostrarArray(multiplosDe5);

        int suma = calcularSuma(multiplosDe5);
        System.out.println("Suma de los múltiplos de 5: " + suma);
    }

    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int cantidad = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                cantidad++;
            }
        }

        int[] multiplosDe5 = new int[cantidad];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplosDe5[index] = i;
                index++;
            }
        }

        return multiplosDe5;
    }
    public static void mostrarArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int elemento : array) {
            suma += elemento;
        }
        return suma;
    }
}
