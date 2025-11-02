public class TabuadaCompleta {

    public static void main(String[] args) {
        // === TABUADA COMPLETA ===
        // Define o limite máximo para a tabuada (ex: até a tabuada do 10)
        int limiteTabuada = 10;
        
        // 1. Laço Externo (i) ---
        // Este laço define qual tabuada estamos calculando (Ex: Tabuada do 1, Tabuada do 2, etc.)
        for (int i = 1; i <= limiteTabuada; i++) {
            
            // Imprime um cabeçalho para separar as tabuadas
            System.out.println("---------------------------");
            System.out.println("--- TABUADA DO " + i + " ---");
            System.out.println("---------------------------");
            
            // 2. Laço Interno (j) ---
            // Este laço define o multiplicador (Ex: x 1, x 2, x 3, ..., x 10)
            for (int j = 1; j < 11; j++) {
                
                // Calcula o resultado da multiplicação
                int resultado = i * j;
                
                // Imprime a operação no formato "i x j = resultado"
                System.out.println(i + " x " + j + " = " + resultado);
            }
            
            // Adiciona uma linha vazia para melhor visualização
            System.out.println();
        }
    }
}