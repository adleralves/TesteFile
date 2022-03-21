/*
criar um arquivo dentro dele passando o objeto File representando o diretório 
como parâmetro para criar no novo arquivo:
*/
package local.adler.testefile;

import java.io.File;
import java.io.IOException;

public class TesteDir {
    public static void main(String[] args) {
        File dir = new File("dir");
        
        if(dir.mkdir()) {
            System.out.println("diretório criado");
        } else {
            System.out.println("diretório não criado");
        }
        
        try {
            File file = new File(dir, "file.txt");
            if(file.createNewFile()) {
                System.out.println("Arquivo criado");
            } else {
                System.out.println("Arquivo não criado");
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
