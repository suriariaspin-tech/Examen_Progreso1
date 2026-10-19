package examen;

public class Main {
    static void main() {
        NodoRed nodo1 = new NodoRed(134572, 2);
        int identificador = nodo1.getIdentificador();
        int capacidadMaxima = nodo1.getCapacidadMaxima();
        int conexionesActivas = nodo1.getConexionesActivas();

        System.out.println("RESULTADOS 1:");
        nodo1.mostrarDatos();

        nodo1.conectar();
        nodo1.desconectar();

        System.out.println("\nRESULTADOS 2:");
        nodo1.conectar();
        nodo1.mostrarDatos();

        nodo1.conectar();

        System.out.println("\nRESULTADOS 3:");
        nodo1.mostrarDatos();

        nodo1.conectar();

        System.out.println("\nRESULTADOS 4:");
        nodo1.mostrarDatos();

    }
}
