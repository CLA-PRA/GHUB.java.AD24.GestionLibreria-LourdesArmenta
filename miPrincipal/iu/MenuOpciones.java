package miPrincipal.iu;
import miPrincipal.servicio.ServicioDatos;
import miPrincipal.modelo.Libro;
import miPrincipal.modelo.Pedido;
import miPrincipal.modelo.Libreria;
import java.util.Scanner;
import java.util.Date;
import java.util.LinkedList;
import java.util.Stack;
import java.util.List;



import java.util.Scanner;
public class MenuOpciones{
    static Scanner scanner = new  Scanner(System.in);
    static private Libreria libreria = new Libreria();

    public static void agregarLibro(){
        System.out.print("Ingrese el título del libro:");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro:");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el ISBN del libro:");
        String isbn = scanner.nextLine();
        //coloque el codigo faltante
        //invoque metodo en libreria y mande los mensajes correspondiente
       

    }
    
    public static void mostrarLibros(){
        /*
         * Llama al método obtenerLibros de la instancia libreria para obtener la lista de libros.
            Verifica si la lista de libros está vacía.
            Si la lista está vacía, imprime "La lista de libros esta vacia.".
            Si la lista no está vacía, imprime "Lista de libros:" y luego recorre la lista, imprimiendo cada libro.
         */

        

    }

    public static void agregarLibroCola(){
        
        /*
          Este código solicita al usuario que ingrese los detalles de un libro y luego intenta agregar ese libro a una cola en la librería. Aquí está el desglose de lo que hace:

            Solicita al usuario que ingrese el título del libro y lo almacena en la variable tituloCola.
            Solicita al usuario que ingrese el autor del libro y lo almacena en la variable autorCola.
            Solicita al usuario que ingrese el ISBN del libro y lo almacena en la variable isbnCola.
            Crea una nueva instancia de Libro con los datos ingresados por el usuario.
            Intenta agregar el libro a la cola en la librería utilizando el método agregarLibroCola.
            Si el libro se agrega exitosamente, imprime "libro se agrego exitosamente a la cola".
            Si no es posible agregar el libro, imprime "Error: no fue posible agregar Libro a la cola".
                    * 
         */
        
    }

    public static Libro obtenerLibroCola(){

        Libro libro = libreria.obtenerLibroCola();
        if (libro != null){
            System.out.println("El siguiente libro disponible sera: "+libro);
            return libro;
        }
        else{
            System.out.println("No existen libros prestados");
            return null;
        }
     
    }

    public static void mostrarReservaLibros(){
        List<Libro> listaLibrosReserva = libreria.mostrarReservaLibros();
        if (listaLibrosReserva.isEmpty()) {
            System.out.println("La lista de reservas esta vacia.");
        } else {
            System.out.println("Lista de libros:");
            for (Libro libro1 : listaLibrosReserva) {
                System.out.println(libro1);
            }
        }
        

    }

    public static void crearPedido(){
        System.out.print("Ingrese el título del libro para el pedido:");
        String tituloPedido = scanner.nextLine();
        System.out.print("Ingrese el autor del libro para el pedido:");
        String autorPedido = scanner.nextLine();
        System.out.print("Ingrese el ISBN del libro para el pedido:");
        String isbnPedido = scanner.nextLine();
        Libro libroPedido = libreria.crearLibro(tituloPedido, autorPedido, isbnPedido);
        Pedido pedido=null;
        if (libroPedido!=null){
            pedido = libreria.crearPedido(libroPedido, new Date());
            if (pedido !=null)
                System.out.println("Pedido creado exitosamente: "+pedido);
            else
                System.out.println("No fue posible crear el pedido");
        }else{
            System.out.println("Error: no fue posible crear el Libro");
        }
       
    }

    public static void devolverLibro(){
        System.out.print("Ingrese el ISBN del libro a devolver:");
        String isbnDevolver = scanner.nextLine();
        Libro libroDevolver = libreria.buscarLibro(isbnDevolver);
        if (libroDevolver == null){
            System.out.println("Error: no existe ningun libro con esas caracteristicas");
            return;
        }

        System.out.println("Titulo del libro a devolver:"+libroDevolver.getTitulo());
        
        System.out.println("Autor del libro a devolver:"+libroDevolver.getAutor());
        libreria.devolverLibro(libroDevolver);
        System.out.println("Libro devuelto a la lista: " + libroDevolver);
        

    }

    public static Libro eliminarUltimoLibro(){
        Libro libroEliminado = libreria.eliminarUltimoLibro();
        if (libroEliminado != null){
            System.out.println("Libro eliminado de la lista y agregado a la pila: " + libroEliminado);
            return libroEliminado;
        } 
        else{
            System.out.println("Error: no se pudo eliminar ultimo libro");
            return null;
        }

    }

    public static void deshacerEliminarLibro(){
        Libro libroRestaurado = libreria.deshacerEliminarLibro();
        if(libroRestaurado !=null)
            System.out.println("Libro restaurado a la lista: " + libroRestaurado);
        else
            System.out.println("No hay libros para deshacer la eliminación.");
       

    }


	
}
