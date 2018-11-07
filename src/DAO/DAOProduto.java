
package DAO;

import Model.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class DAOProduto {
    private final Connection con;
    private final Statement stm;
    private String sql;
    
    public DAOProduto() throws Exception{
        this.con = DAO.getConexao();
        this.stm = con.createStatement();
    }
    
    public void cadastrarProduto(Produto p) throws Exception{
        sql = "INSERT INTO PRODUTO (IDPRODUTO, NOMEPRODUTO, MARCA, COR, MODELO,VALOR)"
                + "VALUES("+null+",'"+p.getNomeProduto()+"','"+p.getMarca()+"','"+p.getCor()+"'"
                + ",'"+p.getModelo()+"',"+p.getValor()+")";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
    public void deletarProdutoId(Produto p) throws Exception{
        sql = "DELETE * FROM PRODUTO"
                + "WHERE ID '"+p.getIdProduto()+"'";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
    public ArrayList<Produto> buscarProdutos() throws Exception{
        sql = "SELECT * FROM PRODUTO";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Produto> produto = new ArrayList<>();
        
        while(rs.next()){
        
        Produto pd = new Produto();
        
        pd.setIdProduto(rs.getInt("IDPRODUTO"));
        pd.setNomeProduto(rs.getString("NOMEPRODUTO"));
        pd.setMarca(rs.getString("MARCA"));
        pd.setCor(rs.getString("COR"));
        pd.setModelo(rs.getString("MODELO"));
        pd.setValor(rs.getDouble("VALOR"));
        
        produto.add(pd);
    }
        stm.close();
        con.close();
        return produto;
    }
    public ArrayList<Produto> buscarProdutosId(Produto p) throws Exception{
        sql = "SELECT * FROM PRODUTO WHERE ID"+p.getIdProduto()+"";
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Produto> produto = new ArrayList<>();
        
        while(rs.next()){
        
        Produto pd = new Produto();
        
        pd.setIdProduto(rs.getInt("IDPRODUTO"));
        pd.setNomeProduto(rs.getString("NOMEPRODUTO"));
        pd.setMarca(rs.getString("MARCA"));
        pd.setCor(rs.getString("COR"));
        pd.setModelo(rs.getString("MODELO"));
        pd.setValor(rs.getDouble("VALOR"));
        
        produto.add(pd);
    }
        stm.close();
        con.close();
        return produto;
    }
    public void atualizarProdutoId(Produto p) throws Exception{
        sql = "UPDATE CLIENTE SET NOMEPRODUTO '"+p.getNomeProduto()+"'"
                + ",MARCA'"+p.getMarca()+"'"
                + ",COR'"+p.getCor()+"'"
                + ",MODELO'"+p.getModelo()+"',VALOR'"+p.getValor()+"'"
                + "WHERE ID "+p.getIdProduto()+" ";
        stm.executeUpdate(sql);
        stm.close();
        con.close();
    }
}

        
