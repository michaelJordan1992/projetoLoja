
package View;

/**
 *
 * @author michael
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j_AreaTrabalho = new javax.swing.JDesktopPane();
        jmb_Menu = new javax.swing.JMenuBar();
        jm_Cadastro = new javax.swing.JMenu();
        jmi_CadastroCliente = new javax.swing.JMenuItem();
        jmi_CadastrarProduto = new javax.swing.JMenuItem();
        jmi_CadastrarVendedor = new javax.swing.JMenuItem();
        jm_Deletar = new javax.swing.JMenu();
        jmi_DeletarCliente = new javax.swing.JMenuItem();
        jmi_DeletarProduto = new javax.swing.JMenuItem();
        jmi_DeletarVendedor = new javax.swing.JMenuItem();
        jm_Alterar = new javax.swing.JMenu();
        jmi_AlterarCliente = new javax.swing.JMenuItem();
        jmi_AlterarProduto = new javax.swing.JMenuItem();
        jmi_AlterarVendedor = new javax.swing.JMenuItem();
        jm_BuscaSeparada = new javax.swing.JMenu();
        jmi_BuscarCliente = new javax.swing.JMenuItem();
        jmi_BuscarProduto = new javax.swing.JMenuItem();
        jmi_BuscarVendedor = new javax.swing.JMenuItem();
        jm_BuscaTodos = new javax.swing.JMenu();
        jmi_BuscarTodosClientes = new javax.swing.JMenuItem();
        jmi_BuscarTodosProdutos = new javax.swing.JMenuItem();
        jmi_BuscarTodosVendedores = new javax.swing.JMenuItem();
        jm_Venda = new javax.swing.JMenu();
        jmi_AbrirVenda = new javax.swing.JMenuItem();
        jmi_BuscaVendaGeral = new javax.swing.JMenuItem();
        jmi_BuscarVendaIndividual = new javax.swing.JMenuItem();
        jmi_DeletarVenda = new javax.swing.JMenuItem();
        jmi_AtualizarVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja da Mariazinha");

        j_AreaTrabalho.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout j_AreaTrabalhoLayout = new javax.swing.GroupLayout(j_AreaTrabalho);
        j_AreaTrabalho.setLayout(j_AreaTrabalhoLayout);
        j_AreaTrabalhoLayout.setHorizontalGroup(
            j_AreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        j_AreaTrabalhoLayout.setVerticalGroup(
            j_AreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        jm_Cadastro.setText("Cadastro");

        jmi_CadastroCliente.setText("Cliente");
        jmi_CadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CadastroClienteActionPerformed(evt);
            }
        });
        jm_Cadastro.add(jmi_CadastroCliente);

        jmi_CadastrarProduto.setText("Produto");
        jm_Cadastro.add(jmi_CadastrarProduto);

        jmi_CadastrarVendedor.setText("Vendedor");
        jm_Cadastro.add(jmi_CadastrarVendedor);

        jmb_Menu.add(jm_Cadastro);

        jm_Deletar.setText("Excluir");

        jmi_DeletarCliente.setText("Cliente");
        jm_Deletar.add(jmi_DeletarCliente);

        jmi_DeletarProduto.setText("Produto");
        jm_Deletar.add(jmi_DeletarProduto);

        jmi_DeletarVendedor.setText("Vendedor");
        jm_Deletar.add(jmi_DeletarVendedor);

        jmb_Menu.add(jm_Deletar);

        jm_Alterar.setText("Alterar");

        jmi_AlterarCliente.setText("Cliente");
        jm_Alterar.add(jmi_AlterarCliente);

        jmi_AlterarProduto.setText("Produto");
        jm_Alterar.add(jmi_AlterarProduto);

        jmi_AlterarVendedor.setText("Vendedor");
        jm_Alterar.add(jmi_AlterarVendedor);

        jmb_Menu.add(jm_Alterar);

        jm_BuscaSeparada.setText("Buscas Separadas");

        jmi_BuscarCliente.setText("Cliente");
        jm_BuscaSeparada.add(jmi_BuscarCliente);

        jmi_BuscarProduto.setText("Produto");
        jm_BuscaSeparada.add(jmi_BuscarProduto);

        jmi_BuscarVendedor.setText("Vendedor");
        jm_BuscaSeparada.add(jmi_BuscarVendedor);

        jmb_Menu.add(jm_BuscaSeparada);

        jm_BuscaTodos.setText("Busca Geral");

        jmi_BuscarTodosClientes.setText("Cliente");
        jm_BuscaTodos.add(jmi_BuscarTodosClientes);

        jmi_BuscarTodosProdutos.setText("Produto");
        jm_BuscaTodos.add(jmi_BuscarTodosProdutos);

        jmi_BuscarTodosVendedores.setText("Vendedor");
        jm_BuscaTodos.add(jmi_BuscarTodosVendedores);

        jmb_Menu.add(jm_BuscaTodos);

        jm_Venda.setText("Venda");

        jmi_AbrirVenda.setText("Abrir Nova Venda");
        jm_Venda.add(jmi_AbrirVenda);

        jmi_BuscaVendaGeral.setText("Buscar Venda");
        jm_Venda.add(jmi_BuscaVendaGeral);

        jmi_BuscarVendaIndividual.setText("Buscar Venda Individual");
        jm_Venda.add(jmi_BuscarVendaIndividual);

        jmi_DeletarVenda.setText("Deletar Venda");
        jm_Venda.add(jmi_DeletarVenda);

        jmi_AtualizarVenda.setText("Atualizar Venda");
        jm_Venda.add(jmi_AtualizarVenda);

        jmb_Menu.add(jm_Venda);

        setJMenuBar(jmb_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_AreaTrabalho, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_AreaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_CadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CadastroClienteActionPerformed
        GuiCadastroCliente gcc = new GuiCadastroCliente();
        gcc.setVisible(true);
        j_AreaTrabalho.add(gcc);
    }//GEN-LAST:event_jmi_CadastroClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane j_AreaTrabalho;
    private javax.swing.JMenu jm_Alterar;
    private javax.swing.JMenu jm_BuscaSeparada;
    private javax.swing.JMenu jm_BuscaTodos;
    private javax.swing.JMenu jm_Cadastro;
    private javax.swing.JMenu jm_Deletar;
    private javax.swing.JMenu jm_Venda;
    private javax.swing.JMenuBar jmb_Menu;
    private javax.swing.JMenuItem jmi_AbrirVenda;
    private javax.swing.JMenuItem jmi_AlterarCliente;
    private javax.swing.JMenuItem jmi_AlterarProduto;
    private javax.swing.JMenuItem jmi_AlterarVendedor;
    private javax.swing.JMenuItem jmi_AtualizarVenda;
    private javax.swing.JMenuItem jmi_BuscaVendaGeral;
    private javax.swing.JMenuItem jmi_BuscarCliente;
    private javax.swing.JMenuItem jmi_BuscarProduto;
    private javax.swing.JMenuItem jmi_BuscarTodosClientes;
    private javax.swing.JMenuItem jmi_BuscarTodosProdutos;
    private javax.swing.JMenuItem jmi_BuscarTodosVendedores;
    private javax.swing.JMenuItem jmi_BuscarVendaIndividual;
    private javax.swing.JMenuItem jmi_BuscarVendedor;
    private javax.swing.JMenuItem jmi_CadastrarProduto;
    private javax.swing.JMenuItem jmi_CadastrarVendedor;
    private javax.swing.JMenuItem jmi_CadastroCliente;
    private javax.swing.JMenuItem jmi_DeletarCliente;
    private javax.swing.JMenuItem jmi_DeletarProduto;
    private javax.swing.JMenuItem jmi_DeletarVenda;
    private javax.swing.JMenuItem jmi_DeletarVendedor;
    // End of variables declaration//GEN-END:variables
}
