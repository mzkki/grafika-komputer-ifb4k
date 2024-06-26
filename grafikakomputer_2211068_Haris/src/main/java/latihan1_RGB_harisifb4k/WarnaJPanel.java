/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1_RGB_harisifb4k;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author mzkki
 */
public class WarnaJPanel extends JPanel{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        this.setBackground(Color.WHITE);
        
        g.setColor(new Color(150,250,15));
        g.fillRect(15,25,100,20);
        g.drawString("RGB Sekarang: " + g.getColor(), 130, 40);
        
        
        g.setColor(new Color(225,125,75 ));
        g.fillRect(15,50,100,20);
        g.drawString("RGB Sekarang: " + g.getColor(), 130, 65);
        
        g.setColor(Color.PINK);
        g.fillRect(15,75,100,20);
        g.drawString("RGB Sekarang: " + g.getColor(), 130, 90);
        
        Color warna = Color.GRAY;
        g.setColor(warna);
        g.fillRect(15,100,100,20);
        g.drawString("Nilai-nilai RGB: r=" + warna.getRed() + ", g=" + warna.getGreen() + ", b="+ warna.getBlue(), 130, 115);
    }
}
