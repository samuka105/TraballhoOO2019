/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo.viewInterfacesGraficas;

/**
 *
 * @author Enedilson
 */



import com.google.gson.Gson;
import com.mycompany.ArquivosDeDados.Arquivo;
import com.mycompany.trabalhooo.Dados;
import static com.mycompany.trabalhooo.Dados.disciplinas;
import static com.mycompany.trabalhooo.Dados.professores;
import static com.mycompany.trabalhooo.Dados.salvaDisciplinas;
import com.mycompany.trabalhooo.Disciplina;
import com.mycompany.trabalhooo.Professor;
import com.mycompany.trabalhooo.Turma;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




//RECEBE OS DADOS DE MATRÍCULAR E ADICIONA EM TURMA, CRIA TURMA, DADOS DE PROFESSORES ASSOCIANDO COM TURMA .. DADOS EM ARQUIVOS
public class TelaDisciplinaDados extends javax.swing.JFrame {


 //DADOS DOS PROFESSORES PARA ASSOCIÁ-LOS
    
    /**
     * Creates new form TelaDisciplinaDados
     */
    public TelaDisciplinaDados() {
        initComponents();   
    }
    
    private void adicionaDisciplina() {
        Turma a = new Turma("A", Constantes.MAX_ALUNOS);
        Turma b = new Turma("B", Constantes.MAX_ALUNOS);
        Professor p1 = buscaProf(jtfProfessorA.getText());
        Professor p2 = buscaProf(jtfProfessorB.getText());
        a.AlocaProfTurma(p1);
        b.AlocaProfTurma(p2);
        Disciplina d = new Disciplina();
        d.setNome(jtfNomeDisc.getText());
        d.setCodigo(jTextField1.getText());
        d.turmas.add(a); d.turmas.add(b);
        disciplinas.add(d);
        salvaDisciplinas(disciplinas);
        

    }
    
    
    
    private Professor buscaProf(String nome) {
        //try{
        int i = 0;
        while(i < professores.size()){
            if(professores.get(i).getNomeComp().equals(nome)) return professores.get(i);
            i++;
        }
        //throw new Exception();
        //}catch(Exception a){
        //    JOptionPane.showMessageDialog(null,"Professor nao existe!");
        //}
        JOptionPane.showMessageDialog(null, "Professor nao encontrado!");
        return null;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfTurmaA = new javax.swing.JTextField();
        jtfTurmaB = new javax.swing.JTextField();
        jlNomeDisc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbDiscVoltar = new javax.swing.JButton();
        jbAdicionarDisc = new javax.swing.JButton();
        jtfNomeDisc = new javax.swing.JTextField();
        jtfProfessorA = new javax.swing.JTextField();
        jtfProfessorB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jtfTurmaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTurmaAActionPerformed(evt);
            }
        });

        jtfTurmaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTurmaBActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jlNomeDisc.setText("Nome");

        jLabel3.setText("Turmas");

        jLabel5.setText("Professor");

        jLabel7.setText("Professor");

        jbDiscVoltar.setText("Voltar");
        jbDiscVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDiscVoltarActionPerformed(evt);
            }
        });

        jbAdicionarDisc.setText("Adicionar");
        jbAdicionarDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarDiscActionPerformed(evt);
            }
        });

        jtfNomeDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeDiscActionPerformed(evt);
            }
        });

        jtfProfessorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProfessorAActionPerformed(evt);
            }
        });

        jtfProfessorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfProfessorBActionPerformed(evt);
            }
        });

        jLabel1.setText("A");

        jLabel8.setText("B");

        jLabel9.setText("Codigo");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNomeDisc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNomeDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfProfessorB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfProfessorA, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jbDiscVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAdicionarDisc)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeDisc)
                    .addComponent(jtfNomeDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfProfessorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfProfessorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDiscVoltar)
                    .addComponent(jbAdicionarDisc))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAdicionarDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarDiscActionPerformed
     //try {
         // TODO add your handling code here:
         adicionaDisciplina();
         System.out.println("Disciplina adicionada");
         jTextField1.setText(" ");
         jtfNomeDisc.setText(" ");
         jtfProfessorA.setText(" ");
         jtfProfessorB.setText(" ");
     //} catch (Exception ex) {
       //  JOptionPane.showMessageDialog(null, "Erro no preenchimento");
     //}
    }//GEN-LAST:event_jbAdicionarDiscActionPerformed

    private void jtfNomeDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeDiscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeDiscActionPerformed

    private void jtfTurmaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTurmaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTurmaAActionPerformed

    private void jtfTurmaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTurmaBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTurmaBActionPerformed

    private void jtfProfessorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProfessorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProfessorAActionPerformed

    private void jbDiscVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiscVoltarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jbDiscVoltarActionPerformed

    private void jtfProfessorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfProfessorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfProfessorBActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        salvaDisciplinas(disciplinas);
        
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(TelaDisciplinaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDisciplinaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaDisciplinaDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbAdicionarDisc;
    private javax.swing.JButton jbDiscVoltar;
    private javax.swing.JLabel jlNomeDisc;
    private javax.swing.JTextField jtfNomeDisc;
    private javax.swing.JTextField jtfProfessorA;
    private javax.swing.JTextField jtfProfessorB;
    private javax.swing.JTextField jtfTurmaA;
    private javax.swing.JTextField jtfTurmaB;
    // End of variables declaration//GEN-END:variables
}
