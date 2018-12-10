package Controller;

import DAO.DAOCliente;
import Model.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class ClienteController {
    DAOCliente dc;
    
    public void cadastrarCliente(Cliente c) throws Exception{
        dc = new DAOCliente();
        dc.CadastrarCliente(c);
        JOptionPane.showMessageDialog(
        null,
                "Cliente Cadastrado com Sucesso!!!");
    }
    public void deletarClienteId(Cliente c) throws Exception{
        dc = new DAOCliente();
        dc.deletarClienteId(c);
        JOptionPane.showMessageDialog(
        null,
                "Cliente Deletado!! ");
    }
    public void deletarClienteCpf(Cliente c) throws Exception{
        dc = new DAOCliente();
        dc.deletarClienteCpf(c);
        JOptionPane.showMessageDialog(
        null,
                "Cliente Deletado!! ");
    }
    public void deletarClienteRg(Cliente c) throws Exception{
        dc = new DAOCliente();
        dc.deletarClienteRg(c);
        JOptionPane.showMessageDialog(
        null, 
                "Cliente Deletado!!");
    }
    public ArrayList<Cliente> buscarTodosClientes() throws Exception{
        dc = new DAOCliente();
        return dc.buscarTodosClientes();
    }
    public ArrayList<Cliente> buscarClienteCpf(Cliente c) throws Exception{
        dc = new DAOCliente();
        return dc.buscarClienteCpf(c);
    }
    public void atualizarClienteCpf(Cliente c) throws Exception{
        DAOCliente dc = new DAOCliente();
        dc.atualizarClienteCpf(c);
        JOptionPane.showMessageDialog(
        null, 
                "Cliente Alterado com Sucesso!!");
    }
}
