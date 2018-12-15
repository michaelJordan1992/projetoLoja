

package View;

import Controller.ProdutoController;

import Model.Produto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class GuiAtualizaProduto extends javax.swing.JInternalFrame {
    DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
    new Object[]{"ID","NOME","MARCA","COR","MODELO","VALOR",});
    
    public GuiAtualizaProduto() {
        super("Alterar Produto");
        initComponents();
    }
    private void inserirDados() throws Exception{
        tabela_Produto.setModel(dtm);
        ProdutoController pc = new ProdutoController();
        ArrayList<Produto> produto = new ArrayList<>();
        Produto p = new Produto();
        p.setIdProduto(Integer.valueOf(jtf_BuscaProdutoId.getText()));
        produto =  pc.buscarProdutosId(p);
        pc.buscarProdutosId(p);
        
        dtm.setNumRows(0);
        
        for(int i = 0; i < produto.size(); i++){
            
            dtm.addRow(new String[]{
           
            Integer.toString(produto.get(i).getIdProduto()),
            produto.get(i).getNomeProduto(),
            produto.get(i).getMarca(),
            produto.get(i).getCor(),
            produto.get(i).getModelo(),
            Double.toString(produto.get(i).getValor()),
        });
        }
        
    }
    private void atualizarProduto()throws Exception{
        try{
        
        ProdutoController pc = new ProdutoController();
        Produto p = new Produto();
        
        p.setIdProduto(Integer.parseInt(jtf_BuscaProdutoId.getText()));
        p.setNomeProduto(jtf_Nome.getText());
        p.setMarca(jtf_Marca.getText());
        p.setCor(jtf_Cor.getText());
        p.setModelo(jtf_Modelo.getText());
        p.setValor(Double.parseDouble(jtf_Valor.getText()));
        
        jtf_BuscaProdutoId.setText("");
        jtf_Nome.setText("");
        jtf_Marca.setText("");
        jtf_Cor.setText("");
        jtf_Modelo.setText("");
        jtf_Valor.setText("");
        
        
        pc.atualizarProdutoId(p);
        
    }catch(Exception ex){
            JOptionPane.showMessageDialog(
            null, 
                    "Erro: "+ex.getMessage());
    }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Cor = new javax.swing.JLabel();
        jl_Modelo = new javax.swing.JLabel();
        jl_Valor = new javax.swing.JLabel();
        jtf_Nome = new javax.swing.JTextField();
        jtf_Marca = new javax.swing.JTextField();
        jtf_Cor = new javax.swing.JTextField();
        jtf_Modelo = new javax.swing.JTextField();
        jtf_Valor = new javax.swing.JTextField();
        jl_Produto = new javax.swing.JLabel();
        jl_Marca = new javax.swing.JLabel();
        jl_IdVendedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_Produto = new javax.swing.JTable();
        jtf_BuscaProdutoId = new javax.swing.JTextField();
        jb_Buscar = new javax.swing.JButton();
        jb_Atualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_Cor.setText("Cor:");

        jl_Modelo.setText("Modelo:");

        jl_Valor.setText("Valor R$:");

        jl_Produto.setText("Produto:");

        jl_Marca.setText("Marca:");

        jl_IdVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_IdVendedor.setText("Digite o ID:");

        tabela_Produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "MARCA", "COR", "MODELO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_ProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_Produto);

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jb_Atualizar.setText("Atualizar");
        jb_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_Valor)
                    .addComponent(jl_Modelo)
                    .addComponent(jl_Cor)
                    .addComponent(jl_Marca)
                    .addComponent(jl_Produto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_Marca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_Modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jtf_Valor, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtf_Cor, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(96, 96, 96)
                .addComponent(jb_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 116, Short.MAX_VALUE)
                .addComponent(jl_IdVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_BuscaProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jb_Buscar)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_IdVendedor)
                    .addComponent(jtf_BuscaProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Produto)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Marca)
                    .addComponent(jtf_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cor)
                    .addComponent(jtf_Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Modelo)
                            .addComponent(jtf_Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Valor)
                            .addComponent(jtf_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jb_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_ProdutoMouseClicked
       int linha = tabela_Produto.getSelectedRow();
       jtf_Nome.setText(tabela_Produto.getValueAt(linha, 1).toString());
       jtf_Marca.setText(tabela_Produto.getValueAt(linha, 2).toString());
       jtf_Cor.setText(tabela_Produto.getValueAt(linha, 3).toString());
       jtf_Modelo.setText(tabela_Produto.getValueAt(linha, 4).toString());
       jtf_Valor.setText(tabela_Produto.getValueAt(linha, 5).toString());
    }//GEN-LAST:event_tabela_ProdutoMouseClicked

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        try {
            inserirDados();
        } catch (Exception ex) {
            Logger.getLogger(GuiAtualizaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AtualizarActionPerformed
        try {
            atualizarProduto();
        } catch (Exception ex) {
            Logger.getLogger(GuiAtualizaProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_AtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Atualizar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JLabel jl_Cor;
    private javax.swing.JLabel jl_IdVendedor;
    private javax.swing.JLabel jl_Marca;
    private javax.swing.JLabel jl_Modelo;
    private javax.swing.JLabel jl_Produto;
    private javax.swing.JLabel jl_Valor;
    private javax.swing.JTextField jtf_BuscaProdutoId;
    private javax.swing.JTextField jtf_Cor;
    private javax.swing.JTextField jtf_Marca;
    private javax.swing.JTextField jtf_Modelo;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_Valor;
    private javax.swing.JTable tabela_Produto;
    // End of variables declaration//GEN-END:variables

}
