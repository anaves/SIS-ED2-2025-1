package Atividade;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class AppFeira{
    private static Scanner input = new Scanner(System.in);

    public static Livro criaLivro(String aut) {
        System.out.println("------cria livro------");
        System.out.println("Titulo: ");
        String tit = input.nextLine();
        System.out.println("Ano: ");
        int ano = input.nextInt();
        Livro obj = new Livro(tit, aut, ano);
        return obj;        
    }

    public static void imprimir(TreeMap<String, TreeSet<Livro>> bib) {
        System.out.println(bib);
    }
    public static void main(String[] args) {
        TreeMap<String, TreeSet<Livro>> biblioteca = new TreeMap<>();
        int op;
        do{
            System.out.println("Autor: ");
            String autor = input.nextLine();
            Livro livro = criaLivro(autor);
            // se vai ser o primeiro livro do autor
            if (!biblioteca.containsKey(autor)){ 
                biblioteca.put(autor, new TreeSet<Livro>());
            }
            biblioteca.get(autor).add(livro);
            imprimir(biblioteca);
            System.out.println("deseja inserir mais registro? 1-s e 0-n ");
            op = input.nextInt();
            input.nextLine(); // limpar \n
        }while(op==1);
    }
}