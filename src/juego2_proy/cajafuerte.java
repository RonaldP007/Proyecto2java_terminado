package juego2_proy;

import java.util.Random;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import static juego2_proy.crono2.centiseconds;
import static juego2_proy.crono2.f2;
import static juego2_proy.crono2.minutes;
import static juego2_proy.crono2.seconds;
import static juego2_proy.crono2.timer;
import juego2_proy.Mov;

public class cajafuerte extends javax.swing.JFrame {
    // this is constructor of the class
    Random ra = new Random();
    int nu1 = ra.nextInt(9);
    int nu2 = ra.nextInt(9);
    int nu3 = ra.nextInt(9);
    crono2 c2 = new crono2();

    /**
     * * Creates new form cajafuerte
     */
    public cajafuerte() {
        // this modifies the JFrame and adds some additional things 
        this.setUndecorated(true);
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Comodín");
        c2.jB_empezarActionPerformed();
        if (t1.getText().length() >= 2 || t2.getText().length() >= 2 || t3.getText().length() >= 2) {
            JOptionPane.showMessageDialog(null, "Ingrese Numeros de 1 Digito");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        l1 = new java.awt.Label();
        l2 = new javax.swing.JLabel();
        bu1 = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        l1.setText("Adivine los numeros para Ganar");

        l2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l2.setText("Tienes un minuto de Tiempo.");

        bu1.setText("Abrir");
        bu1.setActionCommand("");
        bu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bu1MouseClicked(evt);
            }
        });
        bu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu1ActionPerformed(evt);
            }
        });

        l4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l2)
                        .addGap(184, 184, 184))))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(l6)))
                        .addGap(115, 115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bu1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu1ActionPerformed
        // this the button that will let you know if you already accomplish the trivia
        String op = t1.getText();
        String op2 = t2.getText();
        String op3 = t3.getText();
        String n = "" + nu1;
        String n2 = "" + nu2;
        String n3 = "" + nu3;
        if (t1.getText().equals("0") || t2.getText().equals("0") || t3.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "El Numero 0 no esta Permitido!");
        }

        if (t1.getText().length() >= 2 || t2.getText().length() >= 2 || t3.getText().length() >= 2) {
            JOptionPane.showMessageDialog(null, "Ingrese Numeros de 1 Digito");
        }

        if (op.equals(n) & op2.equals(n2) & op3.equals(n3)) {
            
            c2.jB_pararActionPerformed();
            JOptionPane.showMessageDialog(null, "Ganaste la Partida!!");
            new Mov().setVisible(true);
            this.setVisible(false);
            l4.setText("");
        } else {
            System.out.println(n+n2+n3);
            l4.setText("Sigue Intentando..!");
        }


    }//GEN-LAST:event_bu1ActionPerformed

    private void bu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bu1MouseClicked

    }//GEN-LAST:event_bu1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        this.setVisible(false);
        timer.stop();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu1;
    private javax.swing.JButton jButton1;
    private java.awt.Label l1;
    private javax.swing.JLabel l2;
    public static javax.swing.JLabel l4;
    public static javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    public static javax.swing.JLabel l7;
    public static javax.swing.JLabel l9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}
