import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0 ;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota " + (i+1) + ":");
            double nota =  in.nextDouble();
            soma += nota;
        }
        double media = soma/3;
        if (media >= 7){
            System.out.println("APROVADO com MEDIA = " + media);
        }else{
            double pf = 7 - media;
            System.out.println("media = " + media);
            System.out.println("PROVA FINAL precisando de = " + pf);
        }
    }
}
