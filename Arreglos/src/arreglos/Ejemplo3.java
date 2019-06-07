package arreglos;

import java.util.Scanner;

/*Generear un programa */
public class Ejemplo3 {

    public static void main(String[] args) {

        String mensajeFinal = "";
        String seguir = "";
        String[] vocales = {"a", "e", "i", "o", "u"};
        String palabra = "";
        int contador[] = new int[5];
        boolean opcion = true;

        Scanner sc = new Scanner(System.in);

        while (opcion == true) {
            System.out.println("Ingrese la palabra");
            palabra = sc.nextLine();
            
            char valor = palabra.charAt(0);
            switch (valor) {

                case 'a':
                case 'A':
                    contador[0] = contador[0] + 1;
                    break;

                case 'e':
                case 'E':
                    contador[1] = contador[1] + 1;
                    break;

                case 'i':
                case 'I':
                    contador[2] = contador[2] + 1;

                    break;

                case 'o':
                case 'O':
                    contador[3] = contador[3] + 1;

                    if (seguir.equals("x")) {
                        opcion = false;
                    }
                    break;

                case 'u':
                case 'U':
                    contador[4] = contador[4] + 1;

            }
            //sc.nextLine(); // Limpiar Buffer
            System.out.println("Desea salir ingrese 'x' caso contrario presione enter para continuar ");
            seguir = sc.nextLine();

            if (seguir.equals("x")) {
                opcion = false;
            }
        }

        mensajeFinal = String.format("Reporte de vocales\n", mensajeFinal);

        for (int i = 0; i < contador.length; i++) {
            mensajeFinal = String.format("%sVocal %s, numero de veces usada %d\n",
                     mensajeFinal, vocales[i], contador[i]);
        }
        System.out.printf("%s\n", mensajeFinal);
    }

}
