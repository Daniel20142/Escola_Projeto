package View;

import Model.DAO.ProfessorDAO;
import Model.bean.Professor;
import Tratamento_Exception.TextFieldValidator;
import javax.swing.JOptionPane;

public class CadastroProfessores extends javax.swing.JFrame {

    TextFieldValidator validator = new TextFieldValidator();
    
    public CadastroProfessores() {
        initComponents();
    }
    public CadastroProfessores(String login) {
        initComponents();
        jLabel1.setText(login);
        jLabelMsg.setVisible(false);
        jLRGMsg.setVisible(false);
        jLCPFMsg.setVisible(false);
        jLEmailMsg.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMsg = new javax.swing.JLabel();
        jLRGMsg = new javax.swing.JLabel();
        jLCPFMsg = new javax.swing.JLabel();
        jLEmailMsg = new javax.swing.JLabel();
        jCPFTextField = new javax.swing.JTextField();
        jNomeTextField = new javax.swing.JTextField();
        jRGTextField = new javax.swing.JTextField();
        jemailTextField = new javax.swing.JTextField();
        jGraduacaoTextField = new javax.swing.JTextField();
        jSenhaTextField = new javax.swing.JTextField();
        jLoginTextField = new javax.swing.JTextField();
        jLLimparBtn = new javax.swing.JLabel();
        jLCadastrarBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMsg.setBackground(new java.awt.Color(231, 76, 60));
        jLabelMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMsg.setText("Por favor preencha todos os campos!");
        jLabelMsg.setOpaque(true);
        getContentPane().add(jLabelMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 435, 230, -1));

