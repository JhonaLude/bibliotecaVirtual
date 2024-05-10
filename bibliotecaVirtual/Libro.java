/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bibliotecavirtual;

public class Libro {

    private String titulo;
    private Tipo_libro tipo;
    private String editorial;
    private int anio;

    public Libro(String titulo, Tipo_libro tipo, String editorial, int anio) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo_libro getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_libro tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}