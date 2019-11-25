/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo.viewInterfacesGraficas;

import com.mycompany.trabalhooo.Aluno;
import com.mycompany.trabalhooo.Dados;
import static com.mycompany.trabalhooo.Dados.alunos;
import static com.mycompany.trabalhooo.Dados.logins;
import static com.mycompany.trabalhooo.Dados.professores;
import static com.mycompany.trabalhooo.Dados.disciplinas;
import static com.mycompany.trabalhooo.Dados.departamentos;
import static com.mycompany.trabalhooo.Dados.retornaLogin;
import static com.mycompany.trabalhooo.Dados.retornarArquivoAlunos;
import static com.mycompany.trabalhooo.Dados.retornarArquivoDepartamento;
import static com.mycompany.trabalhooo.Dados.retornarArquivoDisciplina;
import static com.mycompany.trabalhooo.Dados.retornarArquivoProfessor;
import com.mycompany.trabalhooo.Departamento;
import com.mycompany.trabalhooo.Disciplina;
import com.mycompany.trabalhooo.Login;
import com.mycompany.trabalhooo.Professor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class TelaLogin extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaInicial
     */
    public TelaLogin( ) {
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

        jButton1 = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        jButton2.setText("Cadastro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfId)
                            .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:..........................................................................................................................................................................................................................................................................................................................................................................................................................
        String id = jtfId.getText();
        char[] senha = jPassword.getPassword();
        System.out.println(logins.size());
        System.out.println(alunos.size());
        System.out.println(logins.get(id));
        System.out.println(senha);
        if(logins.containsKey(id)) {
            System.out.println("confirmou login");
            if(Arrays.equals(logins.get(id), senha)){
                System.out.println("confirmou senha");
                if(telaDados.getMarca().equals(Constantes.ALUNO)) procuraAluno(id);
                else procuraProfessor(id);            
            }
        } else{
            System.out.println("Errou");
        }
        jtfId.setText("");
        jPassword.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void procuraAluno(String id){
        int i = 0;
                System.out.println(alunos.get(i).getLogin().getLogin());
                System.out.println(id);
                while(i<alunos.size()){
                    if(alunos.get(i).getLogin().getLogin().equals(id)){
                        TelaAlunoPrincipal proxima = new TelaAlunoPrincipal(alunos.get(i));
                        proxima.setVisible(true);
                        break;
                        
                    }
                    i++;
                }
        
    }
    private void procuraProfessor(String id){
        int i = 0;
                System.out.println(professores.get(i).getLogin().getLogin());
                System.out.println(id);
                while(i<professores.size()){
                    if(professores.get(i).getLogin().getLogin().equals(id)){
                        TelaProfessorPrincipal prox = new TelaProfessorPrincipal(professores.get(i));
                        prox.setVisible(true);
                        break;
                    }
                    i++;
                }
    }
    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CADASTRO
        //TelaLogin tela = new TelaLogin();
        TelaCadastro t = new TelaCadastro();
        t.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        System.out.println("Abri janela");
       // Dados dadosPessoais = new Dados();
        alunos = retornarArquivoAlunos(Constantes.ARQUIVO_ALUNOS);
        professores = retornarArquivoProfessor(Constantes.ARQUIVO_PROFESSORES);
        disciplinas = retornarArquivoDisciplina(Constantes.ARQUIVO_DISCIPLINAS);
        departamentos = retornarArquivoDepartamento(Constantes.ARQUIVO_DEPARTAMENTO);
        logins = retornaLogin(Constantes.ARQUIVO_LOGINS);
        
        for (Aluno retornarArquivoAluno : alunos) {
            System.out.println("retornarArquivoAluno = " + retornarArquivoAluno);
            System.out.println("Nome:" +retornarArquivoAluno.getNomeComp());
        }
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               // TelaCadastroDados telaDados = new TelaCadastroDados();
               // new TelaLogin(telaDados).setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jtfId;
    // End of variables declaration//GEN-END:variables
}
