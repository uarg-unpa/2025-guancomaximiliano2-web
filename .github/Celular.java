public class Celular {
    private String marca;
    private String modelo;
    private double precio;
    private int almacenamiento;
    
    // Constructor
    public Celular(String marca, String modelo, double precio, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
    }

    // Metodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    // Metodos setters
    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null && !nuevaMarca.isEmpty()) {
            this.marca = nuevaMarca;
        }
    }

    public void setModelo(String nuevoModelo) {
        if (nuevoModelo != null && !nuevoModelo.isEmpty()) {
            this.modelo = nuevoModelo;
        }
    }

    public void setPrecio(nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        }
    }

    // Metodo para actualizar almacenamiento
    public void actualizarAlmacenamiento(int nuevoAlmacen) {
        if (nuevoAlmacen > this.almacenamiento && nuevoAlmacen > 0) {
            this.almacenamiento = nuevoAlmacen;
        }
    }

    // Metodo para aplicar descuento
    public void aplicarDescuento(double descuento) {
        if (descuento > 0 && descuento <= 100) {
            precio = precio - (precio * descuento / 100);
            System.out.println("El nuevo precio es: $" + precio);
        } else {
            System.out.println("El descuento no puede ser menor a 0 ni mayor a 100");
        }
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Almacenamiento: " + almacenamiento);
    }

    // Metodo para comparar precio con otro celular
    public Celular compararPrecio(Celular otroCel) {
        if (this.precio > otroCel.getPrecio()) {
            return this;
        } else {
            return otroCel;
        }
    }
}

import java.util.Scanner;

public class MainCelulares {
    public static void main(String[] args) {

        // Crear el Scanner
        Scanner leer = new Scanner(System.in);

        // Pedirle al usuario los datos del primer celular
        System.out.println("Ingrese el la marca del celular 1: ");
        String marca1 = leer.nextLine();

        System.out.println("Ingrese el modelo del celular 1: ");
        String modelo1 = leer.NextLine();

        System.out.println("Ingrese el precio del celular 1: ");
        double precio1 = leer.nextDouble();

        System.out.println("Ingrese el almacenamiento del celular 1: ");
        int almacenamiento1 = leer.nextInt();

        Celular celuDeChaime = new Celular(marca1, modelo1, precio1, almacenamiento1);
        celuDeChaime.mostrarInformacion();

        // Limpiar el buffer
        leer.nextLine();

        // Pedirle al usuario los datos del celular 2
        System.out.println("Ingrese la marca del celular 2: ");
        String marca2 = leer.nextLine();

        System.out.println("Ingrese el modelo del celular 2: ");
        String modelo2 = leer.nextLine();

        System.out.println("Ingrese el precio del celular 2: ");
        double precio2 = leer.nextDouble();

        System.out.println("Ingrese el almacenamiento del celular 2: ");
        int almacenamiento2 = leer.nextInt();

        // Limpiar el buffer
        leer.nextLine();

        Celular celuDeSube = new Celular(marca2, modelo2, precio2, almacenamiento2);
        celuDeSube.mostrarInformacion();

        // Invocar al metodo actualizarAlmacenamiento
        System.out.println("Ingrese el nuevo almacenamiento para el celular 1: ");
        int nuevoAlmacen = leer.nextInt();
        celuDeChaime.actualizarAlmacenamiento(nuevoAlmacen);

        // Invocar al metodo aplicarDescuento
        System.out.println("Ingrese el descuento para el celular 2: ");
        double descuento = leer.nextDouble();
        celuDeSube.aplicarDescuento(descuento);

        // Invocar al metodo compararPrecio
        Celular esMasCaro = celuDeChaime.compararPrecio(celuDeSube);
        esMasCaro.mostrarInformacion();

        leer.close();
    }
}