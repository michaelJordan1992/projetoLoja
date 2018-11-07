
package Model;
/**
 *
 * @author michael
 */
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private String marca;
    private String cor;
    private String modelo;
    private double valor;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto(int idProduto, String nomeProduto, String marca, String cor, String modelo, double valor) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
    }

    public Produto() {
    }
}
