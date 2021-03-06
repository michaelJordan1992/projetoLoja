/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.VendedorController;
import Model.Vendedor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class GuiDeletarVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiDeletarVendedor
     */
    public GuiDeletarVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void deletar() throws Exception{
        try{
            Vendedor v = new Vendedor();
            VendedorController vc = new VendedorController();
            
            v.setIdVendedor(Integer.parseInt(jtf_CodVendedor.getText()));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
            null,
                    "O seguinte erro ocorreu: " + ex.getMessage());
            
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_CodVendedor = new javax.swing.JLabel();
        jb_Deletar = new javax.swing.JButton();
        jtf_CodVendedor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Exclusão de Vendedor");

        jl_CodVendedor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jl_CodVendedor.setText("Código do Vendedor");

        jb_Deletar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jb_Deletar.setText("Deletar");
        jb_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_DeletarActionPerformed(evt);
            }
        });

        jtf_CodVendedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_CodVendedor)
                .addGap(18, 18, 18)
                .addComponent(jtf_CodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_CodVendedor)
                    .addComponent(jtf_CodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jb_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DeletarActionPerformed
        try {
            deletar();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jb_DeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Deletar;
    private javax.swing.JLabel jl_CodVendedor;
    private javax.swing.JTextField jtf_CodVendedor;
    // End of variables declaration//GEN-END:variables
}
