public class Pc {
    // Atributos
    private String marca;
    private String procesador;
    private double precio;
    private int ram; // en GB

    // Constructor
    public Pc(String marca, String procesador, double precio, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.precio = precio;
        this.ram = ram;
    }

    // Metodos getters
    public String getMarca() {
        return marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public double getPrecio() {
        return precio;
    }

    public int getRam() {
        return ram;
    }

    // Metodos setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // Metodo para actualizar la RAM
    public void actualizarRam(int nuevaRam) {
        if (nuevaRam > 0) {
            this.ram = nuevaRam;
            System.out.println("RAM actulizada a:" + nuevaRam + " GB");
        } else {
            System.out.println("Datos invalidos, la RAM debe ser mayor a 0");
        }
    }

    // Metodo para aplicar descuento
    public void aplicarDescuento(double porcentaje) { 
        if (porcentaje > 0 && porcentaje <= 100) {
            precio = precio - (precio * porcentaje / 100);
            System.outp.println("Nuevo precio despues del descuento: $" + precio);
        } else {
            System.out.println("Porcentaje invalido");
        }
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("Precio: $" + precio);
        System.out.println("RAM: " + ram + " GB");
    }

    // Metodo para comparar RAM con otra PC
    public Pc mayorRam(Pc p) {
        if (this.ram >= p.getRam()) {
            return this;
        } else {
            return p;
        }
    }

}

import java.util.Scanner;

public class MainPc {
    public static void main(String[] args) {

        // Crear el Scanner
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario los datos de la PC 1
        System.out.println("Ingrese la marca de la PC 1:");
        String marca1 = leer.nextLine();

        System.out.println("Ingrese el procesador de la PC 1:");
        String procesador1 = leer.nextLine();

        System.out.println("Ingrese precio de la PC 1:");
        double precio1 = leer.nextDouble();

        System.out.println("Ingrese la RAM de la PC 1:");
        int ram1 = leer.nextInt();

        // Creando la PC 1
        Pc pc1 = new Pc(marca1, procesador1, precio1, ram1);

        // Pedir al usuario los datos de la PC 2
        System.out.println("Ingrese la marca de la PC 2:");
        String marca2 = leer.nextLine();

        System.out.println("Ingrese el procesador de la PC 2:");
        String procesador2 = leer.nextLine();

        System.out.println("Ingrese el precio de la PC 2:");
        double precio2 = leer.nextDouble();

        System.out.println("Ingrese la RAM de la PC 2:");
        int ram2 = leer.nextInt();

        // Crear la PC 2
        Pc pc2 = new Pc(marca2, procesador2, precio2, ram2);


        // Mostrar informacion
        System.out.println("=== Informacion inicial ===");
        pc1.mostrarInformacion();
        pc2.mostrarInformacion();

        // Actualizar RAM
        pc1.actualizarRam(14);

        // Aplicar descuento
        pc2.aplicarDescuento(10); // Descuento del 10%

        // Comparar cual tiene mas RAM
        Pc mayor = pc1.mayorRam(pc2);
        System.out.println("La PC con mayor RAM es: " + mayor.getMarca());

        System.out.println("=== Datos actualizados ===");
        pc1.mostrarInformacion();
        pc2.mostrarInformacion();
    }
}