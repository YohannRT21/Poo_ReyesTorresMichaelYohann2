public class todoslibros extends libros{

    public todoslibros(){

    }
    public todoslibros(String titulo, String autor, String isbn, String genero, int ejemplares, double costo_prestamo, double total){
    super(titulo, autor, isbn, genero, ejemplares, costo_prestamo, total);
    }

    public void mostrrlibro(){
        System.out.println("Titulo: " + getTitulo() +"\n"
                        + "Autor: " + getAutor() +"\n"
                        + "ISBN: " + getISBN() +"\n"
                        + "Genero: " + getGenero() +"\n"
                        + "Ejemplares: " + getEjemplares() +"\n"
                        + "Costo del prestamo: " +getCosto_prestamo()+ "\n"
                        +"Total: "+ getTotal());

    }
}