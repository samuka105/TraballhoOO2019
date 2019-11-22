/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalhooo.viewInterfacesGraficas;

import com.mycompany.trabalhooo.Disciplina;
import com.mycompany.trabalhooo.Professor;
import java.util.List;

/**
 *
 * @author Enedilson
 */
public class TelaProfessorMinhasDisciplinas extends javax.swing.JFrame {
    private Professor p;
    private Disciplina d;
    //public List<Disciplina> disciplinas;
    /**
     * Creates new form TelaProfessorMinhasDisciplinas
     */
    public TelaProfessorMinhasDisciplinas(Professor p) {
        initComponents();
        this.d = d;
        this.p = p;
        //this.disciplinas = disc;
        jLabel1.setText(p.disciplinasProf.get(0).getNome());
        jLabel2.setText(p.disciplinasProf.get(1).getNome());
    }
//    private Disciplina buscaDisciplina(String disc){
//        int i = 0;
//        while(i<telaDisc.disciplinas.size()){
//            if(telaDisc.disciplinas.get(i).getNome().equals(disc)) return telaDisc.disciplinas.get(i);
//        }
//        return null;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVolta = new javax.swing.JButton();
        jbDisciplinaA = new javax.swing.JButton();
        jbDisciplinaB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbVolta.setText("Voltar");
        jbVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltaActionPerformed(evt);
            }
        });

        jbDisciplinaA.setText("Acessar");
        jbDisciplinaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDisciplinaAActionPerformed(evt);
            }
        });

        jbDisciplinaB.setText("Acessar");
        jbDisciplinaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDisciplinaBActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jbVolta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbDisciplinaA, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jbDisciplinaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDisciplinaA)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbDisciplinaB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jbVolta)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltaActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jbVoltaActionPerformed

    private void jbDisciplinaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDisciplinaAActionPerformed
        // TODO add your handling code here:
        d = p.disciplinasProf.get(0);
        TelaProfessorLancaNota telaProfNota = new TelaProfessorLancaNota(d, p);
        telaProfNota.setVisible(true);
    }//GEN-LAST:event_jbDisciplinaAActionPerformed

    private void jbDisciplinaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDisciplinaBActionPerformed
        // TODO add your handling code here:
        d = p.disciplinasProf.get(1);
        TelaProfessorLancaNota telaProfNota = new TelaProfessorLancaNota(d, p);
        telaProfNota.setVisible(true);
    }//GEN-LAST:event_jbDisciplinaBActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProfessorMinhasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProfessorMinhasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProfessorMinhasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProfessorMinhasDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaProfessorMinhasDisciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbDisciplinaA;
    private javax.swing.JButton jbDisciplinaB;
    private javax.swing.JButton jbVolta;
    // End of variables declaration//GEN-END:variables
}
