package View;

import Controller.ClienteController;
import Model.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class GuiDeletarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiDeletarCliente
     */
    public GuiDeletarCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    private void limpar(){
        jtf_DeletaCliente.setText("");
    }
    private void deletar() throws Exception{
        Cliente c = new Cliente();
        ClienteController cc = new ClienteController();
        
        if(jrb_DeletaClienteId.isSelected()){
                        if(jtf_DeletaCliente.getText().isEmpty()){
                JOptionPane.showMessageDialog(
                null,
                        "Campo não pode ser vazio!!!");
                        }else{
                
                        }
           
            c.setIdCliente(Integer.parseInt(jtf_DeletaCliente.getText()));
            cc.deletarClienteId(c);
        }
        if(jrb_DeletaClienteCpf.isSelected()){
                        if(jtf_DeletaCliente.getText().isEmpty()){
                JOptionPane.showMessageDialog(
                null,
                        "Campo não pode ser vazio!!!");
                        }else{
                            
                        }
            c.setCpf(jtf_DeletaCliente.getText());
            cc.deletarClienteCpf(c);
        }
        if(jrb_DeletaClienteRg.isSelected()){
                        if(jtf_DeletaCliente.getText().isEmpty()){
                JOptionPane.showMessageDialog(
                null,
                        "Campo não pode ser vazio!!!");
                        }else{
                            
                        }
            c.setRg(jtf_DeletaCliente.getText());
            cc.deletarClienteRg(c);
        }else{
            
        }
        limpar();
        
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_DeletarCliente = new javax.swing.ButtonGroup();
        jrb_DeletaClienteId = new javax.swing.JRadioButton();
        jrb_DeletaClienteRg = new javax.swing.JRadioButton();
        jrb_DeletaClienteCpf = new javax.swing.JRadioButton();
        jtf_DeletaCliente = new javax.swing.JTextField();
        jb_Deletar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Exclusão de Cliente ");

        bg_DeletarCliente.add(jrb_DeletaClienteId);
        jrb_DeletaClienteId.setSelected(true);
        jrb_DeletaClienteId.setText("Deletar Cliente por ID:");

        bg_DeletarCliente.add(jrb_DeletaClienteRg);
        jrb_DeletaClienteRg.setText("Deletar Cliente por RG:");

        bg_DeletarCliente.add(jrb_DeletaClienteCpf);
        jrb_DeletaClienteCpf.setText("Deletar Cliente por CPF:");

        jb_Deletar.setText("Deletar");
        jb_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_DeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jrb_DeletaClienteId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_DeletaClienteRg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrb_DeletaClienteCpf))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jtf_DeletaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jb_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_DeletaClienteId)
                    .addComponent(jrb_DeletaClienteRg)
                    .addComponent(jrb_DeletaClienteCpf))
                .addGap(32, 32, 32)
                .addComponent(jtf_DeletaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jb_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DeletarActionPerformed
        try {
            deletar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
            null,
                    "O seguinte erro ocorreu: " +ex.getMessage());
        }
    }//GEN-LAST:event_jb_DeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_DeletarCliente;
    private javax.swing.JButton jb_Deletar;
    private javax.swing.JRadioButton jrb_DeletaClienteCpf;
    private javax.swing.JRadioButton jrb_DeletaClienteId;
    private javax.swing.JRadioButton jrb_DeletaClienteRg;
    private javax.swing.JTextField jtf_DeletaCliente;
    // End of variables declaration//GEN-END:variables
}
