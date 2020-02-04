package Rombo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import mdlaf.MaterialLookAndFeel;

public class Controlador extends JFrame {

    PBotones panelBoton;
    PanelFigura panelRombo;
    Rombo el_rombo;

    public Controlador() {
        panelBoton = new PBotones();
        escuchando();
        el_rombo = new Rombo(400, 500);
        el_rombo.crearRombo();

        panelRombo = new PanelFigura();
        panelRombo.setMy_color(Color.WHITE);//_______________________________________________________set_color
        panelRombo.setEje_x(el_rombo.getCor_x());
        panelRombo.setEje_y(el_rombo.getCor_y());
        panelRombo.setGrados(panelBoton.rotar.getValue() * 4);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        panelRombo.setBounds(0, 0, 400, 500);
        this.add(panelRombo);
        this.add(panelBoton);
        this.setBounds(300, 300, 760, 500);
        this.setLocationRelativeTo(null);

    }

    public void escuchando() {
        panelBoton.rotar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                panelRombo.setGrados(panelBoton.rotar.getValue() * 4);
                repaint();
            }
        });

        panelBoton.jb_mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                escalarMas();
                repaint();
            }
        });

        panelBoton.jb_menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                escalarMenos();
                repaint();
            }
        });

        panelBoton.eje_x.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                panelRombo.setTrasladaX(panelBoton.eje_x.getValue()*2.0);
                repaint();
            }
        });

        panelBoton.eje_y.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                panelRombo.setTrasladaY(panelBoton.eje_y.getValue()*2.0);
                repaint();
            }
        });
        
        panelBoton.jb_CRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.RED);
                repaint();
            }
        });
        
        panelBoton.jb_CAmarillo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.YELLOW);
                repaint();
            }
        });

        panelBoton.jb_CAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.BLUE);
                repaint();
            }
        });
        
        panelBoton.jb_CGris.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.DARK_GRAY);
                repaint();
            }
        });
        
        panelBoton.jb_CVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.GREEN);
                repaint();
            }
        });
        
        panelBoton.jb_CNaranja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.ORANGE);
                repaint();
            }
        });
        panelBoton.jb_CBlanco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(Color.WHITE);
                repaint();
            }
        });
        panelBoton.jb_CMyColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelRombo.setMy_color(new Color(0,201,219));
                repaint();
            }
        });
    }

    public void escalarMas() {
        int[] eje_x = panelRombo.getEje_x();
        int[] eje_y = panelRombo.getEje_y();
        eje_x[1] -= 3;
        eje_x[3] += 3;
        eje_y[0] -= 5;
        eje_y[2] += 5;
        panelRombo.setEje_x(eje_x);
        panelRombo.setEje_y(eje_y);
    }

    public void escalarMenos() {
        int[] eje_x = panelRombo.getEje_x();
        int[] eje_y = panelRombo.getEje_y();
        eje_x[1] += 3;
        eje_x[3] -= 3;
        eje_y[0] += 5;
        eje_y[2] -= 5;
        panelRombo.setEje_x(eje_x);
        panelRombo.setEje_y(eje_y);
    }

    
    
    public static void main(String[] args) {
        initMaterialDesign();
        new Controlador().setVisible(true);
    }
        public static void initMaterialDesign() {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
