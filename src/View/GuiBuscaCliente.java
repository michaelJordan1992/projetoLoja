package View;

import Controller.ClienteController;
import Model.Cliente;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class GuiBuscaCliente extends javax.swing.JInternalFrame {
    DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
    new Object[]{"ID","NOME","CPF","RG","CELULAR","ENDERECO","CIDADE","ESTADO",});
    
    public GuiBuscaCliente() throws Exception{
        super("Buscar Cliente por CPF");
        initComponents();
        this.buscarClienteCPF();
        
    }
    
                
    private void buscarClienteCPF()throws Exception{
        try{
            tabela_ClienteCpf.setModel(dtm);
            ClienteController cc = new ClienteController();
            ArrayList<Cliente> cliente = new ArrayList<>();
            Cliente c = new Cliente();
            c.setCpf(jtf_BuscaPorCliente.getText());
            cliente = cc.buscarClienteCpf(c);
 
            dtm.setNumRows(0);
                  
              
            
        for(int i=0; i < cliente.size(); i++){
            
                
                dtm.addRow(new String[]{
                               
                Integer.toString(cliente.get(i).getIdCliente()),
                cliente.get(i).getNome(),
                cliente.get(i).getCpf(),
                cliente.get(i).getRg(),
                cliente.get(i).getCelular(),
                cliente.get(i).getEndereco(),
                cliente.get(i).getCidade(),
                cliente.get(i).getEstado()
                
            });
            
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
                null, 
                    "O seguinte Erro ocorreu: "+ex.getMessage());
        }
   }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_BuscaPorCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_ClienteCpf = new javax.swing.JTable();
        jl_DigCPF = new javax.swing.JLabel();
        jb_BuscarCliente = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tabela_ClienteCpf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "RG", "CELULAR", "ENDEREÇO", "CIDADE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_ClienteCpf.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_ClienteCpf);

        jl_DigCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_DigCPF.setText("Digite o CPF do Cliente:");

        jb_BuscarCliente.setText("Buscar");
        jb_BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jl_DigCPF)
                .addGap(18, 18, 18)
                .addComponent(jtf_BuscaPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jb_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_DigCPF)
                    .addComponent(jtf_BuscaPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarClienteActionPerformed
        try {
            buscarClienteCPF();
        } catch (Exception ex) {
            Logger.getLogger(GuiBuscaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_BuscarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_BuscarCliente;
    private javax.swing.JLabel jl_DigCPF;
    private javax.swing.JTextField jtf_BuscaPorCliente;
    private javax.swing.JTable tabela_ClienteCpf;
    // End of variables declaration//GEN-END:variables
}
