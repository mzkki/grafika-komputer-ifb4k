/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan2_haris;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author mzkki
 */
public class TampilWarnaJFrame extends JFrame{
   private JButton ubahWarnaJButton;
   private Color warna = Color.LIGHT_GRAY;
   private JPanel warnaJPanel;
   
   public TampilWarnaJFrame(){
       super("Menggunakan JColorChooser");
       
       warnaJPanel = new JPanel();
       warnaJPanel.setBackground(warna);
       
       ubahWarnaJButton = new JButton("Ubah Warna");
       ubahWarnaJButton.addActionListener(
               new ActionListener()
               {
                   public void actionPerformed(ActionEvent event)
                   {
                       warna = JColorChooser.showDialog(TampilWarnaJFrame.this, "Pilih sebuah warna", warna);
                       
                       if(warna == null)
                       {
                         warna = Color.LIGHT_GRAY;
                       }
                       
                       warnaJPanel.setBackground(warna);
                   }
               }
       );
       add(warnaJPanel, BorderLayout.CENTER);
       add(ubahWarnaJButton, BorderLayout.SOUTH);
       
       setSize(400, 130);
       setVisible(true);
   }
}
