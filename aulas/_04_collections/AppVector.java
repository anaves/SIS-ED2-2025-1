import java.util.Vector;

public class AppVector {
    public static void main(String[] args) {
        Vector<Produto> listaArray = new Vector<Produto>();
        Produto arroz = new Produto("Arroz",32);
        listaArray.add(arroz);
        listaArray.add(new Produto("Feijao", 9));
        listaArray.add(new Produto("leite", 4.95));
        System.out.println("Vector de Produtos");
        for (Produto p : listaArray) {
            System.out.println(p);
        }
    }
}
