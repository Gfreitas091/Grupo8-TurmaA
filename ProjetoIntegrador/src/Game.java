import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Game {
	static int temp_dialog =60, temp_narrativa = 140, temp_transicao = 30; 
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    String NomePlayer;
    int Escolha;
    
         
    public static void main(String[] args) throws Exception {
 
        Game dublin;
        dublin = new Game();    
         
        dublin.playerSetUp();   
        dublin.Inicio();
    }
    
    public static void TXT(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
    }
     
    public void playerSetUp() throws Exception{
    	
   
        TXT("Por favor digite seu nome:", TimeUnit.MILLISECONDS, temp_narrativa);
        NomePlayer = myScanner.nextLine();
        TXT("\nNarrador: Há muito tempo atrás, onde reis eram deuses, pessoas eram devotas e leis eram absolutas, ", TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\n- Um homem, que apesar de plebeu, era muito sábio e inteligente, além excêntrico,\n"
        		+ "- Tinha uma fome insaciável de resolver enigmas, desvendar e desmitificar a Matemática.",TimeUnit.MILLISECONDS, temp_narrativa); 
        TXT("\n- Mesmo sendo essa a idade das trevas, nada o impediu de escrever nas areias atemporais, sua própria jornada de herói, seu nome é:",TimeUnit.MILLISECONDS, temp_narrativa); 
        TXT("\n\n............::" + NomePlayer.toUpperCase() + "::............" ,TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n----------- THE JOURNEY -----------");
        menu();
       
         
    }   
    
   
    public void menu() throws Exception {
       
       
    	Scanner entrada = new Scanner (System.in);
        int escolha_menu;
        do{
        TXT("1 - Jogar \n2 - Capítulos\n3 - Créditos \n4 - Sair",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        escolha_menu = entrada.nextInt();
        if(escolha_menu == 1){
        	 
        	Inicio();
        }
        else if(escolha_menu == 2){
              capitulos();
        }
        else if(escolha_menu == 3){
              creditos();
        }
        else if(escolha_menu == 4){
              System.exit(0);
        }
        else{
          System.out.println("\nOpção inválida, digite novamente: ");
        }}while(escolha_menu !=1 && escolha_menu !=2 && escolha_menu !=3 && escolha_menu !=4);
        }
    
    public void capitulos()throws Exception {
        Scanner entrada = new Scanner (System.in);
       
           int escolha_capitulo;
           System.out.println("\n..:: " + NomePlayer.toUpperCase() +  "- Capítulos da História ::..");
           do{
           System.out.println("\n\n1 - Capitulo 1(Inicio)\n2 - Capitulo 2\n3 - Capitulo 3 \n4 - Capitulo 4\n4 - Voltar");
           escolha_capitulo = entrada.nextInt();
           if(escolha_capitulo == 1){
              Inicio();
           }else if(escolha_capitulo == 2){
        	   Capitulo1();
           }else if(escolha_capitulo == 3){
        	   Capitulo2();
           }else if(escolha_capitulo == 4){
                Capitulo3();
           }else if(escolha_capitulo == 4){
               menu();
           }else{
             System.out.println("\n***********Opção inválida*************");
           }}while(escolha_capitulo!=1 && escolha_capitulo!=2 &&escolha_capitulo!=3 &&escolha_capitulo!=4);
        }
    
    public void creditos()throws Exception {
        Scanner entrada = new Scanner (System.in);
           int escolha_menu, temp_narrativa = 150;
           TXT("\n\n</> Desenvolvedores </>\n\n-> André Ferreira \n-> Gustavo Freitas",TimeUnit.MILLISECONDS, temp_narrativa);
           do{
           System.out.println("\n2 - Sair");
           escolha_menu = entrada.nextInt();
           if(escolha_menu == 2){
             menu();
           }else{
              System.out.println("\n************Opção inválida**********");
           }}while(escolha_menu!=2);
        }
    

        public void Inicio() throws Exception{
        
            
            System.out.println("\n--------------------------------------------------------------\n");
            TXT("\n\nSerena: " + NomePlayer.toUpperCase() + ", " + NomePlayer.toUpperCase() + ", ACORDE!" , TimeUnit.MILLISECONDS, temp_narrativa);  
            TXT("\n\n" + NomePlayer + ": Já amanheceu??", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nSerena: Sim " + NomePlayer + ", já amanheceu, isso que dá virar a noite estudando essas suas baboseiras." , TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Não são baboseiras, é matemática!",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nSerena: Está mais para delirios de grandeza de um homem velho\nAnde e Levante-se logo, compre algumas verduras pra eu preparar o almoço!" , TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador:" + NomePlayer + " então vai ao centro comercial comprar verduras.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: No caminho se depara com um homem misterioso, usando um capuz preto cobrindo o rosto e andando curvado de cabeça baixa, sem calçados.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Quem é você? E onde estou?", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: O homem em silêncio da as costas a" + NomePlayer + " e começa a caminhar",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: De seu manto negro, cai-se uma carta." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador:" + NomePlayer + " se curva para pegar a carta e diz ao homem" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Ei, o senhor deixou cair isto", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: Quando se levanta, o homem desapareceu" ,TimeUnit.MILLISECONDS, temp_narrativa);
            
            
            TXT("\n\nO que fazer?", TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("");
            System.out.println("1: Ler a carta");
            System.out.println("2: Guardar a carta");
            System.out.println("3: Voltar");
            System.out.println("\n--------------------------------------------------------------\n");
     
            Escolha = myScanner.nextInt();
             
            if(Escolha==1){
             
                	 TXT("\n\nNarrador: Confuso," + NomePlayer + " abre a carta e a lê" ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\nNarrador: Na carta estava escrito algo como uma formula matemática." ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\n" + NomePlayer + ": O que, matemática? por que aquele senhor andaria com isso?", TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\nNarrador: 'y=ax+b' e 'ax²+bx+c=0' ." ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\nNarrador: " + NomePlayer + " apesar de plebeu, era um homem apaixonado pela matemática, conceitos e problemas, porém, o mesmo nunca tinha visto algo parecido com essa fórmula" ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\n" + NomePlayer + ": Isso é tão complicado.", TimeUnit.MILLISECONDS, temp_narrativa);
                	 Capitulo1();
             
            }
            else if(Escolha==2){
                
            	TXT("\n\nNarrador: " + NomePlayer + " então resolve comprar as verdurar e voltar para casa, depois disso passou o resto do dia tentando entender e solucionar aquela fórmula ",TimeUnit.MILLISECONDS, temp_narrativa);
            	TXT("\n\nNarrador: Quando ia deitar-se, lembrou da carta que tinha pego mais cedo .",TimeUnit.MILLISECONDS, temp_narrativa);
            	TXT("\n\nNarrador: Pegou-a de seu bolso, e nela estava escrito: y=ax+b' e 'ax²+bx+c=0 ",TimeUnit.MILLISECONDS, temp_narrativa);
            	TXT("\n\nNarrador: Sendo ",TimeUnit.MILLISECONDS, temp_narrativa);
               Capitulo1();
            }
            else if(Escolha==3){
                Inicio();
            }   
            else{
            	System.out.println("Opção inválida");
            	Inicio();
            }
        }
    
        public void Capitulo1() throws Exception{
            
            System.out.println("\n--------------------------------------------------------------\n");
            
            TXT("\n\nNarrador: Então ele se sente frustrado por não conseguir resolver tais fórmulas.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Porém, se sente desafiado a conseguir solucionar elas.", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: Então motivado, " + NomePlayer + "vai em busca do castelo do reino, atrás de um dos grandes professores de matemática da corte.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: Porém, logo na entrada, guardas o olhavam de cima a baixo e perguntavam o que veio a fazer no castelo real." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nGuarda: O que quer fazer no castelo? " ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Vim atrás do grande matematico real!", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nGuarda: Você é insolente? só um grande matemático pode fazer tal pedido!" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Estou disposto a provar que mesmo plebeu, eu poderia dar aula pros senhores!", TimeUnit.MILLISECONDS, temp_narrativa);

            Pergunta1();
        }
            
            public void Pergunta1() throws Exception{
            TXT("\n\nGuarda: Certo sabichão, então me responda, quanto é 101 elevado a 3?" ,TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("1- 1130311");
            System.out.println("2: 1030301");
            System.out.println("3: 1003300");
            System.out.println("4: 1103819");
            System.out.println("\n--------------------------------------------------------------\n");
     
            Escolha = myScanner.nextInt();
             
            if(Escolha==2){
           	 TXT("\n\nGuarda: Não acredito, ninguem nunca conseguiu me responder certo, e tão rapidamente." ,TimeUnit.MILLISECONDS, temp_narrativa);
           	 TXT("\n\nGuarda: Passe ó grande matemático, mas não pense que  sou o unico a quem você tem que se provar!" ,TimeUnit.MILLISECONDS, temp_narrativa);
             Capitulo2();
           
    	   
       }
       else if(Escolha==1 || Escolha==3 || Escolha==4){
    	   TXT("\n\nGuarda: Resposta errada, seu grande tolo, volte quando for um matematico brilhante!" ,TimeUnit.MILLISECONDS, temp_narrativa);
    	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2- Não");
    	   Escolha = myScanner.nextInt();
    	   if(Escolha==1){
    	   Pergunta1();
    	   }
    	   else if(Escolha==2){
    		   System.exit(0); 
    	   }
    	   else {
    		   System.out.println("****Opção inválida*****");
    		   Pergunta1();
    	   }
     }   
    	   
        
       else{
       	System.out.println("****Opção inválida*****");
       	Pergunta1();
       }
   }

 
        
        public void Capitulo2() throws Exception{
            
            System.out.println("\n--------------------------------------------------------------\n");
            TXT("\n\nNarrador: " + NomePlayer + "Então passa pela entrada do castelo real",TimeUnit.MILLISECONDS, temp_narrativa);
          	TXT("\n\nNarrador: Enquanto tudo parecia tranquilo, alguém parece estar gargalhando bem alto, as risadas ecoavam pelas paredes.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n??????: ***************HAHAHAHAHAHAHAHAHAHAH*************",TimeUnit.MILLISECONDS, temp_narrativa);
        	TXT("\n\n??????: Ora ora, o que temos aqui?",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n??????: Você fede a pobreza, por um acaso seria um plebeu? Sinto lhe informar mas você entrou no lugar errado.",TimeUnit.MILLISECONDS, temp_narrativa);
         	TXT("\n\n??????: O chiqueiro é fora do castelo, porco imundo!",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": E quem é você, peste? apareça!", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n??????: Sou o que chamam de bobo da corte",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBobo da corte: Meu objetivo é entreter ao rei, não que alguem como você saiba o que é isso.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": E o meu objetivo é encontrar o matemático real.", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBobo da corte: Parece determinado senhor Porco, ja que é tão atrevido, passe pelo meu teste então.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Manda a ver!", TimeUnit.MILLISECONDS, temp_narrativa);
            Pergunta2();
        }
  public void Pergunta2() throws Exception{
            
	      TXT("\n\nBobo da corte: Uma barra de chocolate com 18 quadrados, quantos quadradinhos deve-se comer para consumir 5/6 da barra?",TimeUnit.MILLISECONDS, temp_narrativa);
          System.out.println("1- 12");
          System.out.println("2: 14");
          System.out.println("3: 15");
          System.out.println("4: 16");
          System.out.println("\n--------------------------------------------------------------\n");
   
          Escolha = myScanner.nextInt();
           
          if(Escolha==3){
         	 TXT("\n\nBobo da corte: Essa foi só aquecimento, vamos para outra mais interessante." ,TimeUnit.MILLISECONDS, temp_narrativa);
         	 Pergunta3();
         
  	   
     }
     else if(Escolha==1 || Escolha==2 || Escolha==4){
  	   TXT("\n\nBobo da corte: Óh, que pena, o senhor é realmente um porco sujo e burro!" ,TimeUnit.MILLISECONDS, temp_narrativa);
  	   TXT("\n\nBobo da corte: ***************HAHAHAHAHAHAHAHAHAHAH*************",TimeUnit.MILLISECONDS, temp_narrativa);
	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - Não");
	   Escolha = myScanner.nextInt();
	   if(Escolha==1){
	   Pergunta2();
	   }
	   else if(Escolha==2){
		   System.exit(0); 
	   }
	   else {
		   System.out.println("****Opção inválida*****");
		   Pergunta2();
	   }

     }   
     else{
     	System.out.println("****Opção inválida*****");
     	Pergunta2();
     }
 }
  public void Pergunta3() throws Exception{
      
      TXT("\n\nBobo da corte: Sabendo que o valor de 57 é 78 125, qual o resultado de 58??",TimeUnit.MILLISECONDS, temp_narrativa);
      System.out.println("1- 156 250");
      System.out.println("2: 210 127");
      System.out.println("3: 234 375");
      System.out.println("4: 312 500");
      System.out.println("5: 390 625");
      System.out.println("6: 500 000");
      System.out.println("\n--------------------------------------------------------------\n");

      Escolha = myScanner.nextInt();
       
      if(Escolha==5){
     	 TXT("\n\nBobo da corte: Parabéns senhor Porco, você realmente deve ser um prodigio da espécie!" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\n" + NomePlayer + ": que cara mais irritante" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\nBobo da corte: Como me diverti com você, vou deixa-lo passar." ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 Capitulo3();
     
	   
 }
 else if(Escolha==1 || Escolha==2 || Escolha==3 || Escolha==4 || Escolha==6){
	   TXT("\n\nBobo da corte: Óh, que pena, melhor voltar ao chiqueiro, Senhor Porco!" ,TimeUnit.MILLISECONDS, temp_narrativa);
	   TXT("\n\nBobo da corte: ***************HAHAHAHAHAHAHAHAHAHAH*************",TimeUnit.MILLISECONDS, temp_narrativa);
	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - Não");
	   Escolha = myScanner.nextInt();
	   if(Escolha==1){
	   Pergunta3();
	   }
	   else if(Escolha==2){
		   System.exit(0); 
	   }
	   else {
		   System.out.println("****Opção inválida*****");
		   Pergunta3();
	   }
 }   
 
 
 else{
 	System.out.println("****Opção inválida*****");
 	Pergunta2();
 }
      
}
        
  public void Capitulo3() throws Exception{
      
      System.out.println("\n--------------------------------------------------------------\n");
      TXT("\n\nNarrador: " + NomePlayer + " Então passa pelo irritante bobo da corte, subindo as escadas do castelo!",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: Guardas e mais guardas vão fazendo testes e perguntas, só que ele ja pegou o jeito e continua subindo.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: Depois de muitas provas, " + NomePlayer + " encontra o salão real, um salão aonde só a nobreza frequentava.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: Ao fim do salão, de costas, com um capus preto e postura torta, alguém lhe parece familiar",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Você é aquele senhor de ontem?", TimeUnit.MILLISECONDS, temp_narrativa);
   	  TXT("\n\n??????: Não é que o senhor veio mesmo",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": An? Por que?", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Qualquer plebeu que pegasse aquela carta, não iria atrás da resposta, muito menos saberia resolver.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Por que o senhor veio até aqui?",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Eu confesso, não consegui resolver a fórmula, mas eu vim aqui para descobrir como o fazer.", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Mesmo sendo só um plebeu, quero provar a deus e o mundo que qualquer um pode sim, aprender e ser um mestre da matemática.", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Mas antes de ser um bom professor, preciso dessa fórmula, preciso resolve-la, preciso de orientação.", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Que homem mais tolo, porém",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Muito determinado, se é assim eu não tenho mais por que usar isto",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: O homem tira seu capuz. ",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Muito prazer senhor viajante, meu nome e Balduin, sou o Matemático real.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: " + NomePlayer + " fica chocado, aquele mesmo homem que no fim das contas, foi quem o fez a começar sua jornada, na verdade era quem o procurava.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Por que?", TimeUnit.MILLISECONDS, temp_narrativa); 
      TXT("\n\nBalduin: Por que eu concordo com seus ideias, não precisamos de sangue azul para sermos bons em alguma coisa, principalmente Matemática.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Já que vim ate aqui responda-me, como faço para resolver essas fórmulas?", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nBalduin: Antes uma pergunta simples, que tal uma ultima provação?",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Que seja, ja estou aqui mesmo", TimeUnit.MILLISECONDS, temp_narrativa);
      Pergunta4();
  
  }
 public void Pergunta4() throws Exception{
      
      TXT("\n\nBalduin: Quanto é 1 + 1?",TimeUnit.MILLISECONDS, temp_narrativa);
      System.out.println("1- 2");
      System.out.println("2: 3");
      System.out.println("3: 4");
      System.out.println("4: 5");
      System.out.println("\n--------------------------------------------------------------\n");

      Escolha = myScanner.nextInt();
       
      if(Escolha==1 ||Escolha== 2 ||Escolha==  3 || Escolha== 4){
    	 TXT("\n\n" + NomePlayer + ": Que pergunta impecil é essa?", TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\nBalduin: hahahaha, estou só brincando com você" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\nBalduin: Como combinado vou responder sua duvida" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 Ending();	   
      }
 
 else{
 	System.out.println("****Opção inválida*****");
 	Pergunta4();
 }
      
}
    public void PerguntaP() throws Exception{ 
        System.out.println("\n--------------------------------------------------------------\n");
        TXT("\n\nBalduin: O nome da primeira formula é Equação do primeiro grau" ,TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\nPara resolvermos umaa equação do primeiro grau, devemos achar o valor da incógnita (que vamos chamar de x) e, para que isso seja possível, é só isolar o valor do x na igualdade,\n Ou seja, o x deve ficar sozinho em um dos membros da equação.!",TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\n\n" + NomePlayer + ": Ah sim, agora entendi?", TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\n\nBalduin: Então prove, vamos a um teste" ,TimeUnit.MILLISECONDS, temp_narrativa);
        
        TXT("\n\nBaduin: a) 4x + 2 = 38\r\n"
        		+ "\nb) 9x = 6x + 12\r\n"
        		+ "\nc) 5x – 1 = 3x + 11\r\n"
        		+ "\nd) 2x + 8 = x + 13??",TimeUnit.MILLISECONDS, temp_narrativa);
        System.out.println("1: x=13, x= 7, x = 10, x=14");
        System.out.println("2: x=9, x= 6, x = 6, x=8");
        System.out.println("3: x=9, x= 4, x = 6, x=5");
        System.out.println("4: x=14, x= 7, x = 10, x=14");
        System.out.println("\n--------------------------------------------------------------\n");

        Escolha = myScanner.nextInt();
         
        if(Escolha==3){
       	 TXT("\n\nBalduin: Parece que você pegou o jeito da equação de primeiro grau." ,TimeUnit.MILLISECONDS, temp_narrativa);
       	 TXT("\n\n" + NomePlayer + ": Não é tão dificil quanto parece" ,TimeUnit.MILLISECONDS, temp_narrativa);
       	 TXT("\n\nBalduin: Podemos passar para a próxima então, para a equação de segundo grau.", TimeUnit.MILLISECONDS, temp_narrativa);
       	 PerguntaS();
       
  	   
   }
   else if(Escolha==1 || Escolha==2 || Escolha==4){
  	   TXT("\n\nBalduin: Pelo jeito você ainda não aprendeu." ,TimeUnit.MILLISECONDS, temp_narrativa);
  	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - Não");
  	   Escolha = myScanner.nextInt();
  	   if(Escolha==1){
  		 PerguntaP();
  	   }
  	   else if(Escolha==2){
  		   System.exit(0); 
  	   }
  	   else {
  		   System.out.println("****Opção inválida*****");
  		 PerguntaP();
  	   }
   }  
    }
        public void PerguntaS() throws Exception{ 
            System.out.println("\n--------------------------------------------------------------\n");
            TXT("\n\nBalduin: Primeiro passo: Escreva os valores numéricos dos coeficientes a, b e c."
            		+ "\nSegundo passo: Calcule o valor de delta(DELTA = b2 – 4ac)"
            		+ "\nTerceiro passo: calcule os valores de x da equação(x = – b +- Raiz de DELTA/2.A\n)", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Consegui, acho que entendi tudo agora", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Dito isto, vamos ao seu último teste." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Determine o conjunto solução da equação – 3x elevado a 2 + 18x – 15 = 0." ,TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("1: S = (1; 5).");
            System.out.println("2: S = (2; 3).");
            System.out.println("3: S = (0; 3).");
            System.out.println("4: S = (5; 8).");
            System.out.println("\n--------------------------------------------------------------\n");
            
            Escolha = myScanner.nextInt();
            if(Escolha==1){
              
              	 Ending();
              
         	   
          }
          else if(Escolha==2 || Escolha==3 || Escolha==4){
         	   TXT("\n\nBalduin: Pelo jeito você ainda não aprendeu." ,TimeUnit.MILLISECONDS, temp_narrativa);
         	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - Não");
         	   Escolha = myScanner.nextInt();
         	   if(Escolha==1){
         		 PerguntaS();
         	   }
         	   else if(Escolha==2){
         		   System.exit(0); 
         	   }
         	   else {
         		   System.out.println("****Opção inválida*****");
         		 PerguntaS();
         	   }
          }   
        }
            public void Ending() throws Exception{
            TXT("\n\nBalduin: Bom, meu papel foi feito aqui." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Obrigado, mas por que fez tudo isso para me ensinar ?", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Pelo jeito você só e bom em matemática mesmo né, por que eu precisava de um sucessor." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Alguém que assim como eu, respira e vive pela matemática, e um dia você sera esse meu sucessor." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Não pense que acabou, este é so o começo de sua jornada, aliás" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Te ensinei matemática, conversamos, mas eu nem perguntei o seu nome jovem, afinal de contas." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Qual seu nome nobre matemático?" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Meu nome é:", TimeUnit.MILLISECONDS, temp_narrativa);  
         
            TXT("\n- Mesmo sendo essa a idade das trevas, nada o impediu de escrever nas areias atemporais, sua própria jornada de herói, seu nome é:",TimeUnit.MILLISECONDS, temp_narrativa); 
            TXT("\n\n............::" + NomePlayer.toUpperCase() + "::............" ,TimeUnit.MILLISECONDS, temp_transicao);
            System.out.println("\n----------- THE JOURNEY -----------");
            TXT("\n------------------ THE END ------------------", TimeUnit.MILLISECONDS, temp_narrativa);  
           }
                
          
          
 }
 
 
        
        
        

 
