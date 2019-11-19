/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo.viewInterfacesGraficas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.ArquivosDeDados.Arquivo;
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
    
    
    public Arquivo readProf;
    public String arqProf = "ArquivoProfessores.txt";
    
    public Arquivo readAluno;
    public String arqAluno = "ArquivoAlunos.txt";
    
    public Arquivo readLogins;
    public String arqLogins = "ArquivoAlunos.txt";
    
    public HashMap<String, char []> logins;
    public List<Aluno> alunos;
    public List<Professor> professores;
    private String marca;
    private int cont;
    
    Gson gsonAluno = new Gson();
    String toJsonAluno;
    
    Gson gsonProfessor = new Gson();
    String toJsonProfessor; 
    
    public TelaCadastroDados(String marca, int cont) {
        initComponents();
        this.alunos = new ArrayList<>();
        this.logins = new HashMap<>();
        this.marca = marca;
        this.cont = cont;
        this.professores = new ArrayList<>();
        
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

        jButton1 = new javax.swing.JButton();
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
        jButtonVoltar = new javax.swing.JButton();

        jButton1.setText("jButton1");

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

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
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
                        .addComponent(jbConcluir))
                    .addComponent(jButtonVoltar))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void alocaProf(){
        Professor p = new Professor();
        p.setCpf(jtfCPF.getText());
        p.setEmail(jtfEmail.getText());
        p.setIdade(jtfIdade.getText());
        p.setNomeComp(jtfNomeCompleto.getText());
        p.setLogin(jtfLogin.getText(), jpfSenha.getPassword());
        p.setSiap(cont);
        cont =-13;
        professores.add(p);
        logins.put(jtfLogin.getText(), jpfSenha.getPassword());
        
    }
    private void alocaAluno(){
        Aluno a = new Aluno();
        a.setCpf(jtfCPF.getText());
        a.setEmail(jtfEmail.getText());
        a.setIdade(jtfIdade.getText());
        a.setNomeComp(jtfNomeCompleto.getText());
        a.setLogin(jtfLogin.getText(), jpfSenha.getPassword());
        cont =-14;
        alunos.add(a);
        logins.put(jtfLogin.getText(), jpfSenha.getPassword());
    }
    
    private void jbConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirActionPerformed
        // BOTÃO CONCLUIR:
        if(marca.equals(Constantes.PROFESSOR)){
            System.out.println("Prof");
            alocaProf();
            toJsonProfessor = gsonProfessor.toJson(professores);
            //System.out.println("toJson = " + toJsonProfessor);
            if(readProf.Write(arqProf, toJsonProfessor)){    
                System.out.println("Texto salvo");
            }
             else{
            System.out.println("Erro!");
            }
            
            
        }
        else {
            System.out.println("Aluno");
            alocaAluno();
            toJsonAluno = gsonAluno.toJson(alunos);
            
            
            
            System.out.println("toJson = " + toJsonAluno);
            
            if(readAluno.Write(arqAluno, toJsonAluno)){    
                System.out.println("Texto salvo");
            }
            else{
            System.out.println("Erro!");
            }
            
            
        }
        jtfCPF.setText("");
        jtfEmail.setText("");
        jtfIdade.setText("");
        jtfLogin.setText("");
        jtfNomeCompleto.setText("");
        jpfSenha.setText("");
        //TelaLogin login = new TelaLogin();
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

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed
    

    
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
                
            }
        });
    }
    
    public List<Aluno> retornarArquivoAlunos(){
      
        toJsonAluno = readAluno.read(arqAluno);
        
        java.lang.reflect.Type myType = new TypeToken<List<Aluno>>(){}.getType();
        List<Aluno> fromJson = gsonAluno.fromJson(toJsonAluno, myType);
       
        for (Aluno aluno : fromJson) {
            System.out.println(aluno);
        }
        
        
        return alunos;
    }
    
        public List<Professor> retornarArquivoProfessor(){
      
        toJsonProfessor = readProf.read(arqProf);
        
        java.lang.reflect.Type myType = new TypeToken<List<Professor>>(){}.getType();
        List<Professor> fromJson = gsonProfessor.fromJson(toJsonProfessor, myType);
       
        for (Professor professor : fromJson) {
            System.out.println(professor);
        }
        
        
        return professores;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /* EXEMPLO PARA IMPRIMIR GSON - GLEIPH
    Gson gson = new Gson();
        String toJson = gson.toJson(logins);
        System.out.println("toJson = " + toJson);
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVoltar;
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
