package Latihan1_RGB_ShitaClaudia_2211097;

import javax.swing.JFrame;

public class TampilWarna {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Menggunakan Warna");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WarnaJPanel warnaJPanel = new WarnaJPanel();
        frame.add(warnaJPanel);
        frame.setSize(500,200);
        frame.setVisible(true);
    }
}
