
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.*;

public class Dibujo {

    public static void main(String[] args) {
        new Frame().setVisible(true);

    }

}

class Panel extends JPanel {

    @Override
    public void paint(Graphics g) {

        //cielo
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint gp1 = new GradientPaint(10.0f, 125.0f, Color.black, 569.0f, 125.0f, (new Color(0, 153, 255)));
        Rectangle2D r = new Rectangle2D.Double(0.0, 0.0, 800.0, 600.0);
        g2.setPaint(gp1);
        g2.fill(r);

        //Estrellas
        g.setColor(Color.white);
        g.drawOval(10, 10, 1, 2);
        g.drawOval(5, 20, 1, 2);
        g.drawOval(3, 30, 1, 2);
        g.drawOval(30, 40, 1, 2);
        g.drawOval(20, 50, 1, 2);
        g.drawOval(1, 70, 1, 2);
        g.drawOval(90, 80, 1, 2);
        g.drawOval(80, 10, 1, 2);
        g.drawOval(25, 20, 1, 2);
        g.drawOval(19, 30, 1, 2);
        g.drawOval(60, 40, 1, 2);
        g.drawOval(40, 50, 1, 2);
        g.drawOval(10, 70, 1, 2);
        g.drawOval(100, 80, 1, 2);
        g.drawOval(120, 10, 1, 2);
        g.drawOval(50, 20, 1, 2);
        g.drawOval(40, 30, 1, 2);
        g.drawOval(120, 40, 1, 2);
        g.drawOval(80, 50, 1, 2);
        g.drawOval(20, 70, 1, 2);
        g.drawOval(200, 80, 1, 2);
        g.drawOval(80, 20, 1, 2);
        g.drawOval(25, 40, 1, 2);
        g.drawOval(19, 60, 1, 2);
        g.drawOval(60, 80, 1, 2);
        g.drawOval(40, 100, 1, 2);
        g.drawOval(10, 140, 1, 2);
        g.drawOval(100, 160, 1, 2);
        g.drawOval(10, 90, 1, 2);
        g.drawOval(5, 120, 1, 2);
        g.drawOval(1, 140, 1, 2);
        g.drawOval(4, 80, 1, 2);
        g.drawOval(10, 65, 1, 2);
        g.drawOval(10, 70, 1, 2);
        g.drawOval(1, 80, 1, 2);
        g.drawOval(100, 10, 1, 2);
        g.drawOval(75, 20, 1, 2);
        g.drawOval(38, 30, 1, 2);
        g.drawOval(90, 40, 1, 2);
        g.drawOval(60, 50, 1, 2);
        g.drawOval(20, 70, 1, 2);
        g.drawOval(150, 80, 1, 2);
        g.drawOval(80, 12, 1, 2);
        g.drawOval(25, 175, 1, 2);
        g.drawOval(19, 120, 1, 2);
        g.drawOval(60, 120, 1, 2);
        g.drawOval(40, 990, 1, 2);
        g.drawOval(65, 180, 1, 2);
        g.drawOval(1, 176, 1, 2);
        g.drawOval(100, 20, 1, 2);
        g.drawOval(20, 100, 1, 2);
        g.drawOval(19, 110, 1, 2);
        g.drawOval(60, 120, 1, 2);
        g.drawOval(40, 180, 1, 2);
        g.drawOval(10, 140, 1, 2);
        g.drawOval(100, 160, 1, 2);
        g.drawOval(8, 200, 1, 2);
        g.drawOval(25, 190, 1, 2);
        g.drawOval(47, 155, 1, 2);
        g.drawOval(33, 189, 1, 2);
        g.drawOval(62, 89, 1, 2);
        g.drawOval(19, 99, 1, 2);
        g.drawOval(60, 80, 1, 2);
        g.drawOval(4, 220, 1, 2);
        g.drawOval(25, 210, 1, 2);
        g.drawOval(19, 230, 1, 2);
        g.drawOval(60, 240, 1, 2);
        g.drawOval(40, 260, 1, 2);
        g.drawOval(10, 270, 1, 2);
        g.drawOval(100, 180, 1, 2);
        
//Edificio
       
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(204,200,128,200);
         g.setColor(Color.red);
         g.drawString("HOTEL *****",235,210 );
        g.setColor(Color.white);
        g.fillRect(210,215,10,14);
        g.fillRect(225,215,10,14);
        g.fillRect(240,215,10,14);
        g.fillRect(255,215,10,14);
        g.fillRect(270,215,10,14);
        g.fillRect(285,215,10,14);
        g.fillRect(300,215,10,14);
        g.fillRect(315,215,10,14);
         g.fillRect(210,234,10,14);
        g.fillRect(225,234,10,14);
        g.fillRect(240,234,10,14);
        g.fillRect(255,234,10,14);
        g.fillRect(270,234,10,14);
        g.fillRect(285,234,10,14);
        g.fillRect(300,234,10,14);
        g.fillRect(315,234,10,14);
         g.fillRect(210,253,10,14);
        g.fillRect(225,253,10,14);
        g.fillRect(240,253,10,14);
        g.fillRect(255,253,10,14);
        g.fillRect(270,253,10,14);
        g.fillRect(285,253,10,14);
        g.fillRect(300,253,10,14);
        g.fillRect(315,253,10,14);
        
         g.fillRect(210,282,10,14);
        g.fillRect(225,282,10,14);
        g.fillRect(240,282,10,14);
        g.fillRect(255,282,10,14);
        g.fillRect(270,282,10,14);
        g.fillRect(285,282,10,14);
        g.fillRect(300,282,10,14);
        g.fillRect(315,282,10,14);
        
         g.fillRect(210,301,10,14);
        g.fillRect(225,301,10,14);
        g.fillRect(240,301,10,14);
        g.fillRect(255,301,10,14);
        g.fillRect(270,301,10,14);
        g.fillRect(285,301,10,14);
        g.fillRect(300,301,10,14);
        g.fillRect(315,301,10,14);
        
         g.fillRect(210,320,10,14);
        g.fillRect(225,320,10,14);
        g.fillRect(240,320,10,14);
        g.fillRect(255,320,10,14);
        g.fillRect(270,320,10,14);
        g.fillRect(285,320,10,14);
        g.fillRect(300,320,10,14);
        g.fillRect(315,320,10,14);
        
        g.fillRect(210,339,10,14);
        g.fillRect(225,339,10,14);
        g.fillRect(240,339,10,14);
        g.fillRect(255,339,10,14);
        g.fillRect(270,339,10,14);
        g.fillRect(285,339,10,14);
        g.fillRect(300,339,10,14);
        g.fillRect(315,339,10,14);
        
        g.fillRect(210,358,10,14);
        g.fillRect(225,358,10,14);
        g.fillRect(240,358,10,14);
        g.fillRect(255,358,10,14);
        g.fillRect(270,358,10,14);
        g.fillRect(285,358,10,14);
        g.fillRect(300,358,10,14);
        g.fillRect(315,358,10,14);
        
        g.setColor(Color.black);
        g.fill3DRect(210,385,117,15 , true);
           
           
        //Luna
        GradientPaint gp2 = new GradientPaint(50.0f, 50.0f, Color.yellow, 300.0f, 50.0f, Color.darkGray);
        g2.setPaint(gp2);
        Ellipse2D e1 = new Ellipse2D.Double(70.0, 100.0, 80.0, 80.0);
        Ellipse2D e2 = new Ellipse2D.Double(100.0, 100.0, 80.0, 80.0);
        Area a1 = new Area(e1);
        Area a2 = new Area(e2);
        a1.subtract(a2);
        g2.fill(a1);

//Tierra 
        g.setColor(new Color(0, 102, 0));
        g.fillRect(0, 400, 800, 100);
//Casa  
        g.setColor(new Color(204, 51, 51));
        g.fillRect(380, 300, 150, 100);
        //ventanas
        g.setColor(Color.WHITE);
        g.fillOval(405, 310, 20, 30);
        g.fillOval(480, 310, 20, 30);
        //protecciones
        g.setColor(Color.black);
        g.drawLine(415, 310, 415, 340);
        g.drawRect(405, 324, 20, 0);
        g.drawLine(490, 310, 490, 340);
        g.drawRect(480, 324, 20, 0);

        //puerta
        g.setColor(new Color(153, 102, 0));
        g.fillRect(438, 350, 30, 50);
        g.setColor(Color.black);
        g.fillOval(460, 370, 5, 5);
        //Techo
        g.setColor(Color.ORANGE);
        g.fillRoundRect(360, 290, 190, 10, 25, 25);
        //escalón
        g.setColor(new Color(0, 51, 51));
        g.fillRect(438, 400, 30, 3);
        //Camino a la casa
        g.setColor(Color.GRAY);
        g.fillRect(438, 403, 30, 100);

        //árboles 
        g.setColor(new Color(0, 51, 0));
        g.fillRoundRect(600, 365, 90, 10, 30, 25);
        g.fillRoundRect(607, 357, 77, 10, 30, 25);
        g.fillRoundRect(614, 348, 64, 10, 30, 25);
        g.fillRoundRect(622, 340, 47, 10, 30, 25);
        g.fillRoundRect(632, 333, 30, 10, 30, 25);
        g.fillRoundRect(642, 325, 15, 10, 30, 25);
        g.setColor(new Color(70, 19, 8));
        g.fillRect(642, 375, 10, 30);

        g.setColor(new Color(0, 51, 0));

        g.fillRoundRect(655, 365, 90, 10, 30, 25);
        g.fillRoundRect(665, 357, 77, 10, 30, 25);
        g.fillRoundRect(675, 348, 64, 10, 30, 25);
        g.fillRoundRect(685, 340, 47, 10, 30, 25);
        g.fillRoundRect(694, 333, 30, 10, 30, 25);
        g.fillRoundRect(700, 325, 15, 10, 30, 25);
        g.setColor(new Color(70, 19, 8));
        g.fillRect(704, 375, 10, 30);
        //nube
        g.setColor(new Color(231, 231, 231));
        g.fillOval(640, 38, 45, 45);
        g.fillOval(615, 38, 45, 45);
        g.fillOval(665, 38, 45, 45);
        g.fillOval(655, 25, 45, 45);
        g.fillOval(625, 25, 45, 45);
        g.fillOval(655, 50, 45, 45);
        g.fillOval(625, 50, 45, 45);

        g.setColor(new Color(231, 231, 231));
        g.fillOval(640, 178, 45, 45);
        g.fillOval(665, 178, 45, 45);
        g.fillOval(685, 178, 45, 45);
        g.fillOval(655, 165, 45, 45);
        g.fillOval(625, 165, 45, 45);
        g.fillOval(655, 160, 45, 45);
        g.fillOval(655, 190, 45, 45);

        g.setColor(new Color(231, 231, 231));
        g.fillOval(730, 100, 45, 45);
        g.fillOval(745, 120, 45, 45);
        g.fillOval(755, 100, 45, 45);
        g.fillOval(755, 115, 45, 45);

//Ave
        g.setColor(Color.black);
        g.drawArc(500, 150, 10, 5, 0, 180);
        g.drawArc(508, 150, 10, 5, 0, 180);
        //
        g.drawArc(600, 50, 10, 5, 0, 180);
        g.drawArc(608, 50, 10, 5, 0, 180);
        //
        g.drawArc(600, 90, 10, 5, 0, 180);
        g.drawArc(608, 90, 10, 5, 0, 180);

//Edificios
       
        g.setColor(new Color(128, 128, 128));
        //Edificios
        g.fillRect(0, 330, 55, 70);
        g.fillRect(55, 270, 79, 130);
        g.fillRect(134, 330, 69, 70);
        //barandalIzquierdo
        g.fillRect(0, 320, 3, 10);
        g.fillRect(14, 320, 3, 10);
        g.fillRect(28, 320, 3, 10);
        g.fillRect(42, 320, 3, 10);
        g.fillRect(0, 317, 55, 3);
        //barandalDerecho
        g.fillRect(148, 320, 3, 10);
        g.fillRect(162, 320, 3, 10);
        g.fillRect(176, 320, 3, 10);
        g.fillRect(190, 320, 3, 10);
        g.fillRect(200, 320, 3, 10);
        g.fillRect(134, 317, 69, 4);
        //Cruz Roja
        g.setColor(Color.RED);
        g.fillRect(90, 290, 6, 20);
        g.fillRect(83, 295, 20, 6);
        //Ventanas
        g.setColor(Color.white);
        g.fillRect(5, 350, 45, 20);
        g.fillRect(140, 350, 55, 20);
        //puerta
        g.setColor(Color.black);
        g.fillRect(80, 350, 35, 50);
//Ovni
        g.setColor(Color.BLACK);
        g.fillOval(470, 100, 40, 20);
        g.fillOval(480, 88, 22, 30);
        g.setColor(Color.white);
        g.fillOval(477, 110, 27, 5);
        //
        g.setColor(Color.BLACK);
        g.fillOval(400, 50, 40, 20);
        g.fillOval(410, 38, 22, 30);
        g.setColor(Color.white);
        g.fillOval(407, 60, 27, 5);
        //
        g.setColor(Color.BLACK);
        g.fillOval(330, 100, 40, 20);
        g.fillOval(340, 88, 22, 30);
        g.setColor(Color.white);
        g.fillOval(337, 110, 27, 5);
        //Haz de luz
        g.setColor(Color.white);
        g.drawLine(470, 120, 440, 210);
        g.drawLine(490, 140, 440, 210);
        g.drawLine(450, 120, 440, 210);
        g.drawLine(330, 120, 330, 210);
        g.drawLine(390, 100, 370, 240);
        g.drawLine(390, 100, 380, 210);
        g.drawLine(340, 120, 330, 210);
        g.drawLine(430, 90, 410, 210);
//Persona
        g.setColor(new Color(255, 204, 204));
        g.drawOval(350, 350, 10, 10);
        g.drawLine(354, 360, 354, 390);
        g.drawLine(354, 390, 347, 405);
        g.drawLine(354, 390, 361, 405);
        g.drawLine(354, 373, 345, 360);
        g.drawLine(354, 373, 365, 360);

//firma 
        g.setColor(Color.black);
        Font fuente = new Font("Matura MT Script Capitals", Font.PLAIN, 20);
        g.setFont(fuente);
        g.drawString("RodoPH", 10, 430);

    }
}

class Frame extends JFrame {

    JPanel panel;

    public Frame() {
        panel = new Panel();
        add(panel);
        setSize(800, 500);
        setTitle("PAISAJE ISC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
