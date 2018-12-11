
package View;

import Controller.VendedorController;
import Model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class GuiBuscarVendedores extends javax.swing.JInternalFrame {
    DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
    new Object[]{"ID","NOME",});
    public GuiBuscarVendedores() {
        super("Pesquisa Vendedor");
        initComponents();
        this.buscarTodosVendedores();
    }
    private void buscarTodosVendedores(){
        try{
            tabela_Vendedores.setModel(dtm);
            VendedorController vc = new VendedorController();
            ArrayList<Vendedor> vendedor = new ArrayList<Vendedor>();
            vendedor = vc.buscarTodosVendedores();
            dtm.setNumRows(0);
            
            for(int i = 0; i < vendedor.size(); i++){
                dtm.addRow(new Object[]{
                Integer.toString(vendedor.get(i).getIdVendedor()),
                vendedor.get(i).getNomeVendedor(),
                });
            }
                 
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(
            null,
                    "O Seguinte erro ocorreu: "+ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Vendedores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Vendedores = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_Vendedores.setText("Vendedores");

        tabela_Vendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOME DO VENDEDOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_Vendedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jl_Vendedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Vendedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_Vendedores;
    private javax.swing.JTable tabela_Vendedores;
    // End of variables declaration//GEN-END:variables
}
