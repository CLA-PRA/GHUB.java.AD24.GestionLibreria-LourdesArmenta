package miPrincipal.modelo;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Date;
import miPrincipal.servicio.ServicioDatos;
import java.util.Scanner;

public class Libreria{
    ServicioDatos dataService;
    LinkedList<Libro> listaLibros;
    LinkedList<Libro> colaLibros;
    Stack<Libro> pilaLibrosEliminados;
    Scanner scanner; 

    public Libreria(){
        dataService = new ServicioDatos();
        scanner = new Scanner(System.in);
        listaLibros = new LinkedList<>();
        colaLibros = new LinkedList<>();
        pilaLibrosEliminados = new Stack<>();

    }

    public boolean agregarLibro(Libro libro){
        
           listaLibros.add(libro);
           return true;
        
    }

    public List obtenerLibros(){
        return listaLibros;

    }

    public boolean agregarLibroCola(Libro libro){
        
        colaLibros.add(libro);
        return true;
        

    }

    public Libro obtenerLibroCola(){
        return colaLibros.poll();
        

    }

    public List mostrarReservaLibros(){
       
        return colaLibros;


    }

    public Libro crearLibro(String titulo, String autor, String isbn){
        Libro libro = new Libro(titulo,autor,isbn);
        return libro;
    }

    public Pedido crearPedido(Libro libro, Date fecha){
        Pedido pedido = new Pedido(libro, new Date());

        return pedido;

    }

    public boolean devolverLibro(Libro libro){
        listaLibros.remove(libro);
        return true;

    }

    public Libro eliminarUltimoLibro(){
        if (listaLibros.isEmpty()) {
            return null;
        } else {
            Libro libroEliminado = listaLibros.removeLast();
            pilaLibrosEliminados.push(libroEliminado);
            return libroEliminado;
        }

    }

    public Libro deshacerEliminarLibro(){
        if (pilaLibrosEliminados.isEmpty()) {
            return null;
            
        } else {
            Libro libroRestaurado = pilaLibrosEliminados.pop();
            listaLibros.add(libroRestaurado);
            return libroRestaurado;
        }

    }

    public Libro buscarLibro(String isbn){

        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro, devuelve null

    }


}