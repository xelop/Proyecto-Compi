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
        tokens = new ArrayList<TokenDesplegable>();
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
                        createToken(lexer.lexeme, currentToken.toString(), 0); //en cero ya que no se como obtener la linea del reader
                        break;
                }
            }
        }
        Collections.sort(tokens);
        printTokens();
    }
    
    private static void printTokens(){
        
        Collections.sort(tokens); 
        
        for(TokenDesplegable token: tokens)
            System.out.println(token.toString());
        
    }
    
    private static void createToken(String pNombre, String pTipo, int pNumeroLinea){
        
        TokenDesplegable tokenActual = verificarToken(pNombre);
        
        if(tokenActual != null){
            tokenActual.crearLinea(pNumeroLinea);
        } else {
            tokenActual = new TokenDesplegable(pNombre, pTipo);
            tokenActual.crearLinea(pNumeroLinea);
            tokens.add(tokenActual);
        }
        
    }
    
    private static TokenDesplegable verificarToken(String pToken){
        
        for(TokenDesplegable nuevoToken: tokens ){
            if(nuevoToken.compareName(pToken))
                return nuevoToken;
        }
        return null;
    }
}
