/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7_haris;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author 08zak
 */
public class BangunGeneral {
    public static void main(String[] args){
        JFrame frame = new JFrame("Menggambar Bangun 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BangunGeneralPath bangun2JPanel = new BangunGeneralPath();
        frame.add(bangun2JPanel);
        frame.setBackground(Color.WHITE);
        frame.setSize(315,330);
        frame.setVisible(true);
    }
}
