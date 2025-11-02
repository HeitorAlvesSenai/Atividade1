import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class TabuadaCompleta2 {

    public static void main(String[] args) {
        // === TABUADA COMPLETA ===
        // Defina o link para o post do Instagram
        String instagramUrl = "https://www.instagram.com/p/DQhq6YakoXl/?igsh=MWE1dWxqdXZ3ZHJoMw";
        
        // Verifica se a funcionalidade Desktop é suportada pelo sistema
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                // Cria um objeto URI (Identificador de Recurso Uniforme) a partir da URL
                URI uri = new URI(instagramUrl);
                
                // Abre o URI no navegador padrão
                Desktop.getDesktop().browse(uri);
                
                System.out.println("Abrindo o post do Instagram: " + instagramUrl);
                
            } catch (URISyntaxException e) {
                System.err.println("Erro de sintaxe na URL: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Erro ao tentar abrir o navegador: " + e.getMessage());
            }
        } else {
            System.out.println("A funcionalidade de Desktop não é suportada neste sistema.");
        }
    }
}