        jLRGMsg.setBackground(new java.awt.Color(241, 196, 15));
        jLRGMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLRGMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLRGMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRGMsg.setText("Formato: 00.000.000-0");
        jLRGMsg.setOpaque(true);
        getContentPane().add(jLRGMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 185, 150, -1));

        jLCPFMsg.setBackground(new java.awt.Color(241, 196, 15));
        jLCPFMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLCPFMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLCPFMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCPFMsg.setText("Formato: 000.000.000-00");
        jLCPFMsg.setOpaque(true);
        getContentPane().add(jLCPFMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 124, 160, -1));

        jLEmailMsg.setBackground(new java.awt.Color(231, 76, 60));
        jLEmailMsg.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLEmailMsg.setForeground(new java.awt.Color(255, 255, 255));
        jLEmailMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEmailMsg.setText("Por favor insira um email válido!");
        jLEmailMsg.setOpaque(true);
        getContentPane().add(jLEmailMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 185, 200, -1));

        jCPFTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jCPFTextField.setBorder(null);
        jCPFTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCPFTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCPFTextFieldFocusLost(evt);
            }
        });
        jCPFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPFTextFieldActionPerformed(evt);
            }
        });
        jCPFTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCPFTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCPFTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jCPFTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 153, 210, -1));

        jNomeTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jNomeTextField.setBorder(null);
        jNomeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNomeTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNomeTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jNomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 153, 290, -1));

        jRGTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jRGTextField.setBorder(null);
        jRGTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRGTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jRGTextFieldFocusLost(evt);
            }
        });
        jRGTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jRGTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jRGTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 214, 210, -1));

        jemailTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jemailTextField.setBorder(null);
        jemailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jemailTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jemailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 214, 290, -1));

        jGraduacaoTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jGraduacaoTextField.setBorder(null);
        jGraduacaoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jGraduacaoTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jGraduacaoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 275, 540, -1));

        jSenhaTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jSenhaTextField.setBorder(null);
        jSenhaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSenhaTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jSenhaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 397, 210, -1));

        jLoginTextField.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLoginTextField.setBorder(null);
        jLoginTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLoginTextFieldKeyTyped(evt);
            }
        });
        getContentPane().add(jLoginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 397, 290, -1));

        jLLimparBtn.setPreferredSize(new java.awt.Dimension(34, 12));
        jLLimparBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLimparBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLLimparBtnMouseEntered(evt);
            }
        });
        getContentPane().add(jLLimparBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 300, 50));

        jLCadastrarBtn.setPreferredSize(new java.awt.Dimension(34, 12));
        jLCadastrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCadastrarBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCadastrarBtnMouseEntered(evt);
            }
        });
        getContentPane().add(jLCadastrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 300, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CadastrarProfessorWindow.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("user_id");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCPFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPFTextFieldActionPerformed

    private void jLCadastrarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCadastrarBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCadastrarBtnMouseEntered

    private void jLCadastrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCadastrarBtnMouseClicked
        
        if(jCPFTextField.getText().equals("") || jNomeTextField.getText().equals("") || jRGTextField.getText().equals("")
                || jemailTextField.getText().equals("") || jGraduacaoTextField.getText().equals("") || jLoginTextField.getText().equals("")
                || jSenhaTextField.getText().equals("")){
            
            jLabelMsg.setVisible(true);
        }else if(!validator.emailValidate(jemailTextField)){            
            jLEmailMsg.setVisible(true);      
        }else{
            jLEmailMsg.setVisible(false); 
            
            Professor prof = new Professor();
            ProfessorDAO pdao = new ProfessorDAO();
            
            prof.setNome(jNomeTextField.getText());
            prof.setLogin(jLoginTextField.getText());
            prof.setSenha(jSenhaTextField.getText());
            prof.setCPF(jCPFTextField.getText());
            prof.setRG(jRGTextField.getText());
            prof.setEmail(jemailTextField.getText());
            prof.setGraduacao(jGraduacaoTextField.getText());
            prof.setTipo_user("3");
            String User_Login = jLabel1.getText();
            
            if(pdao.create(prof, User_Login) ){
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                jLLimparBtnMouseClicked(evt);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");  
            }
        }
    }//GEN-LAST:event_jLCadastrarBtnMouseClicked

    private void jLLimparBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLimparBtnMouseClicked
        jCPFTextField.setText("");
        jNomeTextField.setText("");
        jRGTextField.setText("");
        jemailTextField.setText("");
        jGraduacaoTextField.setText("");
        jLoginTextField.setText("");
        jSenhaTextField.setText("");
    }//GEN-LAST:event_jLLimparBtnMouseClicked

    private void jLLimparBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLimparBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLLimparBtnMouseEntered

    private void jNomeTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNomeTextFieldKeyTyped
        
    }//GEN-LAST:event_jNomeTextFieldKeyTyped

    private void jNomeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNomeTextFieldKeyPressed
        validator.maxLengthLimit(jNomeTextField, 50);
    }//GEN-LAST:event_jNomeTextFieldKeyPressed

    private void jCPFTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPFTextFieldKeyTyped
        validator.maxLengthLimit(jCPFTextField, 14);        
    }//GEN-LAST:event_jCPFTextFieldKeyTyped

    private void jCPFTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCPFTextFieldFocusGained
        jLCPFMsg.setVisible(true);
    }//GEN-LAST:event_jCPFTextFieldFocusGained

    private void jCPFTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCPFTextFieldFocusLost
        jLCPFMsg.setVisible(false);
    }//GEN-LAST:event_jCPFTextFieldFocusLost

    private void jRGTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRGTextFieldFocusGained
        jLRGMsg.setVisible(true);
    }//GEN-LAST:event_jRGTextFieldFocusGained

    private void jRGTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRGTextFieldFocusLost
        jLRGMsg.setVisible(false);
    }//GEN-LAST:event_jRGTextFieldFocusLost

    private void jRGTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRGTextFieldKeyTyped
        validator.maxLengthLimit(jRGTextField, 12);
    }//GEN-LAST:event_jRGTextFieldKeyTyped

    private void jemailTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jemailTextFieldKeyTyped
        validator.maxLengthLimit(jemailTextField, 50);
    }//GEN-LAST:event_jemailTextFieldKeyTyped

    private void jGraduacaoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jGraduacaoTextFieldKeyTyped
        validator.maxLengthLimit(jGraduacaoTextField, 25);
    }//GEN-LAST:event_jGraduacaoTextFieldKeyTyped

    private void jSenhaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSenhaTextFieldKeyTyped
        validator.maxLengthLimit(jSenhaTextField, 20);
    }//GEN-LAST:event_jSenhaTextFieldKeyTyped

    private void jLoginTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLoginTextFieldKeyTyped
        validator.maxLengthLimit(jLoginTextField, 20);
    }//GEN-LAST:event_jLoginTextFieldKeyTyped

    private void jCPFTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCPFTextFieldKeyPressed
        validator.maxLengthLimit(jCPFTextField, 14);
    }//GEN-LAST:event_jCPFTextFieldKeyPressed
            
    
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
            java.util.logging.Logger.getLogger(CadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCPFTextField;
    private javax.swing.JTextField jGraduacaoTextField;
    private javax.swing.JLabel jLCPFMsg;
    private javax.swing.JLabel jLCadastrarBtn;
    private javax.swing.JLabel jLEmailMsg;
    private javax.swing.JLabel jLLimparBtn;
    private javax.swing.JLabel jLRGMsg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JTextField jLoginTextField;
    private javax.swing.JTextField jNomeTextField;
    private javax.swing.JTextField jRGTextField;
    private javax.swing.JTextField jSenhaTextField;
    private javax.swing.JTextField jemailTextField;
    // End of variables declaration//GEN-END:variables
}
