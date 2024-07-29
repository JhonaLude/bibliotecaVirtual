/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

public enum Estado_lector {
    HABILITADO,
    MUTADO;

    public static Estado_lector fromString(String estado) {
        switch (estado.toLowerCase()) {
            case "habilitado" -> {
                return HABILITADO;
            }
            case "mutado" -> {
                return MUTADO;
            }
            default -> throw new IllegalArgumentException("Estado de lector no válido: " + estado);
        }
    }
}

