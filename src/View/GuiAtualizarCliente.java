/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Model.Cliente;
import java.awt.JobAttributes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class GuiAtualizarCliente extends javax.swing.JInternalFrame {
     DefaultTableModel dtm = new DefaultTableModel(new Object[][]{},
    new Object[]{"ID","NOME","CPF","RG","CELULAR","ENDERECO","CIDADE","ESTADO",});

    public GuiAtualizarCliente() throws Exception {
        initComponents();       
        
    }
     private void inserirdados() throws Exception{ 
            tabela_ClienteCpf.setModel(dtm);
            ClienteController cc = new ClienteController();
            ArrayList<Cliente> cliente = new ArrayList<>();
            Cliente c = new Cliente();
            c.setCpf(jtf_BuscaPorCliente.getText());
            cliente = cc.buscarClienteCpf(c);
            cc.buscarClienteCpf(c);
            
        
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
    }
    private void atualizaCliente()throws SQLException{
           try{
            
            ClienteController cc = new ClienteController();
            Cliente c = new Cliente();   
            
            
            c.setNome(jtf_Nome.getText());
            c.setCpf(jtf_Cpf.getText());
            c.setRg(jtf_Rg.getText());
            c.setCelular(jtf_Celular.getText());
            c.setEndereco(jtf_Endereco.getText());
            c.setCidade(jtf_Cidade.getText());
            c.setEstado((String) jcb_Estado.getModel().getSelectedItem());
            
            jtf_Nome.setText("");
            jtf_Cpf.setText("");
            jtf_Rg.setText("");
            jtf_Celular.setText("");
            jtf_Endereco.setText("");
            jtf_Cidade.setText("");
            jcb_Estado.setToolTipText("");
            
            cc.atualizarClienteCpf(c);
           
           }catch(Exception ex){
               JOptionPane.showMessageDialog(
                       null,
                       "Algum erro ocorreu: " + ex.getMessage());
           }
           
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtf_Rg = new javax.swing.JTextField();
        jtf_Cpf = new javax.swing.JTextField();
        jl_CPF = new javax.swing.JLabel();
        jtf_Cidade = new javax.swing.JTextField();
        jl_RG = new javax.swing.JLabel();
        jcb_Estado = new javax.swing.JComboBox<>();
        jl_Celular = new javax.swing.JLabel();
        jl_Endereco = new javax.swing.JLabel();
        jl_Cidade = new javax.swing.JLabel();
        jtf_Endereco = new javax.swing.JTextField();
        jl_Estado = new javax.swing.JLabel();
        jtf_Celular = new javax.swing.JTextField();
        jtf_Nome = new javax.swing.JTextField();
        jl_Nome = new javax.swing.JLabel();
        jb_Atualizar = new javax.swing.JButton();
        jtf_BuscaPorCliente = new javax.swing.JTextField();
        jl_DigCPF = new javax.swing.JLabel();
        jb_BuscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_ClienteCpf = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jl_CPF.setText("CPF:");

        jl_RG.setText("RG:");

        jcb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Escolha uma opção>", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        jl_Celular.setText("Celular:");

        jl_Endereco.setText("Endereço:");

        jl_Cidade.setText("Cidade:");

        jl_Estado.setText("Estado:");

        jl_Nome.setText("Nome:");

        jb_Atualizar.setText("Atualizar");
        jb_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AtualizarActionPerformed(evt);
            }
        });

        jl_DigCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_DigCPF.setText("Digite o CPF do Cliente:");

        jb_BuscarCliente.setText("Buscar");
        jb_BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarClienteActionPerformed(evt);
            }
        });

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
        tabela_ClienteCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_ClienteCpfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_ClienteCpf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jl_Estado)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jl_DigCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_BuscaPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jb_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 147, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jl_Endereco)
                                    .addComponent(jl_Nome)
                                    .addComponent(jl_Cidade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jl_CPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtf_Cidade)
                                            .addComponent(jtf_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jl_RG)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtf_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jl_Celular)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(343, 343, 343))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_DigCPF)
                    .addComponent(jtf_BuscaPorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nome)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_CPF)
                    .addComponent(jtf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_RG)
                    .addComponent(jtf_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Celular)
                    .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Cidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Estado)
                    .addComponent(jcb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jb_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarClienteActionPerformed
         try {
             inserirdados();
         } catch (Exception ex) {
             Logger.getLogger(GuiAtualizarCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
         
    }//GEN-LAST:event_jb_BuscarClienteActionPerformed

    private void tabela_ClienteCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_ClienteCpfMouseClicked
        int linha = tabela_ClienteCpf.getSelectedRow();
        jtf_Nome.setText(tabela_ClienteCpf.getValueAt(linha, 1).toString());
        jtf_Cpf.setText(tabela_ClienteCpf.getValueAt(linha,2).toString());
        jtf_Rg.setText(tabela_ClienteCpf.getValueAt(linha, 3).toString());
        jtf_Celular.setText(tabela_ClienteCpf.getValueAt(linha, 4).toString());
        jtf_Endereco.setText(tabela_ClienteCpf.getValueAt(linha, 5).toString());
        jtf_Cidade.setText(tabela_ClienteCpf.getValueAt(linha, 6).toString());
        jcb_Estado.setSelectedItem(tabela_ClienteCpf.getValueAt(linha, 7).toString());
       
        
    }//GEN-LAST:event_tabela_ClienteCpfMouseClicked

    private void jb_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AtualizarActionPerformed
       try {
             atualizaCliente();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(
             null,
                    "Erro: "+ex.getMessage());
         }
         
    }//GEN-LAST:event_jb_AtualizarActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Atualizar;
    private javax.swing.JButton jb_BuscarCliente;
    private javax.swing.JComboBox<String> jcb_Estado;
    private javax.swing.JLabel jl_CPF;
    private javax.swing.JLabel jl_Celular;
    private javax.swing.JLabel jl_Cidade;
    private javax.swing.JLabel jl_DigCPF;
    private javax.swing.JLabel jl_Endereco;
    private javax.swing.JLabel jl_Estado;
    private javax.swing.JLabel jl_Nome;
    private javax.swing.JLabel jl_RG;
    private javax.swing.JTextField jtf_BuscaPorCliente;
    private javax.swing.JTextField jtf_Celular;
    private javax.swing.JTextField jtf_Cidade;
    private javax.swing.JTextField jtf_Cpf;
    private javax.swing.JTextField jtf_Endereco;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_Rg;
    private javax.swing.JTable tabela_ClienteCpf;
    // End of variables declaration//GEN-END:variables

}