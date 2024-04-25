/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1_RGB_harisifb4k;

import javax.swing.JFrame;

/**
 *
 * @author mzkki
 */
public class TampilWarna {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Latihan 1 2211068 Haris Muzakki");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WarnaJPanel warnaJPanel = new WarnaJPanel();
        frame.add(warnaJPanel);
        frame.setSize(500,200);
        frame.setVisible(true);
    }
}
