import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

class Pessoa{
    String nome;
    int idade;
}

public class App_arq {
    public static void main(String[] args) {
        Gson gson = new Gson();
        
        FileReader leitor;
        try {
            leitor = new FileReader("docs/pessoa.json");
            Pessoa p = gson.fromJson(leitor, Pessoa.class);
            System.out.println(p.nome);
            System.out.println(p.idade);
        }catch(Exception e){
            System.err.println("Erro");
        }
    }
}
