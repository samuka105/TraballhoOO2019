/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo.viewInterfacesGraficas;

import com.mycompany.trabalhooo.Aluno;

import static com.mycompany.trabalhooo.Dados.alunos;
import static com.mycompany.trabalhooo.Dados.disciplinas;
import static com.mycompany.trabalhooo.Dados.professores;
import static com.mycompany.trabalhooo.Dados.retornarArquivoDisciplina;
import static com.mycompany.trabalhooo.Dados.salvaAlunos;
import static com.mycompany.trabalhooo.Dados.salvaDisciplinas;
import static com.mycompany.trabalhooo.Dados.salvaProfessores;
import com.mycompany.trabalhooo.Turma;


/**
 *
 * @author Geral
 */
public class TelaAlunoTrancamento extends javax.swing.JFrame {
    private Aluno a;
    public Turma t;
   
    /**
     * Creates new form TelaAlunoTrancamento
     */
    
    
    public TelaAlunoTrancamento(Aluno a) {
        initComponents();
        this.a = a;
        jLabel1.setText(a.getNomeComp());
        t = new Turma("");
        
    }
    
    public void buscaTurmaTranca(Aluno a, Turma t){
       
        first:
        for(int i = 0; i< disciplinas.size(); i++){
            second:
            for(int j=0; j< disciplinas.get(i).getTurmas().size();j++){
                if(disciplinas.get(i).getTurmas().get(j) == t){
                    disciplinas.get(i).getTurmas().get(j).tranca(a);
                    a.minhasTurmas.remove(t);
                    break first;
                }
            }
        }
    }

   public void confExistenciaTurma1(Aluno a, Turma t){
       first: 
       for(int i = 0; i< disciplinas.size(); i++){
            for(int j=0; j< disciplinas.get(i).getTurmas().size();j++){
                if(disciplinas.get(i).getTurmas().get(j) == t){
                    jCheckBox1.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo());
                    break first;
                }
                else{
                    jCheckBox1.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo() +" TRANCADA");
                }
                
           }
       }    
   }        
    public void confExistenciaTurma2(Aluno a, Turma t){
       first: 
       for(int i = 0; i< disciplinas.size(); i++){
            for(int j=0; j< disciplinas.get(i).getTurmas().size();j++){
                if(disciplinas.get(i).getTurmas().get(j) == t){
                    jCheckBox2.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo());
                    break first;
                }
                else{
                    jCheckBox2.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo() +" TRANCADA");
                }
                
            }
       }    
    }        
     public void confExistenciaTurma3(Aluno a, Turma t){
       first: 
       for(int i = 0; i< disciplinas.size(); i++){
            for(int j=0; j< disciplinas.get(i).getTurmas().size();j++){
                if(disciplinas.get(i).getTurmas().get(j) == t){
                    jCheckBox3.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo());
                    break first;
                }
                else{
                    jCheckBox3.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo() +" TRANCADA");
                }
                
            } 
       }
     }   
    /**
     *
     * @param a4
     * @param t1
     */
    public void confExistenciaTurma4(Aluno a, Turma t){
       first: 
       for(int i = 0; i< disciplinas.size(); i++){
            for(int j=0; j< disciplinas.get(i).getTurmas().size();j++){
                if(disciplinas.get(i).getTurmas().get(j) == t){
                    jCheckBox4.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo());
                    break first;
                }
                else{
                    jCheckBox4.setText(disciplinas.get(i).getNome() +" - "+ t.getCodigo() +" TRANCADA");
                }
                
            }
       }
       
   }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome do Aluno");

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("jCheckBox2");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("jCheckBox3");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("jCheckBox4");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(28, 28, 28)
                .addComponent(jCheckBox2)
                .addGap(33, 33, 33)
                .addComponent(jCheckBox3)
                .addGap(37, 37, 37)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        salvaAlunos(alunos);
        salvaDisciplinas(disciplinas);
        salvaProfessores(professores);
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        System.out.println("Abri janela");  
        disciplinas = retornarArquivoDisciplina(Constantes.ARQUIVO_DISCIPLINAS);
          confExistenciaTurma1(a,a.minhasTurmas.get(0));
          confExistenciaTurma2(a,a.minhasTurmas.get(1));
          confExistenciaTurma3(a,a.minhasTurmas.get(2));
          confExistenciaTurma4(a,a.minhasTurmas.get(3));
         
    }//GEN-LAST:event_formWindowOpened

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        buscaTurmaTranca(a, a.minhasTurmas.get(0));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        buscaTurmaTranca(a, a.minhasTurmas.get(1));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        buscaTurmaTranca(a, a.minhasTurmas.get(2));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        buscaTurmaTranca(a, a.minhasTurmas.get(3));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlunoTrancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlunoTrancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlunoTrancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlunoTrancamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaAlunoTrancamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
