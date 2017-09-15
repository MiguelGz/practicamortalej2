/*
Desarrolle una  aplicación  que permita ingresar  un 
texto y  como  resultado muestre el  nmero  de palabras, letras, 
símbolos, y espacios en blanco. 
 */
package ejercicio2;



import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author MiguelGz
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
    //Cree un objeto scanner con identificador texto 
       Scanner texto=new Scanner(System.in);
       
       //Ingresamos una String
            String palabra;
        
            System.out.println
                                (
                                  "INGRESE UN TEXTO:    "
                                );
            
        palabra=texto.nextLine();
        
        /*
         Empleamos la clase stringtkenizer el cual separa el string en partes y a 
         su vez el metodo counttokenz que nos dira cuantas palabras tiene el texto
        */
        
        StringTokenizer st = new StringTokenizer(palabra);
                 System.out.println
                                    (
                                     "PALABRAS: " + st.countTokens()
                                     );
        
        /*
         El int contador llevara la cuenta ya sea letra,numero,
         espacios de la palabra
        */
        int contador=0 ;
        int contador1=0;
        int contador2=0;
        int contador3=0;
       
       
            for(int y=0;y<palabra.length();y++) 
       
                    {
            
            /*
              Profe en este caso lo presento asi porque no se me ocurria otra 
              forrma ya que probe con el char.touppercase pero no me salia y 
              el tiempo es oro y como tengo clases a las 1... pues 
              se me ocurrio esto.. es un poco larguito pero almenmos se entiende
            */
                        
               if 
                       (
                                (palabra.charAt(y)=='a') 
                             || (palabra.charAt(y)=='b')
                             || (palabra.charAt(y)=='c')                                                       
                             || (palabra.charAt(y)=='d')
                             || (palabra.charAt(y)=='e')
                             || (palabra.charAt(y)=='f')
                             || (palabra.charAt(y)=='g')
                             || (palabra.charAt(y)=='h')
                             || (palabra.charAt(y)=='i')
                             || (palabra.charAt(y)=='j')
                             || (palabra.charAt(y)=='k')
                             || (palabra.charAt(y)=='l') 
                             || (palabra.charAt(y)=='m')
                             || (palabra.charAt(y)=='ñ')
                             || (palabra.charAt(y)=='o')
                             || (palabra.charAt(y)=='p')
                             || (palabra.charAt(y)=='q')
                             || (palabra.charAt(y)=='r') 
                             || (palabra.charAt(y)=='s')
                             || (palabra.charAt(y)=='t')
                             || (palabra.charAt(y)=='u')
                             || (palabra.charAt(y)=='v')
                             || (palabra.charAt(y)=='w')
                             || (palabra.charAt(y)=='x')
                             || (palabra.charAt(y)=='y') 
                             || (palabra.charAt(y)=='z')                                                  
                       
                             || (palabra.charAt(y)=='A') 
                             || (palabra.charAt(y)=='B')
                             || (palabra.charAt(y)=='C') 
                             || (palabra.charAt(y)=='D')
                             || (palabra.charAt(y)=='E')
                             || (palabra.charAt(y)=='F')
                             || (palabra.charAt(y)=='G')
                             || (palabra.charAt(y)=='H')
                             || (palabra.charAt(y)=='I')
                             || (palabra.charAt(y)=='J')
                             || (palabra.charAt(y)=='K')
                             || (palabra.charAt(y)=='L') 
                             || (palabra.charAt(y)=='M')
                             || (palabra.charAt(y)=='N')
                             || (palabra.charAt(y)=='O')
                             || (palabra.charAt(y)=='P')
                             || (palabra.charAt(y)=='Q')
                             || (palabra.charAt(y)=='R') 
                             || (palabra.charAt(y)=='S')
                             || (palabra.charAt(y)=='T')
                             || (palabra.charAt(y)=='U')
                             || (palabra.charAt(y)=='V')
                             || (palabra.charAt(y)=='W')
                             || (palabra.charAt(y)=='X')
                             || (palabra.charAt(y)=='Y') 
                             || (palabra.charAt(y)=='Z')
                       )
                 
                        {     
                             contador1++;
                        } 
               
        }
        
            System.out.println("LETRAS: "+contador1);
       /*
        Bueno.. aqui en cada iteracion que tenga el metodo char nos devolvera 
        el caracter de la posicion que hemos reccorido en este caso si comprueba 
        que esos caracteres son una letra .. pues se va sumando +1 
        y asi susesivamente
       */
       
                for(int x=0;x<palabra.length();x++) 
        
                    {
                        if 
                           (
                               (palabra.charAt(x)=='0') 
                            || (palabra.charAt(x)=='1')
                            || (palabra.charAt(x)=='2') 
                            || (palabra.charAt(x)=='3')
                            || (palabra.charAt(x)=='4')
                            || (palabra.charAt(x)=='5')
                            || (palabra.charAt(x)=='6')
                            || (palabra.charAt(x)=='7')
                            || (palabra.charAt(x)=='8')
                            || (palabra.charAt(x)=='9')
                            ) 
                 
                     {
                         contador++;
                     }
       }
                
                     System.out.println
                                        (
                                          "NUMEROS: "+contador
                                        );
                     
              
                     /*
       /* Bueno.. aqui en cada iteracion que tenga el metodo char nos devolvera 
        el caracter de la posicion que hemos reccorido en este caso si comprueba 
        que esos caracteres son una letra .. pues se va sumando +1 
        y asi susesivamente
       */
                for(int q=0;q<palabra.length();q++) 
        
                    {
                        if 
                           (
                               (palabra.charAt(q)=='=') 
                            || (palabra.charAt(q)=='"')
                            || (palabra.charAt(q)=='>') 
                            || (palabra.charAt(q)=='#')
                            || (palabra.charAt(q)=='$')
                            || (palabra.charAt(q)=='%')
                            || (palabra.charAt(q)=='&')
                            || (palabra.charAt(q)=='*')
                            || (palabra.charAt(q)=='+')
                            || (palabra.charAt(q)==',')
                            || (palabra.charAt(q)=='-')
                            || (palabra.charAt(q)=='.') 
                            || (palabra.charAt(q)=='/')
                            || (palabra.charAt(q)==':')
                            || (palabra.charAt(q)==';')
                            || (palabra.charAt(q)=='<')
                            || (palabra.charAt(q)=='^')
                            || (palabra.charAt(q)=='_')
                            || (palabra.charAt(q)=='`') 
                            || (palabra.charAt(q)=='ƒ')
                            || (palabra.charAt(q)=='„')
                            || (palabra.charAt(q)=='…')
                            || (palabra.charAt(q)=='†')
                            || (palabra.charAt(q)=='‡') 
                            || (palabra.charAt(q)=='ˆ')
                            || (palabra.charAt(q)=='‰')
                            || (palabra.charAt(q)=='Š')
                            || (palabra.charAt(q)=='‹')
                            || (palabra.charAt(q)=='‘')
                            || (palabra.charAt(q)=='Ž')
                            || (palabra.charAt(q)=='Œ') 
                            || (palabra.charAt(q)=='‚')
                            || (palabra.charAt(q)=='€') 
                            || (palabra.charAt(q)=='Δ')
                            || (palabra.charAt(q)=='~')
                            || (palabra.charAt(q)=='}')
                            || (palabra.charAt(q)=='(')
                            || (palabra.charAt(q)==')')
                            || (palabra.charAt(q)=='[')
                            || (palabra.charAt(q)==']')
                            || (palabra.charAt(q)=='{')
                            || (palabra.charAt(q)=='}') 
                            || (palabra.charAt(q)=='’')
                            || (palabra.charAt(q)=='“')
                            || (palabra.charAt(q)=='”')
                            || (palabra.charAt(q)=='•')
                            || (palabra.charAt(q)=='–')
                            || (palabra.charAt(q)=='—')
                            || (palabra.charAt(q)=='˜') 
                            || (palabra.charAt(q)=='™')
                            || (palabra.charAt(q)=='š')
                            || (palabra.charAt(q)=='›')
                            || (palabra.charAt(q)=='œ')
                            || (palabra.charAt(q)=='ž') 
                            || (palabra.charAt(q)=='Ÿ')                           
                            || (palabra.charAt(q)=='¢')
                            || (palabra.charAt(q)=='£')
                            || (palabra.charAt(q)=='¤')
                            || (palabra.charAt(q)=='¥')
                            || (palabra.charAt(q)=='¦')
                            || (palabra.charAt(q)=='§') 
                            || (palabra.charAt(q)=='¨')
                            || (palabra.charAt(q)=='©')
                            || (palabra.charAt(q)=='«')
                            || (palabra.charAt(q)=='¬')
                            || (palabra.charAt(q)=='®')
                            || (palabra.charAt(q)=='å')
                            || (palabra.charAt(q)=='ä')
                            || (palabra.charAt(q)=='ã')
                            || (palabra.charAt(q)=='â') 
                            || (palabra.charAt(q)=='á')
                            || (palabra.charAt(q)=='à')
                            || (palabra.charAt(q)=='ß')
                            || (palabra.charAt(q)=='Þ')
                            || (palabra.charAt(q)=='Ý')
                            || (palabra.charAt(q)=='Ü')
                            || (palabra.charAt(q)=='Û') 
                            || (palabra.charAt(q)=='Ú')
                            || (palabra.charAt(q)=='Ù')
                            || (palabra.charAt(q)=='Ø')
                            || (palabra.charAt(q)=='×')
                            || (palabra.charAt(q)=='Ö') 
                            || (palabra.charAt(q)=='Õ')
                            || (palabra.charAt(q)=='Ô')
                            || (palabra.charAt(q)=='Ó')
                            || (palabra.charAt(q)=='Ò')
                            || (palabra.charAt(q)=='Ñ')
                            || (palabra.charAt(q)=='ñ')
                            || (palabra.charAt(q)=='Ð')
                            || (palabra.charAt(q)=='Ï')
                            || (palabra.charAt(q)=='Î')
                            || (palabra.charAt(q)=='Í')
                            || (palabra.charAt(q)=='Ì')
                            || (palabra.charAt(q)=='Ë')
                            || (palabra.charAt(q)=='æ')
                            || (palabra.charAt(q)=='ç')
                            || (palabra.charAt(q)=='è')
                            || (palabra.charAt(q)=='é') 
                            || (palabra.charAt(q)=='ê')
                            || (palabra.charAt(q)=='ë')
                            || (palabra.charAt(q)=='ì')
                            || (palabra.charAt(q)=='í')
                            || (palabra.charAt(q)=='î')
                            || (palabra.charAt(q)=='ï')
                            || (palabra.charAt(q)=='ð') 
                            || (palabra.charAt(q)=='ò')
                            || (palabra.charAt(q)=='ó')
                            || (palabra.charAt(q)=='ô')
                            || (palabra.charAt(q)=='õ')
                            || (palabra.charAt(q)=='ö') 
                            || (palabra.charAt(q)=='÷')
                            || (palabra.charAt(q)=='ø')
                            || (palabra.charAt(q)=='ù')
                            || (palabra.charAt(q)=='ú')
                            || (palabra.charAt(q)=='û')
                            || (palabra.charAt(q)=='ü')
                            || (palabra.charAt(q)=='ý')
                            || (palabra.charAt(q)=='þ')
                            || (palabra.charAt(q)=='ÿ')
                            || (palabra.charAt(q)=='Ç')
                            || (palabra.charAt(q)=='ü')
                            || (palabra.charAt(q)=='é')
                            || (palabra.charAt(q)=='â')
                            || (palabra.charAt(q)=='ä')
                            || (palabra.charAt(q)=='à')
                            || (palabra.charAt(q)=='å') 
                            || (palabra.charAt(q)=='ç')
                            || (palabra.charAt(q)=='ê')
                            || (palabra.charAt(q)=='ë')
                            || (palabra.charAt(q)=='è')
                            || (palabra.charAt(q)=='ï')
                            || (palabra.charAt(q)=='î')
                            || (palabra.charAt(q)=='ì') 
                            || (palabra.charAt(q)=='Ä')
                            || (palabra.charAt(q)=='Å')
                            || (palabra.charAt(q)=='É')
                            || (palabra.charAt(q)=='æ')
                            || (palabra.charAt(q)=='Æ') 
                            || (palabra.charAt(q)=='ô')
                            || (palabra.charAt(q)=='ö')
                            || (palabra.charAt(q)=='ò')
                            || (palabra.charAt(q)=='û')
                            || (palabra.charAt(q)=='ù')
                            || (palabra.charAt(q)=='ÿ')
                            || (palabra.charAt(q)=='Ö')
                            || (palabra.charAt(q)=='Ü')
                            || (palabra.charAt(q)=='¢')
                            || (palabra.charAt(q)=='£')
                            || (palabra.charAt(q)=='¥')
                            || (palabra.charAt(q)=='₧')
                            || (palabra.charAt(q)=='ƒ')
                            || (palabra.charAt(q)=='á') 
                            || (palabra.charAt(q)=='í')
                            || (palabra.charAt(q)=='ó')
                            || (palabra.charAt(q)=='ú')                           
                            || (palabra.charAt(q)=='¿')
                            || (palabra.charAt(q)=='⌐') 
                            || (palabra.charAt(q)=='½')
                            || (palabra.charAt(q)=='¬')
                            || (palabra.charAt(q)=='¼')
                           
                            || (palabra.charAt(q)=='«') 
                            || (palabra.charAt(q)=='»')
                            || (palabra.charAt(q)=='┐')
                            || (palabra.charAt(q)=='╝')
                            || (palabra.charAt(q)=='╛')
                            || (palabra.charAt(q)=='╗')
                            || (palabra.charAt(q)=='║')
                            || (palabra.charAt(q)=='╣')
                            || (palabra.charAt(q)=='╕')
                            || (palabra.charAt(q)=='╖')
                            || (palabra.charAt(q)=='╢')
                            || (palabra.charAt(q)=='╡')
                            || (palabra.charAt(q)=='┤')
                            || (palabra.charAt(q)=='│')
                            || (palabra.charAt(q)=='└') 
                            || (palabra.charAt(q)=='┴')
                            || (palabra.charAt(q)=='┬')
                            || (palabra.charAt(q)=='├')
                            || (palabra.charAt(q)=='─')
                            || (palabra.charAt(q)=='┼')
                            || (palabra.charAt(q)=='╞')
                            || (palabra.charAt(q)=='╟') 
                            || (palabra.charAt(q)=='╚')
                            || (palabra.charAt(q)=='╔')
                            || (palabra.charAt(q)=='╩')
                            || (palabra.charAt(q)=='╦')
                            || (palabra.charAt(q)=='╠') 
                            || (palabra.charAt(q)=='═')
                            || (palabra.charAt(q)=='╬')
                            || (palabra.charAt(q)=='╧')
                            || (palabra.charAt(q)=='▀')
                            || (palabra.charAt(q)=='▐')
                            || (palabra.charAt(q)=='▌')
                            || (palabra.charAt(q)=='▄')
                            || (palabra.charAt(q)=='▄')
                            || (palabra.charAt(q)=='█')
                            || (palabra.charAt(q)=='┌')
                            || (palabra.charAt(q)=='┘')
                            || (palabra.charAt(q)=='╪')
                            || (palabra.charAt(q)=='╫')
                            || (palabra.charAt(q)=='╓') 
                            || (palabra.charAt(q)=='╒')
                            || (palabra.charAt(q)=='╘')
                            || (palabra.charAt(q)=='╙')
                            || (palabra.charAt(q)=='¡')
                            || (palabra.charAt(q)=='╥')
                            || (palabra.charAt(q)=='╤')
                            || (palabra.charAt(q)=='╨')
                            || (palabra.charAt(q)=='α') 
                            || (palabra.charAt(q)=='ß')
                            || (palabra.charAt(q)=='Γ')
                            || (palabra.charAt(q)=='π')
                            || (palabra.charAt(q)=='Σ')
                            || (palabra.charAt(q)=='σ') 
                            || (palabra.charAt(q)=='µ')
                            || (palabra.charAt(q)=='τ')
                            || (palabra.charAt(q)=='Φ')
                            || (palabra.charAt(q)=='Θ')
                            || (palabra.charAt(q)=='Ω')
                            || (palabra.charAt(q)=='δ')
                            || (palabra.charAt(q)=='∞')
                            || (palabra.charAt(q)=='φ')
                            || (palabra.charAt(q)=='ε')
                            || (palabra.charAt(q)=='∩')
                            || (palabra.charAt(q)=='≡')
                            || (palabra.charAt(q)=='±')
                            || (palabra.charAt(q)=='≥')
                            || (palabra.charAt(q)=='≤') 
                            || (palabra.charAt(q)=='⌠')
                            || (palabra.charAt(q)=='⌡')
                            || (palabra.charAt(q)=='÷')
                            || (palabra.charAt(q)=='≈')
                            || (palabra.charAt(q)=='°')
                            || (palabra.charAt(q)=='∙')
                            || (palabra.charAt(q)=='·') 
                            || (palabra.charAt(q)=='√')
                            || (palabra.charAt(q)=='ⁿ')
                            || (palabra.charAt(q)=='²')
                            || (palabra.charAt(q)=='■')
                            || (palabra.charAt(q)=='!')
                            || (palabra.charAt(q)=='¡')
                            || (palabra.charAt(q)=='?')                          
                            || (palabra.charAt(q)=='¿')
                            
                           
                            ) 
                 
                     {
                         contador3++;
                     }
       }
                
                     System.out.println
                                        (
                                          "SIMBOLOS: "+contador3
                                        );
                     
        /* Bueno.. aqui en cada iteracion que tenga el metodo char nos devolvera 
        el caracter de la posicion que hemos reccorido en este caso si comprueba 
        que esos caracteres son una letra .. pues se va sumando +1 
        y asi susesivamente
       */
               
                    for(int z=0;z<palabra.length();z++) 
        
                    {
                        if 
                            (
                              (palabra.charAt(z)==' ') 
                            )
                            
                        {
                            contador2++;
                        }
                        
        }
            System.out.println
                                (
                                  "ESPACIOS: "+contador2
                                );
            //Profe que procede me reconoce los simbolos menos este :  ¡
            
    
    }
}

        
    


    


