/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego2_proy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static juego2_proy.cajafuerte.l4;
import static juego2_proy.cajafuerte.l5;
import static juego2_proy.cajafuerte.l7;
import static juego2_proy.cajafuerte.l9;

/**
 *
 * @author Kevin
 */
public class crono2 extends JFrame {

    // this the principal class with some stuff and with this is the stopwatch for you to answer before time
    public static byte centiseconds = 0;
    public static byte seconds = 0;
    public static short minutes = 1;
    public static boolean f = false;
    public static boolean f2;

    private DecimalFormat timeFormatter;

    public static Timer timer;
    private ActionEvent evt;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        //   jLminuto = new javax.swing.JLabel();
        // jLsegundo = new javax.swing.JLabel();
        //jLcentesima = new javax.swing.JLabel();
        //jB_empezar = new javax.swing.JButton();
        // jB_parar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

//        jLminuto.setText("0");
        //      jLsegundo.setText("0");
        //    jLcentesima.setText("0");
        //jB_empezar.setText("Empezar");
        /*jB_empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_empezarActionPerformed(evt);
            }
        });*/
        // jB_parar.setText("Parar");
        //jB_parar.setEnabled(false);
        /*jB_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_pararActionPerformed(evt);
            }
        });*/
        jLabel1.setText(".");

        jLabel2.setText(":");

        jLabel3.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                        // .addComponent( javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel3)
                                                        .addGap(10, 10, 10)
                                                        //.addComponent(jLminuto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel2)
                                                        .addGap(10, 10, 10)
                                                        //.addComponent(jLsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        //.addComponent(jLcentesima, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(33, 33, 33))
                        ));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                //.addComponent(jLhora)
                                                //.addComponent(jLminuto)
                                                //.addComponent(jLsegundo)
                                                //.addComponent(jLcentesima)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                //.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                )));

        pack();
    }// </editor-fold>                        

    public void jB_empezarActionPerformed() {
        // this method is gonna start the stopwatch
        this.setVisible(false);
        empezar();

        timer.start();
    }

    public void jB_pararActionPerformed() {
// this method is gonna stop the stopwatch
        activar = false;

        timer.stop();

    }

    public void empezar() {
// this is gonna star the stopwatch with the time

        activar = true;

        timeFormatter = new DecimalFormat("00");

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (centiseconds > 0) {
                    centiseconds--;
                } else {
                    if (seconds == 0 && minutes == 0) {
                        f2 = true;
                        timer.stop();
                        if (f2 == true) {

                            l4.setText("");
                            JOptionPane.showMessageDialog(null, "Se te Acabo el Tiempo", "Perdiste", JOptionPane.ERROR_MESSAGE);

                        }

                    } else if (seconds > 0) {
                        seconds--;
                        centiseconds = 99;
                    } else if (minutes > 0) {
                        minutes--;
                        seconds = 59;
                        centiseconds = 99;
                    }

                }
                l5.setText("" + ": " + timeFormatter.format(centiseconds));
                l9.setText("" + ": " + timeFormatter.format(seconds));
                l7.setText("" + timeFormatter.format(minutes));
            }
        });
        l5.setText("" + ": " + timeFormatter.format(centiseconds));
        l9.setText("" + ": " + timeFormatter.format(seconds));
        l7.setText("" + timeFormatter.format(minutes));
    }

    public static boolean activar = false;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    /*private javax.swing.JLabel jLcentesima;

    private javax.swing.JLabel jLminuto;
    private javax.swing.JLabel jLsegundo;*/

    void jB_pararActionPerformed(MouseEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
