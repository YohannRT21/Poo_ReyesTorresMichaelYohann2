/*
Las funciones de la biblioteca 
prestamo de libros
*/ 

import java.util.Scanner;
import javax.swing.JOptionPane.*;
import java.util.*;
import javax.swing.*;

public class Bibloteca {

    //vamos a crear un objeto para poder introducir los datos
    Scanner entrada =new Scanner(System.in);

    /*
    vamos a realizar el
    Variables
    Autor, Titulo, ISBN, Genero,
    Ejemplares,Costo del prestamo
    //metodos
    prestamo de libros
    Dovolucion de libros
    */

    String titulo, autor, isbn, genero;
    int ejemplares;
    double costo_prestamo, total;


    public void libros(){
        //menu para el prestamo del libro

        //agregar el try catch para el manejo de errores
        //identificar si son variables publicas o privadas para el manejo de los datos
        String text;
        text = JOptionPane.showInputDialog("Elija la funcion que desea ejecutar: 3 \n 1.- prestamo del libro \n 2.- devolucion del libro");
        int opcion;

        opcion = Integer.parseInt(text);

            switch (opcion){
                case 1: 


                    Prestamo();

                case 2:

                    Devolucion ();

                    break;
                default:

                    JOptionPane.showInputDialog("Gracias por usar el programa de prestamos de libros");
                    break;
            }   
    }   
    public void Prestamo (){
        /*
        lo primero es que deberan de crear los objetos de libros 
        Donde cada uno de ustedes debera tener 5 libros diferentes
        Se debera de precargar la opcion del libro

        IMPORTANTE (SE DEBERAN CARGAR 5 LIBROS ¡¡¡Es de examen!!!)
        --Primero se debe de crear la clase libro
        libro drama = new libro ("La cumbre escarlata", "No me lo se", "12345-BN", "5");
        libro fantasmas = new libro ("Las cronicas mutantes", "No me lo se", "12345-BN", "3");

        --Segundo
        Tiene que aparecer la lista de todos lo libros.

        --Tercero
        Ingrese el titulo que desea para su prestamo y la cantidad de libros la debes de ir regresesando
        porque se debe de preguntar, si desea agregar otro titulo

        --Cuarto
        Se debe de visualizar los datos del libro que se presto y quedan x cantidad de existencia
        Ingrese el titulo que desea para su prestamo
        */
    }

    public void Devolucion(){

        /*
        Primero
        Buscar en el sistema el liibro que se presto

        Segundo
        Cambiar el estado de ese prestamo -> volver a sumar la cantidad del ejemplar

        tercero
        Visualizar los datos del libro de nuevo para confirmar que se cargo

        */
    }
}