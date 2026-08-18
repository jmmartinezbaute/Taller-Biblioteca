package com.mycompany.taller.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Libro> libros = new ArrayList<>();
    static ArrayList<Prestamo> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void crearCliente() {

        System.out.println("CREAR CLIENTE");

        System.out.print("Ingrese el ID: ");
        String id = sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Ingrese el email: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(email, nombre, telefono, id);

        clientes.add(cliente);

        System.out.println("Cliente creado correctamente.");
    }

    public static void listarClientes() {

        System.out.println("LISTA DE CLIENTES");

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("Email: " + cliente.getEmail());

        }
    }

    public static void buscarCliente() {

        System.out.print("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                System.out.println("CLIENTE ENCONTRADO");
                System.out.println("ID: " + cliente.getId());
                System.out.println("Nombre: " + cliente.getNombre());
                System.out.println("Teléfono: " + cliente.getTelefono());
                System.out.println("Email: " + cliente.getEmail());
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    public static void actualizarCliente() {

        System.out.print("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {

                System.out.print("Ingrese el nuevo nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese el nuevo teléfono: ");
                String telefono = sc.nextLine();

                System.out.print("Ingrese el nuevo email: ");
                String email = sc.nextLine();

                cliente.setNombre(nombre);
                cliente.setTelefono(telefono);
                cliente.setEmail(email);

                System.out.println("Cliente actualizado correctamente.");
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    public static void eliminarCliente() {

        System.out.print("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(id)) {
                clientes.remove(cliente);
                System.out.println("Cliente eliminado correctamente.");
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    public static void crearLibro() {

        System.out.println("CREAR LIBRO");

        System.out.print("Ingrese el código: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese el título: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese el año de publicación: ");
        String aniopublic = sc.nextLine();

        System.out.print("Ingrese el autor: ");
        String autor = sc.nextLine();

        System.out.print("¿Está disponible? (true/false): ");
        boolean disponible = Boolean.parseBoolean(sc.nextLine());

        Libro libro = new Libro(codigo, titulo, aniopublic, autor, disponible);

        libros.add(libro);

        System.out.println("Libro creado correctamente.");
    }

    public static void listarLibros() {

        System.out.println("LISTA DE LIBROS");

        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Libro libro : libros) {
            System.out.println("Código: " + libro.getCodigo());
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Año de publicación: " + libro.getAniopublic());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Disponible: " + libro.isDisponible());
        }
    }

    public static void buscarLibro() {

        System.out.print("Ingrese el código del libro: ");
        String codigo = sc.nextLine();

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {

                System.out.println("LIBRO ENCONTRADO");
                System.out.println("Código: " + libro.getCodigo());
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Año de publicación: " + libro.getAniopublic());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Disponible: " + libro.isDisponible());

                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    public static void actualizarLibro() {

        System.out.print("Ingrese el código del libro: ");
        String codigo = sc.nextLine();

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {

                System.out.print("Ingrese el nuevo título: ");
                String titulo = sc.nextLine();

                System.out.print("Ingrese el nuevo año de publicación: ");
                String aniopublic = sc.nextLine();

                System.out.print("Ingrese el nuevo autor: ");
                String autor = sc.nextLine();

                System.out.print("¿Está disponible? (true/false): ");
                boolean disponible = Boolean.parseBoolean(sc.nextLine());

                libro.setTitulo(titulo);
                libro.setAniopublic(aniopublic);
                libro.setAutor(autor);
                libro.setDisponible(disponible);

                System.out.println("Libro actualizado correctamente.");
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    public static void eliminarLibro() {

        System.out.print("Ingrese el código del libro: ");
        String codigo = sc.nextLine();

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                libros.remove(libro);
                System.out.println("Libro eliminado correctamente.");
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    public static void crearPrestamo() {

        System.out.println("REGISTRO PRESTAMO");

        System.out.print("Ingrese el ID del préstamo: ");
        String idPrestamo = sc.nextLine();

        System.out.print("Ingrese el ID del cliente: ");
        String idCliente = sc.nextLine();

        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(idCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado == null) {
            System.out.println("Cliente no encontrado");
            return;
        }

        System.out.print("Ingrese el código del libro: ");
        String codigoLibro = sc.nextLine();

        Libro libroEncontrado = null;

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                libroEncontrado = libro;
                break;
            }
        }

        if (libroEncontrado == null) {
            System.out.println("Libro no encontrado");
            return;
        }

        System.out.print("Ingrese la fecha: ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        System.out.print("Ingrese el estado: ");
        String estado = sc.nextLine();

        Prestamo prestamo = new Prestamo(idPrestamo, clienteEncontrado, libroEncontrado, fecha, estado);

        prestamos.add(prestamo);

        System.out.println("Préstamo registrado correctamente.");
    }
    public static void devolverLibro(){
        System.out.print("DEVOLUCION DEL LIBRO");
        System.out.print("INGRESE EL ID DEL PRESTAMO ");
        String idPrestamo=sc.nextLine();
        for(Prestamo prestamo : prestamos){
            if(prestamo.getIdPrestamo().equals(idPrestamo)){
                prestamo.setEstado("DEVUELTO");
                prestamo.getLibro().setDisponible(true);
                System.out.print("Libro devuelto correctamente");
                return;
            }
        }
        System.out.print("Prestamo no encontrado");
    }
}
