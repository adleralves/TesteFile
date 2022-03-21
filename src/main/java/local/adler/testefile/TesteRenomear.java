package local.adler.testefile;

import java.io.File;

public class TesteRenomear {
    public static void main(String[] args) {
        File pasta = new File("pasta2");
        
        if(pasta.isDirectory()){
            String[] arqs = pasta.list();
            for(String nome : arqs) {
                System.out.println(nome);
                System.out.println("teste");
            }
        }
        
        File novoNome = new File("pasta_renomeada");
        pasta.renameTo(novoNome);
    }
}
