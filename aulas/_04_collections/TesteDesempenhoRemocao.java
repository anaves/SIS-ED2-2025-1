import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TesteDesempenhoRemocao{
   public static void main(String[] args) {
        int tamanho = 1000000;
        int consulta = 100000;
        int [] array = new int[tamanho];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Vector<Integer> vector = new Vector<Integer>();
        
        // array estatico

        long inicio = System.currentTimeMillis();
      
        // for (int i = 0; i < tamanho; i++) {
        //     array[i] = i;
        // }
        long fim = System.currentTimeMillis();
        // System.out.println("Tempo array estatico: " + (fim-inicio) + "ms");
        
        for (int i = 0; i < tamanho; i++) {
            arrayList.add(i);
            linkedList.add(i);
            vector.add(i);
        }
        // ArrayList
        inicio = System.currentTimeMillis();
        while (!arrayList.isEmpty()) {
            arrayList.removeLast();
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo ArrayList: " + (fim-inicio) + "ms");
        // LinkedList
        inicio = System.currentTimeMillis();
        while (!linkedList.isEmpty()) {
            linkedList.removeLast();
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo LinkedList: " + (fim-inicio) + "ms");
        // Vector
        inicio = System.currentTimeMillis();
        while (!vector.isEmpty()){
            vector.removeLast();
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo Vector: " + (fim-inicio) + "ms");
   } 
}
