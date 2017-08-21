package juego_1;
// here we crate practically the panel for you to see the athletichs 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import juego_1.crono;
import static juego_1.interfaz_1.re;
import static juego_1.interfaz_1.t11;
import static juego_1.interfaz_1.t22;
import static juego_1.interfaz_1.t33;
import static juego_1.interfaz_1.t44;
import static juego_1.interfaz_1.t55;
import juego_1.objetos;

public class panel extends JPanel {

    //instance to the persona in the position(X,Y) => (0,0)
    int limite_derecha;
    protected objetos persona1 = new objetos(0, 15);
    protected objetos persona2 = new objetos(0, 115);
    protected objetos persona3 = new objetos(0, 220);
    protected objetos persona4 = new objetos(0, 315);
    protected objetos persona5 = new objetos(0, 420);
    protected Timer timer;
    crono c = new crono();
    int x1;
    int x2;
    int x3;
    int x4;
    int x5;

    boolean x1_1 = false;
    boolean x2_2 = false;
    boolean x3_3 = false;
    boolean x4_4 = false;
    boolean x5_5 = false;
    public static int v;
    public static int v2;
    public static int v3;
    public static int v4;
    public static int v5;
    public static boolean ce;
    public static boolean t;
    public static boolean t2;
    public static boolean t3;
    public static boolean t4;
    public static boolean t5;
    public static int c1 = 0;
    public static int c2 = 0;
    public static int c3 = 0;
    public static int c4 = 0;
    public static int c5 = 0;
    public static int e1 = 0;
    public static int c12 = 0;
    public static int c23 = 0;
    public static int c34 = 0;
    public static int c45 = 0;
    public static int c56 = 0;

    //Constructor
    public panel(Dimension d) {

        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBackground(new Color(0, 200, 234));
        persona1.LimitesX(getWidth());
        persona2.LimitesX(getWidth());
        persona3.LimitesX(getWidth());
        persona4.LimitesX(getWidth());
        persona5.LimitesX(getWidth());
        int a = v;

        timer = new Timer(16, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[] list = new int[5];

                v = persona1.vel();

                v2 = persona2.vel();
                v3 = persona3.vel();
                v4 = persona4.vel();
                v5 = persona5.vel();

                x1 = persona1.mover();
                if (x1 == 0) {
                    x1_1 = true;
                }

                if (x1 == persona1.LimitesX(getWidth())) {
                    x1_1 = true;

                }

                x2 = persona2.mover();
                if (x2 == 0) {
                    x2_2 = true;
                }

                if (x2 == persona2.LimitesX(getWidth())) {
                    x2_2 = true;

                }
                x3 = persona3.mover();
                if (x3 == 0) {
                    x3_3 = true;
                }

                if (x3 == persona3.LimitesX(getWidth())) {
                    x3_3 = true;

                }
                x4 = persona4.mover();
                if (x4 == 0) {
                    x4_4 = true;
                }

                if (x4 == persona4.LimitesX(getWidth())) {
                    x4_4 = true;

                }
                x5 = persona5.mover();
                if (x5 == 0) {
                    x5_5 = true;
                }

                if (x5 == persona5.LimitesX(getWidth())) {
                    x5_5 = true;

                }

                repaint();

                if (x1_1 == true & x2_2 == true & x3_3 == true & x4_4 == true & x5_5 == true) {
                    c.jB_pararActionPerformed(e);
                    timer.stop();
                    re.setVisible(true);
                    if (v > v2 & v > v3 & v > v4 & v > v5) {

                        c1 += 1;
                        if (t22 == true) {
                            c23 += 1;
                        }
                        if (t33 == true) {
                            c34 += 1;
                        }
                        if (t44 == true) {
                            c45 += 1;
                        }
                        if (t55 == true) {
                            c56 += 1;
                        }

                    }

                    if (v2 > v & v2 > v3 & v2 > v4 & v2 > v5) {

                        c2 += 1;
                        if (t11 == true) {
                            c12 += 1;
                        }
                        if (t33 == true) {
                            c34 += 1;
                        }
                        if (t44 == true) {
                            c45 += 1;
                        }
                        if (t55 == true) {
                            c56 += 1;
                        }
                    }

                    if (v3 > v2 & v3 > v & v3 > v4 & v3 > v5) {

                        c3 += 1;
                        if (t22 == true) {
                            c23 += 1;
                        }
                        if (t11 == true) {
                            c12 += 1;
                        }
                        if (t44 == true) {
                            c45 += 1;
                        }
                        if (t55 == true) {
                            c56 += 1;
                        }

                    }

                    if (v4 > v2 & v4 > v & v4 > v3 & v4 > v5) {

                        c4 += 1;
                        if (t22 == true) {
                            c23 += 1;
                        }
                        if (t33 == true) {
                            c34 += 1;
                        }
                        if (t11 == true) {
                            c12 += 1;
                        }
                        if (t55 == true) {
                            c56 += 1;
                        }

                    }

                    if (v5 > v2 & v5 > v & v5 > v4 & v5 > v3) {

                        c5 += 1;
                        if (t22 == true) {
                            c23 += 1;
                        }
                        if (t33 == true) {
                            c34 += 1;
                        }
                        if (t44 == true) {
                            c45 += 1;
                        }
                        if (t11 == true) {
                            c12 += 1;
                        }

                    }

                    list[0] = v;
                    list[1] = v2;
                    list[2] = v3;
                    list[3] = v4;
                    list[4] = v5;

                    Arrays.sort(list); // we order them to comparete as we told you
                    Random ra = new Random();
                    int numero = ra.nextInt(2);
                   
                    for (int i = 1; i < list.length; i++) { // run on the array
                        if ((list[4] == list[i - 1])) { // Comparete if i is equal to the array
                            e1 += 1;

                        }

                    }
                    if (v != 0) {
                        if (v == v2 & numero == 0) {

                            JOptionPane.showMessageDialog(null, "El Nadador 1 es el ganador");
                            c1 += 1;
                            if (t22 == true) {
                                c23 += 1;
                                
                            }
                            t22=false;
                            
                            if (t33 == true) {
                                c34 += 1;
                                
                            }
                            t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }
                            t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }
                            t55=false;

                        }
                        if (v == v2 & numero == 1) {

                            c2 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 2 es el ganador");
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }

                        if (v == v3 & numero == 0) {
                            c1 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 1 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;

                        }
                        if (v == v3 & numero == 1) {
                            c3 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 3 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t5=false;
                        }
                        if (v == v4 & numero == 0) {
                            c1 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 1 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v == v4 & numero == 1) {
                            c4 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 4 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v == v5 & numero == 0) {
                            c1 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 1 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v == v5 & numero == 1) {
                            c5 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 5 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                        }
                    }

                    if (v2 != 0) {
                        if (v2 == v3 & numero == 0) {
                            c2 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 2 es el ganador");
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                               
                            } t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;

                        }
                        if (v2 == v3 & numero == 1) {
                            c3 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 3 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;

                        }
                        if (v2 == v4 & numero == 0) {
                            c2 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 2 es el ganador");
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;

                        }
                        if (v2 == v4 & numero == 1) {
                            c4 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 4 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;

                        }
                        if (v2 == v5 & numero == 0) {
                            c2 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 2 es el ganador");
                            if (t11 == true) {
                                c12 += 1;
                               
                            } t11=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;

                        }
                        if (v2 == v5 & numero == 1) {
                            c5 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 5 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;

                        }
                    }

