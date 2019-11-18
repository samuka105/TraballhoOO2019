/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo.viewInterfacesGraficas;

import com.google.gson.Gson;
import com.mycompany.trabalhooo.Aluno;
import com.mycompany.trabalhooo.Login;
import com.mycompany.trabalhooo.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class TelaCadastroDados extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAluno
     */
    
    
    public HashMap<String, String> logins;
    
    public List<Aluno> alunos;
    public List<Professor> professores;
    private boolean marca;
    private int cont;
    public TelaCadastroDados(boolean marca, int cont) {
        initComponents();
        
        this.marca = marca;
        this.cont = cont;
        
    }

    TelaCadastroDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
    private TelaCadastroDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbNomeCompleto = new javax.swing.JLabel();
        jlbIdade = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbCPF = new javax.swing.JLabel();
        jlbLogin = new javax.swing.JLabel();
        jlbSenha = new javax.swing.JLabel();
        jtfNomeCompleto = new javax.swing.JTextField();
        jtfIdade = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfCPF = new javax.swing.JTextField();
        jtfLogin = new javax.swing.JTextField();
        jbConcluir = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbNomeCompleto.setText("Nome Completo");

        jlbIdade.setText("Idade");

        jlbEmail.setText("Email");

        jlbCPF.setText("CPF");

        jlbLogin.setText("Login");

        jlbSenha.setText("Senha");

        jtfNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeCompletoActionPerformed(evt);
            }
        });

        jtfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdadeActionPerformed(evt);
            }
        });

        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        jtfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFActionPerformed(evt);
            }
        });

        jbConcluir.setText("Concluir");
        jbConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirActionPerformed(evt);
            }
        });

        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlbEmail)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlbCPF)
                                                .addComponent(jlbLogin))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jlbSenha)
                                            .addGap(7, 7, 7)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                        .addComponent(jtfCPF)
                                        .addComponent(jpfSenha))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbNomeCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jbConcluir)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNomeCompleto)
                    .addComponent(jtfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIdade)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCPF)
                    .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbLogin)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSenha)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jbConcluir)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void alocaProf(){
        Professor p = new Professor();
        p.setCpf(jtfCPF.getText());
        p.setEmail(jtfEmail.getText());
        p.setIdade(jtfIdade.getText());
        p.setNomeComp(jtfNomeCompleto.getText());
        p.setLogin(jtfLogin.getText(), jpfSenha.getText());
        p.setSiap(cont);
        cont =-13;
        professores.add(p);
        logins.put(jtfLogin.getText(), jpfSenha.getText());
        
    }
    private void alocaAluno(){
        Aluno a = new Aluno();
        a.setCpf(jtfCPF.getText());
        a.setEmail(jtfEmail.getText());
        a.setIdade(jtfIdade.getText());
        a.setNomeComp(jtfNomeCompleto.getText());
        a.setLogin(jtfLogin.getText(), jpfSenha.getText());
        cont =-14;
        alunos.add(a);
        logins.put(jtfLogin.getText(), jpfSenha.getText());
    }   
    
    private void jbConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirActionPerformed
        // BOTÃO CONCLUIR:
        if(marca == true){
            alocaProf();
            //Gson gsonProfessor = new Gson();
            //String toJsonProfessor = gsonProfessor.toJson(professores);
            //System.out.println("toJson = " + toJsonProfessor);
            
            
        }
        else {
            alocaAluno();
            //Gson gsonAluno = new Gson();
            //String toJsonAluno = gsonAluno.toJson(alunos);
            
            
            
            //System.out.println("toJson = " + toJsonAluno);
            
        }
        
        
        //logins.add(login);
        //Gson gsonLogin = new Gson();
        //String toJsonLogin = gsonLogin.toJson(logins);
        //System.out.println("toJson = " + toJsonLogin);
    }//GEN-LAST:event_jbConcluirActionPerformed

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jtfNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeCompletoActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jtfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdadeActionPerformed

    private void jtfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFActionPerformed
    

    
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
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //USAR O METODO CONFERE OU SETAR UM VALOR BOOL PRA TESTAR
        //TelaCadastroDados tela = new TelaCadastroDados(true, 5000);
       // tela.setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                boolean marca = true;
                int cont = 5000;
                new TelaCadastroDados(marca, cont).setVisible(true);
            }
        });
    }
    
    
    
    /* EXEMPLO PARA IMPRIMIR GSON - GLEIPH
    Gson gson = new Gson();
        String toJson = gson.toJson(logins);
        System.out.println("toJson = " + toJson);
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbConcluir;
    private javax.swing.JLabel jlbCPF;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbIdade;
    private javax.swing.JLabel jlbLogin;
    private javax.swing.JLabel jlbNomeCompleto;
    private javax.swing.JLabel jlbSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNomeCompleto;
    // End of variables declaration//GEN-END:variables
}
