public class VetorDeObjetosCP {
    public static void imprimir(Conta []aux){
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] == null){
                System.out.print(aux[i] + " | ");
            }else{
                // System.out.print(aux[i] + " num: " + aux[i].numero + 
                // " titular " + aux[i].titular + " | ");
                System.out.print(aux[i] + " | ");
            }
        }
        System.out.println();
    }   

    public static void main(String[] args) {
        Conta []minhasContas = new Conta[3];
        imprimir(minhasContas);
        Conta nubank = new Conta();
        nubank.numero = "8888-8";
        nubank.titular = "Alysson";
        minhasContas[0] = nubank;
        imprimir(minhasContas);

        Conta caixa = new Conta();
        caixa.numero = "2222-2";
        caixa.titular = "alysson";
        minhasContas[1] = caixa;
        imprimir(minhasContas);
        System.out.println("---------------");
        System.out.println(caixa.toString());
        System.out.println(caixa);
        
    }    

}
