public class App {
    public static void imprimir(Object []aux){
        System.out.println("aux: " + aux);
        for (int i = 0; i < aux.length; i++) {
            System.out.println(i + " >> " + aux[i]);
        }
    }
 
    public static void main(String[] args){
        int tamanho = 15;
        //int []numeros = new int[15];
        Integer []numeros = new Integer[tamanho];
        System.out.println(numeros);
        String []palavras =  {"ola", "mundo", "abobora", "oi"};
        System.out.println(palavras);
        Cliente []clientes = new Cliente[100];
        System.out.println(clientes);
        // adiciono elementos no vetor numeros
        numeros[5] = 357;
        imprimir(numeros);
        imprimir(palavras);
        palavras[3]="casa";
        imprimir(palavras);

        System.out.println(Integer.max(22, 80));
        System.out.println(Integer.reverse(89));
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.TYPE);
        System.out.println(Integer.MAX_VALUE);
        // Integer foo = new Integer();
        // foo.MAX_VALUE;
    }
}
