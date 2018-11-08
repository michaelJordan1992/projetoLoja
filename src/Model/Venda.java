
package Model;

/**
 *
 * @author michael
 */
public class Venda {
    private int numeroVenda;
    private String produto;
    private int quantidade;
    private String pagamento;
    private double valor;
    private String cliente;
    private String vendedor;

    public int getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Venda(int numeroVenda, String produto, int quantidade, String pagamento, double valor, String cliente, String vendedor) {
        this.numeroVenda = numeroVenda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.pagamento = pagamento;
        this.valor = valor;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Venda() {
    }
}
