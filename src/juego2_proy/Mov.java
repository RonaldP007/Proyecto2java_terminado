package juego2_proy;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import juego2_proy.cajafuerte;
import juego_1.menu;
import static juego_1.panel.c2;

public class Mov extends javax.swing.JFrame {
//this method is the principal and contains all the labels and mores things that the project needs
    int cantidad = 10;
    int arreglo[] = new int[cantidad];
    ArrayList<Integer> lista = new ArrayList();
    public static boolean re;
    private int X;
    private int Y;
    int contar = 0;
    private int velocidad_X;
    private int velocidad_Y;
    private Image drago;
    public int limite_derecha;
    int pder = 0;
    int pizq = 0;
    int limite_inferior;
    int bot_der = 0;
    int bot_izq = 0;
    Random ra = new Random();
    int matriz[][] = new int[8][5];
    int matriz1[][] = new int[8][5];
    int con = 0;
    int cuenta = 0;
    int o = 10;
    ImageIcon obs = new ImageIcon("src/imagenes/mina.jpg");
    ImageIcon preg = new ImageIcon("src/imagenes/preg.jpg");
    ImageIcon com = new ImageIcon("src/imagenes/candado.jpg");

    public Mov() {
//this is the constructor of the project and we modify the structor of the project
        initComponents();
       
        setTitle("Preguntas");
        setSize(458, 559);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        lab1.setHorizontalAlignment(lab1.CENTER);
        lab1.setVerticalAlignment(lab1.CENTER);
        lab2.setHorizontalAlignment(lab2.CENTER);
        lab2.setVerticalAlignment(lab2.CENTER);
        lab3.setHorizontalAlignment(lab3.CENTER);
        lab3.setVerticalAlignment(lab3.CENTER);
        lab4.setHorizontalAlignment(lab4.CENTER);
        lab4.setVerticalAlignment(lab4.CENTER);
        lab5.setHorizontalAlignment(lab5.CENTER);
        lab5.setVerticalAlignment(lab5.CENTER);
        lab6.setHorizontalAlignment(lab6.CENTER);
        lab6.setVerticalAlignment(lab6.CENTER);
        lab7.setHorizontalAlignment(lab7.CENTER);
        lab7.setVerticalAlignment(lab7.CENTER);
        lab8.setHorizontalAlignment(lab8.CENTER);
        lab8.setVerticalAlignment(lab8.CENTER);
        lab9.setHorizontalAlignment(lab9.CENTER);
        lab9.setVerticalAlignment(lab9.CENTER);
        lab10.setHorizontalAlignment(lab10.CENTER);
        lab10.setVerticalAlignment(lab10.CENTER);
        lab11.setHorizontalAlignment(lab11.CENTER);
        lab11.setVerticalAlignment(lab11.CENTER);
        lab12.setHorizontalAlignment(lab12.CENTER);
        lab12.setVerticalAlignment(lab12.CENTER);
        lab13.setHorizontalAlignment(lab13.CENTER);
        lab13.setVerticalAlignment(lab13.CENTER);
        lab14.setHorizontalAlignment(lab14.CENTER);
        lab14.setVerticalAlignment(lab14.CENTER);
        lab15.setHorizontalAlignment(lab15.CENTER);
        lab15.setVerticalAlignment(lab15.CENTER);
        lab16.setHorizontalAlignment(lab16.CENTER);
        lab16.setVerticalAlignment(lab16.CENTER);
        lab17.setHorizontalAlignment(lab17.CENTER);
        lab17.setVerticalAlignment(lab17.CENTER);
        lab18.setHorizontalAlignment(lab18.CENTER);
        lab18.setVerticalAlignment(lab18.CENTER);
        lab19.setHorizontalAlignment(lab19.CENTER);
        lab19.setVerticalAlignment(lab19.CENTER);
        lab20.setHorizontalAlignment(lab20.CENTER);
        lab20.setVerticalAlignment(lab20.CENTER);
        lab21.setHorizontalAlignment(lab21.CENTER);
        lab21.setVerticalAlignment(lab21.CENTER);
        lab22.setHorizontalAlignment(lab22.CENTER);
        lab22.setVerticalAlignment(lab22.CENTER);
        lab23.setHorizontalAlignment(lab23.CENTER);
        lab23.setVerticalAlignment(lab23.CENTER);
        lab24.setHorizontalAlignment(lab24.CENTER);
        lab24.setVerticalAlignment(lab24.CENTER);
        lab25.setHorizontalAlignment(lab25.CENTER);
        lab25.setVerticalAlignment(lab25.CENTER);
        lab26.setHorizontalAlignment(lab26.CENTER);
        lab26.setVerticalAlignment(lab26.CENTER);
        lab27.setHorizontalAlignment(lab27.CENTER);
        lab27.setVerticalAlignment(lab27.CENTER);
        lab28.setHorizontalAlignment(lab28.CENTER);
        lab28.setVerticalAlignment(lab28.CENTER);
        lab29.setHorizontalAlignment(lab29.CENTER);
        lab29.setVerticalAlignment(lab29.CENTER);
        lab30.setHorizontalAlignment(lab30.CENTER);
        lab30.setVerticalAlignment(lab30.CENTER);
        lab31.setHorizontalAlignment(lab31.CENTER);
        lab31.setVerticalAlignment(lab31.CENTER);
        lab32.setHorizontalAlignment(lab32.CENTER);
        lab32.setVerticalAlignment(lab32.CENTER);
        lab33.setHorizontalAlignment(lab33.CENTER);
        lab33.setVerticalAlignment(lab33.CENTER);
        lab34.setHorizontalAlignment(lab34.CENTER);
        lab34.setVerticalAlignment(lab34.CENTER);
        lab35.setHorizontalAlignment(lab35.CENTER);
        lab35.setVerticalAlignment(lab35.CENTER);
        lab36.setHorizontalAlignment(lab36.CENTER);
        lab36.setVerticalAlignment(lab36.CENTER);
        lab37.setHorizontalAlignment(lab37.CENTER);
        lab37.setVerticalAlignment(lab38.CENTER);
        lab38.setHorizontalAlignment(lab38.CENTER);
        lab38.setVerticalAlignment(lab38.CENTER);

        int i = 0, rango = 37;

        arreglo[i] = (int) (Math.random() * rango) + 2;
        for (i = 1; i < cantidad; i++) {
            arreglo[i] = (int) (Math.random() * rango) + 2;
            if (arreglo[i] == 22) {
                while (true) {
                    arreglo[i] = (int) (Math.random() * rango) + 2;
                    if (arreglo[i] == 22) {
                        arreglo[i] = (int) (Math.random() * rango) + 2;
                    } else {
                        lista.add(arreglo[i]);
                        break;
                    }
                }
            }
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }

        for (int u = 0; u < matriz.length; u++) {
            for (int y = 0; y < matriz[u].length; y++) {
                matriz[u][y] = contar;
                contar += 1;
            }
        }
        for (int u = 0; u < matriz.length; u++) {
            for (int y = 0; y < matriz[u].length; y++) {
                if (matriz[u][y] == arreglo[0] || matriz[u][y] == arreglo[1] || matriz[u][y] == arreglo[2] || matriz[u][y] == arreglo[3] || matriz[u][y] == arreglo[4] || matriz[u][y] == arreglo[5] || matriz[u][y] == arreglo[6] || matriz[u][y] == arreglo[7] || matriz[u][y] == arreglo[8] || matriz[u][y] == arreglo[9]) {
                    matriz1[u][y] = 1;

                } else {
                    matriz1[u][y] = 0;
                }

            }
        }
        matriz1[4][2] = 3;

        for (int y = 0; y < arreglo.length; y++) {
            lista.add(arreglo[y]);

        }

        if (matriz1[0][1] == 0) {
            lab1.setIcon(preg);

        } else {
            lab1.setIcon(obs);
        }
        if (matriz1[0][2] == 0) {
            lab2.setIcon(preg);
        } else {
            lab2.setIcon(obs);
        }
        if (matriz1[0][3] == 0) {
            lab3.setIcon(preg);
        } else {
            lab3.setIcon(obs);
        }
        if (matriz1[0][4] == 0) {
            lab4.setIcon(preg);
        } else {
            lab4.setIcon(obs);
        }
        if (matriz1[1][0] == 0) {
            lab5.setIcon(preg);

        } else {
            lab5.setIcon(obs);
        }
        if (matriz1[1][1] == 0) {
            lab6.setIcon(preg);

        } else {
            lab6.setIcon(obs);
        }
        if (matriz1[1][2] == 0) {
            lab7.setIcon(preg);

        } else {
            lab7.setIcon(obs);
        }
        if (matriz1[1][3] == 0) {
            lab8.setIcon(preg);

        } else {
            lab8.setIcon(obs);
        }
        if (matriz1[1][4] == 0) {
            lab9.setIcon(preg);

        } else {
            lab9.setIcon(obs);
        }
        if (matriz1[2][0] == 0) {
            lab10.setIcon(preg);

        } else {
            lab10.setIcon(obs);
        }
        if (matriz1[2][1] == 0) {
            lab11.setIcon(preg);

        } else {
            lab11.setIcon(obs);
        }
        if (matriz1[2][2] == 0) {
            lab12.setIcon(preg);

        } else {
            lab12.setIcon(obs);
        }
        if (matriz1[2][3] == 0) {
            lab13.setIcon(preg);

        } else {
            lab13.setIcon(obs);
        }
        if (matriz1[2][4] == 0) {
            lab14.setIcon(preg);

        } else {
            lab14.setIcon(obs);
        }
        if (matriz1[3][0] == 0) {
            lab15.setIcon(preg);

        } else {
            lab15.setIcon(obs);
        }
        if (matriz1[3][1] == 0) {
            lab16.setIcon(preg);

        } else {
            lab16.setIcon(obs);
        }
        if (matriz1[3][2] == 0) {
            lab17.setIcon(preg);

        } else {
            lab17.setIcon(obs);
        }
        if (matriz1[3][3] == 0) {
            lab18.setIcon(preg);

        } else {
            lab18.setIcon(obs);
        }
        if (matriz1[3][4] == 0) {
            lab19.setIcon(preg);

        } else {
            lab19.setIcon(obs);
        }
        if (matriz1[4][0] == 0) {
            lab20.setIcon(preg);

        } else {
            lab20.setIcon(obs);
        }
        if (matriz1[4][1] == 0) {
            lab21.setIcon(preg);

        } else {
            lab21.setIcon(obs);
        }
        if (matriz1[4][2] == 3) {
            lab22.setIcon(com);

        } else {
            lab22.setIcon(obs);
        }
        if (matriz1[4][3] == 0) {
            lab23.setIcon(preg);

        } else {
            lab23.setIcon(obs);
        }
        if (matriz1[4][4] == 0) {
            lab24.setIcon(preg);
        } else {
            lab24.setIcon(obs);
        }
        if (matriz1[5][0] == 0) {
            lab25.setIcon(preg);

        } else {
            lab25.setIcon(obs);
        }
        if (matriz1[5][1] == 0) {
            lab26.setIcon(preg);

        } else {
            lab26.setIcon(obs);
        }
        if (matriz1[5][2] == 0) {
            lab27.setIcon(preg);

        } else {
            lab27.setIcon(obs);
        }
        if (matriz1[5][3] == 0) {
            lab28.setIcon(preg);

        } else {
            lab28.setIcon(obs);
        }
        if (matriz1[5][4] == 0) {
            lab29.setIcon(preg);
        } else {
            lab29.setIcon(obs);
        }
        if (matriz1[6][0] == 0) {
            lab30.setIcon(preg);

        } else {
            lab30.setIcon(obs);
        }
        if (matriz1[6][1] == 0) {
            lab31.setIcon(preg);

        } else {
            lab31.setIcon(obs);
        }
        if (matriz1[6][2] == 0) {
            lab32.setIcon(preg);

        } else {
            lab32.setIcon(obs);
        }
        if (matriz1[6][3] == 0) {
            lab33.setIcon(preg);

        } else {
            lab33.setIcon(obs);
        }
        if (matriz1[6][4] == 0) {
            lab34.setIcon(preg);
        } else {
            lab34.setIcon(obs);
        }
        if (matriz1[7][0] == 0) {
            lab35.setIcon(preg);

        } else {
            lab35.setIcon(obs);
        }
        if (matriz1[7][1] == 0) {
            lab36.setIcon(preg);

        } else {
            lab36.setIcon(obs);
        }
        if (matriz1[7][2] == 0) {
            lab37.setIcon(preg);

        } else {
            lab37.setIcon(obs);
        }
        if (matriz1[7][3] == 0) {
            lab38.setIcon(preg);

        } else {
            lab38.setIcon(obs);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lab = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        lab7 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        lab9 = new javax.swing.JLabel();
        lab11 = new javax.swing.JLabel();
        lab12 = new javax.swing.JLabel();
        lab13 = new javax.swing.JLabel();
        lab14 = new javax.swing.JLabel();
        lab16 = new javax.swing.JLabel();
        lab17 = new javax.swing.JLabel();
        lab18 = new javax.swing.JLabel();
        lab19 = new javax.swing.JLabel();
        lab21 = new javax.swing.JLabel();
        lab22 = new javax.swing.JLabel();
        lab23 = new javax.swing.JLabel();
        lab24 = new javax.swing.JLabel();
        lab25 = new javax.swing.JLabel();
        lab26 = new javax.swing.JLabel();
        lab27 = new javax.swing.JLabel();
        lab28 = new javax.swing.JLabel();
        lab29 = new javax.swing.JLabel();
        lab30 = new javax.swing.JLabel();
        lab31 = new javax.swing.JLabel();
        lab32 = new javax.swing.JLabel();
        lab33 = new javax.swing.JLabel();
        lab34 = new javax.swing.JLabel();
        lab35 = new javax.swing.JLabel();
        lab36 = new javax.swing.JLabel();
        lab37 = new javax.swing.JLabel();
        lab38 = new javax.swing.JLabel();
        labf = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        lab10 = new javax.swing.JLabel();
        lab15 = new javax.swing.JLabel();
        lab20 = new javax.swing.JLabel();
        labin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        la1 = new javax.swing.JLabel();
        bw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(350, 602));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        lab.setBackground(new java.awt.Color(204, 204, 255));
        lab.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab.setForeground(new java.awt.Color(102, 0, 0));
        lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego2_proy/pp.jpg"))); // NOI18N
        lab.setAlignmentY(0.0F);
        lab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lab);
        lab.setBounds(0, 0, 60, 59);

