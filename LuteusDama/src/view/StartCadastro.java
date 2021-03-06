/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.UsuarioController;

/**
 *
 * @author mateu
 */
public class StartCadastro extends javax.swing.JFrame {
    private int xMouse;
    private int yMouse;
    private String nome;
    private String email;
    private String senha;
    private StartGUI a;

    /**
     * Creates new form StartGUI
     */
    public StartCadastro() {
        initComponents();
        jEntrar.setBackground(new Color(97,167,6));
    }
    
    public StartCadastro(StartGUI start) {
        initComponents();
        jEntrar.setBackground(new Color(97,167,6));
        a = start;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLReturn = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jEntrar = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 24));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo-logar3.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 180));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 167, 6));
        jLabel6.setText("Registro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, 30));

        lblSenha1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblSenha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha1.setText("Nome");
        getContentPane().add(lblSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jtfEmail.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, -1));

        jLReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/11.png"))); // NOI18N
        jLReturn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLReturnMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLReturnMouseMoved(evt);
            }
        });
        jLReturn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLReturnFocusLost(evt);
            }
        });
        jLReturn.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLReturnMouseWheelMoved(evt);
            }
        });
        jLReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLReturnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLReturnMouseReleased(evt);
            }
        });
        getContentPane().add(jLReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, -1, -1));

        lblEmail.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("E-mail");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        lblSenha.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jtfNome.setBackground(new java.awt.Color(240, 240, 240));
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        jEntrar.setBackground(new java.awt.Color(0, 0, 0));
        jEntrar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jEntrar.setText("Cadastrar");
        jEntrar.setBorder(null);
        jEntrar.setBorderPainted(false);
        jEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jEntrarMousePressed(evt);
            }
        });
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 90, 40));

        jtfSenha.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 130, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/frame.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(StartCadastro.ICONIFIED);
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

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEntrarMousePressed
        this.setBackground(new Color(90,160,6));
    }//GEN-LAST:event_jEntrarMousePressed

    private void jEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarActionPerformed

        nome = jtfNome.getText();
        email = jtfEmail.getText();
        senha = jtfSenha.getText();
        if(nome.equals("") || email.equals("") || senha.equals("")){
            JOptionPane.showMessageDialog(null, "Por favorm insira valores nos campo(s)");            
        } else{
            UsuarioController control = new UsuarioController();
            try {
                control.insere(nome, email, senha);
            } catch (SQLException ex) {
                Logger.getLogger(StartCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
            a.setVisible(true);

            jtfNome.setText("");
            jtfEmail.setText("");
            jtfSenha.setText("");
        }
    }//GEN-LAST:event_jEntrarActionPerformed

    private void jLReturnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLReturnMouseReleased
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jLReturnMouseReleased

    private void jLReturnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLReturnMouseMoved
        jLReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imgs/12.png")));
    }//GEN-LAST:event_jLReturnMouseMoved

    private void jLReturnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLReturnMouseDragged
    }//GEN-LAST:event_jLReturnMouseDragged

    private void jLReturnMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLReturnMouseWheelMoved
    }//GEN-LAST:event_jLReturnMouseWheelMoved

    private void jLReturnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLReturnFocusLost
    }//GEN-LAST:event_jLReturnFocusLost

    private void jLReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLReturnMouseExited
        jLReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../imgs/11.png")));
    }//GEN-LAST:event_jLReturnMouseExited

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
            java.util.logging.Logger.getLogger(StartCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jLReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    // End of variables declaration//GEN-END:variables
}
