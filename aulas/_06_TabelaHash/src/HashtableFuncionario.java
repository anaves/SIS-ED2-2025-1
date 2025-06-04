import java.util.Hashtable;
import java.util.Scanner;

// META: deixar essa classe GENERICA - 
public class HashtableFuncionario {
    private static Scanner input = new Scanner(System.in);
    private static Hashtable<String, Funcionario> funcs = new Hashtable<>();
    
    public static int menu(){
        System.out.println(" -----------------  ");
        System.out.println("1- Cadastrar");
        System.out.println("2- Listar todos");
        System.out.println("3- Buscar pelo CPF");
        System.out.println("4- Excluir");
        System.out.println("5- Atualizar");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        int op = input.nextInt();
        input.nextLine(); // limpar buffer
        return op;
    }

    public static void cadastrar(){
        System.out.println("----Cadastro----");
        System.out.print("CPF: ");
        String cpf = input.nextLine();
        if (funcs.containsKey(cpf)){
            System.out.println("CPF ja cadastrado");
            System.out.println("...vamos de novo...");
            cadastrar();
        }else{
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Salario: R$ ");
            double salario = input.nextDouble();
            Funcionario obj = new Funcionario(cpf, nome);
            obj.setSalario(salario);
            funcs.put(cpf, obj);
            System.out.println("... cadastro com sucesso");
        }
    }

    public static Funcionario buscar(){
        System.out.println("---Buscar---");
        System.out.print("CPF: ");
        String cpf = input.nextLine();
        if(funcs.containsKey(cpf)){
            Funcionario f = funcs.get(cpf);
            System.out.println(f);
            return f;
        }
        System.out.println("CPF "+ cpf + " inexistente");
        return null;
    }
    public static void main(String[] args) {        
        int opcao = 0;
        do{
            opcao = menu();
            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    System.out.println(funcs);
                    break;
                case 3:
                    buscar();
                    break;
                case 0:
                    System.out.println("saindo...");
                    break;            
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }while (opcao != 0);
    }
}
