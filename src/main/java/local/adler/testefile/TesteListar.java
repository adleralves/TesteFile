package local.adler.testefile;

import java.io.File;

public class TesteListar {
    public static void main(String[] args) {
        File dir = new File("pasta");
        
        if(dir.isDirectory()){
            String[] arqs = dir.list();
            for(String nome : arqs) {
                System.out.println(nome);
                System.out.println("teste");
            }
        }
        
        if(dir.delete()) {
            System.out.println("arquivo deletado");
        } else {
            System.out.println("arquivo não deletado");
        }
        
    }
}
