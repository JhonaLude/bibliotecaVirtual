/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author Dannn
 */
public class Copia {
    private String isbn;
    private Estado_copia estado;
    private int num_copia;

    public Copia(String isbn, Estado_copia estado, int num_copia) {
        this.isbn = isbn;
        this.estado = estado;
        this.num_copia = num_copia;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Estado_copia getEstado() {
        return estado;
    }

    public void setEstado(Estado_copia estado) {
        this.estado = estado;
    }

    public int getNum_copia() {
        return num_copia;
    }

    public void setNum_copia(int num_copia) {
        this.num_copia = num_copia;
    }
}
