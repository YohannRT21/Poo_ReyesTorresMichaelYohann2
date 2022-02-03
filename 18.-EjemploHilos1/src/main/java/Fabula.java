/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yohan
 */
public class Fabula {
    public static void main(String[] args){
        Tortuga tortugui = new Tortuga();
        Liebre tony = new Liebre();
        
        //Inicializar el hilo
        tortugui.start();
        tony.start();
    }
      
}
