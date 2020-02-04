package Rombo;

import transformadas.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;

public class PBotones extends JPanel {

    public PBotones() {
        this.setBounds(400, 0, 360, 500);
        init();
    }

    public void init() {
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        rotar = new JSlider();
        eje_x = new JSlider();
        eje_y = new JSlider();
        jl_titulo = new JLabel("MENU");
        jl_escalar = new JLabel("ESCALAR");
        jl_rotar = new JLabel("ROTAR");
        jl_moverx = new JLabel("MOVER EJE X");
        jl_moverx.setOpaque(true);
        jl_movery = new JLabel("MOVER EJE Y");
        rotar.setValue(0);
        jb_mas = new JButton("+");
        jb_menos = new JButton("-");
        jl_sel_color=new JLabel("SELECCIONA COLOR");
        
        jb_CRojo = new JButton();
        jb_CAmarillo = new JButton();
        jb_CAzul = new JButton();
        jb_CGris = new JButton();
        jb_CVerde = new JButton();
        jb_CNaranja = new JButton();
        jb_CBlanco = new JButton();
        jb_CMyColor=new JButton();

        rotar.setBounds(5, 153, 360, 25);
        eje_x.setBounds(5, 214, 150, 25);
        eje_y.setBounds(5, 272, 150, 25);
        jl_titulo.setBounds(118, 11, 50, 25);
        jl_escalar.setBounds(5, 55, 300, 25);
        jl_rotar.setBounds(5, 123, 300, 25);
        jl_moverx.setBounds(5, 184, 300, 25);
        jl_movery.setBounds(5, 242, 300, 25);
        jb_mas.setBounds(56, 77, 50, 50);
        jb_menos.setBounds(5, 77, 50, 50);

        jl_sel_color.setBounds(5, 310, 150, 30);
        jb_CRojo.setBounds(5, 350, 60, 30);
        jb_CRojo.setBackground(Color.RED);
        jb_CAmarillo.setBounds(65, 350, 60, 30);
        jb_CAmarillo.setBackground(Color.YELLOW);
        jb_CAzul.setBounds(120, 350, 60, 30);
        jb_CAzul.setBackground(Color.BLUE);
        jb_CGris.setBounds(170, 350, 60, 30);
        jb_CGris.setBackground(Color.DARK_GRAY);
        jb_CVerde.setBounds(5, 380, 60, 30);
        jb_CVerde.setBackground(Color.GREEN);
        jb_CNaranja.setBounds(65, 380, 60, 30);
        jb_CNaranja.setBackground(Color.ORANGE);
        jb_CBlanco.setBounds(120, 380, 60, 30);
        jb_CBlanco.setBackground(Color.WHITE);
        jb_CMyColor.setBounds(170, 380, 60, 30);
        jb_CMyColor.setBackground(new Color(0,201,219));

        this.add(rotar);
        this.add(eje_x);
        this.add(eje_y);
        this.add(jl_titulo);
        this.add(jl_escalar);
        this.add(jl_rotar);
        this.add(jl_moverx);
        this.add(jl_movery);
        this.add(jl_sel_color);
        
        this.add(jb_mas);
        this.add(jb_menos);
        this.add(jb_CRojo);
        this.add(jb_CAmarillo);
        this.add(jb_CAzul);
        this.add(jb_CGris);
        this.add(jb_CVerde);
        this.add(jb_CNaranja);
        this.add(jb_CBlanco);
        this.add(jb_CMyColor);

    }

    public JSlider rotar;
    public JSlider eje_x;
    public JSlider eje_y;
    public JLabel jl_titulo;
    public JLabel jl_escalar;
    public JLabel jl_rotar;
    public JLabel jl_moverx;
    public JLabel jl_movery;
    public JLabel jl_sel_color;

    public JButton jb_mas;
    public JButton jb_menos;
    public JButton jb_CRojo;
    public JButton jb_CAmarillo;
    public JButton jb_CAzul;
    public JButton jb_CGris;
    public JButton jb_CVerde;
    public JButton jb_CNaranja;
    public JButton jb_CBlanco;
    public JButton jb_CMyColor;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setBounds(200, 200, 750, 500);
        frame.add(new PBotones());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
