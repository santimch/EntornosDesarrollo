import es.iesmz.prueba.Coche;

import java.util.Scanner;

class coche{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear coche inicial
        Coche miCoche = new Coche("Fiat", "Panda", "Amarillo");

        int opcion;
        do {
            System.out.println("\n=== MENÚ COCHE ===");
            System.out.println("1. Imprimir datos del coche");
            System.out.println("2. Pintar el coche");
            System.out.println("3. Establecer Marca");
            System.out.println("4. Establecer Modelo");
            System.out.println("5. Establecer Color");
            System.out.println("6. Acelerar");
            System.out.println("7. Frenar");
            System.out.println("8. Parar");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println(miCoche.toString());
                    break;
                case 2:
                    System.out.print("Introduce nuevo color: ");
                    String nuevocolor = sc.nextLine();
                    miCoche.pinta ();
                    break;
                case 3:
                    System.out.print("Introduce nueva marca: ");
                    String marca = sc.nextLine();
                    miCoche.setMarca(marca);
                    break;
                case 4:
                    System.out.print("Introduce nuevo modelo: ");
                    String modelo = sc.nextLine();
                    miCoche.setModelo(modelo);
                    break;
                case 5:
                    System.out.print("Introduce nuevo color: ");
                    String color = sc.nextLine();
                    miCoche.setColor(color);
                    break;
                case 6:
                    System.out.print("Velocidad a aumentar: ");
                    double velAcelerar = sc.nextDouble();
                    miCoche.acelera((int) velAcelerar);
                    break;
                case 7:
                    System.out.print("Velocidad a reducir: ");
                    double velFrenar = sc.nextDouble();
                    miCoche.frena((int) velFrenar);
                    break;
                case 8:
                    miCoche.para();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        sc.close();
    }
}