package bibliotecavirtual;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BibliotecaVirtual {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Libro libroNuevo = obtenerInformacionLibro(scanner);
            mostrarInformacionLibro(libroNuevo);

            Usuario usuario = obtenerInformacionUsuario(scanner);
            mostrarInformacionUsuario(usuario);

            Lector lector1 = obtenerInformacionLector(scanner);
            if (lector1 != null) {
                mostrarInformacionLector(lector1);
            } else {
                System.out.println("No se pudo obtener información del lector.");
            }

            Prestamo prestamo1 = obtenerInformacionPrestamo(scanner);
            mostrarInformacionPrestamo(prestamo1);

            Copia copia1 = obtenerInformacionCopia(scanner);
            mostrarInformacionCopia(copia1);

            Disponibilidad modalidad1 = obtenerInformacionModalidad(scanner);
            mostrarInformacionModalidad(modalidad1);

            Menu.mostrarMenu(scanner, libroNuevo, usuario, lector1, prestamo1, copia1, modalidad1);
        }
    }

    public static Libro obtenerInformacionLibro(Scanner scanner) {
        System.out.println("Ingrese el titulo del libro:");
        String tituloLibro = scanner.nextLine();

        System.out.println("Ingrese el tipo del libro (NOVELA, ENSAYO, POESIA, CIENCIA_FICCION, HISTORIA, BIOGRAFIA):");
        String tipoLibroString = scanner.nextLine();
        Tipo_libro tipoLibroEnum = Tipo_libro.fromString(tipoLibroString);

        System.out.println("Ingrese la editorial del libro:");
        String editorialLibro = scanner.nextLine();

        System.out.println("Ingrese el anio del libro:");
        int anioLibro = scanner.nextInt();
        scanner.nextLine();

        return new Libro(tituloLibro, tipoLibroEnum, editorialLibro, anioLibro);
    }

    public static void mostrarInformacionLibro(Libro libro) {
        System.out.println("\nInformación del libro ingresado:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Tipo: " + libro.getTipo());
        System.out.println("Editorial: " + libro.getEditorial());
        System.out.println("Año: " + libro.getAnio());
    }

    public static Usuario obtenerInformacionUsuario(Scanner scanner) {
        System.out.println("\nIngrese el nombre del usuario:");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese el email del usuario:");
        String emailUsuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña del usuario:");
        String contraseniaUsuario = scanner.nextLine();

        try {
            return new Usuario(nombreUsuario, emailUsuario, contraseniaUsuario);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
            return null;
        }
    }

    public static void mostrarInformacionUsuario(Usuario usuario) {
        System.out.println("\nInformación del usuario ingresado:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Contraseña: " + usuario.getContrasenia());
    }

    public static Lector obtenerInformacionLector(Scanner scanner) {
        System.out.println("\nIngrese el nombre del lector:");
        String nombreLector = scanner.nextLine();

        System.out.println("Ingrese el email del lector:");
        String emailLector = scanner.nextLine();

        System.out.println("Ingrese la contraseña del lector:");
        String contraseniaLector = scanner.nextLine();

        System.out.println("Ingrese el estado del lector (HABILITADO, MUTADO):");
        String estadoLectorString = scanner.nextLine();
        Estado_lector estadoLector;
        try {
            estadoLector = Estado_lector.fromString(estadoLectorString);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

        return new Lector(nombreLector, emailLector, contraseniaLector, estadoLector);
    }

    public static void mostrarInformacionLector(Lector lector) {
        System.out.println("\nInformación del lector ingresado:");
        System.out.println("Nombre: " + lector.getNombre());
        System.out.println("Email: " + lector.getEmail());
        System.out.println("Contraseña: " + lector.getContrasenia());
        System.out.println("Estado: " + lector.getEstado());
    }

    public static Prestamo obtenerInformacionPrestamo(Scanner scanner) {
        System.out.println("\nIngrese la fecha de entrega del préstamo (en formato dd/MM/yyyy):");
        String fechaEntregaString = scanner.nextLine();
        Date fechaEntrega = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaEntrega = sdf.parse(fechaEntregaString);
        } catch (ParseException e) {
            manejarErrorFecha();
        }

        return new Prestamo(fechaEntrega, null, 0.0);
    }

    public static void mostrarInformacionPrestamo(Prestamo prestamo) {
        System.out.println("\nInformación del préstamo ingresado:");
        System.out.println("Fecha de entrega: " + prestamo.getFechaEntrega());
        System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
        System.out.println("Multa: " + prestamo.getMulta());
    }

    public static Copia obtenerInformacionCopia(Scanner scanner) {
        System.out.println("\nIngrese el ISBN de la copia:");
        String isbnCopia = scanner.nextLine();

        System.out.println("Ingrese el estado de la copia (DISPONIBLE, PRESTADO, ATRASADO, REPARACION):");
        String estadoCopiaString = scanner.nextLine();
        Estado_copia estadoCopia = null;
        
        System.out.println("Ingrese el número de copia:");
        int numCopia = scanner.nextInt();
        scanner.nextLine();

        return new Copia(isbnCopia, estadoCopia, numCopia);
    }

    public static void mostrarInformacionCopia(Copia copia) {
        System.out.println("\nInformación de la copia ingresada:");
        System.out.println("ISBN: " + copia.getIsbn());
        System.out.println("Estado: " + copia.getEstado());
        System.out.println("Número de copia: " + copia.getNum_copia());
    }

    public static Disponibilidad obtenerInformacionModalidad(Scanner scanner) {
        System.out.println("\nIngrese la modalidad (FISICO, VIRTUAL):");
        String modalidadString = scanner.nextLine();
        Tipo_libro tipoModalidad = Tipo_libro.valueOf(modalidadString);
        return new Disponibilidad(tipoModalidad);
    }

    public static void mostrarInformacionModalidad(Disponibilidad modalidad) {
        System.out.println("\nInformación de la modalidad ingresada:");
        System.out.println("Tipo: " + modalidad.getTipoModalidad());
    }

    public static void manejarErrorFecha() {
        System.out.println("Error al analizar la fecha de entrega. Asegúrate de ingresarla en el formato correcto (dd/MM/yyyy).");
        System.exit(1);
    }
}
