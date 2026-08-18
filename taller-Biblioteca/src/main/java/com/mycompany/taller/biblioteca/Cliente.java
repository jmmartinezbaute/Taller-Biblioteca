package com.mycompany.taller.biblioteca;

public class Cliente extends Persona {

    private String email;

    public Cliente() {
    }

    public Cliente(String email, String nombre, String telefono, String id) {
        super(nombre, telefono, id);
        this.email = email;
    }
    

    public Cliente(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
