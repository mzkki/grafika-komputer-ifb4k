/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_haris;

/**
 *
 * @author mzkki
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawKucing extends JPanel {

    private double x = 0;
    private double y = 0;
    private double dx = 2;  // kecepatan bergerak horizontal
    private double dy = 2;  // kecepatan bergerak vertikal

    public DrawKucing() {
        Timer timer = new Timer(50, e -> moveAnimal());
        timer.start();
    }

    private void moveAnimal() {
        x += dx;
        y += dy;

        // Mengecek batas bawah dan kanan jendela
        if (x + 60 > getWidth() || y + 50 > getHeight()) {
            x = 0;
            y = 0;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Menggambar tubuh kucing
        Ellipse2D body = new Ellipse2D.Double(x, y, 60, 30);
        g2d.setColor(Color.ORANGE);
        g2d.fill(body);
        g2d.setColor(Color.BLACK);
        g2d.draw(body);

        // Menggambar kepala kucing
        Ellipse2D head = new Ellipse2D.Double(x + 40, y - 20, 30, 30);
        g2d.setColor(Color.ORANGE);
        g2d.fill(head);
        g2d.setColor(Color.BLACK);
        g2d.draw(head);

        // Menggambar mata kucing
        Ellipse2D eye1 = new Ellipse2D.Double(x + 47, y - 12, 5, 5);
        Ellipse2D eye2 = new Ellipse2D.Double(x + 58, y - 12, 5, 5);
        g2d.setColor(Color.WHITE);
        g2d.fill(eye1);
        g2d.fill(eye2);
        g2d.setColor(Color.BLACK);
        g2d.draw(eye1);
        g2d.draw(eye2);

        // Menggambar pupil kucing
        Ellipse2D pupil1 = new Ellipse2D.Double(x + 49, y - 10, 2, 2);
        Ellipse2D pupil2 = new Ellipse2D.Double(x + 60, y - 10, 2, 2);
        g2d.setColor(Color.BLACK);
        g2d.fill(pupil1);
        g2d.fill(pupil2);

        // Menggambar telinga kucing
        GeneralPath ear1 = new GeneralPath();
        ear1.moveTo(x + 45, y - 20);
        ear1.lineTo(x + 50, y - 30);
        ear1.lineTo(x + 55, y - 20);
        ear1.closePath();
        g2d.setColor(Color.ORANGE);
        g2d.fill(ear1);
        g2d.setColor(Color.BLACK);
        g2d.draw(ear1);

        GeneralPath ear2 = new GeneralPath();
        ear2.moveTo(x + 55, y - 20);
        ear2.lineTo(x + 60, y - 30);
        ear2.lineTo(x + 65, y - 20);
        ear2.closePath();
        g2d.setColor(Color.ORANGE);
        g2d.fill(ear2);
        g2d.setColor(Color.BLACK);
        g2d.draw(ear2);

        // Menggambar kumis kucing
        g2d.drawLine((int) x + 45, (int) y - 5, (int) x + 40, (int) y - 5);
        g2d.drawLine((int) x + 45, (int) y - 7, (int) x + 40, (int) y - 7);
        g2d.drawLine((int) x + 45, (int) y - 3, (int) x + 40, (int) y - 3);

        g2d.drawLine((int) x + 65, (int) y - 5, (int) x + 70, (int) y - 5);
        g2d.drawLine((int) x + 65, (int) y - 7, (int) x + 70, (int) y - 7);
        g2d.drawLine((int) x + 65, (int) y - 3, (int) x + 70, (int) y - 3);

        // Menggambar kaki kucing
        Rectangle2D leg1 = new Rectangle2D.Double(x + 10, y + 25, 5, 12);
        Rectangle2D leg2 = new Rectangle2D.Double(x + 20, y + 25, 5, 12);
        Rectangle2D leg3 = new Rectangle2D.Double(x + 40, y + 25, 5, 12);
        Rectangle2D leg4 = new Rectangle2D.Double(x + 50, y + 25, 5, 12);
        g2d.setColor(Color.ORANGE);
        g2d.fill(leg1);
        g2d.fill(leg2);
        g2d.fill(leg3);
        g2d.fill(leg4);
        g2d.setColor(Color.BLACK);
        g2d.draw(leg1);
        g2d.draw(leg2);
        g2d.draw(leg3);
        g2d.draw(leg4);

        // Menggambar ekor kucing
        QuadCurve2D tail = new QuadCurve2D.Double(x, y + 10, x - 20, y + 20, x - 10, y + 30);
        g2d.setColor(Color.ORANGE);
        g2d.fill(tail);
        g2d.setColor(Color.BLACK);
        g2d.draw(tail);
    }
}
