
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
        super ("Pesquisar Cliente");
        initComponents();
        this.buscarTodosCLientes();
    }
    private void buscarTodosCLientes(){
        try{
            tabela_Cliente.setModel(dtm);
            ClienteController cc = new ClienteController();
            ArrayList<Cliente> cliente = new ArrayList<>();
            cliente = cc.buscarTodosClientes();
            
            dtm.setNumRows(0);
                        
            for(int i = 0; i < cliente.size(); i++){
                dtm.addRow(new Object[]{    
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
                    "Erro: "+ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Cliente = new javax.swing.JTable();
        jl_Clientes = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tabela_Cliente.setModel(new javax.swing.table.DefaultTableModel(
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
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_Cliente);

        jl_Clientes.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jl_Clientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jl_Clientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_Clientes;
    private javax.swing.JTable tabela_Cliente;
    // End of variables declaration//GEN-END:variables
}
