public class Libroimpreso extends Libro {
    private double peso;

    public Libroimpreso() {
    }

    public Libroimpreso(String titulo, String autor, double precio, double cantidaddeejemplares, double peso) {
        super(titulo, autor, precio, cantidaddeejemplares);
        this.peso = peso;
    }

    @Override
    public void Mostrarlibro() {
        System.out.println("titulo: "+getTitulo());
        System.out.println("autor: "+getAutor());
        System.out.println("precio: "+getPrecio());
        System.out.println("cantidaddeejemplares: "+getCantidaddeejemplares());
        System.out.println("peso: "+peso);
    }
public void devolverlibro(){

}
}



