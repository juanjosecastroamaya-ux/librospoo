import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Libro>libros = new ArrayList<>();


        int opcion;
        do {
            System.out.println("---------- MENÚ PRINCIPAL ------");
            System.out.println("1.crear libro impreso ");
            System.out.println("2. crear libro digital ");
            System.out.println("3. mostrar libors ");
            System.out.println("4. devolver libros ");
            System.out.println("5. prestar libros ");
            System.out.println("6. cerrar pregrama ");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println(" Ingresa el titulo del libro: ");
                    String titulo = sc.nextLine();
                    System.out.println(" Ingresa el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.println(" Ingresa la cantidad de libros: ");
                    double cantidaddeejemplares = sc.nextDouble();
                    System.out.println(" Ingresa el precio del libro: ");
                    double precio = sc.nextDouble();
                    System.out.println(" Ingresa el peso del libro: ");
                    double peso = sc.nextDouble();
                    libros. add (new Libroimpreso(titulo, autor, cantidaddeejemplares, precio, peso));
                    break;
                case 2:
                    System.out.println(" Ingresa el titulo del libro: ");
                    String titulo = sc.nextLine();
                    System.out.println(" Ingresa el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.println(" Ingresa la cantidad de libros: ");
                    double cantidaddeejemplares = sc.nextDouble();
                    System.out.println(" Ingresa el precio del libro: ");
                    double precio = sc.nextDouble();
                    System.out.println(" Ingresa el peso del libro en MB: ");
                    double pesolibro = sc.nextDouble();
                    libros. add(new Librodigital(titulo, autor ,cantidaddeejemplares,precio,pesolibro));

                case 3:
libro.Mostrarlibro
                    break;

                case 4:

                    break;

                case 5:
                    break;

                case 6:
                    break;

                default:
                    System.out.println(" Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 6);

        sc.close();
    }
}