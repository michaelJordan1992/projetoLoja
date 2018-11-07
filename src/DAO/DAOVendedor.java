
package DAO;

import Model.Vendedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class DAOVendedor {
    private final Connection con;
    private final Statement stm; 
    private String sql;
    
    public DAOVendedor() throws Exception{
        this.con = DAO.getConexao();
        this.stm = con.createStatement();
    }
    public void cadastrarVendedor(Vendedor v) throws Exception{
        sql = "INSERT INTO VENDEDOR(IDVENDEDOR NOMEVENDEDOR"
                + "VALUES('"+v.getIdVendedor()+"',"+v.getNomeVendedor()+" )";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
        
    }
    public void deletarVendedorId(Vendedor v) throws Exception{
        sql = "DELETE FROM VENDEDOR "
                + "WHERE'"+v.getIdVendedor()+"'";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
        
    }
    public ArrayList<Vendedor> buscarVendedores() throws Exception{
        sql = "SELECT * FROM VENDEDOR";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Vendedor> vendedor = new ArrayList<>();
        
        while(rs.next()){
        
        Vendedor vd = new Vendedor();
        
        vd.setIdVendedor(rs.getInt("IDVENDEDOR"));
        vd.setNomeVendedor(rs.getString("NOMEVENDEDOR"));
        
        vendedor.add(vd);
        }
        stm.close();
        con.close();
        return vendedor;
    }
    public ArrayList<Vendedor> buscarVendedorId(Vendedor v) throws Exception{
        sql = "SELECT * FROM VENDEDOR "
                + "WHERE ID'"+v.getIdVendedor()+"' ";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Vendedor> vendedor = new ArrayList<>();
        
        while(rs.next()){
            Vendedor vd = new Vendedor();
            
            vd.setIdVendedor(rs.getInt("IDVENDEDOR"));
            vd.setNomeVendedor(rs.getString("NOMEVENDEDOR"));
            
            vendedor.add(vd);
        }
        stm.close();
        con.close();
        return vendedor;
    }
    public void atualizarVendedorId(Vendedor v) throws Exception{
        sql = "UPDATE VENDEDOR SET IDVENDEDOR'"+v.getIdVendedor()+"', NOMEVENDEDOR"+v.getNomeVendedor()+" "
                + "WHERE "+v.getIdVendedor()+" ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
      
}
