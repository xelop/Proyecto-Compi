package lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;


public class Main {

    public static void main(String[] args) {
        String path = "./src/lexer/lexer.flex";
        generarLexer(path);
        System.out.println("Analizador Creado. Se procede a scannear:");
        try{
            Scan();
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
    public static void Scan() throws IOException{
        Reader reader = new BufferedReader(new FileReader("Prueba.mypy"));
        Lexer lexer = new Lexer(reader);
        String resultado = "";
        Token currentToken;
        while(true){
            currentToken = lexer.yylex();
            if (currentToken == null){
                //se llega al final del archivo.
                
                break;
            }
            else{
                switch(currentToken){
                    case ERROR:
                        resultado = resultado + "Error : " + lexer.lexeme + ".\n";
                        System.out.println("ERROR");
                        break;
                    default:
                        resultado = resultado + lexer.lexeme + " y de tipo: " + currentToken + ".\n";
                        break;
                }
            }
        }
        System.out.println(resultado);
    }
}
