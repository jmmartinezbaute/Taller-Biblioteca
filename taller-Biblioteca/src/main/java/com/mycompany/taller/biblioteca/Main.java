package com.mycompany.taller.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
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
}
