import java.util.Random;

class Principal {

    public static void main(String[] args) {


        Coche c = new Coche("Fiat","500","Rojo");
        Coche c2 = new Coche("Audi","A4","Negro");
        Coche c3 = new Coche("Renault","4L","Gris");


        Random aleatorio = new Random();
        int velocidad_nueva1 = aleatorio.nextInt(80);
        int velocidad_nueva2 = aleatorio.nextInt(80);
        int velocidad_nueva3 = aleatorio.nextInt(80);

        // En las variables velocidad_nuevaX hay un número entre el 0 y el 50



        c2.acelera(velocidad_nueva1);
        c3.acelera(velocidad_nueva2);
        c.acelera(velocidad_nueva3);


        System.out.println("----- INFO DE LOS 3 COCHES------");
        System.out.println("-----------------------------");

        c.pinta();
        c2.pinta();
        c3.pinta();

        // Queremos saber las velocidades en este punto

        velocidad_nueva1 = aleatorio.nextInt(100);
        velocidad_nueva2 = aleatorio.nextInt(100);
        velocidad_nueva3 = aleatorio.nextInt(100);

        c.frena(velocidad_nueva1);
        c2.frena(velocidad_nueva2);
        c3.frena(velocidad_nueva3);

        // Queremos saber las velocidades en este punto

        System.out.println("----- INFO DE LOS 3 COCHES------");
        System.out.println("-----------------------------");


        c.pinta();
        c2.pinta();
        c3.pinta();

    }

}

class Coche {


    String marca;
    String modelo;
    String color;
    int velocidad;    // En km/hora


    public Coche(String marca, String modelo, String color) {

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;  //Inicialmente esta parado
    }



    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }
    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }



    public void imprime() {
        System.out.println("[ "+ this.marca + "-" + this.modelo + " (" + this.color +") ---> "+ this.velocidad +" Km/h ]");

    }

    public void acelera(int vel) {
        this.velocidad += vel;

    }
    public void frena(int vel) {
        this.velocidad -= vel;
        if(this.velocidad<0) this.velocidad = 0;

    }
    public void para(){

        this.velocidad = 0;

    }

    public void pinta() {
        int i=0;
        for(i=0; i<this.velocidad/10; i++)
            System.out.print(" ");
        System.out.println(" _/ "+ this.marca+"  \\_");

        for(i=0; i<this.velocidad/10; i++)
            System.out.print(" ");
        System.out.println(" o    o ");

        System.out.println();

    }






}
