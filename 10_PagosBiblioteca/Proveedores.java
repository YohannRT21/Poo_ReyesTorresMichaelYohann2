/*
Suma de los cotos de la biblioteca
Costo mayor
Costo menor
costro promedio
costo total de los productos (libros)
*/

import java.util.*;
import javax.swing*;
import javax.lang.Math;

public class Proveedores(){

    private String nombre_cliente;
    private String producto[] = new String[10];
    private int costo[] = new int[10];
    private int producto_existente[] = new int [10];
    //los metodos Getter y Setter de cada variable

    //menu


    public void MenuProveedores(){

        String text;
        //try catch para el mensaje de errores
        //un ciclo do while para repetir las opciones

        text = JOptionPane.showInputDialog("seleccione la funcion deseada: "
                                            +"\n 1.- Suma total de costos"
                                            +"\ 2.- Costo Mayor"
                                            +"\n 3.- Costo Menor"
                                            +"\n 4.- Costo Promedio"
                                            +"\n 5.- Costo Total del Producto"); 

        /*

        De los libros que se crearon deberan de agregar la clase costo aplicando la herencia
        para que se pueda manejar el costo de cada libro

        Libro drama = new ("la cumbre escarlata", "no me lo se", "12345-BN", "5", "44"); //($44 es el costo del libro)
        Libro fantasmas = new libro ("Las cronicas mutantes", "No me lo se", "12345-BN", "3", "608");

        Si elije la opcion 1 total del costo de la cumbre escarlata: 5*44

        Si elije la opcion 2 se debe de obtener cual es el libro que tiene mayor costo: las cronicas 

        Si elije la opcion 3 debe de salir el libro mas barato: la cumbre escarlata 44

        Si elijo la opcion 4 se debe de sacar el promedio de los costos de los libros

        Si elijo la opcion 5 se deben de multiplicar la cantidad de libros Los ejemplares * costo

        */

        //aqui hay que agregar el menu de las opciones
        int opcion;

        switch (opcion) {
            case 1:
                SumaTotal();
                break;
            case 2:
                CostoMayor();
                break;
            case 3;
                CostoMenor();
                break;
            case 4;
                CostoPromedio();
                break;
            case 5;

                break
            default:
                break;
        }
    }

}