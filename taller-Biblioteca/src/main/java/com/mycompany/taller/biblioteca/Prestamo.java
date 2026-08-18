
package com.mycompany.taller.biblioteca;
import java.time.LocalDate;
public class Prestamo {

    private String idPrestamo;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;
    private String estado;

    // Constructor vacío
    public Prestamo() {
    }

    // Constructor con todos los parámetros
    public Prestamo(String idPrestamo, Cliente cliente, Libro libro, LocalDate fecha, String estado) {
        this.idPrestamo = idPrestamo;
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = fecha;
        this.estado = estado;
    }

    // Getter y Setter de idPrestamo
    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    // Getter y Setter de cliente
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter y Setter de libro
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    // Getter y Setter de fecha
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Getter y Setter de estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
    
    

