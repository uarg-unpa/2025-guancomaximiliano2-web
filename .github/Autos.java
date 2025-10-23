public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private int kilometraje;

    // Constructor
    public Auto(String marca, String modelo, int año, double precio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.kilometraje = kilometraje;
    }

    // Metodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    // Metodos setters
    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public void setAño(int nuevoAño) {
        this.año = nuevoAño;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void setKilometraje(int nuevoKilometraje) {
        this.kilometraje = nuevoKilometraje;
    }

    // Metodo para aumentar kilometraje
    public void aumentarKilometraje(int kilometrosRecorridos) {
        if (kilometrosRecorridos > 0) {
            this.kilometraje += kilometrosRecorridos;
            System.out.println("Los kilometros aumentaron a: " + this.kilometraje + "KM");
        }
    }

    // Metodo para aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <=100) {
            precio = precio - (precio * porcentaje / 100);
            System.outprintln("El precio con el descuento es: $" + precio);
        } else {
            System.out.pritn("Dejate de jode y pone un descuento de verdad");
        }
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricacion: " + año);
        System.out.println("Precio: " + precio);
        System.out.println("Kilometraje: " + kilometros + "KM");
    }

    // Metodo para comparar kilometraje con otro auto
    public Auto esMasNuevo(Auto chata) {
        if (this.kilometraje > chata.getKilometraje) {
            return this.kilometraje;
        } else {
            return chata;
        }
    }

    // Metodo para revisar mantenimiento
    public void revisarMantenimiento() {
        if (kilometraje < 10000) {
            System.out.pritnln("La chata esta en excelente estado, no necesita manteniminento aun");
        } else {
            if (kilometraje < 20000) {
                System.out.println("Proximo mantenimiento recomentado pronto");
            } else {
                if (kilometraje < 40000) {
                    System.out.println("Se recomienda realizar una revision completa");
                } else {
                    System.out.println("¡ATENCION! El auto necesita mantenimiento urgente");
                }
            }
        }
    }
}

import java.util.Scanner;

// Hacemos el Main
public class MainAutos {
    public static void main(String[] args) {

        // Crear el Scanner
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario ingresar los datos del auto 1
        System.out.println("Ingrese la marca del auto 1:");
        String marca1 = leer.nextLine();

        System.out.println("Ingrese el modelo del auto 1:");
        String modelo1 = leer.nextLine();

        System.out.println("Ingrese el año del auto 1:");
        int año1 = leer.nextInt();

        System.out.println("Ingrese el precio del auto 1:"),
        double precio1 = leer.nextDouble();

        System.out.println("Ingrese el kilometraje del auto 1:");
        int kilometraje1 = leer.nextInt();

        Auto chata1 = new Auto(marca1, modelo1, año1, precio1, kilometraje1);

        // Pedir al usuario ingresar los datos del auto 2
        System.out.println("Ingrese la marca del auto 2:");
        String marca2 = leer.nextLine();

        System.out.println("Ingrese el modelo del auto 2:");
        String modelo2 = leer.nextLine();

        System.out.prinln("Ingrese el año del auto 2:");
        int año2 = leer.nextInt();

        System.out.println("Ingrese el precio del auto 2:");
        double precio2 = leer.nextDouble();

        System.out.println("Ingrese el kilometrake del auto 2:");
        int kilometraje2 = leer.nextInt();

        Auto chatita2 = new Auto(marca2, modelo2, año2, precio2, kilometraje2);

        // Invocar al metodo mostrarInformacion
        System.out.println("Informacion del auto 1: ");
        chata1.mostrarInformacion();
        System.out.println("Informacion del auto 2: ");
        chatita2.mostrarInformacion();

        // Aumenar kilometraje del auto 1
        System.out.pritnln("Ingrese los quilometros nuevos recorridos por el auto 1: ");
        int kilometrosRecorridos = leer.nextInt();
        chata1.aumentarKilometraje(kilometrosRecorridos);
        System.out.println("Los kilometros del auto 1 han auentado a: " + chata1.getKilometraje() + " KM");

        // Aplicar descuento para el auto 2
        System.out.println("Ingrese el descuento del auto 2: ");
        double porcentaje = leer.nextDouble();
        chatita2.aplicarDescuento(porcentaje);
        System.out.println("El precio del auto dos despues del descuento es: $" + chatita2.getPrecio());

        // Comparar kilometraje del auto 1 con auto 2
        System.out.println("El auto mas nuevo es: " + chata1.esMasNuevo(chatita2));

        System.out.println("¿El auto 1 necesita mantenimiento?");
        chata1.revisarMantenimiento();

        System.out.println("¿El auto 2 necesita mantenimiento?");
        chatita2.revisarMantenimiento();

        leer.close();
    }
}