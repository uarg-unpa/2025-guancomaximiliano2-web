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
            System.out.pritn("Dejate de jode y pone un precio de verdad");
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
}