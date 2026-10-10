import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyLinkedList<Trabajador> listaTrabajadores = new SinglyLinkedList<>();
        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE TRABAJADORES ---");
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Eliminar trabajador");
            System.out.println("3. Mostrar trabajadores");
            System.out.println("4. Calcular nómina total");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1: // AGREGAR
                        System.out.print("Nombre del trabajador: ");
                        String nombre = sc.nextLine();
                        System.out.print("Salario mensual: ");
                        double salario = sc.nextDouble();

                        listaTrabajadores.insertLast(new Trabajador(nombre, salario));
                        System.out.println("¡Trabajador agregado con éxito!");
                        break;

                    case 2: // ELIMINAR
                        System.out.print("Escribe el nombre del trabajador a despedir: ");
                        String nombreEliminar = sc.nextLine();

                        Trabajador borrar = new Trabajador(nombreEliminar, 0);

                        if (listaTrabajadores.remove(borrar)) {
                            System.out.println("Trabajador eliminado correctamente.");
                        } else {
                            System.out.println("Error: No se encontró al trabajador.");
                        }
                        break;

                    case 3: // MOSTRAR
                        System.out.println("\n--- LISTA DE TRABAJADORES ---");
                        if (listaTrabajadores.isEmpty()) {
                            System.out.println("No hay trabajadores registrados.");
                        } else {
                            listaTrabajadores.traverse();
                        }
                        break;

                    case 4: // nomina calcularla
                        double totalNomina = 0;
                        for (int i = 0; i < listaTrabajadores.getSize(); i++) {
                            totalNomina += listaTrabajadores.get(i).getSalario();
                        }
                        System.out.println("\nEl pago total de nómina de la empresa es: $" + totalNomina);
                        break;

                    case 5: // SALIR
                        System.out.println("Saliendo del sistema. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } else {
                System.out.println("Por favor ingresa un número válido.");
                sc.next();
            }
        } while (opcion != 5);

        sc.close();
    }
}