class Ejercicio_5 {
    public static void main(String[] args) {
        int numeroDeNaturales = 10;

        int[][] tablasDeMultiplicar = generarTablasDeMultiplicar(numeroDeNaturales);

        for (int i = 0; i < tablasDeMultiplicar.length; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < tablasDeMultiplicar[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tablasDeMultiplicar[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] generarTablasDeMultiplicar(int n) {
        int[][] tablas = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = i * j;
            }
        }

        return tablas;
    }
}