        lab1.setBackground(new java.awt.Color(204, 204, 255));
        lab1.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab1.setForeground(new java.awt.Color(102, 0, 0));
        lab1.setText("1");
        lab1.setAlignmentY(0.0F);
        lab1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        lab1.setMaximumSize(new java.awt.Dimension(60, 60));
        lab1.setMinimumSize(new java.awt.Dimension(60, 60));
        lab1.setOpaque(true);
        getContentPane().add(lab1);
        lab1.setBounds(66, 0, 60, 60);

        lab2.setBackground(new java.awt.Color(204, 204, 255));
        lab2.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab2.setForeground(new java.awt.Color(102, 0, 0));
        lab2.setText("2");
        lab2.setAlignmentY(0.12F);
        lab2.setMaximumSize(new java.awt.Dimension(60, 60));
        lab2.setMinimumSize(new java.awt.Dimension(60, 60));
        lab2.setOpaque(true);
        getContentPane().add(lab2);
        lab2.setBounds(132, 0, 60, 60);

        lab3.setBackground(new java.awt.Color(204, 204, 255));
        lab3.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab3.setForeground(new java.awt.Color(102, 0, 0));
        lab3.setText("3");
        lab3.setAlignmentY(0.18F);
        lab3.setMaximumSize(new java.awt.Dimension(60, 60));
        lab3.setMinimumSize(new java.awt.Dimension(60, 60));
        lab3.setOpaque(true);
        getContentPane().add(lab3);
        lab3.setBounds(198, 0, 60, 60);

