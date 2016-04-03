package lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    private static ArrayList<TokenDesplegable> tokens;

    public static void main(String[] args) {
        String path = "./src/lexer/lexer.flex";
        generarLexer(path);
        System.out.println("Analizador Creado. Se procede a scannear:");
        try{
            ScannerController scanner = new ScannerController("Prueba.mypy");
            scanner.Scan();
            System.out.println("Análisis léxico terminado.");
        }
        catch(IOException e){
            System.out.println("No se pudo abrir el archivo.");
        }
    }
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    
}
