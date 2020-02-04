package Rombo;

import java.awt.Polygon;

public class Rombo {
    private int[] cor_x;
    private int[] cor_y;
    private int X;
    private int Y;

    Polygon rombo;

    public Rombo(int ancho, int alto) {
        X = ancho / 2;
        Y = alto / 2;
        cor_x = new int[4];
        cor_y = new int[4];
    }

    public Polygon crearRombo() {
        int mayor = 150, menor = 80;
        cor_x[0] = X;
        cor_x[1] = X - menor;
        cor_x[2] = X;
        cor_x[3] = X + menor;

        cor_y[0] = Y - mayor;
        cor_y[1] = Y;
        cor_y[2] = Y + mayor;
        cor_y[3] = Y;
        //mostrarMatriz();
        return new Polygon(cor_x, cor_y, 4);
    }
/*    
    public void mostrarMatriz(){
        for (int i = 0; i < 4; i++) {
            System.out.println(cor_x[i]+" - "+cor_y[i]);
        }
    }
*/
    public int[] getCor_x() {
        return cor_x;
    }

    public void setCor_x(int[] cor_x) {
        this.cor_x = cor_x;
    }

    public int[] getCor_y() {
        return cor_y;
    }

    public void setCor_y(int[] cor_y) {
        this.cor_y = cor_y;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public Polygon getRombo() {
        return rombo;
    }

    public void setRombo(Polygon rombo) {
        this.rombo = rombo;
    }
    
    
}
