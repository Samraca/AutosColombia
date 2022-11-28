/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author samra_waefnk9
 */
public class AutosColombiaFrame extends javax.swing.JFrame {

    /**
     * Creates new form AutosColombiaFrame
     */
    public AutosColombiaFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPnl = new javax.swing.JDesktopPane();
        ingresoPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cedulaIngresoTxtfld = new javax.swing.JTextField();
        placaIngresoTxtfld = new javax.swing.JTextField();
        ingresoBtn = new javax.swing.JButton();
        salidaPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cedulaSalidaTxtfld = new javax.swing.JTextField();
        placaSalidaTxtfld = new javax.swing.JTextField();
        salidaBtn = new javax.swing.JButton();
        finBtn = new javax.swing.JButton();
        nuevoUsuarioBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autos Colombia");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 750, 750));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setName("AutosColombiaFrm"); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 450));
        setSize(new java.awt.Dimension(0, 0));

        mainPnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPnl.setPreferredSize(new java.awt.Dimension(732, 550));

        ingresoPnl.setBackground(new java.awt.Color(255, 255, 255));
        ingresoPnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel2.setText("Ingreso");

        jLabel3.setText("Cedula");

        jLabel4.setText("Placa");

        placaIngresoTxtfld.setMinimumSize(new java.awt.Dimension(50, 24));

        ingresoBtn.setText("Ingresar");

        javax.swing.GroupLayout ingresoPnlLayout = new javax.swing.GroupLayout(ingresoPnl);
        ingresoPnl.setLayout(ingresoPnlLayout);
        ingresoPnlLayout.setHorizontalGroup(
            ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresoPnlLayout.createSequentialGroup()
                .addGroup(ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresoPnlLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2))
                    .addGroup(ingresoPnlLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ingresoPnlLayout.createSequentialGroup()
                                .addGroup(ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cedulaIngresoTxtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(placaIngresoTxtfld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ingresoPnlLayout.createSequentialGroup()
                                .addComponent(ingresoBtn)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(41, 41, 41))
        );
        ingresoPnlLayout.setVerticalGroup(
            ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresoPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addGroup(ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cedulaIngresoTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(ingresoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(placaIngresoTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(ingresoBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        salidaPnl.setBackground(new java.awt.Color(255, 255, 255));
        salidaPnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salidaPnl.setPreferredSize(new java.awt.Dimension(224, 308));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel1.setText("Salida");

        jLabel5.setText("Cedula");

        jLabel6.setText("Placa");

        salidaBtn.setText("Ingresar");

        javax.swing.GroupLayout salidaPnlLayout = new javax.swing.GroupLayout(salidaPnl);
        salidaPnl.setLayout(salidaPnlLayout);
        salidaPnlLayout.setHorizontalGroup(
            salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salidaPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79))
            .addGroup(salidaPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salidaPnlLayout.createSequentialGroup()
                        .addComponent(salidaBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(salidaPnlLayout.createSequentialGroup()
                        .addGroup(salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 31, Short.MAX_VALUE)
                        .addGroup(salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cedulaSalidaTxtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(placaSalidaTxtfld))
                        .addGap(41, 41, 41))))
        );
        salidaPnlLayout.setVerticalGroup(
            salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salidaPnlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cedulaSalidaTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(salidaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(placaSalidaTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(salidaBtn)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        finBtn.setText("Salir");
        finBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finBtnActionPerformed(evt);
            }
        });

        nuevoUsuarioBtn.setText("Nuevo Usuario");
        nuevoUsuarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoUsuarioBtnMouseClicked(evt);
            }
        });
        nuevoUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoUsuarioBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Pagos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mainPnl.setLayer(ingresoPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPnl.setLayer(salidaPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPnl.setLayer(finBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPnl.setLayer(nuevoUsuarioBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainPnl.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainPnlLayout = new javax.swing.GroupLayout(mainPnl);
        mainPnl.setLayout(mainPnlLayout);
        mainPnlLayout.setHorizontalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPnlLayout.createSequentialGroup()
                        .addComponent(nuevoUsuarioBtn)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPnlLayout.createSequentialGroup()
                        .addComponent(ingresoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(salidaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        mainPnlLayout.setVerticalGroup(
            mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPnlLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salidaPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(ingresoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(mainPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finBtn)
                    .addComponent(nuevoUsuarioBtn)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_finBtnActionPerformed

    private void nuevoUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoUsuarioBtnActionPerformed
        NuevoUsuario nuevoUsuario = new NuevoUsuario();
        nuevoUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevoUsuarioBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pagos pagos = new Pagos();
        pagos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nuevoUsuarioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoUsuarioBtnMouseClicked
        
    }//GEN-LAST:event_nuevoUsuarioBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutosColombiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutosColombiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutosColombiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutosColombiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutosColombiaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaIngresoTxtfld;
    private javax.swing.JTextField cedulaSalidaTxtfld;
    private javax.swing.JButton finBtn;
    private javax.swing.JButton ingresoBtn;
    private javax.swing.JPanel ingresoPnl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JDesktopPane mainPnl;
    private javax.swing.JButton nuevoUsuarioBtn;
    private javax.swing.JTextField placaIngresoTxtfld;
    private javax.swing.JTextField placaSalidaTxtfld;
    private javax.swing.JButton salidaBtn;
    private javax.swing.JPanel salidaPnl;
    // End of variables declaration//GEN-END:variables
}
