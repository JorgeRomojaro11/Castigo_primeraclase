import java.util.Scanner;

class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de años: ");
        int aniosInput = scanner.nextInt();

        long segundosResultantes = calcularSegundosEnUnAnio(aniosInput);

        System.out.println("En " + aniosInput + " años hay " + segundosResultantes + " segundos.");
    }

    public static long calcularSegundosEnUnAnio(int anios) {
        int diasPorAnio = 365;
        int horasPorDia = 24;
        int minutosPorHora = 60;
        int segundosPorMinuto = 60;

        long segundosPorAnio = (long) anios * diasPorAnio * horasPorDia * minutosPorHora * segundosPorMinuto;
        return segundosPorAnio;
    }
}
