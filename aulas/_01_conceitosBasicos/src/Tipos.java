public class Tipos {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int numero = 127;
        System.out.println("---teste---");
        System.out.println(numero);
        // numero = ++numero;
        System.out.println(++numero);
        // System.out.println(++numero);
        // tipos primitos inteiros
        byte valor1 = 127;   // byte-> 7 bits pro numero 1 bit sinal
        byte valor2 = -128;
        // short [-32768, 32767]
        short valor3 = 32767; // short -> 15 bits e 1 bit sinal
        // int [-2147483648, 2147483647]
        int valor4 = 2147483647; // int 4 bytes =  31bits e 1 sinal
        // long 8 bytes = 64 bits
        // 1 bit sinal 63 bits pro numero
        long valor5 = 9223372036854775807l;
        // numeros reais
        float valor6 = 1.0f/3.0f; // 4 bytes
        double valor7 = 1.0/3.0; // 8 bytes -> maior precisao
        System.out.println(valor6);
        System.out.println(valor7);
        // caracteres -> aspas simples
        char valor8 = 'a';
        char valor9 = 'A';
        System.out.println(valor8);
        System.out.println(valor9);
        valor8++; // valor8 = valor8+1
        //valor9 = valor9+1; da erro
        System.out.println(valor8);
        char valor10 = 100;
        System.out.println(valor10);
        int valor11 = '$';
        System.out.println(valor11);
        // caracteres especiais
        // \n - enter (qubra de linha)
        // \t - tab
        // \f - nova pagina (form feed)
        // \' - para exibir o apstrofo
        System.out.println("\fola mundo\nhoje\testa\" calor");
        // string assim ta errado, String assim ok
        // String nao eh tipo primitivo
        String valor12 = "o que eh? o que eh?...";
        System.out.println(valor12);
        System.out.println(valor12.toUpperCase());
        // tipo logico - boolean
        boolean valor13 = false;
        System.out.println(valor13);
        

    }
}
