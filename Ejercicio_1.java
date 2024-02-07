public class Ejercicio_1 {
}
def calcular_segundos_en_un_año(años):
dias_por_año = 365
horas_por_dia = 24
minutos_por_hora = 60
segundos_por_minuto = 60

segundos_por_año = años * dias_por_año * horas_por_dia * minutos_por_hora * segundos_por_minuto
    return segundos_por_año

años_input = int(input("Introduce el número de años: "))
segundos_resultantes = calcular_segundos_en_un_año(años_input)