        lab4.setBackground(new java.awt.Color(204, 204, 255));
        lab4.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab4.setForeground(new java.awt.Color(102, 0, 0));
        lab4.setText("4");
        lab4.setAlignmentY(0.22F);
        lab4.setMaximumSize(new java.awt.Dimension(60, 60));
        lab4.setMinimumSize(new java.awt.Dimension(60, 60));
        lab4.setOpaque(true);
        getContentPane().add(lab4);
        lab4.setBounds(264, 0, 60, 60);

        lab6.setBackground(new java.awt.Color(204, 204, 255));
        lab6.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab6.setForeground(new java.awt.Color(102, 0, 0));
        lab6.setText("6");
        lab6.setAlignmentY(0.28F);
        lab6.setMaximumSize(new java.awt.Dimension(60, 60));
        lab6.setMinimumSize(new java.awt.Dimension(60, 60));
        lab6.setOpaque(true);
        getContentPane().add(lab6);
        lab6.setBounds(66, 66, 60, 60);

        lab7.setBackground(new java.awt.Color(204, 204, 255));
        lab7.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab7.setForeground(new java.awt.Color(102, 0, 0));
        lab7.setText("7");
        lab7.setAlignmentY(0.28F);
        lab7.setMaximumSize(new java.awt.Dimension(60, 60));
        lab7.setMinimumSize(new java.awt.Dimension(60, 60));
        lab7.setOpaque(true);
        getContentPane().add(lab7);
        lab7.setBounds(132, 66, 60, 60);

        lab8.setBackground(new java.awt.Color(204, 204, 255));
        lab8.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab8.setForeground(new java.awt.Color(102, 0, 0));
        lab8.setText("8");
        lab8.setAlignmentY(0.28F);
        lab8.setMaximumSize(new java.awt.Dimension(60, 60));
        lab8.setMinimumSize(new java.awt.Dimension(60, 60));
        lab8.setOpaque(true);
        getContentPane().add(lab8);
        lab8.setBounds(198, 66, 60, 60);

        lab9.setBackground(new java.awt.Color(204, 204, 255));
        lab9.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab9.setForeground(new java.awt.Color(102, 0, 0));
        lab9.setText("9");
        lab9.setAlignmentY(0.28F);
        lab9.setMaximumSize(new java.awt.Dimension(60, 60));
        lab9.setMinimumSize(new java.awt.Dimension(60, 60));
        lab9.setOpaque(true);
        getContentPane().add(lab9);
        lab9.setBounds(264, 66, 60, 60);

        lab11.setBackground(new java.awt.Color(204, 204, 255));
        lab11.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab11.setForeground(new java.awt.Color(102, 0, 0));
        lab11.setText("11");
        lab11.setAlignmentY(0.28F);
        lab11.setMaximumSize(new java.awt.Dimension(60, 60));
        lab11.setMinimumSize(new java.awt.Dimension(60, 60));
        lab11.setOpaque(true);
        getContentPane().add(lab11);
        lab11.setBounds(66, 132, 60, 60);

        lab12.setBackground(new java.awt.Color(204, 204, 255));
        lab12.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab12.setForeground(new java.awt.Color(102, 0, 0));
        lab12.setText("12");
        lab12.setAlignmentY(0.28F);
        lab12.setMaximumSize(new java.awt.Dimension(60, 60));
        lab12.setMinimumSize(new java.awt.Dimension(60, 60));
        lab12.setOpaque(true);
        getContentPane().add(lab12);
        lab12.setBounds(132, 132, 60, 60);

        lab13.setBackground(new java.awt.Color(204, 204, 255));
        lab13.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab13.setForeground(new java.awt.Color(102, 0, 0));
        lab13.setText("13");
        lab13.setAlignmentY(0.28F);
        lab13.setMaximumSize(new java.awt.Dimension(60, 60));
        lab13.setMinimumSize(new java.awt.Dimension(60, 60));
        lab13.setOpaque(true);
        getContentPane().add(lab13);
        lab13.setBounds(198, 132, 60, 60);

        lab14.setBackground(new java.awt.Color(204, 204, 255));
        lab14.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab14.setForeground(new java.awt.Color(102, 0, 0));
        lab14.setText("14");
        lab14.setAlignmentY(0.28F);
        lab14.setMaximumSize(new java.awt.Dimension(60, 60));
        lab14.setMinimumSize(new java.awt.Dimension(60, 60));
        lab14.setOpaque(true);
        getContentPane().add(lab14);
        lab14.setBounds(264, 132, 60, 60);

        lab16.setBackground(new java.awt.Color(204, 204, 255));
        lab16.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab16.setForeground(new java.awt.Color(102, 0, 0));
        lab16.setText("16");
        lab16.setAlignmentY(0.28F);
        lab16.setMaximumSize(new java.awt.Dimension(60, 60));
        lab16.setMinimumSize(new java.awt.Dimension(60, 60));
        lab16.setOpaque(true);
        getContentPane().add(lab16);
        lab16.setBounds(66, 198, 60, 60);

        lab17.setBackground(new java.awt.Color(204, 204, 255));
        lab17.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab17.setForeground(new java.awt.Color(102, 0, 0));
        lab17.setText("17");
        lab17.setAlignmentY(0.28F);
        lab17.setMaximumSize(new java.awt.Dimension(60, 60));
        lab17.setMinimumSize(new java.awt.Dimension(60, 60));
        lab17.setOpaque(true);
        getContentPane().add(lab17);
        lab17.setBounds(132, 198, 60, 60);

        lab18.setBackground(new java.awt.Color(204, 204, 255));
        lab18.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab18.setForeground(new java.awt.Color(102, 0, 0));
        lab18.setText("18");
        lab18.setAlignmentY(0.28F);
        lab18.setMaximumSize(new java.awt.Dimension(60, 60));
        lab18.setMinimumSize(new java.awt.Dimension(60, 60));
        lab18.setOpaque(true);
        getContentPane().add(lab18);
        lab18.setBounds(198, 198, 60, 60);

