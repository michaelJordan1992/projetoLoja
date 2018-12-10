
package View;

import Controller.ProdutoController;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class GuiBuscaProduto extends javax.swing.JInternalFrame {
        DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
           new Object[]{"ID","NOME","MARCA","COR","MODELO","VALOR",});
    public GuiBuscaProduto() {
        super("Busca por Produto");
        initComponents();
    }
    private void buscarProdutoId()throws Exception{
        try{
            tabela_BuscaProduto.setModel(dtm);
            ProdutoController pc = new ProdutoController();
            ArrayList<Produto> produto = new ArrayList<>();
            Produto p = new Produto();
            p.setIdProduto(Integer.parseInt(jtf_BuscaProduto.getText()));
            produto = pc.buscarProdutosId(p);
            
            dtm.setNumRows(0);
            
             for(int i=0; i < produto.size(); i++){
            dtm.addRow(new String[]{
                Integer.toString(produto.get(i).getIdProduto()),
                produto.get(i).getNomeProduto(),
                produto.get(i).getMarca(),
                produto.get(i).getCor(),
                produto.get(i).getCor(),
                Double.toString(produto.get(i).getValor()),
            });
            
            }
            }catch(Exception ex){
            JOptionPane.showMessageDialog(
            null,
                    "O seguinte erro ocorreu: "+ ex.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtf_BuscaProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_BuscaProduto = new javax.swing.JTable();
        jb_BuscarProduto = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Busca Produto ID");

        tabela_BuscaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PRODUTO", "MARCA", "COR", "MODELO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_BuscaProduto);

        jb_BuscarProduto.setText("Buscar");
        jb_BuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_BuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jb_BuscarProduto)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_BuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_BuscarProduto))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarProdutoActionPerformed
       try{
           buscarProdutoId();
       }catch(Exception ex){
           JOptionPane.showMessageDialog(
           null,
                   "ERRO!!!");
       }
    }//GEN-LAST:event_jb_BuscarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_BuscarProduto;
    private javax.swing.JTextField jtf_BuscaProduto;
    private javax.swing.JTable tabela_BuscaProduto;
    // End of variables declaration//GEN-END:variables
}
