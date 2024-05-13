/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4_harisifb4k;

import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class GambarBusur {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Menggambar Busur");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BusurJPanel busurJPanel = new BusurJPanel();
        frame.add(busurJPanel);
        frame.setSize(300,210);
        frame.setVisible(true);
    }
}
