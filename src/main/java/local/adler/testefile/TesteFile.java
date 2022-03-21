package local.adler.testefile;
import java.io.File;
import java.io.IOException;

public class TesteFile {
    public static void main(String[] args) {
        
        File arquivo = new File("texto.txt");
        
        if(!arquivo.exists()) {
            System.out.println("até aqui não foi criado um arquivo.");
        }
        
        try {
            if(arquivo.createNewFile()) {
                System.out.println("Arquivo criado");
            } else {
                System.out.println("O arquivo não foi criado, talvez ele já exista");
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
