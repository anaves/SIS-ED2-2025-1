public class Produto {
    private String nome;
    private double preco;
    
    // construtor
    public Produto(String nome, double preco){
        setNome(nome);
        setPreco(preco);//this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()){
            nome = "Produto padrao";
        }
        this.nome = nome.toUpperCase();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            preco *= (-1);
        }
        this.preco = preco;
    }

    public String toString() {
        return "Produto: " + getNome() + ", Preco: R$ " + getPreco();
    }

    
}
