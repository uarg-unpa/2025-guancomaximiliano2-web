public class Persona {
    private String apellido;
    private int edad;
    private int dni;
    private char sexo;
    private int peso;
    private int altura;
    
    // Constructor
    public Persona(String apellido, int edad, int dni, char sexo, int peso, int altura) {
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Metodos getters
    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    // Metodos setters
    public void setApellido(String nuevoApellido) {
        if (nuevoApellido != null && !nuevoApellido.isEmpty()) {
            this.apellido = nuevoApellido;
        }
    }

    public void setEdad(int nuevaEdad) {
        if (nuevaEdad > 0 && nuevaEdad <= 100) {
            this.edad = nuevaEdad;
        }
    }

    public void setDni(int nuevoDni) {
        if (nuevoDni > 0) {
            this.dni = nuevoDni;
        }
    }

    public void setSexo(char nuevoSexo) {
        this.sexo = nuevoSexo;
    }

    public void setPeso(int nuevoPeso) {
        if (nuevoPeso > 0) {
            this.peso = nuevoPeso;
        }
    }

    public void setAltura(int nuevaAltura) {
        if (nuevaAltura > 0) {
            this.altura = nuevaAltura;
        }
    }

    // Metodo para calcular IMC
    public int calcularImc() {
        // Altura en metros
        double alturaEnMetros = altura / 100.0;
        double icm = peso / (alturaEnMetros * alturaEnMetros);

        if (icm < 18) {
            return -1;
        } else if (icm >= 18 && icm <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    // Metodo para saber si es mayor de edad
    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo para comparar edad con otra persona
    public boolean esMayorQue(Persona otraPersona) {
        if (this.edad > otraPersona.getEdad()) {
            return true;
        } else return false;
    }
}

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {

        // Crear el Scanner
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el apellido de la persona 1: ");
        String apellido1 = leer.nextLine();

        System.out.println("Ingrese la edad de persona 1: ");
        int edad1 = leer.nextInt();

        System.out.println("Ingrese el DNI de persona 1: ");
        int dni1 = leer.nextInt();

        System.out.println("Ingrese el sexo de persona 1: ");
        char sexo1 = leer.nextChar().charAt(0);

        System.out.println("Ingrese el peso de persona 1: ");
        int peso1 = leer.nextInt();

        System.out.println("Ingrese la altura de persona 1: ");
        int altura1 = leer.nextInt();

        Persona p1 = new Persona(apellido1, edad1, dni1, sexo1, peso1, altura1);

        // Limpiar el buffer
        leer.nextLine();

        System.out.println("Ingrese el apellido de persona 2. ");
        String apellido2 = leer.nextLine();

        System.out.println("Ingrese la edad de persona 2: ");
        int edad2 = leer.nextInt();

        System.out.println("Ingrese el DNI de persona 2: ");
        int dni2 = leer.nextInt();

        System.out.println("Ingrese el sexo de persona 2: ");
        char sexo2 = leer.nextChar().charAt(0);

        System.out.println("Ingrese el peso de persona 2: ");
        int peso2 = leer.nextInt();

        System.out.println("Ingrese la altura de persona 2: ");
        int altura2 = leer.nextInt();

        Persona p2 = new Persona(apellido2, edad2, dni2, sexo2, peso2, altura2);

        // Limpiar el buffer
        leer.nextLine();

        // Peso ideal de p1
        int icm1 = p1.calcularImc();
        if (icm1 == -1) {
            System.out.println("La persona 1 esta por debajo de su peso ideal");
        } else if (icm1 == 0) {
            System.out.println("La persona 1 esta en su peso ideal");
        } else System.out.println("La persona 1 tiene sobrepeso");

        // Peso ideal de p2
        int icm2 = p2.calcularImc();
        if (icm2 == -1) {
            System.out.println("La persona 2 esta por debajo de su peso ideal");
        } else if (icm2 == 0) {
            System.out.println("La persona 2 esta en su peso ideal");
        } else System.out.println("La persona 2 tiene sobrepeso");

        // Cuantos son mayores de edad
        boolean mayor1 = p1.esMayorDeEdad();
        if (mayor1 == true) {
            System.out.println("La persona 1 es mayor de edad");
        } else System.out.println("La persona 1 no es mayor de edad");

        boolean mayor2 = p2.esMayorDeEdad();
        if (mayor2 == true) {
            System.out.println("La persona 2 es mayor de edad");
        } else System.out.println("La persona 2 no es mayor de edad");

        // Compara edad de p1 con p2
        boolean elMayor = p1.esMayorQue(p2);
        if (elMayor == true) {
            System.out.println("La persona 1 es mayor que persona 2");
        } else System.out.println("La persona 2 es mayor que persona 1");

        leer.close();
    }
}