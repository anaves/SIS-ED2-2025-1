import java.util.ArrayList;
import java.util.Collections;

public class AppArrayListMetodos {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();
        palavras.add("casa");
        palavras.add("chuva");
        palavras.add("arara");
        palavras.add(1, "mouse");
        System.out.println(palavras);
        String palavra = palavras.get(3);
        System.out.println("palavra na posicao 3 " + palavra);
        System.out.println("ultima palavra na ed " + palavras.getLast());
        System.out.println("primeira palavra na ED: "+ palavras.getFirst());
        Collections.sort(palavras);
        System.out.println("ordenada:" + palavras);
        System.out.println("total elementos:  " + palavras.size());
        // remover elemento
        String el = palavras.remove(2);
        System.out.println("excluiu " + el);
        System.out.println(palavras);
        System.out.println("retirar mouse: " + palavras.remove("mouse"));
        System.out.println("retirar tv: " + palavras.remove("tv"));
        System.out.println(palavras);
        //if (!palavras.contains("arara"))
        //    palavras.add("arara");
        palavras.add("arara");
        System.out.println(palavras);
        // SELECT DISTINCT cidade FROM clientes;
    }
}
