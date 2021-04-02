package uruborosKrakato;

 import java.util.Scanner;
 
  
 
 
/* Sejam bem vindos ao URUBOROS, um gamebook em RPG de texto! Um universo paralelo onde Deuses e humanos ocupam o mesmo espaço e compartilham dos mesmos desejos... */
  
 
 public class bookOne {
   
   
   
   public static void main  (String[] args){

Scanner scanner = new Scanner(System.in);





/*Aqui inicia a construção de uma arte ASCII para a interação e apresentação do menu. */


System.out.println("              _.,._____..._____,_____,,_._");
System.out.println("      '.   .''.___...___,,___..______..__.''.");
System.out.println("      .' .' ..  ....                  ....'. '.");
System.out.println("      -.' .'   ::::;                  ...   '. '.");
System.out.println("       '--'_'. ...                    .,   __'--' ");
System.out.println("       |.|_________________--_________________| | .'");



/* O jogo é composto de 5 personagens, cada um com sua senha e número... inicialmente o jogo começa com TEBAS ao decorrer da história você conseguirá as senhas para desbloquear os outros personagens.
 
  número de TEBAS: 03 || 003
  Senha: 3447 */



System.out.print("       __________--   PERSONAGEM: ");
     short nome = scanner.nextShort();
     
       if (nome == 03) {
 
System.out.print("       ________--     SENHA:   ");
     short codg1 = scanner.nextShort();
       
       if (codg1 == 3){
        
System.out.println("       _____--                                | :.");
System.out.println("          - Tebas, ainda bem que você chegou! | | '"); 
System.out.println("       _____--         - Kassaya...           | .");
System.out.println("       ________--    - ONE SESSION            . |");
System.out.println("       __________--                           : : '");    
System.out.println("       |.|_________________--_________________| |- '");   
System.out.println("       | |                                    | |");      
System.out.println("    '  | |.'.'                                | |");           
System.out.println("       | |'.'.                                | |");    
System.out.println("  '    | |                                    | _");      
System.out.println("   '   | |                                    .' .'");      
System.out.println("       | |                                  .' .'");      System.out.println("       | |  '.                           .' .'");
System.out.println("       | |                               --   | |");
System.out.println("       | |                                    | |");  

/* Nome UROBORUS em arte ASCII */
    
System.out.println("     ___ _               __.                    _____");
System.out.println("    |   | '. ____    __'._ |__    __ ____ __ _.'  __.'");
System.out.println("    |   |  ''.   '..'  '.|    '..'  '.   '. | '.__  '.");
System.out.println("    |   | .' | |'.(      )     (      ) |'  | .'     .");
System.out.println("    '----'   '-'   '----''--- ' '----''-' '--'-------'");
 
/* faixa com o nome KRAKATO (sub-título do gamebook) */

System.out.println("        ==____._...__ __.__.____..___.__.::._____==");
System.out.println("       '.                                         .'");
System.out.println("- ___..._:   |_.' |''| |''| |_.' |''| ''|'' |''|  :__._.__._-");
System.out.println(" '       |   |'.  |''. |  | |'.  |  |   |   |  |  |         ' ");
System.out.println("-|       |      '    ' '  '    ' '  '   '    ''   |         |_"); 
System.out.println(" '.      '-----------....---.----.----::.:.------'.        .'");
System.out.println("__.'________.'                                '.___________'.__");  
        
/* */  
       
System.out.println("       |:|                                    | |");
System.out.println("       :_:                                    :_:");
System.out.println("       '.'.__________________________________.'.'");
System.out.println("        '----..---.----.--- -- ... --.:.::.::.-'");
  
/* Inicia - se */

System.out.println("");
System.out.println("");
System.out.println("");
System.out.println("");


System.out.println("      | - Tebas... fique com ele... agora...");

System.out.println("      | (dificuldades para respirar e falar)");
System.out.println("      | ... ele é seu...");


System.out.println("      | - Caralho Kassaya você não deixou nem uma");
System.out.println("      | dica de como usar isso!");

/* 3 cálculos matemáticos de nível intermediário, caso consiga decifrar os 3 cálculos um novo "SE" irar se abrir e você poderá continuar sua jornada*/


System.out.println("");
System.out.println("");


System.out.println("      |... Esfregar a esfera do cajado: ");

System.out.println("");    
       
System.out.print("      |... ");
     float esf = scanner.nextFloat();
System.out.print("      |... ");
     float rega = scanner.nextFloat();
System.out.println("      |... ");
  
     float total = esf + rega;
  
System.out.println("");
System.out.print("      |... " + total);
System.out.println("");    
   
   
     
       if (total == 5){



System.out.println("");    
System.out.println("         CONTINUA");
System.out.println("");


System.out.print("      |... ");
     float no = scanner.nextFloat();
System.out.print("      |... ");
     float ta = scanner.nextFloat();
System.out.println("      |... ");

     float resu = no * ta;
     
System.out.println("");
System.out.print("      |... " + resu);
System.out.println("");
      
      
    
       if (resu == 4){
  
  
  
System.out.println("");         
System.out.println("         CONTINUA");
System.out.println("");


System.out.print("      |... ");    
     float so = scanner.nextFloat();
System.out.print("      |... ");
     float ma = scanner.nextFloat();   
System.out.println("      |... ");

     float divi = so / ma;

System.out.println("");
System.out.print("      |... " + divi);
System.out.println("");



       if (divi == 5) {
         
/* uma bifurcação da história dependendo da resposta boolean (true or false) */

System.out.println("");
System.out.println("      ladoA");
     
 } 
       
         else{
        
System.out.println("");
System.out.println("      ladoB");}
     
     
         
         
 } 
         else {  

System.out.println("");   
System.out.println("   repita 2 ");    


 }
 } 

/* Else pertence ao primeiro if, caso voce erre a questão o fluxo é encaminhado para esse loop*/
 
   
         else {

 while (total != 5) {

System.out.println("");
System.out.println("       REPETI  ");
System.out.println("");
 
 
 System.out.print("      |... ");     
     float es = scanner.nextFloat();
System.out.print("      |... ");
     float reg = scanner.nextFloat();
System.out.println("      |... ");
  
     float tota = es + reg;
  
System.out.println("");
System.out.print("      |... " + tota);
System.out.println("");


       if (tota == 5){



System.out.println("");    
System.out.println("         CONTINUA");
System.out.println("");


System.out.print("      |... ");
     float no = scanner.nextFloat();
System.out.print("      |... ");
     float ta = scanner.nextFloat();
System.out.println("      |... ");

     float resu = no * ta;
     
System.out.println("");
System.out.print("      |... " + resu);
System.out.println("");
      
      
    
       if (resu == 4){
  
  
  
System.out.println("");         
System.out.println("         CONTINUA");
System.out.println("");


System.out.print("      |... ");    
     float so = scanner.nextFloat();
System.out.print("      |... ");
     float ma = scanner.nextFloat();   
System.out.println("      |... ");

     float divi = so / ma;

System.out.println("");
System.out.print("      |... " + divi);
System.out.println("");



       if (divi == 5) {
         

System.out.println("");

System.out.println("      ladoA");
     
       } else{

System.out.println("");        

System.out.println("      ladoB");}
     
     
                         break;   
         
 } 
         else{}
     
 } 
         else{}

 }

 }
        
   
        
       
     
     
     
     
     
     
     
     
       /* fim se do menu */
       } else { System.out.print("ERRO");}
       } else { System.out.print("ERRO");} 










  
 }
}
