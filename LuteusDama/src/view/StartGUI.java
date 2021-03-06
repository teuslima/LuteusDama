package view;

import java.awt.Color;

/**
 *
 * @author mateu
 */
public class StartGUI extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;

    /**
     * Creates new form StartGUI
     */
    public StartGUI() {
        initComponents();
        jBEntrar.setBackground(new Color(97,167,6));
        jBCriarConta.setBackground(new Color(97,167,6));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jBEntrar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBCriarConta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit-null.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/minimizar.gif"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 30));

        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 167, 6));
        jLabel6.setText("Entrar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        jtfNome.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 130, 20));

        lblEmail.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblSenha.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jBEntrar.setBackground(new java.awt.Color(0, 0, 0));
        jBEntrar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jBEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jBEntrar.setText("Entrar");
        jBEntrar.setBorder(null);
        jBEntrar.setBorderPainted(false);
        jBEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jBEntrarMousePressed(evt);
            }
        });
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 90, 40));

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 130, 20));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(97, 167, 6));
        jLabel7.setText("LT Damas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 160, 40));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel8.setText("Este é um maravilhoso jogo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel9.setText("para você se divertir e buscar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel10.setText("desenvolver a lógica e a");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 170, -1));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel13.setText(" percepção.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 80, -1));

        jBCriarConta.setBackground(new java.awt.Color(0, 0, 0));
        jBCriarConta.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jBCriarConta.setForeground(new java.awt.Color(255, 255, 255));
        jBCriarConta.setText("Criar conta");
        jBCriarConta.setMaximumSize(new java.awt.Dimension(37, 25));
        jBCriarConta.setMinimumSize(new java.awt.Dimension(37, 25));
        jBCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarContaActionPerformed(evt);
            }
        });
        getContentPane().add(jBCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 100, 40));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 200));
        jLabel5.setText("Esqueci a senha");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/frame.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Book", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(97, 167, 6));
        jLabel11.setText("Entrar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(StartGUI.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jBEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBEntrarMousePressed
        this.setBackground(new Color(90,160,6));
    }//GEN-LAST:event_jBEntrarMousePressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarContaActionPerformed

        StartCadastro sc = new StartCadastro(this);
        this.setVisible(false);
        sc.setVisible(true);
    }//GEN-LAST:event_jBCriarContaActionPerformed

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        
        //Criar Frame pra esquecer a senha.
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imgs/exit-pressed.png")));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imgs/exit-null.png")));
    }//GEN-LAST:event_jLabel3MouseExited

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
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCriarConta;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
}
