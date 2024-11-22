package miPrincipal.servicio;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
public class ServicioDatos{
    
    private List<Integer> lista;
    private Queue<Integer> cola;
    private Stack<Integer> pila;

    public ServicioDatos() {
        lista = new LinkedList<>();
        cola = new LinkedList<>();
        pila = new Stack<>();
    }

    // Métodos para la lista
    public void agregarALista(int valor) {
        lista.add(valor);
    }

    public int obtenerDeLista(int indice) {
        return lista.get(indice);
    }

    // Métodos para la cola
    public void agregarACola(int valor) {
        cola.add(valor);
    }

    public int obtenerDeCola() {
        return cola.peek();
    }

    public void removerDeCola() {
        cola.poll();
    }

    // Métodos para la pila
    public void agregarAPila(int valor) {
        pila.push(valor);
    }

    public int obtenerDePila() {
        return pila.peek();
    }

    public void removerDePila() {
        pila.pop();
    }
}
