package juego_1;
// this is the stopwatch 
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import static juego_1.interfaz_1.l9;
import static juego_1.interfaz_1.l8;
import static juego_1.interfaz_1.l10;
public class crono extends javax.swing.JFrame {


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLminuto = new javax.swing.JLabel();
        jLsegundo = new javax.swing.JLabel();
        jLcentesima = new javax.swing.JLabel();
        //jB_empezar = new javax.swing.JButton();
        // jB_parar = new javax.swing.JButton();
        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLminuto.setText("0");

        jLsegundo.setText("0");

        jLcentesima.setText("0");

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

        jLabel3.setText(":");

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
                                                        //.addComponent(jLhora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel3)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLminuto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel2)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLcentesima, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addComponent(jLminuto)
                                                .addComponent(jLsegundo)
                                                .addComponent(jLcentesima)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                //.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                )));

        pack();
    }// </editor-fold>                        

    public void jB_empezarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        empezar();

        t.start();
    }

    public void jB_pararActionPerformed(java.awt.event.ActionEvent evt) {

        activar = false;

        t.stop();

    }

    public void empezar() {

        this.setVisible(false);

        activar = true;
        centesima = 0;
        segundo = 0;
        minuto = 0;
        hora = 0;

        t = new Thread(new Runnable() {
            @Override
            public void run() {

                while (activar) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }

                    l10.setText(""+": "+ centesima);
                    l9.setText(""+": "+ segundo);
                    l8.setText(""+  minuto);
                   

                    centesima++;
                    if (centesima >= 99) {
                        centesima = 0;
                        segundo++;
                    }
                    if (segundo >= 60) {
                        segundo = 0;
                        minuto++;
                    }

                    if (minuto >= 60) {
                        minuto = 0;
                        hora++;
                    }
                    if (hora >= 24) {
                        centesima = 0;
                        segundo = 0;
                        minuto = 0;
                        hora = 0;
                    }

                }

            }
        });

    }

    private Thread t;

    private boolean activar = false;
    private int segundo, minuto, hora, centesima;

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLcentesima;
    
    private javax.swing.JLabel jLminuto;
    private javax.swing.JLabel jLsegundo;

    void jB_pararActionPerformed(MouseEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
