import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TesteDesempenhoInsercaoInicio {
   public static void main(String[] args) {
        int tamanho = 1000000;
        // array estatico
        long inicio = System.currentTimeMillis();
        // int [] array = new int[tamanho];
        // for (int i = 0; i < tamanho; i++) {
        //     array[i] = i;
        // }
        long fim = System.currentTimeMillis();
        // System.out.println("Tempo array estatico: " + (fim-inicio) + "ms");
        // ArrayList
        inicio = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < tamanho; i++) {
            arrayList.add(0,i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo ArrayList: " + (fim-inicio) + "ms");
        // LinkedList
        inicio = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < tamanho; i++) {
            linkedList.add(0,i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo LinkedList: " + (fim-inicio) + "ms");
        // Vector
        inicio = System.currentTimeMillis();
        Vector<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < tamanho; i++) {
            vector.add(0,i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo Vector: " + (fim-inicio) + "ms");
   } 
}
