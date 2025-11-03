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

    public void aplicarDescuento(double descuento) {
        if (descuento > 0 && descuento <= 100) {
            precio = precio - (precio * descuento / 100)
        } else {
            System.out.println("El descuento no puede ser menor a 0 ni mayor a 100");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Almacenamiento: " + almacenamiento);
    }

    public Celular compararPrecio(Celular otroCel) {
        if (this.precio > otroCel.getPrecio()) {
            return this;
        } else {
            return otroCel;
        }
    }
}