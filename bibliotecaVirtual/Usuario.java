/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

public class Usuario {

    private String nombre;
    private String email;
    private String contrasenia;

    public Usuario(String nombre, String email, String contrasenia) throws IllegalArgumentException {
        setNombre(nombre);
        setEmail(email);
        setContrasenia(contrasenia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }
        // Aquí podrías agregar una validación más sofisticada para el formato del email si lo deseas
        this.email = email.trim();
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) throws IllegalArgumentException {
        if (contrasenia == null || contrasenia.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía");
        }
        // Aquí podrías agregar más validaciones, como longitud mínima, complejidad, etc.
        this.contrasenia = contrasenia;
    }
}
