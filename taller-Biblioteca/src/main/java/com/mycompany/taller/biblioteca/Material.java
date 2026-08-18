
package com.mycompany.taller.biblioteca;

public class Material {
    private String codigo;
    private String titulo;
    private String aniopublic;

    public Material() {
    }

    public Material(String codigo, String titulo, String aniopublic) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.aniopublic = aniopublic;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAniopublic() {
        return aniopublic;
    }

    public void setAniopublic(String aniopublic) {
        this.aniopublic = aniopublic;
    }
    
}
