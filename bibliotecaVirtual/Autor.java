/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dannn
 */
public class Autor {

    /**
     * @return the nombresAutor
     */
    public ArrayList<String> getNombresAutor() {
        return nombresAutor;
    }

    /**
     * @param nombresAutor the nombresAutor to set
     */
    public void setNombresAutor(ArrayList<String> nombresAutor) {
        this.nombresAutor = nombresAutor;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private ArrayList<String> nombresAutor;
    private String nacionalidad;
    private Date fechaNacimiento;
}
