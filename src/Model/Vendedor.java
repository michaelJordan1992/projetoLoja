
package Model;

/**
 *
 * @author michael
 */
public class Vendedor {
    private int idVendedor;
    private String nomeVendedor;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Vendedor(int idVendedor, String nomeVendedor) {
        this.idVendedor = idVendedor;
        this.nomeVendedor = nomeVendedor;
    }

    public Vendedor() {
    }
}
