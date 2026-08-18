public class Algoritm {
    
    public final int [][] DIRECAO = { // "int [][]" é um array de arrays de inteiros, representando as direções possíveis em um grid
        {0, 1}, // direita
        {1, 0}, // baixo
        {0, -1}, // esquerda
        {-1, 0} // cima
    };

    int corOrginal = -1; // esta variável armazena a cor original do pixel que será alterado


    public int[][] floodFill(int[][] imagem, int sr, int sc, int novaCor) {

        if (corOrginal == -1) {
            corOrginal = imagem[sr][sc];
        }

        imagem[sr][sc] = novaCor; // altera a cor do pixel atual para a nova cor

        for (int[] dir : DIRECAO) {
            int x = sr + dir[0]; // calcula a nova coordenada x
            int y = sc + dir[1]; // calcula a nova coordenada y

            if (x >= 0 && x < imagem.length && y < imagem[0].length && y >= 0 && imagem[x][y] == corOrginal) {
                floodFill(imagem, x, y, novaCor); // chama recursivamente a função para o pixel vizinho
            }
        }

        return imagem; // retorna a imagem modificada
    }
}
