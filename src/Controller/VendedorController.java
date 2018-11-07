
package Controller;

import DAO.DAOVendedor;
import Model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class VendedorController {
    DAOVendedor dv;
    
    public void cadastrarVendedor(Vendedor v) throws Exception{
        dv = new DAOVendedor();
        dv.cadastrarVendedor(v);
        JOptionPane.showMessageDialog(
        null, 
                "Novo Vendedor Cadastrado!");
    }
    public void deletarVendedorId(Vendedor v) throws Exception{
        dv = new DAOVendedor();
        dv.deletarVendedorId(v);
        JOptionPane.showMessageDialog(
        null, 
                "Vendedor Deletado com Sucesso!");
    }
    public ArrayList<Vendedor> buscarTodosVendedores() throws Exception{
        dv = new DAOVendedor();
        return dv.buscarVendedores();
    }
    public ArrayList<Vendedor> buscarVendedorId(Vendedor v) throws Exception{
        dv = new DAOVendedor();
        return dv.buscarVendedorId(v);
    } 
    public void atualizarVendedorId(Vendedor v) throws Exception{
        dv = new DAOVendedor();
        dv.atualizarVendedorId(v);
        JOptionPane.showMessageDialog(
        null,
                "Vendedor Atualizado com Sucesso!!!");
    }
}
