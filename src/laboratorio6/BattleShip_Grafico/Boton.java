/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Boton extends JButton implements ActionListener {
    
    public Boton (int fila, int columna, int ancho, int alto){
        setBounds(fila, columna, ancho, alto);
        addActionListener(this);
    }
     
    public void Vacio(){
        setText("Vacio");
    }
  
    public void Nombre(){
        setText("barco");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(getText().equals("barco")){
             setBackground(Color.red);
             setText("Vacio");
             setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "FALLASTE...SIGUE INTENTANDO");
            setBackground(Color.white);
        }
        
        
    }
    
}