        lab19.setBackground(new java.awt.Color(204, 204, 255));
        lab19.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab19.setForeground(new java.awt.Color(102, 0, 0));
        lab19.setText("19");
        lab19.setAlignmentY(0.28F);
        lab19.setMaximumSize(new java.awt.Dimension(60, 60));
        lab19.setMinimumSize(new java.awt.Dimension(60, 60));
        lab19.setOpaque(true);
        getContentPane().add(lab19);
        lab19.setBounds(264, 198, 60, 60);

        lab21.setBackground(new java.awt.Color(204, 204, 255));
        lab21.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab21.setForeground(new java.awt.Color(102, 0, 0));
        lab21.setText("21");
        lab21.setAlignmentY(0.28F);
        lab21.setMaximumSize(new java.awt.Dimension(60, 60));
        lab21.setMinimumSize(new java.awt.Dimension(60, 60));
        lab21.setOpaque(true);
        getContentPane().add(lab21);
        lab21.setBounds(66, 264, 60, 60);

        lab22.setBackground(new java.awt.Color(204, 204, 255));
        lab22.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab22.setForeground(new java.awt.Color(102, 0, 0));
        lab22.setText("22");
        lab22.setAlignmentY(0.28F);
        lab22.setMaximumSize(new java.awt.Dimension(60, 60));
        lab22.setMinimumSize(new java.awt.Dimension(60, 60));
        lab22.setOpaque(true);
        getContentPane().add(lab22);
        lab22.setBounds(132, 264, 60, 60);

        lab23.setBackground(new java.awt.Color(204, 204, 255));
        lab23.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab23.setForeground(new java.awt.Color(102, 0, 0));
        lab23.setText("23");
        lab23.setAlignmentY(0.28F);
        lab23.setMaximumSize(new java.awt.Dimension(60, 60));
        lab23.setMinimumSize(new java.awt.Dimension(60, 60));
        lab23.setOpaque(true);
        getContentPane().add(lab23);
        lab23.setBounds(198, 264, 60, 60);

        lab24.setBackground(new java.awt.Color(204, 204, 255));
        lab24.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab24.setForeground(new java.awt.Color(102, 0, 0));
        lab24.setText("24");
        lab24.setAlignmentY(0.28F);
        lab24.setMaximumSize(new java.awt.Dimension(60, 60));
        lab24.setMinimumSize(new java.awt.Dimension(60, 60));
        lab24.setOpaque(true);
        getContentPane().add(lab24);
        lab24.setBounds(264, 264, 60, 60);

        lab25.setBackground(new java.awt.Color(204, 204, 255));
        lab25.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab25.setForeground(new java.awt.Color(102, 0, 0));
        lab25.setText("25");
        lab25.setAlignmentY(0.28F);
        lab25.setMaximumSize(new java.awt.Dimension(60, 60));
        lab25.setMinimumSize(new java.awt.Dimension(60, 60));
        lab25.setOpaque(true);
        getContentPane().add(lab25);
        lab25.setBounds(0, 330, 60, 60);

        lab26.setBackground(new java.awt.Color(204, 204, 255));
        lab26.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab26.setForeground(new java.awt.Color(102, 0, 0));
        lab26.setText("26");
        lab26.setAlignmentY(0.28F);
        lab26.setMaximumSize(new java.awt.Dimension(60, 60));
        lab26.setMinimumSize(new java.awt.Dimension(60, 60));
        lab26.setOpaque(true);
        getContentPane().add(lab26);
        lab26.setBounds(66, 330, 60, 60);

        lab27.setBackground(new java.awt.Color(204, 204, 255));
        lab27.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab27.setForeground(new java.awt.Color(102, 0, 0));
        lab27.setText("27");
        lab27.setAlignmentY(0.28F);
        lab27.setMaximumSize(new java.awt.Dimension(60, 60));
        lab27.setMinimumSize(new java.awt.Dimension(60, 60));
        lab27.setOpaque(true);
        getContentPane().add(lab27);
        lab27.setBounds(132, 330, 60, 60);

        lab28.setBackground(new java.awt.Color(204, 204, 255));
        lab28.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab28.setForeground(new java.awt.Color(102, 0, 0));
        lab28.setText("28");
        lab28.setAlignmentY(0.28F);
        lab28.setMaximumSize(new java.awt.Dimension(60, 60));
        lab28.setMinimumSize(new java.awt.Dimension(60, 60));
        lab28.setOpaque(true);
        getContentPane().add(lab28);
        lab28.setBounds(198, 330, 60, 60);

        lab29.setBackground(new java.awt.Color(204, 204, 255));
        lab29.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab29.setForeground(new java.awt.Color(102, 0, 0));
        lab29.setText("29");
        lab29.setAlignmentY(0.28F);
        lab29.setMaximumSize(new java.awt.Dimension(60, 60));
        lab29.setMinimumSize(new java.awt.Dimension(60, 60));
        lab29.setOpaque(true);
        getContentPane().add(lab29);
        lab29.setBounds(264, 330, 60, 60);

        lab30.setBackground(new java.awt.Color(204, 204, 255));
        lab30.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab30.setForeground(new java.awt.Color(102, 0, 0));
        lab30.setText("30");
        lab30.setAlignmentY(0.28F);
        lab30.setMaximumSize(new java.awt.Dimension(60, 60));
        lab30.setMinimumSize(new java.awt.Dimension(60, 60));
        lab30.setOpaque(true);
        getContentPane().add(lab30);
        lab30.setBounds(0, 396, 60, 60);

        lab31.setBackground(new java.awt.Color(204, 204, 255));
        lab31.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab31.setForeground(new java.awt.Color(102, 0, 0));
        lab31.setText("31");
        lab31.setAlignmentY(0.28F);
        lab31.setMaximumSize(new java.awt.Dimension(60, 60));
        lab31.setMinimumSize(new java.awt.Dimension(60, 60));
        lab31.setOpaque(true);
        getContentPane().add(lab31);
        lab31.setBounds(66, 396, 60, 60);

        lab32.setBackground(new java.awt.Color(204, 204, 255));
        lab32.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab32.setForeground(new java.awt.Color(102, 0, 0));
        lab32.setText("32");
        lab32.setAlignmentY(0.28F);
        lab32.setMaximumSize(new java.awt.Dimension(60, 60));
        lab32.setMinimumSize(new java.awt.Dimension(60, 60));
        lab32.setOpaque(true);
        getContentPane().add(lab32);
        lab32.setBounds(132, 396, 60, 60);

        lab33.setBackground(new java.awt.Color(204, 204, 255));
        lab33.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab33.setForeground(new java.awt.Color(102, 0, 0));
        lab33.setText("33");
        lab33.setAlignmentY(0.28F);
        lab33.setMaximumSize(new java.awt.Dimension(60, 60));
        lab33.setMinimumSize(new java.awt.Dimension(60, 60));
        lab33.setOpaque(true);
        getContentPane().add(lab33);
        lab33.setBounds(198, 396, 60, 60);

