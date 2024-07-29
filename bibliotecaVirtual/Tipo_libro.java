/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

public enum Tipo_libro {
    NOVELA, 
    ENSAYO, 
    POESIA, 
    CIENCIA_FICCION, 
    HISTORIA,
    BIOGRAFIA;

    /*public static Tipo_libro fromString(String tipo) {
        switch (tipo.toUpperCase()) {
            case "NOVELA":
                return NOVELA;
            case "ENSAYO":
                return ENSAYO;
            case "POESIA":
                return POESIA;
            case "CIENCIA_FICCION":
                return CIENCIA_FICCION;
            case "HISTORIA":
                return HISTORIA;
            case "BIOGRAFIA":
                return BIOGRAFIA;
                
            default:
                 throw new IllegalArgumentException("Tipo de libro no válido: " + tipo);
            /*    switch (tipo.toLowerCase()) {
                    case "novela":
                        return NOVELA;
                    case "ensayo":
                        return ENSAYO;
                    case "poesia":
                        return POESIA;
                    case "ciencia_ficcion":
                        return CIENCIA_FICCION;
                    case "historia":
                        return HISTORIA;
                    case "biografia":
                        return BIOGRAFIA;
                    default:
                        throw new IllegalArgumentException("Tipo de libro no válido: " + tipo);
                }
        }
    }*/
   
    public static Tipo_libro fromString(String estado) {
        switch (estado.toLowerCase()) {
            case "novela" -> {
                return NOVELA;
            }
            case "poesia" -> {
                return POESIA;
            }
            case "ciencia ficcion" -> {
                return CIENCIA_FICCION;
            }
            
            case "historia" -> {
                return HISTORIA;
            }
            
            case "biografia" -> {
                return BIOGRAFIA;
            }
            default -> throw new IllegalArgumentException("Estado de lector no válido: " + estado);
        }
}
}