package local.adler.testefile;

import java.io.File;

public class TestePasta {
    public static void main(String[] args) {
        
        File diretorio = new File("pasta");
        
        if(diretorio.mkdir()) {
            System.out.println("diretório criado");
        } else {
            System.out.println("não foi possivel criar o diretório");
        }
        
        File sub = new File("pasta2" + File.separator + "subpasta");
        sub.mkdirs();
        
        File dir = new File("pasta");
    }
}
