/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4_harisifb4k;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class BusurJPanel extends JPanel{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.drawRect(15,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(15,35,80,80,0,360);
        
        g.setColor(Color.RED);
        g.drawRect(100,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(100,35,80,80,0,110);
        
        g.setColor(Color.RED);
        g.drawRect(185,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(185,35,80,80,0,-270);
        
        g.fillArc(15,120,80,40,0,360);
        
        g.fillArc(100,120,80,40,270,-90);
        
        g.fillArc(185,120,80,40,0,-270);
    }
    
}
