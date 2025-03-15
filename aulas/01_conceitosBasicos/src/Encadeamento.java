import java.util.Scanner;

public class Encadeamento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("DIGITE UM VALOR: ");
        int y = in.nextInt();
        switch (y) {
            case 1:
                System.out.println("escolhi 1");
                break;
            case 2:
                System.out.println("escolhi 2");
                break;
            case 3:
            case 4:
                System.out.println("escolhi 3 ou 4");
                break;        
            default:
                System.out.println("caso padrao");
                break;
        }
    }
}
