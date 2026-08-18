public class Main {
    public static void main(String[] args) {
        int[][] imagem = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };

        int sr = 1; // linha do pixel inicial
        int sc = 1; // coluna do pixel inicial
        int novaCor = 2; // nova cor para preencher

        Algoritm algoritm = new Algoritm();
        int[][] resultado = algoritm.floodFill(imagem, sr, sc, novaCor);

        // Imprime a imagem resultante
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
