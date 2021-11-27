public class Libro extends Biblioteca {
    /*
    Aqui deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    */



    public Libro(){
        //constructor de la clase
    }

    //sobrecarga para obtener y enviar el ladrido
    public Libro(String titulo, String autor, String isbn, String genero, int ejemplares, double costo_prestamo, double total){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(titulo, autor, isbn, genero, ejemplares, costo_prestamo, total);

    }

    //metodo para mostrar la informacion del Libro
    public void mostrarLibro(){
        System.out.println("Titulo: " + getTitulo() +"\n"
                            + "Autor: " + getAutor() +"\n"
                            + "ISBN:"  + getISBN() +"\n"
                            + "Genero: " + getGenero() +"\n"
                            + "Ejemplares: " + getEjemplares() +"\n"
                            + "Costo del prestamo: " + getCosto_prestamo() +"\n"
                            +"Total: " +getTotal());
    }
}