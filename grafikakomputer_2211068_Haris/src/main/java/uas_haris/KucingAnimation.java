/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_haris;

import javax.swing.JFrame;

/**
 *
 * @author mzkki
 */
public class KucingAnimation {
        public static void main(String[] args) {
        JFrame frame = new JFrame("Animal Animation");
        DrawKucing panel = new DrawKucing();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
