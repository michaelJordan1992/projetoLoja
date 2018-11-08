
package DAO;

import Model.Venda;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class DAOVenda {
    private final Connection con;
    private final Statement stm;
    private String sql;
    
    public DAOVenda() throws Exception{
        this.con = DAO.getConexao();
        this.stm = con.createStatement();
    }
    public void abrirNovaVenda(Venda v) throws Exception{
        sql = "INSERT INTO VENDA(NUMEROVANDA, PRODUTO, QUANTIDADE, PAGAMENTO, VALOR, CLIENTE, VENDEDOR)"
                + "VALUES "+null+",'"+v.getProduto()+"',"+v.getQuantidade()+",'"+v.getPagamento()+"',"+v.getValor()+""
                + ",'"+v.getCliente()+"','"+v.getVendedor()+"')";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
    public void deletarVendaNumero(Venda v) throws Exception{
        sql = "DELETE * FROM VENDA"
              + "WHERE NUMEROVENDA "+v.getNumeroVenda()+" ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
    public ArrayList<Venda> buscarTodasVendas() throws Exception{
        sql = "SELECT * FROM VENDA";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Venda> venda = new ArrayList<>();
        
        while(rs.next()){
            
            Venda vd = new Venda();
            
            vd.setNumeroVenda(rs.getInt("NEMEROVENDA"));
            vd.setProduto(rs.getString("PRODUTO"));
            vd.setQuantidade(rs.getInt("QUANTIDADE"));
            vd.setPagamento(rs.getString("PAGAMENTO"));
            vd.setValor(rs.getDouble("VALOR"));
            vd.setCliente(rs.getString("CLIENTE"));
            vd.setVendedor(rs.getString("VENDEDOR"));
            
            venda.add(vd);
        }
        stm.close();
        con.close();
        return venda;
    }
    public ArrayList<Venda> buscarVendaNumero(Venda v) throws Exception{
        sql = "SELECT * FROM VENDA"
                + "WHERE NUMEROVENDA "+v.getNumeroVenda()+" ";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Venda> venda = new ArrayList<>();
        
        while(rs.next()){
            
            Venda vd = new Venda();
            
            vd.setNumeroVenda(rs.getInt("NUMEROVENDA"));
            vd.setProduto(rs.getString("PRODUTO"));
            vd.setQuantidade(rs.getInt("QUANTIDADE"));
            vd.setPagamento(rs.getString("PAGAMENTO"));
            vd.setValor(rs.getDouble("VALOR"));
            vd.setCliente(rs.getString("CLIENTE"));
            vd.setVendedor(rs.getString("VENDEDOR"));
            
            venda.add(v);
        }
        stm.close();
        con.close();
        return venda;
    }
    public void atualizarVendaNumVenda(Venda v) throws Exception{
        sql = "UPDATE VENDA SET PRODUTO '"+v.getProduto()+"',"+v.getQuantidade()+""
                + ",'"+v.getPagamento()+"',"+v.getValor()+","+v.getCliente()+""
                + ","+v.getVendedor()+""
                + "WHERE "+v.getNumeroVenda()+" ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
}
