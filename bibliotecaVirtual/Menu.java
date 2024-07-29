/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Menu {
    public static void mostrarMenu(Scanner scanner, Libro libroNuevo, Usuario usuario, Lector lector1,
            Prestamo prestamo1, Copia copia1, Disponibilidad modalidad1) {
        boolean salir = false;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Ver datos ingresados.");
            System.out.println("2. Prestar libro.");
            System.out.println("3. Devolver libro.");
            System.out.println("4. Salir.");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarDatos(libroNuevo, usuario, lector1, prestamo1, copia1, modalidad1);
                    break;
                case 2:
                    System.out.println("Prestar libro...");
                    break;
                case 3:
                    System.out.println("Devolver libro...");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (!salir); 
    }

    public static void mostrarDatos(Libro libroNuevo, Usuario usuario, Lector lector1, Prestamo prestamo1,
            Copia copia1, Disponibilidad modalidad1) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("\nInformacion del libro ingresado:");
        System.out.println("Titulo: " + libroNuevo.getTitulo());
        System.out.println("Tipo: " + libroNuevo.getTipo());
        System.out.println("Editorial: " + libroNuevo.getEditorial());
        System.out.println("Ano: " + libroNuevo.getAnio());
        System.out.println("\nInformacion del usuario ingresado:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Contrasenia: " + usuario.getContrasenia());
        System.out.println("\nInformacion del lector ingresado:");
        System.out.println("Nombre: " + lector1.getNombre());
        System.out.println("Email: " + lector1.getEmail());
        System.out.println("Contrasenia: " + lector1.getContrasenia());
        System.out.println("Estado: " + lector1.getEstado());
        System.out.println("\nInformacion del prestamo ingresado:");
        System.out.println("Fecha de entrega: " + sdf.format(prestamo1.getFechaEntrega()));
        System.out.println("Fecha de devolucion: " + prestamo1.getFechaDevolucion());
        System.out.println("Multa: " + prestamo1.getMulta());
        System.out.println("\nInformacion de la copia ingresada:");
        System.out.println("ISBN: " + copia1.getIsbn());
        System.out.println("Estado: " + copia1.getEstado());
        System.out.println("Numero de copia: " + copia1.getNum_copia());
        System.out.println("\nInformacion de la modalidad ingresada:");
        System.out.println("Tipo: " + modalidad1.getTipoModalidad());
    }
}
