public class VetorConta {
    public static void main(String[] args) {
        // vetor estatico
        // vantagem: do acesso a posicao ser rapida
        // desvantagem: se precisarmos alocar mais posicoes
        // int->[4,2,8,10,6]
        // Conta->[c1, c2, c3, c4, c5]
        // preciso armazenar mais 6 elementos
        int [] vetor = new int[5];
        vetor[0]=4;
        vetor[1]=2;
        vetor[2]=8;
        vetor[3]=10;
        vetor[4]=6;
        // novo vetor com mais 6 elementos
        int []outroVetor = new int[vetor.length+6];
        outroVetor[0]=vetor[0];
        outroVetor[1]=vetor[1];
        outroVetor[2]=vetor[2];
        outroVetor[3]=vetor[3];
        outroVetor[4]=vetor[4];
        // alternativa
        for (int i = 0; i < vetor.length; i++) {
            outroVetor[i] = vetor[i];
        }


    }

}
