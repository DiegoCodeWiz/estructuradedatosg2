package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class PruebaSerie {
 public static void main(String[] args) {
    //Creacion del primer objeto
    Serie serie1 = new Serie();
    
    Serie serie2 = new Serie(5);
    JOptionPane.showMessageDialog(null, serie2.getN());

   System.out.println(serie1.CalcularSerie());
   JOptionPane.showMessageDialog(null, serie1.CalcularSerie());
   JOptionPane.showMessageDialog(null, serie1);

 }
 

}
