
package View;

import Controller.ClienteController;
import Model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class GuiCadastroCliente extends javax.swing.JInternalFrame {

   
    public GuiCadastroCliente() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Nome = new javax.swing.JLabel();
        jl_CPF = new javax.swing.JLabel();
        jl_RG = new javax.swing.JLabel();
        jl_Celular = new javax.swing.JLabel();
        jl_Endereco = new javax.swing.JLabel();
        jl_Cidade = new javax.swing.JLabel();
        jl_Estado = new javax.swing.JLabel();
        jtf_Nome = new javax.swing.JTextField();
        jtf_Rg = new javax.swing.JTextField();
        jtf_Endereco = new javax.swing.JTextField();
        jtf_Celular = new javax.swing.JTextField();
        jtf_Cpf = new javax.swing.JTextField();
        jtf_Cidade = new javax.swing.JTextField();
        jcb_Estado = new javax.swing.JComboBox<>();
        jb_Limpar = new javax.swing.JButton();
        jb_Cadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");

        jl_Nome.setText("Nome:");

        jl_CPF.setText("CPF:");

        jl_RG.setText("RG:");

        jl_Celular.setText("Celular:");

        jl_Endereco.setText("Endereço:");

        jl_Cidade.setText("Cidade:");

        jl_Estado.setText("Estado:");

        jcb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Escolha uma opção>", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        jb_Limpar.setText("Limpar");
        jb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimparActionPerformed(evt);
            }
        });

        jb_Cadastrar.setText("Cadastrar");
        jb_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_Endereco)
                            .addComponent(jl_Celular)
                            .addComponent(jl_CPF)
                            .addComponent(jl_Nome)
                            .addComponent(jl_RG)
                            .addComponent(jl_Cidade)
                            .addComponent(jl_Estado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtf_Celular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(jtf_Rg, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtf_Cpf, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jtf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jb_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_Cadastrar)))
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nome)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CPF)
                    .addComponent(jtf_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_RG)
                    .addComponent(jtf_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Celular)
                    .addComponent(jtf_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Endereco)
                    .addComponent(jtf_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cidade)
                    .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Estado)
                    .addComponent(jcb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimparActionPerformed
       limpar();
    }//GEN-LAST:event_jb_LimparActionPerformed

    private void jb_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jb_CadastrarActionPerformed
   
    private void limpar(){
        jtf_Nome.setText("");
        jtf_Cpf.setText("");
        jtf_Rg.setText("");
        jtf_Celular.setText("");
        jtf_Endereco.setText("");
        jtf_Cidade.setText("");
        
    }
    private void cadastrar(){
   try{
        Cliente c = new Cliente();
        
        c.setNome(jtf_Nome.getText());
        c.setCpf(jtf_Cpf.getText());
        c.setRg(jtf_Rg.getText());
        c.setCelular(jtf_Celular.getText());
        c.setEndereco(jtf_Endereco.getText());
        c.setCidade(jtf_Cidade.getText());
        c.setEstado((String) jcb_Estado.getModel().getSelectedItem());
        
        ClienteController cc = new ClienteController();
        cc.cadastrarCliente(c);
   }catch(Exception ex){
       JOptionPane.showMessageDialog(
       null,
               "O seguinte erro ocorreu!!! "+ex.getMessage());
       limpar();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Cadastrar;
    private javax.swing.JButton jb_Limpar;
    private javax.swing.JComboBox<String> jcb_Estado;
    private javax.swing.JLabel jl_CPF;
    private javax.swing.JLabel jl_Celular;
    private javax.swing.JLabel jl_Cidade;
    private javax.swing.JLabel jl_Endereco;
    private javax.swing.JLabel jl_Estado;
    private javax.swing.JLabel jl_Nome;
    private javax.swing.JLabel jl_RG;
    private javax.swing.JTextField jtf_Celular;
    private javax.swing.JTextField jtf_Cidade;
    private javax.swing.JTextField jtf_Cpf;
    private javax.swing.JTextField jtf_Endereco;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_Rg;
    // End of variables declaration//GEN-END:variables
}
