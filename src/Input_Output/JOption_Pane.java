/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Output;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 8
 */
public class JOption_Pane {
    public static void main(String[] args) {
                int V;
        String bil=JOptionPane.showInputDialog("Masukkan panjang persegi panjang ");
        int p= Integer.parseInt(bil);
        String bil1=JOptionPane.showInputDialog("Masukkan lebar persegi panjang ");
        int l= Integer.parseInt(bil);
        String bil2=JOptionPane.showInputDialog("Masukkan tinggi persegi panjang ");
        int t= Integer.parseInt(bil);
        V=p*l*t;
        JOptionPane.showMessageDialog(null,"Volume persegi panjang adalah: "+V);
    }
}
