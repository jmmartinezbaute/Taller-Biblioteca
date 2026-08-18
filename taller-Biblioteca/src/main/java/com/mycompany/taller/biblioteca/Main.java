package com.mycompany.taller.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
    }

   
    public static void crearCliente() {

        System.out.println("=== CREAR CLIENTE ===");

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
}