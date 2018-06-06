/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boton.pulsame;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dam1a26
 */
public class ttyt extends JFrame {
    public ttyt(){
    super("Ventana");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton("Hola");
         boton.addActionListener(new EventoBotonPulsado());
        cp.add(boton);
    
    }
}