        lab34.setBackground(new java.awt.Color(204, 204, 255));
        lab34.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab34.setForeground(new java.awt.Color(102, 0, 0));
        lab34.setText("34");
        lab34.setAlignmentY(0.28F);
        lab34.setMaximumSize(new java.awt.Dimension(60, 60));
        lab34.setMinimumSize(new java.awt.Dimension(60, 60));
        lab34.setOpaque(true);
        getContentPane().add(lab34);
        lab34.setBounds(264, 396, 60, 60);

        lab35.setBackground(new java.awt.Color(204, 204, 255));
        lab35.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab35.setForeground(new java.awt.Color(102, 0, 0));
        lab35.setText("35");
        lab35.setAlignmentY(0.28F);
        lab35.setMaximumSize(new java.awt.Dimension(60, 60));
        lab35.setMinimumSize(new java.awt.Dimension(60, 60));
        lab35.setOpaque(true);
        getContentPane().add(lab35);
        lab35.setBounds(0, 462, 60, 60);

        lab36.setBackground(new java.awt.Color(204, 204, 255));
        lab36.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab36.setForeground(new java.awt.Color(102, 0, 0));
        lab36.setText("36");
        lab36.setAlignmentY(0.28F);
        lab36.setMaximumSize(new java.awt.Dimension(60, 60));
        lab36.setMinimumSize(new java.awt.Dimension(60, 60));
        lab36.setOpaque(true);
        getContentPane().add(lab36);
        lab36.setBounds(66, 462, 60, 60);

        lab37.setBackground(new java.awt.Color(204, 204, 255));
        lab37.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab37.setForeground(new java.awt.Color(102, 0, 0));
        lab37.setText("37");
        lab37.setAlignmentY(0.28F);
        lab37.setMaximumSize(new java.awt.Dimension(60, 60));
        lab37.setMinimumSize(new java.awt.Dimension(60, 60));
        lab37.setOpaque(true);
        getContentPane().add(lab37);
        lab37.setBounds(132, 462, 60, 60);

        lab38.setBackground(new java.awt.Color(204, 204, 255));
        lab38.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab38.setForeground(new java.awt.Color(102, 0, 0));
        lab38.setText("38");
        lab38.setAlignmentY(0.28F);
        lab38.setMaximumSize(new java.awt.Dimension(60, 60));
        lab38.setMinimumSize(new java.awt.Dimension(60, 60));
        lab38.setOpaque(true);
        getContentPane().add(lab38);
        lab38.setBounds(198, 462, 60, 60);

        labf.setBackground(new java.awt.Color(204, 204, 255));
        labf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labf.setText(" META");
        labf.setMaximumSize(new java.awt.Dimension(60, 60));
        labf.setMinimumSize(new java.awt.Dimension(60, 60));
        labf.setOpaque(true);
        getContentPane().add(labf);
        labf.setBounds(264, 462, 60, 60);

        lab5.setBackground(new java.awt.Color(204, 204, 255));
        lab5.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab5.setForeground(new java.awt.Color(102, 0, 0));
        lab5.setText("5");
        lab5.setAlignmentY(0.0F);
        lab5.setMaximumSize(new java.awt.Dimension(60, 60));
        lab5.setMinimumSize(new java.awt.Dimension(60, 60));
        lab5.setOpaque(true);
        getContentPane().add(lab5);
        lab5.setBounds(0, 66, 60, 60);

        lab10.setBackground(new java.awt.Color(204, 204, 255));
        lab10.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab10.setForeground(new java.awt.Color(102, 0, 0));
        lab10.setText("10");
        lab10.setAlignmentY(0.0F);
        lab10.setMaximumSize(new java.awt.Dimension(60, 60));
        lab10.setMinimumSize(new java.awt.Dimension(60, 60));
        lab10.setOpaque(true);
        getContentPane().add(lab10);
        lab10.setBounds(0, 132, 60, 60);

        lab15.setBackground(new java.awt.Color(204, 204, 255));
        lab15.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab15.setForeground(new java.awt.Color(102, 0, 0));
        lab15.setText("15");
        lab15.setAlignmentY(0.0F);
        lab15.setMaximumSize(new java.awt.Dimension(60, 60));
        lab15.setMinimumSize(new java.awt.Dimension(60, 60));
        lab15.setOpaque(true);
        getContentPane().add(lab15);
        lab15.setBounds(0, 198, 60, 60);

        lab20.setBackground(new java.awt.Color(204, 204, 255));
        lab20.setFont(new java.awt.Font("Arial", 1, 9)); // NOI18N
        lab20.setForeground(new java.awt.Color(102, 0, 0));
        lab20.setText("20");
        lab20.setAlignmentY(0.28F);
        lab20.setMaximumSize(new java.awt.Dimension(60, 60));
        lab20.setMinimumSize(new java.awt.Dimension(60, 60));
        lab20.setOpaque(true);
        getContentPane().add(lab20);
        lab20.setBounds(0, 264, 60, 60);

        labin.setBackground(new java.awt.Color(204, 204, 255));
        labin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labin.setText("  INICIO");
        labin.setAlignmentY(0.0F);
        labin.setOpaque(true);
        labin.setPreferredSize(new java.awt.Dimension(60, 60));
        getContentPane().add(labin);
        labin.setBounds(0, 0, 60, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PTS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 50, 24, 30);

        la1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(la1);
        la1.setBounds(350, 80, 30, 40);

