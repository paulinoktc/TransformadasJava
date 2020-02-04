package Rombo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class PanelFigura extends JPanel {

    private int[] eje_x;
    private int[] eje_y;
    int grados = 0;
    double escala = 1;
    
    double trasladaX=0;
    double trasladaY=0;
    private Color my_color;
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.BLACK);
        g2d.clearRect(0, 0, 400, 500);
        double r = Math.toRadians(grados);
        g2d.setColor(my_color);
        g2d.rotate(r, 200, 250);
        g2d.translate(trasladaX, trasladaY);
        g2d.fillPolygon(eje_x, eje_y, 4);

        
    }

    public int[] getEje_x() {
        return eje_x;
    }

    public void setEje_x(int[] eje_x) {
        this.eje_x = eje_x;
    }

    public int[] getEje_y() {
        return eje_y;
    }

    public void setEje_y(int[] eje_y) {
        this.eje_y = eje_y;
    }

    public int getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }

    public double getEscala() {
        return escala;
    }

    public void setEscala(double escala) {
        this.escala = escala;
    }

    public double getTrasladaX() {
        return trasladaX;
    }

    public void setTrasladaX(double trasladaX) {
        this.trasladaX = trasladaX;
    }

    public double getTrasladaY() {
        return trasladaY;
    }

    public void setTrasladaY(double trasladaY) {
        this.trasladaY = trasladaY;
    }

    public Color getMy_color() {
        return my_color;
    }

    public void setMy_color(Color my_color) {
        this.my_color = my_color;
    }

    
    
}
