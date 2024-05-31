/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5_haris;

import javax.swing.JFrame;

/**
 *
 * @author asus
 */
public class GambarPolygon {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Menggambar Polygon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PolygonJPanel polygonJPanel = new PolygonJPanel();
        frame.add(polygonJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
