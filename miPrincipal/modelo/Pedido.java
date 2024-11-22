package miPrincipal.modelo;

import java.util.Date;

public class Pedido {
    private Libro libro;
    private Date fechaPedido;

    public Pedido(Libro libro, Date fechaPedido) {
        this.libro = libro;
        this.fechaPedido = fechaPedido;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "libro=" + libro +
                ", fechaPedido=" + fechaPedido +
                '}';
    }
}