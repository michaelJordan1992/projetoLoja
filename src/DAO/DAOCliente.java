package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class DAOCliente {
    private final Connection con;
    private final Statement stm;
    private String sql;
    
    public DAOCliente() throws Exception{
        this.con = DAO.getConexao();
        this.stm = con.createStatement();
    }
    public void CadastrarCliente(Cliente c) throws Exception{
        sql = "INSERT INTO CLIENTE (ID, NOME, CPF, RG, CELULAR, ENDERECO, CIDADE, ESTADO)"
                + "VALUES("+null+",'"+c.getNome()+"','"+c.getCpf()+"','"+c.getRg()+"','"+c.getCelular()+"','"+c.getEndereco()+"'"
                + ",'"+c.getCidade()+"','"+c.getEstado()+"')";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    
    }
    public void deletarClienteId(Cliente c) throws SQLException{
        sql = "DELETE FROM CLIENTE WHERE ID = "+c.getIdCliente()+" ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
      
    }
    public void deletarClienteCpf(Cliente c) throws Exception{
        sql = "DELETE  FROM CLIENTE WHERE CPF = '"+c.getCpf()+"' ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }    
  
    public void deletarClienteRg(Cliente c) throws Exception{
        sql = "DELETE FROM CLIENTE WHERE RG = '"+c.getRg()+"' ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
    public ArrayList<Cliente> buscarTodosClientes() throws Exception{
        sql = "SELECT * FROM CLIENTE";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Cliente> cliente = new ArrayList<>();
        
        while(rs.next()){
            Cliente c = new Cliente();
            
            c.setIdCliente(rs.getInt("ID"));
            c.setNome(rs.getString("NOME"));
            c.setCpf(rs.getString("CPF"));
            c.setRg(rs.getString("RG"));
            c.setCelular(rs.getString("CELULAR"));
            c.setEndereco(rs.getString("ENDERECO"));
            c.setCidade(rs.getString("CIDADE"));
            c.setEstado(rs.getString("ESTADO"));
            
            cliente.add(c);
        }
        stm.close();
        con.close();
        return cliente;
        
    }
    public ArrayList<Cliente> buscarClienteCpf(Cliente c) throws Exception{
        sql = "SELECT * FROM CLIENTE WHERE CPF'"+c.getCpf()+"'";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Cliente> cliente = new ArrayList<>();
        
        while(rs.next()){
            Cliente c1 = new Cliente();
           
            c1.setIdCliente(rs.getInt("ID"));
            c1.setNome(rs.getString("NOME"));
            c1.setCpf(rs.getString("CPF"));
            c1.setRg(rs.getString("RG"));
            c1.setCelular(rs.getString("CELULAR"));
            c1.setEndereco(rs.getString("ENDERECO"));
            c1.setCidade(rs.getString("CIDADE"));
            c1.setEstado(rs.getString("ESTADO"));
            
            cliente.add(c);
        }
        stm.close();
        con.close();
        return cliente;
    }
    public void atualizarClienteCpf(Cliente c) throws Exception{
        sql = "UPDATE CLIENTE SET NOME '"+c.getNome()+"',CPF'"+c.getCpf()+"'"
                + ",RG'"+c.getRg()+"',CELULAR'"+c.getCelular()+"'"
                + ",ENDERECO'"+c.getEndereco()+"',CIDADE'"+c.getCidade()+"',ESTADO'"+c.getEstado()+","
                + "WHERE CPF '"+c.getCpf()+"'";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
        
    }
}
     

    
    

