/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author Dannn
 */
public class Lector {
    private String nombre;
    private String email;
    private String contrasenia;
    private Estado_lector estado;

    public Lector(String nombre, String email, String contrasenia, Estado_lector estado) {
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Estado_lector getEstado() {
        return estado;
    }

    public void setEstado(Estado_lector estado) {
        this.estado = estado;
    }
}
