/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7_haris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author 08zak
 */
public class BangunGeneralPath extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Random acak = new Random();
        
        int[] xTitik = {55,67,109,73,83,55,27,37,1,43};
        int[] yTitik = {0,36,36,54,96,72,96,54,36,36};
        
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath bintang = new GeneralPath();
        
        bintang.moveTo(xTitik[0], yTitik[0]);
        
        for(int hitung=1; hitung < xTitik.length; hitung++){
            bintang.lineTo(xTitik[hitung], yTitik[hitung]);    
        }
        bintang.closePath();
        g2d.translate(150, 150);
        
        for(int hitung=1; hitung <=20; hitung++){
            g2d.rotate(Math.PI/10.0);
            g2d.setColor(new Color(acak.nextInt(256),
                    acak.nextInt(256), acak.nextInt(256)));
            
            g2d.fill(bintang);
        }
    }
}
