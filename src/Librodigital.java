public class Librodigital extends Libro {
    private double pesolibro;

    public Librodigital(){

    }
    public Librodigital(String titulo, String autor, double precio, double cantidaddeejemplares) {
        super(titulo, autor, precio, cantidaddeejemplares);
    }

    public void peso (){
    System.out.println("Peso de libro: "+pesolibro);
}
@Override
public void Mostrarlibro(){
    System.out.println("titulo: "+ getTitulo());
    System.out.println("autor: "+ getAutor());
    System.out.println("precio: "+ getPrecio());
    System.out.println("cantidaddeejemplares: "+getCantidaddeejemplares());
    System.out.println(" peso del libro: "+pesolibro);
}
    public void devolverlibro(){

    }
}

