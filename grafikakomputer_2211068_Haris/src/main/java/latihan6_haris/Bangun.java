/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6_haris;

import javax.swing.JFrame;

/**
 *
 * @author 08zak
 */
public class Bangun {
        public static void main(String[] args){
        JFrame frame = new JFrame("Menggambar bangun 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BangunJPanel bangunJPanel = new BangunJPanel();
        
        frame.add(bangunJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
