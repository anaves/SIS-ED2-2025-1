package Atividade;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

class AppLinkedList {

    public static void main(String[] args) {
        Livro obj1 = new Livro("Livro D", "Jose", 2020);
        Livro obj2 = new Livro("Livro A", "Jose", 2020);
        Livro obj3 = new Livro("Livro A", "Jose", 2020);
        Livro obj4 = new Livro("Livro Z", "Astrogildo", 2020);

        LinkedList<Livro> lista = new LinkedList();
        lista.add(obj1);
        lista.add(obj2);
        lista.add(obj3);
        lista.add(obj4);
        System.out.println("Sem ordenar");
        System.out.println(lista);
        System.out.println("___________");
        Collections.sort(lista);
        System.out.println("Ordenar");
        System.out.println(lista);
        
        System.out.println(obj3.compareTo(obj2));
        
    }
}