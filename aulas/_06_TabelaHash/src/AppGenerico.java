public class AppGenerico {
    
    public static void main(String[] args) {
        HashtableGenerico<String, Funcionario> tabela = new HashtableGenerico<>();
        Funcionario f1  = new Funcionario("123", "Fulano");
        tabela.cadastrar(f1.getDocumento(), f1);

        System.out.println(tabela);

        HashtableGenerico<Integer, Produto> estoque = new HashtableGenerico<>();
        Produto mouse = new Produto(555,"mouse");
        estoque.cadastrar(mouse.getCodigo(), mouse);

        System.out.println(estoque);
    }
}
