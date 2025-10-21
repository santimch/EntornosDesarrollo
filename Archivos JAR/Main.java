
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Introduce día: ");
    int dia = entrada.nextInt();

    System.out.print("Introduce mes: ");
    int mes = entrada.nextInt();

    System.out.print("Introduce año: ");
    int anyo = entrada.nextInt();

    MZFecha fecha = new MZFecha(dia, mes, anyo);
    fecha.imprime();

    MZFecha fechaFutura = new MZFecha(1, 1, 2026);
    System.out.println("Diferencia de días con 01/01/2026: " + fecha.diferenciaDias(fechaFutura));

    entrada.close();
}