
import java.util.Scanner;

public class Examen___ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEstudiantes = NumEstu(scanner);

        double[] calificaciones = Calificaciones(scanner, numeroEstudiantes);

        double promedio = Promedio(calificaciones);

        int cantidadMayores = CalifMax(calificaciones, promedio);

        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        
        
        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        Salida(promedio, cantidadMayores, calificacionMasAlta, calificacionMasBaja);
    }

    public static int NumEstu(Scanner scanner) {
        int numeroE;
        do {
            System.out.print("Ingrese el número de estudiantes siempre y cuando mayo que 0: ");
            numeroE = scanner.nextInt();
        } while (numeroE <= 0);
        return numeroE;
    }

                                 public static double[] Calificaciones(Scanner scanner, int numeroEstudiantes) {
        double[] calificaciones = new double[numeroEstudiantes];
        for (int i = 0; i < numeroEstudiantes; i++) {
            double calificacion;
            do {
                System.out.print("Ingrese la calificación del alumno " + (i + 1) + " (0-100): ");
                
                calificacion = scanner.nextDouble();
            } while (calificacion < 0 || calificacion > 100);
            calificaciones[i] = calificacion;
        }
        return calificaciones;
    }

    public static double Promedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static int CalifMax(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double masbaja = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < masbaja) {
                masbaja = calificacion;
            }
        }
        return masbaja;
    }

    public static void Salida(double promedio, int cantidadMayores, double calificacionMasAlta, double calificacionMasBaja) {
        System.out.println("Resultados:");
        System.out.println("Promedio de calificaciones: "+ promedio);
        System.out.println("Cantidad de calificaciones mayores o iguales al promedio: " + cantidadMayores);
        System.out.printf("Calificación más alta:"+ calificacionMasAlta);
        System.out.printf("Calificación más baja:"+ calificacionMasBaja);
    }
}


