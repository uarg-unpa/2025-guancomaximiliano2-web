public class Videojuego {
    private String titulo;
    private String genero;
    private double precio;
    private int horasJugadas;

    // Constructor
    public Videojuego(String titulo, String genero, double precio, int horasJugadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.horasJugadas = horasJugadas;
    }

    // Metodos getters
    public String getTitulo() {
        return titulo;
    }

    public String  getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    // Metodos setters
    public void setTitulo(String nuevoTitulo) {
        if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
            this.titulo = nuevoTitulo;
        }
    }

    public void setGenero(String nuevoGenero) {
        if (nuevoGenero != null && !nuevoGenero.isEmpty()) {
            this.genero = nuevoGenero;
        }
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        }
    }

    public void setHorasJugadas(int nuevasHoras) {
        if (nuevasHoras >= 0) {
            this.horasJugadas = nuevasHoras;
        }
    }

    // Metodo para aumentar horas
    public void aumentarHoras(int horasSumadas) {
        if (horasSumadas > 0) {
            horasJugadas = horasJugadas + horasSumadas;
            System.out.println("Las horas se aumentaron a: " + horasJugadas + " Horas");
        } else {
            System.out.println("¡Las horas no pueden ser menores a 0!");
        }
    }

    // Metodo para aplicar descuento
    public void aplicarDescuento(double descuento) {
        if (descuento > 0 && descuento <= 100) {
            precio = precio - (precio * descuento / 100);
            System.out.println("El precio despues del descuento es: $" + precio);
        } else {
            System.out.println("Tenes que cerrar el estadio, Giant Giant. No podes poner ese precio");
        }
    }

    // Metodo para mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Datos del juego para gordos PC: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Precio: $" + precio);
        System.out.println("Horas Jugadas: " + horasJugadas + " Horas");
    }

    // Metodo para comparar precio con otro juego
    public Videojuego compararPrecio(Videojuego otroJuego) {
        if (this.precio > otroJuego.getPrecio()) {
            return this;
        } else {
            return otroJuego;
        }
    }
}

import java.util.Scanner;

public class MainJuegos {
    public static void main(String[] args) {

        // Crear el Scanner
        Scanner leer = new Scanner(System.in);

        // Pedirle al usuario los datos del primer videojuego
        System.out.println("Ingrese el nombre del juego 1: ");
        String nombre1 = leer.nextLine();

        System.out.println("Ingrese el genero del juego 1: ");
        String genero1 = leer.nextLine();

        System.out.println("Ingrese el precio del juego 1: ");
        double precio1 = leer.nextDouble();

        System.out.println("Ingrese las horas del juego 1: ");
        int horasJugadas1 = leer.nextInt();

        Videojuego j1 = new Videojuego(nombre1, genero1, precio1, horasJugadas1);
        j1.mostrarInformacion();

        // Limpiar el buffer
        leer.nextLine();

        // Pedirle al usuario los datos del segundo juego
        System.out.println("Ingrese el nombre del juego 2: ");
        String nombre2 = leer.nextLine();

        System.out.println("Ingrese el genero del juego 2: ");
        String genero2 = leer.nextLine();

        System.out.println("Ingrese el precio del juego 2: ");
        double precio2 = leer.nextDouble();

        System.out.println("Ingrese las horas del juego 2: ");
        int horasJugadas2 = leer.nextInt();

        // Limpiar el buffer
        leer.nextLine();

        Videojuego j2 = new Videojuego(nombre2, genero2, precio2, horasJugadas2);
        j2.mostrarInformacion();

        // Invocar al metodo aumentarHoras
        System.out.println("Ingrese las horas para el juego 1: ");
        int horasSumadas = leer.nextInt();
        j1.aumentarHoras(horasSumadas);

        // Invocar al metodo aplicarDescuento
        System.out.println("Ingrese el descuento para el juego 2: ");
        double descuento = leer.nextDouble();
        j2.aplicarDescuento(descuento);

        // Comparar precios
        System.out.println("¿Cual juego es mas caro?");
        Videojuego elMasCaro = j1.compararPrecio(j2);
        elMasCaro.mostrarInformacion();

        leer.close();
    }
}