                    if (v3 != 0) {
                        if (v3 == v4 & numero == 0) {
                            c3 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 3 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v3 == v4 & numero == 1) {
                            c4 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 4 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v3 == v5 & numero == 0) {
                            c3 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 3 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v3 == v5 & numero == 1) {
                            c5 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 5 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                        }
                    }

                    if (v4 != 0 & v5 != 0) {
                        if (v4 == v5 & numero == 0) {
                            c4 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 4 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                            if (t55 == true) {
                                c56 += 1;
                                
                            }t55=false;
                        }
                        if (v4 == v5 & numero == 1) {
                            c5 += 1;
                            JOptionPane.showMessageDialog(null, "El Nadador 5 es el ganador");
                            if (t22 == true) {
                                c23 += 1;
                                
                            }t22=false;
                            if (t33 == true) {
                                c34 += 1;
                                
                            }t33=false;
                            if (t44 == true) {
                                c45 += 1;
                                
                            }t44=false;
                            if (t11 == true) {
                                c12 += 1;
                                
                            }t11=false;
                        }
                    }
                }

            }
        }
        );

    }

    //control the beggining and the end of the animation
    public void animar(boolean turnOnOff, boolean t1, boolean t2, boolean t3, boolean t4, ActionEvent e) {
        if (turnOnOff) {

            persona1.VelocidadX();
            timer.start();

        }
        if (t1) {
            persona2.VelocidadX();
            timer.start();
        }
        if (t2) {
            persona3.VelocidadX();
            timer.start();
        }
        if (t3) {
            persona4.VelocidadX();
            timer.start();
        }
        if (t4) {
            persona5.VelocidadX();
            timer.start();
        }
        c.jB_empezarActionPerformed(e);

    }

    //draw the animation
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        persona1.dibujar(g);
        persona2.dibujar(g);
        persona3.dibujar(g);
        persona4.dibujar(g);
        persona5.dibujar(g);

    }

}
