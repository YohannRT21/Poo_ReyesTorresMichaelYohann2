/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/*
 *
 * @author Yohan*/
import Controles.ManipuladorPeriodicos;
import Controles.ManipuladorRevistas;
import Controles.ManipularLibros;
import java.io.*;
import java.util.*;

public class Principal {
    
    public static void main(String[] args){
        int opciones = 0;
        
        Scanner opc = new Scanner(System.in);

        do {            
            System.err.println("¿Qué categoría deseas ver?\n"
                    + "1.-Libro\n"
                    + "2.-Revista\n"
                    + "3.-Periodico");
            opciones = opc.nextInt();
            
            switch(opciones){
                case 1:
                                       Scanner entrada = new Scanner(System.in);

                    //menu principal para poder manipula los datos de libros y 
                    //de los demas documentos

                    //instancia de manipular libros

                    ManipularLibros listadelibrosobj = new ManipularLibros();
                    int opcion;

                    do{
                        System.out.println("Bienvenido a la Biblioteca de Oscurantismo");
                        System.out.println("Ingresa la opcion deseada");
                        System.out.println("1.- Agregar nuevo Libro");
                        System.out.println("2.- Consultar Libro");
                        System.out.println("3.- Consulta todos los Libros");
                        System.out.println("4.- Borrar un libro");
                        System.out.println("5.- Modificar los datos de un libro");
                        System.out.println("6.- Salir");

                        opcion = entrada.nextInt();

                        switch(opcion){
                            case 1:
                                //agregar libro
                                listadelibrosobj.agregarLibro();

                                break;

                            case 2:
                                //consultar libros por el id
                                listadelibrosobj.buscar();
                                break;

                            case 3:
                                //consulta de todos los libros
                                listadelibrosobj.consultaGeneral();
                                break;

                            case 4:
                                listadelibrosobj.borrar();
                                break;

                            case 5:
                                listadelibrosobj.modificar();
                                break;

                            case 6:
                                System.out.println("Adios gracias por su alma");
                                //cuando vamos a generar el archivo
                                listadelibrosobj.grabar();
                            default:
                                System.out.println("Error ingrese una opcion valida");
                        }
                    }while((opcion >= 1)&&(opcion < 6));
                    
                case 2: 
                    Scanner entrada1 = new Scanner(System.in);

                    //menu principal para poder manipula los datos de libros y 
                    //de los demas documentos

                    //instancia de manipular libros

                    ManipuladorRevistas objetoarchivorevistas = new ManipuladorRevistas();
                    int opcion1;

                    do{
                        System.out.println("Bienvenido a la Biblioteca de Oscurantismo");
                        System.out.println("Ingresa la opcion deseada");
                        System.out.println("1.- Agregar nuevo Revista");
                        System.out.println("2.- Consultar Revista");
                        System.out.println("3.- Consulta todos las Revista");
                        System.out.println("4.- Borrar una Revista");
                        System.out.println("5.- Modificar los datos de una Revista");
                        System.out.println("6.- Salir");

                        opcion = entrada1.nextInt();

                        switch(opcion){
                            case 1:
                                //agregar libro
                                objetoarchivorevistas.agregarRevista();

                                break;

                            case 2:
                                //consultar libros por el id
                                objetoarchivorevistas.buscar();
                                break;

                            case 3:
                                //consulta de todos los libros
                                objetoarchivorevistas.consultaGeneral();
                                break;

                            case 4:
                                objetoarchivorevistas.borrar();
                                break;

                            case 5:
                                objetoarchivorevistas.modificar();
                                break;

                            case 6:
                                System.out.println("Adios gracias por su alma");
                                //cuando vamos a generar el archivo
                                objetoarchivorevistas.grabar();
                            default:
                                System.out.println("Error ingrese una opcion valida");
                        }
                    }while((opcion >= 1)&&(opcion < 6));
                    
                case 3:
                    Scanner entrada2 = new Scanner(System.in);

                    //menu principal para poder manipula los datos de libros y 
                    //de los demas documentos

                    //instancia de manipular libros

                    ManipuladorPeriodicos objetoarchivoperiodicos = new ManipuladorPeriodicos();
                    int opcion2;

                    do{
                        System.out.println("Bienvenido a la Biblioteca de Oscurantismo");
                        System.out.println("Ingresa la opcion deseada");
                        System.out.println("1.- Agregar nuevo Periodico");
                        System.out.println("2.- Consultar Periodico");
                        System.out.println("3.- Consulta todos los Periodico");
                        System.out.println("4.- Borrar un Periodico");
                        System.out.println("5.- Modificar los datos de un Periodico");
                        System.out.println("6.- Salir");

                        opcion = entrada2.nextInt();

                        switch(opcion){
                            case 1:
                                //agregar libro
                                objetoarchivoperiodicos.agregarPeriodico();

                                break;

                            case 2:
                                //consultar libros por el id
                                objetoarchivoperiodicos.buscar();
                                break;

                            case 3:
                                //consulta de todos los libros
                                objetoarchivoperiodicos.consultaGeneral();
                                break;

                            case 4:
                                objetoarchivoperiodicos.borrar();
                                break;

                            case 5:
                                objetoarchivoperiodicos.modificar();
                                break;

                            case 6:
                                System.out.println("Adios gracias por su alma");
                                //cuando vamos a generar el archivo
                                objetoarchivoperiodicos.grabar();
                            default:
                                System.out.println("Error ingrese una opcion valida");
                        }
                    }while((opcion >= 1)&&(opcion < 6));
 
                        }
               

                    
            
        } while (true);
        

    }

    
}