package examen;

public class NodoRed {
    private final int identificador;
    private final int capacidadMaxima;
    private int conexionesActivas;

    private static int contadorNodos = 0;

    public NodoRed(int identificador, int capacidadMaxima) {

        if (identificador <= 0) {
            throw new IllegalArgumentException(
                    "El identificador debe ser positivo"
            );
        }

        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException(
                    "La capacidad debe ser mayor que cero"
            );
        }

        this.identificador = identificador;
        this.capacidadMaxima = capacidadMaxima;
        this.conexionesActivas = 0;

        contadorNodos++;
    }

    // GETTERS
    public int getIdentificador() {
        return identificador;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getConexionesActivas() {
        return conexionesActivas;
    }

    // METODO CONECTAR
    public boolean conectar() {
        if (conexionesActivas < capacidadMaxima) {
            conexionesActivas++;
            return true;
        }
        return false;
    }

    // METODO DESCONECTAR
    public boolean desconectar() {
        if (conexionesActivas > 0) {
            conexionesActivas--;
            return true;
        }
        return false;
    }

    // METODO CONTADOR
    public static int getContadorNodos() {
        return contadorNodos;
    }

    // METODO CONTADOR
    public void mostrarDatos() {
        System.out.println("IDENTIFICADOR: " + identificador);
        System.out.println("CAPACIDAD MAXIMA: " + capacidadMaxima);
        System.out.println("CONEXIONES ACTIVAS: " + conexionesActivas);
    }
}
