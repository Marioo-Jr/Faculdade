public class Produto {

    private int codigo;
    private String nome;
    private Double preco;
    private int estoque;


    public Produto(){}


    public Produto(int codigo, int estoque, Double preco, String nome) {
        this.codigo = codigo;
        this.estoque = estoque;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
