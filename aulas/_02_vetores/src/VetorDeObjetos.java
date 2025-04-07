public class VetorDeObjetos {
    public static void imprimir(double []aux){
        System.out.println("IMP 1");
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
        System.out.println();
    }
    public static void imprimir(Object []aux){
        System.out.println("IMP 2");
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
        System.out.println();
    }
    // public static void imprimir(String []aux){
    //     for (int i = 0; i < aux.length; i++) {
    //         System.out.print(aux[i] + " ");
    //     }
    //     System.out.println();
    // }
    // public static void imprimir(Conta []aux){
    //     for (int i = 0; i < aux.length; i++) {
    //         System.out.print(aux[i] + " ");
    //     }
    //     System.out.println();
    // }
    

    public static void main(String[] args) {
        double []v = new double[4]; // [0.0,0.0,0.0,0.0]
        imprimir(v);
        String []palavras = new String[4];
        imprimir(palavras);
        Conta []minhasContas = new Conta[3];
        imprimir(minhasContas);
        Double []w = new Double[4]; // [null, null, null, null]
        imprimir(w);
    }    

}
