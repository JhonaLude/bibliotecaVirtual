/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author Dannn
 */
public class Seccion {

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the numeroLibros
     */
    public int getNumeroLibros() {
        return numeroLibros;
    }

    /**
     * @param numeroLibros the numeroLibros to set
     */
    public void setNumeroLibros(int numeroLibros) {
        this.numeroLibros = numeroLibros;
    }
    private String genero;
    private int numeroLibros;

}