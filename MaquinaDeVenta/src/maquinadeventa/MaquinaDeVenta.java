/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinadeventa;

/**
 *
 * @author Yohan
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MaquinaDeVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // CUADRO DE BIENVENIDA
        JOptionPane.showMessageDialog(null,"¡Bienvenido al Cinepolis 3-D!");
        // VARIABLE
	    double edad,monto;
	    double n;
	    char pago;
 
 
	    // VALORES DE PAGO DE ACUARDO A SU EDAD ( CON IGV)
	    Scanner sc = new Scanner(System.in);
	    System.out.println(" Ingrese su edad ");
	    Scanner teclado = new Scanner(System.in);
	    edad=sc.nextFloat();
	    System.out.println(" Ingrese el modo de pago : \n [E] = Efectivo o [T] = Tarjeta ");
	    pago = teclado.next().charAt(0);
 
        switch (pago) {
            case 'E':
                if(edad >=55){
                    monto= (( 15 * 0.18) + 15) ;
                    System.out.println("el precio correspondiente (Adulto Mayores) es " + monto + " soles "); }
 
                else if(edad < 55 && edad >= 18 ){
                    monto = ( 30 * 0.18) + 30  ;
                    System.out.println("el precio correspondiente (Adulto) es " + monto + " soles ");}
 
                else if (edad >= 1 && edad < 12 ){
                    monto = ( 10 * 0.18) + 10 ;
                    System.out.println("el precio correspondiente (Menores de 12 años) es " + monto + " soles ");}
 
                else if (edad >= 12 && edad <= 17 ){
                    monto = ( 20 * 0.18) + 20 ;
                    System.out.println("el precio correspondiente (De 13 para 17 años) es " + monto + " soles ");}
                break;
 
            case 'T':
                if ( edad >=55){
                    monto = ( 15 * 0.035)* 0.18 + 15;
                    System.out.println("el precio correspondiente (Adulto Mayores) es " + monto + " soles "); }
 
                else if (edad < 55 && edad >= 18 ){
                    monto = ( 30 * 0.035)* 0.18 + 30;
                    System.out.println("el precio correspondiente (Adulto) es " + monto + " soles ");}
                else if (edad >= 1 && edad < 12 ){
                    monto = ( 10 * 0.035)*0.18 + 10 ;
                    System.out.println("el precio correspondiente (Menores de 12 años) es " + monto + " soles ");}
                else if (edad >= 12 && edad <= 17 ){
                    monto = ( 20 * 0.035)*0.18 + 20 ;
                    System.out.println("el precio correspondiente (De 13 para 17 años) es " + monto + " soles ");}
                default:
	    }
    }
    
}
