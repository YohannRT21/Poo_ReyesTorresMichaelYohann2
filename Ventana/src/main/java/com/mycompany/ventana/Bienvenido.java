/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Yohan
 */
public class Bienvenido implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        
    
        /*
        Como se vio en la teoria es necesario primero crear el frame 
        */
        
        JFrame ventana = new JFrame("");
        
        //hay que definir el tamaño de la ventana
        ventana.setSize(400,220 );
        //definir sus acciones de la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //necesito el panel para poder incorporar los componentes de la interfaz
        JPanel panel = new JPanel();
        //en ese panel agregamos los componentes
        ventana.add(panel);
        
        //vamos a crear un metodo para agregar componentes
        agregarComponente(panel);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        
    }

    private static void agregarComponente(JPanel panel) {
                
        // el panel se debe de inicializar
        panel.setLayout(null); //el panel esta vacio
        
        //agregamos los componentes como:
        JLabel userlabel = new JLabel("Bienvenido");
        /*
        para inicializar los componentes se utiliza el metodo
        
        setBounds 
        
        el cual utiliza 4 parametros para poder posicionar el
        componente dentro del panel
        
        2 como coordenadas x y
        2 para definir el tamaño
        */
        
        
        userlabel.setBounds(100, 50, 200, 50);
        userlabel.setFont(new Font("Artial",Font.CENTER_BASELINE,30));
        //lo agregamos al panel
        panel.add(userlabel);

    }
}

