package lexer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;


public class ScannerController {
    
    private ArrayList<TokenDesplegable> tokens;
    private String path;
    
    public ScannerController(String pPath){
        path = pPath;
        tokens = new ArrayList<TokenDesplegable>();
    }
    
    public void Scan() throws IOException{
        Reader reader = new BufferedReader(new FileReader(path));
        Lexer lexer = new Lexer(reader);
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
                        System.out.println("Error : " + lexer.lexeme + ".\n");
                        break;
                    default:
                        createToken(lexer.lexeme, currentToken.toString(), lexer.getLine()); 
                        break;
                }
            }
        }
        Collections.sort(tokens);
        printTokens();
    }
    
    private void printTokens(){
        
        Collections.sort(tokens); 
        
        for(TokenDesplegable token: tokens)
            System.out.println(token.toString());
        
    }
    
    private void createToken(String pNombre, String pTipo, int pNumeroLinea){
        
        TokenDesplegable tokenActual = verificarToken(pNombre);
        
        if(tokenActual != null){
            tokenActual.crearLinea(pNumeroLinea);
        } else {
            tokenActual = new TokenDesplegable(pNombre, pTipo);
            tokenActual.crearLinea(pNumeroLinea);
            tokens.add(tokenActual);
        }
        
    }
    
    private TokenDesplegable verificarToken(String pToken){
        
        for(TokenDesplegable nuevoToken: tokens ){
            if(nuevoToken.compareName(pToken))
                return nuevoToken;
        }
        return null;
    }
}
