
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
public class GuiBuscarProdutos extends javax.swing.JInternalFrame {
    
    DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
    new Object[]{"ID","NOME","MARCA","COR","MODELO","VALOR"});
    public GuiBuscarProdutos() {
        super("Pesquisar Produto");
        initComponents();
        this.buscarTodosProdutos();
    }
      private void buscarTodosProdutos(){
        try{
            tabela_Produto.setModel(dtm);
            ProdutoController pc = new ProdutoController();
            ArrayList<Produto> produto = new ArrayList<>();
            produto = pc.buscarProdutos();
            
            dtm.setNumRows(0);
                        
            for(int i = 0; i < produto.size(); i++){
                dtm.addRow(new Object[]{    
                    Integer.toString(produto.get(i).getIdProduto()),
                    produto.get(i).getNomeProduto(),
                    produto.get(i).getMarca(),
                    produto.get(i).getCor(),
                    produto.get(i).getModelo(),
                    Double.toString(produto.get(i).getValor()),
                });
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(
            null,
                    "O Seguinte Erro Ocorreu: "+ex.getMessage());
        }
    }
            

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Produtos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Produto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_Produtos.setText("Produtos");

        tabela_Produto.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabela_Produto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_Produtos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_Produtos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_Produtos;
    private javax.swing.JTable tabela_Produto;
    // End of variables declaration//GEN-END:variables
}
