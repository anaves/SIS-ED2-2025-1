import java.util.Hashtable;
import java.util.Scanner;

// META: deixar essa classe GENERICA - 
public class HashtableGenerico<K,T> {
    private Scanner input = new Scanner(System.in);
    private Hashtable<K, T> table = new Hashtable<>();
    
    public void cadastrar(K key, T object){
        System.out.println("----Cadastro----");
    
        if (table.containsKey(key)){
            System.out.println(key + " ja cadastrado");
            System.out.println("...vamos de novo...");
            this.cadastrar(key, object);
        }else{
            table.put(key, object);
            System.out.println("... cadastro com sucesso");
        }
    }

    public T buscar(K key){
        System.out.println("---Buscar---");
        
        if(table.containsKey(key)){
            T object = table.get(key);
            System.out.println(object);
            return object;
        }
        System.out.println("Chave "+ key + " inexistente");
        return null;
    }

    @Override
    public String toString() {
        // String saida = "";
        return table.toString();
    }

    

}
