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