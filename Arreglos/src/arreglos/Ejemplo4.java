package arreglos;

import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {
        String mensajeFinal = "";
        String seguir = "";
        String[] peliculas = {"comedia", "terror", "drama", "familiar"};
        int tipo;
        int contador[] = new int[4];
        boolean opcion = true;
        String c = "*";

        Scanner sc = new Scanner(System.in);

        while (opcion == true) {
            System.out.println("Ingrese el tipo de pelicula\n1.Comedia\n2.Terror\n"
                    + "3.Drama\n4.Comedia");
            tipo = sc.nextInt();

            switch (tipo) {

                case 1:

                    contador[0] = contador[0] + 1;
                    break;

                case 2:

                    contador[1] = contador[1] + 1;
                    break;

                case 3:

                    contador[2] = contador[2] + 1;

                    break;

                case 4:

                    contador[3] = contador[3] + 1;

            }
            sc.nextLine(); // Limpiar Buffer
            System.out.println("Desea salir ingrese 'x' caso contrario presione enter para continuar ");
            seguir = sc.nextLine();

            if (seguir.equals("x")) {
                opcion = false;
            }
        }
        mensajeFinal = String.format("Reporte de preferencias de peliculas\n", mensajeFinal);

        for (int i = 0; i < contador.length; i++) {
            int j = contador[i];
            String aterisco = "";

            for (int a = 0; a < j; a++) {
                
                aterisco = String.format("%s*",aterisco);

            }
            mensajeFinal = String.format("%s\n%s = %s",
            mensajeFinal, peliculas[i], aterisco);
        }
        System.out.printf("%s\n", mensajeFinal);
    }
}
