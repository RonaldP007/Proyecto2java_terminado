package juego_1;
//here you the visual and one of the most principal parts of the project 

public class interfaz_1 extends javax.swing.JFrame {

    panel pizarra;
    Reportes e = new Reportes();
    public static int canti;
    public static int carre = 1;
    public static boolean t11 = false;
    public static boolean t22 = false;
    public static boolean t33 = false;
    public static boolean t44 = false;
    public static boolean t55 = false;

    public interfaz_1() {

        initComponents();
        setTitle("Juego Natacion");
        setLocationRelativeTo(null);
        //we create the panel as an instance and then we add it to the frame
        pizarra = new panel(this.jPanel1.getSize());
        this.jPanel1.add(pizarra);
        re.setVisible(false);
        box.setVisible(false);
        box2.setVisible(false);
        box3.setVisible(false);
        box4.setVisible(false);
        box6.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        la1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        la2 = new javax.swing.JLabel();
        la3 = new javax.swing.JLabel();
        b = new javax.swing.JButton();
        re = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        co = new javax.swing.JComboBox<>();
        botonagregar = new javax.swing.JButton();
        box = new javax.swing.JCheckBox();
        box2 = new javax.swing.JCheckBox();
        box3 = new javax.swing.JCheckBox();
        box4 = new javax.swing.JCheckBox();
        box6 = new javax.swing.JCheckBox();
        la6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        l8 = new javax.swing.JLabel();
        l9 = new java.awt.Label();
        l10 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piscina");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );

        b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b.setText("Iniciar");
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        re.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        re.setText("Reiniciar Carrera");
        re.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reMouseClicked(evt);
            }
        });
        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b3.setText("Regresar");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        l6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l6.setText("Ingrese el numero de Nadadores");

        co.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nadador 1", "Nadador 2", "Nadador 3", "Nadador 4", "Nadador 5" }));
        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });

        botonagregar.setText("Ingresar Nadador");
        botonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarActionPerformed(evt);
            }
        });

        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        la6.setText("Tiempo de Carrera:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Reportes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(box)
                        .addGap(0, 0, 0)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(box2)
                        .addGap(0, 0, 0)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(re)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(box3)
                        .addGap(0, 0, 0)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(la6)
                        .addGap(134, 134, 134)
                        .addComponent(box4)
                        .addGap(0, 0, 0)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(box6)
                        .addGap(6, 6, 6)
                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(la1)
                    .addComponent(la2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(botonagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(box2))
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box3)
                                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(la6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(box4)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box6)
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(la1)
                        .addGap(196, 196, 196)
                        .addComponent(la2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked


    }//GEN-LAST:event_bMouseClicked


    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        //this put them to run in the panel
        panel o = new panel(this.jPanel1.getSize());

        this.jPanel1.add(o);
        new crono().setVisible(false);
        if (box.isSelected()) {
            pizarra.animar(true, false, false, false, false, evt);
            canti += 1;
            t11 = true;
        }
        if (box2.isSelected()) {
            pizarra.animar(false, true, false, false, false, evt);
            canti += 1;
            t22 = true;
        }
        if (box3.isSelected()) {
            pizarra.animar(false, false, true, false, false, evt);
            canti += 1;
            t33 = true;
        }
        if (box4.isSelected()) {
            pizarra.animar(false, false, false, true, false, evt);
            canti += 1;
            t44 = true;
        }
        if (box6.isSelected()) {
            pizarra.animar(false, false, false, false, true, evt);
            canti += 1;
            t55 = true;
        }
        b.setEnabled(false);
    }//GEN-LAST:event_bActionPerformed

    private void reMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reMouseClicked
        carre += 1;
        new interfaz_1().setVisible(true);
        this.dispose();
        pizarra.c.hide();
        e.setVisible(false);
        t11 = false;
        t22 = false;
        t33 = false;
        t44 = false;
        t55 = false;
    }//GEN-LAST:event_reMouseClicked

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed

    }//GEN-LAST:event_reActionPerformed

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coActionPerformed

    private void botonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarActionPerformed
        if (co.getSelectedItem().equals("Nadador 1")) {
            l1.setText("Nadador 1");
            box.setVisible(true);
            box.setSelected(true);
            box.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 2")) {
            l2.setText("Nadador 2");
            box2.setVisible(true);
            box2.setSelected(true);
            box2.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 3")) {
            l3.setText("Nadador 3");
            box3.setVisible(true);
            box3.setSelected(true);
            box3.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 4")) {
            l4.setText("Nadador 4");
            box4.setVisible(true);
            box4.setSelected(true);
            box4.setEnabled(false);
        }
        if (co.getSelectedItem().equals("Nadador 5")) {
            l5.setText("Nadador 5");
            box6.setVisible(true);
            box6.setSelected(true);
            box6.setEnabled(false);
        }

    }//GEN-LAST:event_botonagregarActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed

    }//GEN-LAST:event_boxActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        new menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        e.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton b3;
    private javax.swing.JButton botonagregar;
    private javax.swing.JCheckBox box;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private javax.swing.JCheckBox box4;
    private javax.swing.JCheckBox box6;
    private javax.swing.JComboBox<String> co;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    public static java.awt.Label l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    public static javax.swing.JLabel l8;
    public static java.awt.Label l9;
    private javax.swing.JLabel la1;
    private javax.swing.JLabel la2;
    private javax.swing.JLabel la3;
    private javax.swing.JLabel la6;
    public static javax.swing.JButton re;
    // End of variables declaration//GEN-END:variables

}
