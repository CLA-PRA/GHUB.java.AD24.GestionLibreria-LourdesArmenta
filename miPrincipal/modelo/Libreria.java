package miPrincipal.modelo;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Date;
import miPrincipal.servicio.ServicioDatos;
import java.util.Scanner;

public class Libreria{
    //corriga lo faltante
    ServicioDatos dataService;
    LinkedList<> listaLibros;
    LinkedList<> colaLibros;
    Stack<> pilaLibrosEliminados;
    Scanner scanner; 

    public Libreria(){
       //coloque el codigo faltante


    }

    public boolean agregarLibro(Libro libro){
        /*
         * Este fragmento de codigo agrega un libro a 
         * la lista de libros y luego devuelve true.
         *  
         */
        
           
        
    }

    public ??? obtenerLibros(){
        //devuelve la lista de libros almacenada en la variable
        

    }

    public ?? agregarLibroCola(??){
        /*
         * agrega un libro a la cola de libros y luego devuelve true
         */
        
     
        

    }

    public Libro obtenerLibroCola(){
        //elimina y devuelve el primer libro de la cola
        
        

    }

    public List mostrarReservaLibros(){
        //devuelve la cola de libros almacenada en la variable
       
        


    }

    //define dos métodos en la clase Libreria para crear instancias de Libro y Pedido
    public Libro ??{
    }

    public Pedido crearPedido(Libro libro, Date fecha){
        

    }

    public boolean devolverLibro(Libro libro){
       /*
        * elimina un libro de la lista de libros y luego devuelve true
        */

    }

    public Libro eliminarUltimoLibro(){
        /*
         * elimina el último libro de la lista de libros 
         * y lo agrega a una pila de libros eliminados
         */
       

    }

    public Libro deshacerEliminarLibro(){
        /*
         * restaura el último libro eliminado de la pila de
         *  libros eliminados y lo agrega de nuevo a la lista de libros
         */
        

    }

    public Libro buscarLibro(String isbn){
        /*
         * busca un libro en la lista de libros (listaLibros) 
         * por su ISBN y lo devuelve si lo encuentra si no
         * regresa null
         */

        
    }


}