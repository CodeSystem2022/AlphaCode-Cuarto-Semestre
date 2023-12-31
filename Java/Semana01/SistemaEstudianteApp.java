package presentacion;

import conexion.Conexion;
import datos.EstudianteDAO;
import dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudiantesApp {

    //Mostrar Menu
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        while(!salir){
            try {
                mostrarMenu();//Wste sera el metodo que devolvera un booleano
                salir = ejecutarOpciones(consola, estudianteDao);
            } catch (Exception e) {
                System.out.println("Ocurrio un error al ejecutar la operacion: " + e.getMessage());
            }
        }//Fin While
    }//Fin main
    private static void mostrarMenu() {
        System.out.println("""
                ******* Sitema de Estudiantes ********
                1. Listar Estudiantes
                2. Buscar Estudiantes
                3. Agregar estudiantes
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Eliga una Opción:
                """);
    } //Fin de Mostrar Menu  


    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch(opcion){
            case 1 -> {
                System.out.println("Listado de estudiantes: ");
            
            var estudiantes = estudianteDAO.listarEstudiantes();
            estudiantes.forEach(System.out::println); //imprimir la lista
           } 
           case 2 -> {
            System.out.println("Introduce el id_estudiante a buscar:");
            var idEstudiante = Integer.parseInt(consola.nextLine());
            var estudiante = new Estudiante(idEstudiante);
            var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
            if (encontrado)
                System.out.println("Estudiante encontrado: " + estudiante);
            else
                System.out.println("Estudiante no encontrado");
            }
            case 3 -> {
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email:");
                var email = consola.nextLine();
                //Crear objeto estudiante sin id
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if(agregado)
                    System.out.println("Estudiante agregado: "+ estudiante);
                else
                    System.out.println("Estudiante no agregado: " + estudiante);

            }
            case 4 -> {
                System.out.println("Modificar estudiante: ");
                System.out.println("Id Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine(); 
                // crea el objeto estudiante a modificar

                var estudiante= new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado= estudianteDAO.modificanEstudiante(estudiante);
                if(modificado){
                    System.out.println("Estudiante modificado: " + estudiante);
                }
                else{
                    System.out.println("Estudiante NO modificado: " + estudiante);
                }
            }
            case 5 -> {
                System.out.println("Eliminar estudiante: ");
                System.out.println("Id estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println("Estudiante eliminado: "+ estudiante);
                else{
                    System.out.println("Estudiante NO eliminado: " + estudiante);
                }
            }
            case 6 -> {
                System.out.println("Hasta pronto");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida, ingrese otra opcion.");
        }
            return salir;

    }
}
