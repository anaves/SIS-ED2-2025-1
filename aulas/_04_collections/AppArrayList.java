import java.util.ArrayList;

public class AppArrayList {
    public static void main(String[] args) {
        ArrayList<Produto> listaArray = new ArrayList<Produto>();
        Produto arroz = new Produto("Arroz",32);
        listaArray.add(arroz);
        listaArray.add(new Produto("Feijao", 9));
        listaArray.add(new Produto("leite", 4.95));
        System.out.println("ArrayList de Produtos");
        for (Produto p : listaArray) {
            System.out.println(p);
        }        
    }
    //  reproduza esta classe usando LinkedList e Vector
}
