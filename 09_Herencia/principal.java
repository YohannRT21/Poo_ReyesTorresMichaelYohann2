public class principal {
     public static void main(String[] args){

        //Gracias al constructor para hacer las instancias de las clases
        perro dog = new perro("Pulgas", "de la calle", "croquetas dogcaut", 1, 0, "hace guau guau");
        gato cat = new gato("Michi", "de colores", "Wiscas", 2, 0, "hace miau miau");


        //vamos a mostrar los datos del gato y del perro

        dog.mostrarperro();
        cat.mostrargato();
    }
    
    
}
