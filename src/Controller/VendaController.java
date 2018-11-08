
package Controller;

import DAO.DAOVenda;
import Model.Venda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class VendaController {
    DAOVenda dv;
    
    public void AbrirVenda(Venda v) throws Exception{
        dv = new DAOVenda();
        dv.abrirNovaVenda(v);
        JOptionPane.showMessageDialog(
        null,
                "Venda Realizada com Sucesso!");
    }
    public void deletarVendaNumero(Venda v) throws Exception{
        dv = new DAOVenda();
        dv.deletarVendaNumero(v);
        JOptionPane.showMessageDialog(
        null,
                "Venda Deletada!");
    }
    public ArrayList<Venda> buscarTodasVendas() throws Exception{
        dv = new DAOVenda();
        return buscarTodasVendas();
    }
    public ArrayList<Venda> buscarVendaNumero(Venda v) throws Exception{
        dv = new DAOVenda();
        return buscarVendaNumero(v);
    }
    public void atualizaVenda(Venda v) throws Exception{
        dv = new DAOVenda();
        dv.atualizarVendaNumVenda(v);
        JOptionPane.showMessageDialog(
        null,
                "Venda Atualizada com Sucesso!");
    }
}

