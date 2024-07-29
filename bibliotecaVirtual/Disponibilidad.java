/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author Dannn
 */
public class Disponibilidad {

    /*Disponibilidad(Tipo_libro tipoModalidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    // Enum para representar las modalidades
    public enum Tipo {
        FISICO,
        VIRTUAL;

        public static Tipo fromString(String estado) {
            switch (estado.toLowerCase()) {
                case "fisico" -> {
                    return FISICO;
                }
                case "virtual" -> {
                    return VIRTUAL;
                }
                default ->
                    throw new IllegalArgumentException("Estado de lector no válido: " + estado);
            }
        }
    }

    private Tipo tipoModalidad;

    // Constructor
    public Disponibilidad(Tipo tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    // Métodos para obtener y establecer la modalidad
    public Tipo getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(Tipo tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }
}
