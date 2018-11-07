
package Controller;

import DAO.DAOProduto;
import Model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class ProdutoController {
    DAOProduto dp;
    
    public void cadastrarProduto(Produto p) throws Exception{
        dp = new DAOProduto();
        dp.cadastrarProduto(p);
        JOptionPane.showMessageDialog(
        null, 
                "Produto Cadastrado com Sucesso!!");
    }
    public void deletarProdutoId(Produto p) throws Exception{
        dp = new DAOProduto();
        dp.deletarProdutoId(p);
        JOptionPane.showMessageDialog(
        null,
                "Produto Deletado!!!");
    }
    public ArrayList<Produto> buscarProdutos() throws Exception{
        dp = new DAOProduto();
        return dp.buscarProdutos();
       
    }
    public ArrayList<Produto> buscarProdutosId(Produto p) throws Exception{
        dp = new DAOProduto();
        return dp.buscarProdutosId(p);
    }
    public void alterarProdutoId(Produto p) throws Exception{
        dp = new DAOProduto();
        dp.atualizarProdutoId(p);
        JOptionPane.showMessageDialog(
        null,
                "Produto Atualizado com Sucesso!!");
       
    }
}
