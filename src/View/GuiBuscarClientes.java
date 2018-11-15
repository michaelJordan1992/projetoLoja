
package View;

import Controller.ClienteController;
import Model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class GuiBuscarClientes extends javax.swing.JInternalFrame {
    DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
    new Object[]{"ID","NOME","CPF","RG","CELULAR","ENDERECO","CIDADE","ESTADO",});
    
    public GuiBuscarClientes() {
        super ("Pesquisar Pessoas");
        initComponents();
    }
    private void buscarTodosCLientes(){
        try{
            tabela_Cliente.setModel(dtm);
            ClienteController cc = new ClienteController();
            ArrayList<Cliente> cliente = new ArrayList<>();
            cc.buscarTodosClientes();
            dtm.setNumRows(8);
            
            for(int i = 0; i < cliente.size(); i++){
                dtm.addRow(new String[]{
                    
                    cliente.get(i).getNome(),
                    cliente.get(i).getCpf(),
                    cliente.get(i).getRg(),
                    cliente.get(i).getEndereco(),
                    cliente.get(i).getCidade(),
                    cliente.get(i).getEstado()
                });
                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
            null,
                    "Erro: "+ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Cliente = new javax.swing.JTable();
        jb_Buscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabela_Cliente);

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jb_Buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jb_Buscar)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        buscarTodosCLientes();
    }//GEN-LAST:event_jb_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JTable tabela_Cliente;
    // End of variables declaration//GEN-END:variables
}
