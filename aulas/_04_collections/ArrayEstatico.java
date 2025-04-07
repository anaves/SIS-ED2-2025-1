
public class ArrayEstatico {
    public static void main(String[] args) {
        Produto [] produtosArray = new Produto[3];
        produtosArray[0] = new Produto("  ", -500);
        produtosArray[1] = new Produto("Mouse", 70);
        produtosArray[2] = new Produto("Teclado", 90);

        System.out.println("ELEMENTOS DO VETOR");
        for (Produto prod : produtosArray) {
            System.out.println(prod);
        }
    }
}
