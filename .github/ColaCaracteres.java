public class ColaCaracteres {
    private char[] elementos; // array donde se guardan los caracteres
    private int cantidad; // cantidad actual de elementos en la cola

    // Constructor que define el tamaño maximo de la cola
    public ColaCaracteres(int tamanio) {
        elementos = new char[tamanio];
        cantidad = 0;
    }

    // Metodo para encolar (agregar un elemento al final)
    public void encolar(char c) {
        if (estaLlena()) {
            System.out.println("La cola esta llena, no se puede encolar mas.");
        }
        else {
            elementos[cantidad] = c;
            cantidad++;
            System.out.println("Encolado: " + c);
        }
    }

    // Metodo para desencolar (eliminar el primer elemento)
    public char desencolar() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia, no hay elementos para desencolar");
            return '\0'; // caracter nulo (vacio)
        }
        else {
            char frente = elementos[0]; // guardamos el primer elemento
            // desplazamos todos los demas hacia la izquierda
            for (int i = 0, i < cantidad - 1; i++) {
                elementos[i] = elementos[i + 1];
            }

            cantidad--; // disminuimos la cantidad
            System.out.println("Desencolado: " + frente);
            return frente;
        }
    }

    // Metodo peek: muestra el frente sin quitarlo 
    pubic char peek() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia, no hay elemento en el frente");
            return '\0';
        }
        else {
            return elementos[0]; // devuelve el primer elemento
        }
    }

    // Verifica si la cola esta vacia
    public boolean estaVacia() {
        return cantidad == 0;
    }

    // Verifica si la cola esta llena
    public boolean estaLlena() {
        return cantidad == elementos.length;
    }

    // Muestra el contenido actual de la cola
    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia");
        }
        else {
            System.out.println("Cola actual: ");
            for ( int i = 0, i < cantidad; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}