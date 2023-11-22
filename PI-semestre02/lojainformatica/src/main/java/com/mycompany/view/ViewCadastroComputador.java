/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.dao.ComputadorDAO;
import com.mycompany.model.Computador;
import javax.swing.JOptionPane;

/**
 *
 * @author janaina costa
 */
public class ViewCadastroComputador extends javax.swing.JFrame {

    Computador obj = null;
    
    public ViewCadastroComputador() {
        initComponents();
    }
    
    public ViewCadastroComputador(Computador objAlterar) {
        initComponents();
        
        this.obj = objAlterar;
        
        lblID.setText( String.valueOf(obj.getIdComputador()));
        txtHd.setText(String.valueOf(obj.getHd()));
        txtProcessador.setText(String.valueOf(obj.getProcessador()));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tela = new javax.swing.JPanel();
        txtHd = new javax.swing.JTextField();
        HD = new javax.swing.JLabel();
        Processador = new javax.swing.JLabel();
        txtProcessador = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HD.setText("HD");

        Processador.setText("Processador");

        txtProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProcessadorActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Cadastro PC");

        lblID.setText("0");

        jLabel2.setText("Marca");

        lblMarca.setText("JanainaCosta");

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblID)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Processador)
                            .addComponent(HD)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca))))
                .addGap(51, 51, 51))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblID))
                .addGap(49, 49, 49)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HD)
                    .addComponent(txtHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Processador))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
      if(obj == null){
            
            int hd = Integer.parseInt(txtHd.getText());
            String processador = txtProcessador.getText();

            Computador novoComputador = new Computador(hd, hd, processador);

            boolean retorno = ComputadorDAO.salvar(novoComputador);

            if(retorno == true){
                JOptionPane.showMessageDialog(rootPane, "Sucesso ");
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Falha!");
            }
            
        }else{
            int hd = Integer.parseInt(txtHd.getText());
            String processador = txtProcessador.getText();
            
            obj.setHd(hd);
            obj.setProcessador(processador);
            
            boolean retorno = ComputadorDAO.alterar(obj);
            
            if(retorno == true){
                JOptionPane.showMessageDialog(rootPane, "Sucesso!");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Falha!");
            }
            this.dispose();   
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcessadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcessadorActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewCadastroComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HD;
    private javax.swing.JLabel Processador;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JPanel tela;
    private javax.swing.JTextField txtHd;
    private javax.swing.JTextField txtProcessador;
    // End of variables declaration//GEN-END:variables
}
