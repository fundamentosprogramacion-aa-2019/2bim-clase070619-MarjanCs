package arreglos;

import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String[] rangos = {"0-10", "10.1-12", "12.1-15", "15.1-18", "18.1-20"};
        double calificaciones[] = new double[5];

        int suma = 0;
        boolean bandera = true;
        String seguir = "";
        double calificacion;
        String reporteFinal = "";

        while (bandera == true) {
            System.out.println("Ingrese una calificacion para clasificarla");
            calificacion = entrada.nextDouble();
            if ((calificacion >= 0) && calificacion <= 10) {
                calificaciones[0] = calificaciones[0] + 1;
            } else {
                if ((calificacion >= 10.1) && calificacion <= 12) {
                    calificaciones[1] = calificaciones[1] + 1;
                } else {
                    if ((calificacion >= 12.1) && calificacion <= 15) {
                        calificaciones[2] = calificaciones[2] + 1;
                    } else {
                        if ((calificacion >= 15.1) && calificacion <= 18) {
                            calificaciones[3] = calificaciones[3] + 1;
                        } else {
                            if ((calificacion >= 18.1) && calificacion <= 20) {
                                calificaciones[4] = calificaciones[4] + 1;
                            }
                        }
                    }
                }
            }
            entrada.nextLine(); // Limpiar Buffer
            
            System.out.println("Desea salir ingrese 'x' caso contrario presione enter para continuar ");
            seguir = entrada.nextLine();

            if (seguir.equals("x")) {
                bandera = false;
            }
        }
        reporteFinal = String.format("%sReporte de notas\n",reporteFinal);
        
        for(int i = 0; i<calificaciones.length; i++ ){
            reporteFinal = String.format("%sRango %s, numero de notas %.0f\n"
                    ,reporteFinal,rangos[i],calificaciones[i]);
        }
        System.out.printf("%s\n",reporteFinal);
    }
}