        bw.setText("Menu");
        bw.setFocusable(false);
        bw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bwActionPerformed(evt);
            }
        });
        getContentPane().add(bw);
        bw.setBounds(340, 10, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        //with this when you press the boton this method has all the logic to produce points and more things to make this possible
        int derecha = lab.getX();
        int izquierda = lab.getY();
        labin.setBackground(Color.BLUE);

        if (evt.getKeyChar() == 'd') {
            if (derecha == 264) {

            } else {

                pregunta();
                if (re == true) {

                    derecha += 66;
                    con += 1;

                    eli2();
                    lab.setLocation(derecha, izquierda);
                    eli();
                }
                if (re == false) {

                    JOptionPane.showMessageDialog(null, "Has Fallado!!", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
                    con -= 1;
                    crear();
                    lab.setLocation(derecha, izquierda);
                }
            }

        }

        if (evt.getKeyChar() == 's') {

            if (izquierda == 462) {

            } else {
                //   bot_izq += 1;
                pregunta();
                if (re == true) {

                    izquierda += 66;
                    con += 1;

                    eli2();
                    lab.setLocation(derecha, izquierda);
                    eli();
                }
                if (re == false) {

                    JOptionPane.showMessageDialog(null, "Has Fallado!!", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
                    con -= 1;
                    crear();
                    lab.setLocation(derecha, izquierda);
                }

            }
        }

        if (evt.getKeyChar() == 'a') {
            if (derecha == 0) {

            } else {
                //    bot_der -= 1;
                pregunta();
                if (re == true) {

                    derecha -= 66;
                    con += 1;

                    eli2();
                    lab.setLocation(derecha, izquierda);
                    eli();
                }
                if (re == false) {

                    JOptionPane.showMessageDialog(null, "Has Fallado!!", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
                    con -= 1;
                    crear();
                    lab.setLocation(derecha, izquierda);
                }
            }
        }
        if (evt.getKeyChar() == 'w') {

            if (izquierda == 0) {

            } else {

                pregunta();
                if (re == true) {

                    izquierda -= 66;
                    con += 1;

                    eli2();
                    lab.setLocation(derecha, izquierda);
                    eli();

                }
                if (re == false) {

                    JOptionPane.showMessageDialog(null, "Has Fallado!!", "Mensaje", JOptionPane.OK_CANCEL_OPTION);
                    con -= 1;
                    crear();
                    lab.setLocation(derecha, izquierda);
                }
            }

        }

        la1.setText("" + con);
        if (derecha == 264 & izquierda == 462 & con >= 3) {
            JOptionPane.showMessageDialog(null, "HAS GANADO", "Mensaje", JOptionPane.OK_OPTION);
            new menu().setVisible(true);
            this.setVisible(false);
        }
        if (derecha == 264 & izquierda == 462 & con <= 3) {
            JOptionPane.showMessageDialog(null, "HAS PERDIDO", "Mensaje", JOptionPane.OK_OPTION);
            new menu().setVisible(true);
            this.setVisible(false);
        }
        if (derecha == 66 & izquierda == 0) {//fila0
            lab1.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 0) {//fila0
            lab2.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 0) {//fila0
            lab3.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 0) {//fila0
            lab4.setBackground(Color.BLUE);
        }

        if (derecha == 0 & izquierda == 66) {//fila1
            lab5.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 66) {//fila1
            lab6.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 66) {//fila1
            lab7.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 66) {//fila1
            lab8.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 66) {//fila1
            lab9.setBackground(Color.BLUE);
        }
        if (derecha == 0 & izquierda == 132) {//fila2
            lab10.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 132) {//fila2
            lab11.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 132) {//fila2
            lab12.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 132) {//fila2
            lab13.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 132) {//fila2
            lab14.setBackground(Color.BLUE);
        }
        if (derecha == 0 & izquierda == 198) {//fila3
            lab15.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 198) {//fila3
            lab16.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 198) {//fila3
            lab17.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 198) {//fila3
            lab18.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 198) {//fila3
            lab19.setBackground(Color.BLUE);
        }
        if (derecha == 0 & izquierda == 264) {//fila4
            lab20.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 264) {//fila4
            lab21.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 264) {//fila4
            lab22.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 264) {//fila4
            lab23.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 264) {//fila4
            lab24.setBackground(Color.BLUE);
        }
        if (derecha == 0 & izquierda == 330) {//fila5
            lab25.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 330) {//fila5
            lab26.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 330) {//fila5
            lab27.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 330) {//fila5
            lab28.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 330) {//fila5
            lab29.setBackground(Color.BLUE);
        }
        if (derecha == 0 & izquierda == 396) {//fila6
            lab30.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 396) {//fila6
            lab31.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 396) {//fila6
            lab32.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 396) {//fila6
            lab33.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 396) {//fila6
            lab34.setBackground(Color.BLUE);
        }
        if (derecha == 0 & izquierda == 462) {//fila7
            lab35.setBackground(Color.BLUE);
        }
        if (derecha == 66 & izquierda == 462) {//fila7
            lab36.setBackground(Color.BLUE);
        }
        if (derecha == 132 & izquierda == 462) {//fila7
            lab37.setBackground(Color.BLUE);
        }
        if (derecha == 198 & izquierda == 462) {//fila7
            lab38.setBackground(Color.BLUE);
        }
        if (derecha == 264 & izquierda == 462) {//fila7
            labf.setBackground(Color.BLUE);
        }

    }//GEN-LAST:event_formKeyPressed

    private void bwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bwActionPerformed
       //this button is gonna take you back to the menu
        new menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bwActionPerformed

    public void eli() {
        //this method will let you know when you already lost
        if (lab1.getIcon() == obs & lab.getX() == 66 & lab.getY() == 0) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab2.getIcon() == obs & lab.getX() == 132 & lab.getY() == 0) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab3.getIcon() == obs & lab.getX() == 198 & lab.getY() == 0) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab4.getIcon() == obs & lab.getX() == 264 & lab.getY() == 0) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab5.getIcon() == obs & lab.getX() == 0 & lab.getY() == 66) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab6.getIcon() == obs & lab.getX() == 66 & lab.getY() == 66) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab7.getIcon() == obs & lab.getX() == 132 & lab.getY() == 66) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab8.getIcon() == obs & lab.getX() == 198 & lab.getY() == 66) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab9.getIcon() == obs & lab.getX() == 264 & lab.getY() == 66) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab10.getIcon() == obs & lab.getX() == 0 & lab.getY() == 132) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
         if (lab11.getIcon() == obs & lab.getX() == 66 & lab.getY() == 132) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab12.getIcon() == obs & lab.getX() == 132 & lab.getY() == 132) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab13.getIcon() == obs & lab.getX() == 198 & lab.getY() == 132) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab14.getIcon() == obs & lab.getX() == 264 & lab.getY() == 132) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab15.getIcon() == obs & lab.getX() == 0 & lab.getY() == 198) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab16.getIcon() == obs & lab.getX() == 66 & lab.getY() == 198) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab17.getIcon() == obs & lab.getX() == 132 & lab.getY() == 198) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab18.getIcon() == obs & lab.getX() == 198 & lab.getY() == 198) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab19.getIcon() == obs & lab.getX() == 264 & lab.getY() == 198) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab20.getIcon() == obs & lab.getX() == 0 & lab.getY() == 264) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab21.getIcon() == obs & lab.getX() == 66 & lab.getY() == 264) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab22.getIcon() == obs & lab.getX() == 132 & lab.getY() == 264) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab23.getIcon() == obs & lab.getX() == 198 & lab.getY() == 264) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab24.getIcon() == obs & lab.getX() == 264 & lab.getY() == 264) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);

        }
        if (lab25.getIcon() == obs & lab.getX() == 0 & lab.getY() == 330) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab26.getIcon() == obs & lab.getX() == 66 & lab.getY() == 330) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab27.getIcon() == obs & lab.getX() == 132 & lab.getY() == 330) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab28.getIcon() == obs & lab.getX() == 198 & lab.getY() == 330) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab29.getIcon() == obs & lab.getX() == 264 & lab.getY() == 330) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab30.getIcon() == obs & lab.getX() == 0 & lab.getY() == 396) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab31.getIcon() == obs & lab.getX() == 66 & lab.getY() == 396) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab32.getIcon() == obs & lab.getX() == 132 & lab.getY() == 396) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab33.getIcon() == obs & lab.getX() == 198 & lab.getY() == 396) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab34.getIcon() == obs & lab.getX() == 264 & lab.getY() == 396) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab35.getIcon() == obs & lab.getX() == 0 & lab.getY() == 432) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab36.getIcon() == obs & lab.getX() == 66 & lab.getY() == 432) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab37.getIcon() == obs & lab.getX() == 132 & lab.getY() == 432) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }
        if (lab38.getIcon() == obs & lab.getX() == 198 & lab.getY() == 432) {
            JOptionPane.showMessageDialog(null, "Has Perdido!!");
            new Mov();
            this.setVisible(false);
        }

    }

    public void eli2() {
        //this method will eliminate all bombs or mines that the game has
        String nu = JOptionPane.showInputDialog(null, "Ingrese El numero de Obstaculo que desea Eliminar o El Comodin\nADVERTENCIA SI INGRESA UN NUMERO QUE NO ES OBSTACULO PIERDES LA OPORTUNIDAD");
        if (nu.equals("2") & re == true) {

            lab2.setIcon(preg);
            matriz1[0][2] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("3") & re == true) {

            lab3.setIcon(preg);
            matriz1[0][3] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("4") & re == true) {

            lab4.setIcon(preg);
            matriz1[0][4] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("5") & re == true) {

            lab5.setIcon(preg);
            matriz1[1][0] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("6") & re == true) {

            lab6.setIcon(preg);
            matriz1[1][1] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("7") & re == true) {

            lab7.setIcon(preg);
            matriz1[1][2] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("8") & re == true) {

            lab8.setIcon(preg);
            matriz1[1][3] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("9") & re == true) {

            lab9.setIcon(preg);
            matriz1[1][4] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("10") & re == true) {
            lab.getIcon();
            lab10.setIcon(preg);
            matriz1[2][0] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("11") & re == true) {
            lab.getIcon();
            lab11.setIcon(preg);
            matriz1[2][1] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("12") & re == true) {
            lab.getIcon();
            lab12.setIcon(preg);
            matriz1[2][2] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("13") & re == true) {
            lab.getIcon();
            lab13.setIcon(preg);
            matriz1[2][3] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("14") & re == true) {
            lab.getIcon();
            lab14.setIcon(preg);
            matriz1[2][4] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("15") & re == true) {
            lab.getIcon();
            lab15.setIcon(preg);
            matriz1[3][0] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("16") & re == true) {
            lab.getIcon();
            lab16.setIcon(preg);
            matriz1[3][1] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("17") & re == true) {
            lab.getIcon();
            lab17.setIcon(preg);
            matriz1[3][2] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("18") & re == true) {
            lab.getIcon();
            lab18.setIcon(preg);
            matriz1[3][3] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("19") & re == true) {
            lab.getIcon();
            lab19.setIcon(preg);
            matriz1[3][4] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("20") & re == true) {
            lab.getIcon();
            lab20.setIcon(preg);
            matriz1[4][0] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("21") & re == true) {
            lab.getIcon();
            lab21.setIcon(preg);
            matriz1[4][1] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("22") & re == true) {
            lab.getIcon();
            JOptionPane.showMessageDialog(null, "Ingrese Numeros del 1 al 9 en los 3 Diferentes Campos");
            cajafuerte c = new cajafuerte();
            c.setVisible(true);
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("23") & re == true) {
            lab.getIcon();
            lab23.setIcon(preg);
            matriz1[4][3] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("24") & re == true) {
            lab.getIcon();
            lab24.setIcon(preg);
            matriz1[4][4] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("25") & re == true) {
            lab.getIcon();
            lab25.setIcon(preg);
            matriz1[5][0] = 0;

            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("26") & re == true) {
            lab.getIcon();
            lab26.setIcon(preg);
            matriz1[5][1] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("27") & re == true) {
            lab.getIcon();
            lab27.setIcon(preg);
            matriz1[5][2] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("28") & re == true) {
            lab.getIcon();
            lab28.setIcon(preg);
            matriz1[5][3] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("29") & re == true) {
            lab.getIcon();
            lab29.setIcon(preg);
            matriz1[5][4] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("30") & re == true) {
            lab.getIcon();
            lab30.setIcon(preg);
            matriz1[6][0] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("31") & re == true) {
            lab.getIcon();
            lab31.setIcon(preg);
            matriz1[6][1] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("32") & re == true) {
            lab.getIcon();
            lab32.setIcon(preg);
            matriz1[6][2] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("33") & re == true) {
            lab.getIcon();
            lab33.setIcon(preg);
            matriz1[6][3] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("34") & re == true) {
            lab.getIcon();
            lab34.setIcon(preg);
            matriz1[6][4] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("35") & re == true) {
            lab.getIcon();
            lab35.setIcon(preg);
            matriz1[7][0] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }
        if (nu.equals("37") & re == true) {
            lab.getIcon();
            lab37.setIcon(preg);
            matriz1[7][1] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }

        if (nu.equals("38") & re == true) {
            lab.getIcon();
            lab38.setIcon(preg);
            matriz1[7][2] = 0;
            for (int p = 0; p < lista.size(); p++) {
                if (lista.get(p) == Integer.parseInt(nu)) {
                    lista.remove(p);

                }

            }

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mov().setVisible(true);
            }
        });
    }

    public static void pregunta() {
        //this method contains all the questions and the answers that you need to answer
        String[] pre = {"Una variable puede ser nula?", "Una variable String puede ser convertida a int?", "Una variable Int puede ser convertida a String?", "Una variable String puede ser convertida a double?",
            "Una variable puede ser utilizada en otra clase si es privated?", "Una variable public se puede utulizar en otros metodos?", "Una variable protected puede ser modificada en otra clase?", "Una variable declarada public static es global?", "Una instancia es una variable?",
            "Una instancia es una clase aparte?", "new clase(); es una instancia?", "Una variable int puede tener decimales?", "Se pueden sumar variables String?", "Una variable double puede tener numeros enteros?",
            "Una variable long puede contener numeros de gran rango?", "Una interfaz grafica puede realizarse a codigo manual?", "Se puede caer un programa cuando un ciclo de iteracion se encicla ?", "Un caracter es lo mismo que una cadena de texto?",
            "Los archivos almacenan informacion permanente?", "Las matrices almacenan todo tipo de dato?", "Las ArrayList tienen limites definidos?", "Las Listas tienen limited definidos?", "El println imprime de la misma forma que el print?",
            "El /n hace lo mismo que el System.LineSeparetor()?", "El /n hace lo mismo que el  /r/n ?", "El % significa 'porciento'?", "En java se concatena con +?", "Se pueden sumar metodos de diferentes tipo?",
            "Se puede retornar una variable en un metodo void?", "Format sirve para ordenar el codigo?", "Java es orientado a objetos?", "Una clase sin MAIN puede correr programas?", "Una forma de establecer el MAIN m�s rapido es escribiendo psvm?",
            "Para establecer el System.out.println mas rapido es escribiendo sout?", "Para elevar una potencia en programacion se utiliza ^ ?", "Para cerrar una declaracion de cualquier tipo en java se utiliza {}?", "Se puede declarar una variable de cualquier tipo NULL?",
            "Se puede declarar un metodo int con parametros String?", "Para ingresar informacion desde el teclado se utiliza la Clase Scanner?", "El BufferedReader se utiliza para la lectura de archivos?",};

        String[] res = {"v", "v", "v", "f", "f", "v", "f", "v", "f", "f", "v", "f", "f", "f", "v", "v", "v", "f", "v", "f", "f", "v", "f", "v", "v", "f", "v", "f", "f", "v", "v", "f", "v", "v", "v", "v", "v", "v", "v", "v"};
        Object unComponentePadre = null;
        Object unIcono = null;
        int numero = (int) (Math.random() * 40);
        String preg = pre[numero];
        int sele = JOptionPane.showOptionDialog((Component) unComponentePadre, preg, "Pregunta", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, (Icon) unIcono, new Object[]{"Falso", "Verdadero"}, // null para YES, NO y CANCEL
                "opcion 1");
        int suma = sele + 1;
        String a = "v";
        String b = "f";
        re = false;
        if (sele != -1) {

            if (suma == 2 & res[numero].equals(a)) {
                re = true;

            }
            if (suma == 1 & res[numero].equals(b)) {
                re = true;

            }

        }

    }

    public void crear() {
        // this method creats the matriz for the game and puts the questions and the bombs in different places
        for (int i = 1; i < 2; i++) {
            int numero = (int) (Math.random() * 37 + 2);
            if (numero == 22) {
                while (true) {
                    numero = (int) (Math.random() * 37 + 2);
                    if (numero == 22) {
                        numero = (int) (Math.random() * 37 + 2);
                    } else {
                        break;
                    }
                }
            }
            if (lista.contains(numero)) {
                i--;
            } else {
                lista.add(numero);
            }
        }

        for (int u = 0; u < matriz.length; u++) {
            for (int y = 0; y < matriz[u].length; y++) {
                for (int z = 0; z < lista.size(); z++) {
                    if (lista.get(z) == matriz[u][y]) {
                        matriz1[u][y] = 1;
                    }

                }
            }
            matriz1[4][2] = 3;

        }
        if (matriz1[0][1] == 0) {
            lab1.setIcon(preg);

        } else {
            lab1.setIcon(obs);
        }
        if (matriz1[0][2] == 0) {
            lab2.setIcon(preg);
        } else {
            lab2.setIcon(obs);
        }
        if (matriz1[0][3] == 0) {
            lab3.setIcon(preg);
        } else {
            lab3.setIcon(obs);
        }
        if (matriz1[0][4] == 0) {
            lab4.setIcon(preg);
        } else {
            lab4.setIcon(obs);
        }
        if (matriz1[1][0] == 0) {
            lab5.setIcon(preg);

        } else {
            lab5.setIcon(obs);
        }
        if (matriz1[1][1] == 0) {
            lab6.setIcon(preg);

        } else {
            lab6.setIcon(obs);
        }
        if (matriz1[1][2] == 0) {
            lab7.setIcon(preg);

        } else {
            lab7.setIcon(obs);
        }
        if (matriz1[1][3] == 0) {
            lab8.setIcon(preg);

        } else {
            lab8.setIcon(obs);
        }
        if (matriz1[1][4] == 0) {
            lab9.setIcon(preg);

        } else {
            lab9.setIcon(obs);
        }
        if (matriz1[2][0] == 0) {
            lab10.setIcon(preg);

        } else {
            lab10.setIcon(obs);
        }
        if (matriz1[2][1] == 0) {
            lab11.setIcon(preg);

        } else {
            lab11.setIcon(obs);
        }
        if (matriz1[2][2] == 0) {
            lab12.setIcon(preg);

        } else {
            lab12.setIcon(obs);
        }
        if (matriz1[2][3] == 0) {
            lab13.setIcon(preg);

        } else {
            lab13.setIcon(obs);
        }
        if (matriz1[2][4] == 0) {
            lab14.setIcon(preg);

        } else {
            lab14.setIcon(obs);
        }
        if (matriz1[3][0] == 0) {
            lab15.setIcon(preg);

        } else {
            lab15.setIcon(obs);
        }
        if (matriz1[3][1] == 0) {
            lab16.setIcon(preg);

        } else {
            lab16.setIcon(obs);
        }
        if (matriz1[3][2] == 0) {
            lab17.setIcon(preg);

        } else {
            lab17.setIcon(obs);
        }
        if (matriz1[3][3] == 0) {
            lab18.setIcon(preg);

        } else {
            lab18.setIcon(obs);
        }
        if (matriz1[3][4] == 0) {
            lab19.setIcon(preg);

        } else {
            lab19.setIcon(obs);
        }
        if (matriz1[4][0] == 0) {
            lab20.setIcon(preg);

        } else {
            lab20.setIcon(obs);
        }
        if (matriz1[4][1] == 0) {
            lab21.setIcon(preg);

        } else {
            lab21.setIcon(obs);
        }
        if (matriz1[4][2] == 3) {
            lab22.setIcon(com);

        } else {
            lab22.setIcon(com);
        }
        if (matriz1[4][3] == 0) {
            lab23.setIcon(preg);

        } else {
            lab23.setIcon(obs);
        }
        if (matriz1[4][4] == 0) {
            lab24.setIcon(preg);
        } else {
            lab24.setIcon(obs);
        }
        if (matriz1[5][0] == 0) {
            lab25.setIcon(preg);

        } else {
            lab25.setIcon(obs);
        }
        if (matriz1[5][1] == 0) {
            lab26.setIcon(preg);

        } else {
            lab26.setIcon(obs);
        }
        if (matriz1[5][2] == 0) {
            lab27.setIcon(preg);

        } else {
            lab27.setIcon(obs);
        }
        if (matriz1[5][3] == 0) {
            lab28.setIcon(preg);

        } else {
            lab28.setIcon(obs);
        }
        if (matriz1[5][4] == 0) {
            lab29.setIcon(preg);
        } else {
            lab29.setIcon(obs);
        }
        if (matriz1[6][0] == 0) {
            lab30.setIcon(preg);

        } else {
            lab30.setIcon(obs);
        }
        if (matriz1[6][1] == 0) {
            lab31.setIcon(preg);

        } else {
            lab31.setIcon(obs);
        }
        if (matriz1[6][2] == 0) {
            lab32.setIcon(preg);

        } else {
            lab32.setIcon(obs);
        }
        if (matriz1[6][3] == 0) {
            lab33.setIcon(preg);

        } else {
            lab33.setIcon(obs);
        }
        if (matriz1[6][4] == 0) {
            lab34.setIcon(preg);
        } else {
            lab34.setIcon(obs);
        }
        if (matriz1[7][0] == 0) {
            lab35.setIcon(preg);

        } else {
            lab35.setIcon(obs);
        }
        if (matriz1[7][1] == 0) {
            lab36.setIcon(preg);

        } else {
            lab36.setIcon(obs);
        }
        if (matriz1[7][2] == 0) {
            lab37.setIcon(preg);

        } else {
            lab37.setIcon(obs);
        }
        if (matriz1[7][3] == 0) {
            lab38.setIcon(preg);

        } else {
            lab38.setIcon(obs);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel la1;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab10;
    private javax.swing.JLabel lab11;
    private javax.swing.JLabel lab12;
    private javax.swing.JLabel lab13;
    private javax.swing.JLabel lab14;
    private javax.swing.JLabel lab15;
    private javax.swing.JLabel lab16;
    private javax.swing.JLabel lab17;
    private javax.swing.JLabel lab18;
    private javax.swing.JLabel lab19;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab20;
    private javax.swing.JLabel lab21;
    private javax.swing.JLabel lab22;
    private javax.swing.JLabel lab23;
    private javax.swing.JLabel lab24;
    private javax.swing.JLabel lab25;
    private javax.swing.JLabel lab26;
    private javax.swing.JLabel lab27;
    private javax.swing.JLabel lab28;
    private javax.swing.JLabel lab29;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab30;
    private javax.swing.JLabel lab31;
    private javax.swing.JLabel lab32;
    private javax.swing.JLabel lab33;
    private javax.swing.JLabel lab34;
    private javax.swing.JLabel lab35;
    private javax.swing.JLabel lab36;
    private javax.swing.JLabel lab37;
    private javax.swing.JLabel lab38;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel labf;
    private javax.swing.JLabel labin;
    // End of variables declaration//GEN-END:variables
}
