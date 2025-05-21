import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {

    public static int funcaoHash(String palavra, int tam){
        int hash = 0;
        //  ex: Abobora  -> pega letra A->int da tabela ascii
        // A -> valor 65
        /// 65 -> 0
        /// 90 -> 25
        // hash = 13+palavra.toUpperCase().charAt(0);  // pega a inicial
        palavra = palavra.toUpperCase();
        for (int i = 0; i < palavra.length(); i++) {
            hash += palavra.charAt(i);
        }
        return hash % tam;
    }

    public static boolean buscarPalavra(String palavra, ArrayList<String>[] tabelaHash, int tam) {
	    int categoria = funcaoHash(palavra, tam);
        List<String> elementos = tabelaHash[categoria];
        return elementos.contains(palavra.toUpperCase());
    }
    
    public static void main(String[] args) throws Exception {
        int totalCategorias = 26;
        ArrayList<String> tabelaHash[] =  new ArrayList[totalCategorias];
        // inicializar a tabela
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> " + tabelaHash[i]);
            tabelaHash[i] = new ArrayList<String>();
        }
        System.out.println("---INSTANCIADAS---");
        for (int i = 0; i < tabelaHash.length; i++) {
            System.out.println(i + "-> " + tabelaHash[i]);
        }
        System.out.println("Adicionando palavras...");
        List<String> listaPalavra = GeradorPalavras.lerPalavras();

        System.out.println("TOTAL: " + listaPalavra.size());
        for (String palavra : listaPalavra) {
            palavra = palavra.toUpperCase();
            int categoria = funcaoHash(palavra, totalCategorias);
            tabelaHash[categoria].add(palavra);     
        }
        // for (int i = 0; i < 100; i++) {
        //     String palavra = GeradorPalavras.gerarPalavraAleatoria(3, 10);
        //     int categoria = funcaoHash(palavra, totalCategorias);
        //     tabelaHash[categoria].add(palavra);            
        // }
        System.out.println("---PREENCHIDA---");
        for (int i = 0; i < tabelaHash.length; i++) {
            ArrayList<String> el = tabelaHash[i];
            //String letra = el.get(0);
            // el.subList(0, 5)
            System.out.println(i + " " + "-> total = " + el.size());
        }

        int opcao = 0;
        do{
            String procurar = JOptionPane.showInputDialog("Digite: ");
            boolean result = buscarPalavra(procurar, tabelaHash, totalCategorias);
            if (result){
                JOptionPane.showMessageDialog(null, "achei " + procurar);
            }else{
                JOptionPane.showMessageDialog(null, "nao achei " + procurar);
            }
            opcao = JOptionPane.showConfirmDialog(null, "Continuar");

        }while(opcao == JOptionPane.OK_OPTION);


        // // teste de desempenho
        // long inicio = System.currentTimeMillis();
        // for (String palavra : listaPalavra) {
        //     // teste obvio
        //     listaPalavra.contains(palavra.toUpperCase());
        // }
        // long fim = System.currentTimeMillis();
        // System.out.println("Busca ArrayList "+(fim-inicio)+ " ms");


        // inicio = System.currentTimeMillis();
        // for (String palavra : listaPalavra) {
        //     // teste obvio
        //     buscarPalavra(palavra, tabelaHash, totalCategorias);
        // }
        // fim = System.currentTimeMillis();
        // System.out.println("Busca Tabela Hash "+(fim-inicio)+ " ms");
    }
}
