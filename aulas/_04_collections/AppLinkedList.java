import java.util.LinkedList;

public class AppLinkedList {
    public static void main(String[] args) {
        LinkedList<Produto> listaArray = new LinkedList<Produto>();
        Produto arroz = new Produto("Arroz",32);
        listaArray.add(arroz);
        listaArray.add(new Produto("Feijao", 9));
        listaArray.add(new Produto("leite", 4.95));
        System.out.println("LinkedList de Produtos");
        for (Produto p : listaArray) {
            System.out.println(p);
        }        
    }
}
