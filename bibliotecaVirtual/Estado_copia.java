/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;


enum Estado_copia {
    DISPONIBLE,
    PRESTADO,
    ATRASADO,
    REPARACION;

    public static Estado_copia fromString(String estado) {
        switch (estado.toLowerCase()) {
            case "disponible" -> {
                return DISPONIBLE;
            }
            case "prestado" -> {
                return PRESTADO;
            }
            case "atrasado" -> {
                return ATRASADO;
            }
            case "reparacion" -> {
                return REPARACION;
            }
            default -> throw new IllegalArgumentException("Estado de lector no válido: " + estado);
        }
    }
}
