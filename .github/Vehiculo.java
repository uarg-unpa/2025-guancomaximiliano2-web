public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private char tipoDeCombustible;
    private double kilometros;
    private double capacidadDeTanque;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, char tipoDeCombustible, double kilometros, double capacidadDeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoDeCombustible = tipoDeCombustible;
        this.kilometros = kilometros;
        this.capacidadDeTanque = capacidadDeTanque;
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

    public char getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public double getKilometros() {
        return kilometros;
    }

    public double getCapacidadDeTanque() {
        return capacidadDeTanque;
    }

    // Metodos setters
    public void setMarca(String nuevaMarca) {
        if (nuevaMarca != null && !nuevaMarca.trim().isEmpty()) {
            this.marca = nuevaMarca;
        }
    }

    public void setModelo(String nuevoModelo) {
        if (nuevoModelo != null && !nuevoModelo.trim().isEmpty()) {
            this.modelo = nuevoModelo;
        }
    }

    public void setAño(int nuevoAño) {
        if (nuevoAño > 0) {
            this.año = nuevoAño;
        }
    }

    public void setTipoDeCombustible(char nuevoCombustible) {
        nuevoCombustible = Character.toUpperCase(nuevoCombustible); // Para combertir cualquier minuscula a mayuscula
        if (nuevoCombustible == 'N' || nuevoCombustible == 'G') {
            this.tipoDeCombustible = nuevoCombustible;
        }

    }

    public void setKilometros(double km) {
        if (km > 0) {
            this.kilometros = km;
        }
    }

    public void setCapacidadDeTanque(double nuevaCapacidad) {
        if (nuevaCapacidad > 0) {
            this.capacidadDeTanque = nuevaCapacidad;
        }
    }

    // Metodo para calcular consumo
    public double calcularConsumo(double kmRecorridos) {
        if (kmRecorridos > 0) {
            return kmRecorridos / 13;
        } else return 0;
    }

    // Metodo para saber si es antiguo
    public boolean esAntiguo() {
        if (año < 2005) {
            return true;
        } else return false;
    }

    // Metodo para comparar kilometros con otro auto
    public boolean tieneMasKmQue(Vehiculo otroV) {
        if (this.kilometros > otroV.getKilometros()) {
            return true;
        } else return false;
    }
}

import java.util.Scanner;

public class MainVehiculos {
    public static void main(String[] args) {

        // Crear el Scanner
        Scanner leer = new Scanner(System.in);

        // Pedirle al usuario los datos del primer vehiculo
        System.out.println("Ingrese la marca de v1: ");
        String marca1 = leer.nextLine();

        System.out.println("Ingrese el modelo de v1: ");
        String modelo1 = leer.nextLine();

        System.out.println("Ingrese el año de v1: ");
        int año1 = leer.nextInt();

        System.out.println("Ingrese el tipo de combustible de v1: ");
        char combus1 = leer.next().charAt(0);

        System.out.println("Ingrese los kilometros de v1: ");
        double kilometros1 = leer.nextDouble();

        System.out.println("Ingrese la capacidad del taque de v1: ");
        double capDelTanque1 = leer.nextDouble();

        // Limpiar el buffer
        leer.nextLine();

        // Crear a v1
        Vehiculo v1 = new Vehiculo(marca1, modelo1, año1, combus1, kilometros1, capDelTanque1);
        

        // Pedirle al usuario los datos del segundo vehiculo
        System.out.println("Ingrese la marca de v2: ");
        String marca2 = leer.nextLine();

        System.out.println("Ingrese el modelo de v2: ");
        String modelo2 = leer.nextLine();

        System.out.println("Ingrese el año de v2: ");
        int año2 = leer.nextInt();

        System.out.println("Ingrese el tipo de combustible de v2: ");
        char combus2 = leer.next().charAt(0);

        System.out.println("Ingrese los kimoetros de v2: ");
        double kilometros2 = leer.nextDouble();

        System.out.println("Ingrese la capacidad del tanque de v2: ");
        double capDelTanque2 = leer.nextDouble();

        // Limpiar el buffer
        leer.nextLine();

        // Crear a v2
        Vehiculo v2 = new Vehiculo(marca2, modelo2, año2, combus2, kilometros2, capDelTanque2);

        // Usar al metodo calcular consumo
        System.out.println("Ingrese los Km recorridos por v1: ");
        double kmRecorridos = leer.nextDouble();

        double resultado = v1.calcularConsumo(kmRecorridos);
        System.out.println("El consumo de v1 fue de" + resultado + " litros para recorrer" + kmRecorridos + " km");

        // Usar al metodo esAntiguo
        System.out.println("¿v2 es viejo?");
        boolean ñema = v2.esAntiguo();

        if (ñema == true) {
            System.out.println("Si, v2 es antiguo");
        } else System.out.println("No, v2 no es antiguo");

        // Usar al metodo para comparar kilometrajes
        boolean sube = v1.tieneMasKmQue(v2);

        if (sube == true) {
            System.out.println("v1 tiene mas kilometraje que v2");
        } else System.out.println("v2 tiene mas kilometraje que v1");

        leer.close();
    }
}