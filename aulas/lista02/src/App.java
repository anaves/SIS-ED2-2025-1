import com.google.gson.Gson;

class Pessoa{
    String nome;
    int idade;
}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Gson gson = new Gson();
        String json = "{\"nome\":\"Alysson\",\"idade\":42}";
        Pessoa p = gson.fromJson(json, Pessoa.class);
        System.out.println(p.nome);
        System.out.println(p.idade);
    }
}
