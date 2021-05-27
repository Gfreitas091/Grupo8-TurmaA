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
        TXT("\nNarrador: H� muito tempo atr�s, onde reis eram deuses, pessoas eram devotas e leis eram absolutas, ", TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\n- Um homem, que apesar de plebeu, era muito s�bio e inteligente, al�m exc�ntrico,\n"
        		+ "- Tinha uma fome insaci�vel de resolver enigmas, desvendar e desmitificar a Matem�tica.",TimeUnit.MILLISECONDS, temp_narrativa); 
        TXT("\n- Mesmo sendo essa a idade das trevas, nada o impediu de escrever nas areias atemporais, sua pr�pria jornada de her�i, seu nome �:",TimeUnit.MILLISECONDS, temp_narrativa); 
        TXT("\n\n............::" + NomePlayer.toUpperCase() + "::............" ,TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n----------- THE JOURNEY -----------");
        menu();
       
         
    }   
    
   
    public void menu() throws Exception {
       
       
    	Scanner entrada = new Scanner (System.in);
        int escolha_menu;
        do{
        TXT("1 - Jogar \n2 - Cap�tulos\n3 - Cr�ditos \n4 - Sair",TimeUnit.MILLISECONDS, temp_transicao);
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
          System.out.println("\nOp��o inv�lida, digite novamente: ");
        }}while(escolha_menu !=1 && escolha_menu !=2 && escolha_menu !=3 && escolha_menu !=4);
        }
    
    public void capitulos()throws Exception {
        Scanner entrada = new Scanner (System.in);
       
           int escolha_capitulo;
           System.out.println("\n..:: " + NomePlayer.toUpperCase() +  "- Cap�tulos da Hist�ria ::..");
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
             System.out.println("\n***********Op��o inv�lida*************");
           }}while(escolha_capitulo!=1 && escolha_capitulo!=2 &&escolha_capitulo!=3 &&escolha_capitulo!=4);
        }
    
    public void creditos()throws Exception {
        Scanner entrada = new Scanner (System.in);
           int escolha_menu, temp_narrativa = 150;
           TXT("\n\n</> Desenvolvedores </>\n\n-> Andr� Ferreira \n-> Gustavo Freitas",TimeUnit.MILLISECONDS, temp_narrativa);
           do{
           System.out.println("\n2 - Sair");
           escolha_menu = entrada.nextInt();
           if(escolha_menu == 2){
             menu();
           }else{
              System.out.println("\n************Op��o inv�lida**********");
           }}while(escolha_menu!=2);
        }
    

        public void Inicio() throws Exception{
        
            
            System.out.println("\n--------------------------------------------------------------\n");
            TXT("\n\nSerena: " + NomePlayer.toUpperCase() + ", " + NomePlayer.toUpperCase() + ", ACORDE!" , TimeUnit.MILLISECONDS, temp_narrativa);  
            TXT("\n\n" + NomePlayer + ": J� amanheceu??", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nSerena: Sim " + NomePlayer + ", j� amanheceu, isso que d� virar a noite estudando essas suas baboseiras." , TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": N�o s�o baboseiras, � matem�tica!",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nSerena: Est� mais para delirios de grandeza de um homem velho\nAnde e Levante-se logo, compre algumas verduras pra eu preparar o almo�o!" , TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador:" + NomePlayer + " ent�o vai ao centro comercial comprar verduras.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: No caminho se depara com um homem misterioso, usando um capuz preto cobrindo o rosto e andando curvado de cabe�a baixa, sem cal�ados.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Quem � voc�? E onde estou?", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: O homem em sil�ncio da as costas a" + NomePlayer + " e come�a a caminhar",TimeUnit.MILLISECONDS, temp_narrativa);
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
             
                	 TXT("\n\nNarrador: Confuso," + NomePlayer + " abre a carta e a l�" ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\nNarrador: Na carta estava escrito algo como uma formula matem�tica." ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\n" + NomePlayer + ": O que, matem�tica? por que aquele senhor andaria com isso?", TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\nNarrador: 'y=ax+b' e 'ax�+bx+c=0' ." ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\nNarrador: " + NomePlayer + " apesar de plebeu, era um homem apaixonado pela matem�tica, conceitos e problemas, por�m, o mesmo nunca tinha visto algo parecido com essa f�rmula" ,TimeUnit.MILLISECONDS, temp_narrativa);
                     TXT("\n\n" + NomePlayer + ": Isso � t�o complicado.", TimeUnit.MILLISECONDS, temp_narrativa);
                	 Capitulo1();
             
            }
            else if(Escolha==2){
                
            	TXT("\n\nNarrador: " + NomePlayer + " ent�o resolve comprar as verdurar e voltar para casa, depois disso passou o resto do dia tentando entender e solucionar aquela f�rmula ",TimeUnit.MILLISECONDS, temp_narrativa);
            	TXT("\n\nNarrador: Quando ia deitar-se, lembrou da carta que tinha pego mais cedo .",TimeUnit.MILLISECONDS, temp_narrativa);
            	TXT("\n\nNarrador: Pegou-a de seu bolso, e nela estava escrito: y=ax+b' e 'ax�+bx+c=0 ",TimeUnit.MILLISECONDS, temp_narrativa);
            	TXT("\n\nNarrador: Sendo ",TimeUnit.MILLISECONDS, temp_narrativa);
               Capitulo1();
            }
            else if(Escolha==3){
                Inicio();
            }   
            else{
            	System.out.println("Op��o inv�lida");
            	Inicio();
            }
        }
    
        public void Capitulo1() throws Exception{
            
            System.out.println("\n--------------------------------------------------------------\n");
            
            TXT("\n\nNarrador: Ent�o ele se sente frustrado por n�o conseguir resolver tais f�rmulas.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Por�m, se sente desafiado a conseguir solucionar elas.", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: Ent�o motivado, " + NomePlayer + "vai em busca do castelo do reino, atr�s de um dos grandes professores de matem�tica da corte.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nNarrador: Por�m, logo na entrada, guardas o olhavam de cima a baixo e perguntavam o que veio a fazer no castelo real." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nGuarda: O que quer fazer no castelo? " ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Vim atr�s do grande matematico real!", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nGuarda: Voc� � insolente? s� um grande matem�tico pode fazer tal pedido!" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Estou disposto a provar que mesmo plebeu, eu poderia dar aula pros senhores!", TimeUnit.MILLISECONDS, temp_narrativa);

            Pergunta1();
        }
            
            public void Pergunta1() throws Exception{
            TXT("\n\nGuarda: Certo sabich�o, ent�o me responda, quanto � 101 elevado a 3?" ,TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("1- 1130311");
            System.out.println("2: 1030301");
            System.out.println("3: 1003300");
            System.out.println("4: 1103819");
            System.out.println("\n--------------------------------------------------------------\n");
     
            Escolha = myScanner.nextInt();
             
            if(Escolha==2){
           	 TXT("\n\nGuarda: N�o acredito, ninguem nunca conseguiu me responder certo, e t�o rapidamente." ,TimeUnit.MILLISECONDS, temp_narrativa);
           	 TXT("\n\nGuarda: Passe � grande matem�tico, mas n�o pense que  sou o unico a quem voc� tem que se provar!" ,TimeUnit.MILLISECONDS, temp_narrativa);
             Capitulo2();
           
    	   
       }
       else if(Escolha==1 || Escolha==3 || Escolha==4){
    	   TXT("\n\nGuarda: Resposta errada, seu grande tolo, volte quando for um matematico brilhante!" ,TimeUnit.MILLISECONDS, temp_narrativa);
    	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2- N�o");
    	   Escolha = myScanner.nextInt();
    	   if(Escolha==1){
    	   Pergunta1();
    	   }
    	   else if(Escolha==2){
    		   System.exit(0); 
    	   }
    	   else {
    		   System.out.println("****Op��o inv�lida*****");
    		   Pergunta1();
    	   }
     }   
    	   
        
       else{
       	System.out.println("****Op��o inv�lida*****");
       	Pergunta1();
       }
   }

 
        
        public void Capitulo2() throws Exception{
            
            System.out.println("\n--------------------------------------------------------------\n");
            TXT("\n\nNarrador: " + NomePlayer + "Ent�o passa pela entrada do castelo real",TimeUnit.MILLISECONDS, temp_narrativa);
          	TXT("\n\nNarrador: Enquanto tudo parecia tranquilo, algu�m parece estar gargalhando bem alto, as risadas ecoavam pelas paredes.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n??????: ***************HAHAHAHAHAHAHAHAHAHAH*************",TimeUnit.MILLISECONDS, temp_narrativa);
        	TXT("\n\n??????: Ora ora, o que temos aqui?",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n??????: Voc� fede a pobreza, por um acaso seria um plebeu? Sinto lhe informar mas voc� entrou no lugar errado.",TimeUnit.MILLISECONDS, temp_narrativa);
         	TXT("\n\n??????: O chiqueiro � fora do castelo, porco imundo!",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": E quem � voc�, peste? apare�a!", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n??????: Sou o que chamam de bobo da corte",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBobo da corte: Meu objetivo � entreter ao rei, n�o que alguem como voc� saiba o que � isso.",TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": E o meu objetivo � encontrar o matem�tico real.", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBobo da corte: Parece determinado senhor Porco, ja que � t�o atrevido, passe pelo meu teste ent�o.",TimeUnit.MILLISECONDS, temp_narrativa);
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
         	 TXT("\n\nBobo da corte: Essa foi s� aquecimento, vamos para outra mais interessante." ,TimeUnit.MILLISECONDS, temp_narrativa);
         	 Pergunta3();
         
  	   
     }
     else if(Escolha==1 || Escolha==2 || Escolha==4){
  	   TXT("\n\nBobo da corte: �h, que pena, o senhor � realmente um porco sujo e burro!" ,TimeUnit.MILLISECONDS, temp_narrativa);
  	   TXT("\n\nBobo da corte: ***************HAHAHAHAHAHAHAHAHAHAH*************",TimeUnit.MILLISECONDS, temp_narrativa);
	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - N�o");
	   Escolha = myScanner.nextInt();
	   if(Escolha==1){
	   Pergunta2();
	   }
	   else if(Escolha==2){
		   System.exit(0); 
	   }
	   else {
		   System.out.println("****Op��o inv�lida*****");
		   Pergunta2();
	   }

     }   
     else{
     	System.out.println("****Op��o inv�lida*****");
     	Pergunta2();
     }
 }
  public void Pergunta3() throws Exception{
      
      TXT("\n\nBobo da corte: Sabendo que o valor de 57 � 78 125, qual o resultado de 58??",TimeUnit.MILLISECONDS, temp_narrativa);
      System.out.println("1- 156 250");
      System.out.println("2: 210 127");
      System.out.println("3: 234 375");
      System.out.println("4: 312 500");
      System.out.println("5: 390 625");
      System.out.println("6: 500 000");
      System.out.println("\n--------------------------------------------------------------\n");

      Escolha = myScanner.nextInt();
       
      if(Escolha==5){
     	 TXT("\n\nBobo da corte: Parab�ns senhor Porco, voc� realmente deve ser um prodigio da esp�cie!" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\n" + NomePlayer + ": que cara mais irritante" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\nBobo da corte: Como me diverti com voc�, vou deixa-lo passar." ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 Capitulo3();
     
	   
 }
 else if(Escolha==1 || Escolha==2 || Escolha==3 || Escolha==4 || Escolha==6){
	   TXT("\n\nBobo da corte: �h, que pena, melhor voltar ao chiqueiro, Senhor Porco!" ,TimeUnit.MILLISECONDS, temp_narrativa);
	   TXT("\n\nBobo da corte: ***************HAHAHAHAHAHAHAHAHAHAH*************",TimeUnit.MILLISECONDS, temp_narrativa);
	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - N�o");
	   Escolha = myScanner.nextInt();
	   if(Escolha==1){
	   Pergunta3();
	   }
	   else if(Escolha==2){
		   System.exit(0); 
	   }
	   else {
		   System.out.println("****Op��o inv�lida*****");
		   Pergunta3();
	   }
 }   
 
 
 else{
 	System.out.println("****Op��o inv�lida*****");
 	Pergunta2();
 }
      
}
        
  public void Capitulo3() throws Exception{
      
      System.out.println("\n--------------------------------------------------------------\n");
      TXT("\n\nNarrador: " + NomePlayer + " Ent�o passa pelo irritante bobo da corte, subindo as escadas do castelo!",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: Guardas e mais guardas v�o fazendo testes e perguntas, s� que ele ja pegou o jeito e continua subindo.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: Depois de muitas provas, " + NomePlayer + " encontra o sal�o real, um sal�o aonde s� a nobreza frequentava.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: Ao fim do sal�o, de costas, com um capus preto e postura torta, algu�m lhe parece familiar",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Voc� � aquele senhor de ontem?", TimeUnit.MILLISECONDS, temp_narrativa);
   	  TXT("\n\n??????: N�o � que o senhor veio mesmo",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": An? Por que?", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Qualquer plebeu que pegasse aquela carta, n�o iria atr�s da resposta, muito menos saberia resolver.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Por que o senhor veio at� aqui?",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Eu confesso, n�o consegui resolver a f�rmula, mas eu vim aqui para descobrir como o fazer.", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Mesmo sendo s� um plebeu, quero provar a deus e o mundo que qualquer um pode sim, aprender e ser um mestre da matem�tica.", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Mas antes de ser um bom professor, preciso dessa f�rmula, preciso resolve-la, preciso de orienta��o.", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Que homem mais tolo, por�m",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Muito determinado, se � assim eu n�o tenho mais por que usar isto",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: O homem tira seu capuz. ",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n??????: Muito prazer senhor viajante, meu nome e Balduin, sou o Matem�tico real.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nNarrador: " + NomePlayer + " fica chocado, aquele mesmo homem que no fim das contas, foi quem o fez a come�ar sua jornada, na verdade era quem o procurava.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Por que?", TimeUnit.MILLISECONDS, temp_narrativa); 
      TXT("\n\nBalduin: Por que eu concordo com seus ideias, n�o precisamos de sangue azul para sermos bons em alguma coisa, principalmente Matem�tica.",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": J� que vim ate aqui responda-me, como fa�o para resolver essas f�rmulas?", TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\nBalduin: Antes uma pergunta simples, que tal uma ultima prova��o?",TimeUnit.MILLISECONDS, temp_narrativa);
      TXT("\n\n" + NomePlayer + ": Que seja, ja estou aqui mesmo", TimeUnit.MILLISECONDS, temp_narrativa);
      Pergunta4();
  
  }
 public void Pergunta4() throws Exception{
      
      TXT("\n\nBalduin: Quanto � 1 + 1?",TimeUnit.MILLISECONDS, temp_narrativa);
      System.out.println("1- 2");
      System.out.println("2: 3");
      System.out.println("3: 4");
      System.out.println("4: 5");
      System.out.println("\n--------------------------------------------------------------\n");

      Escolha = myScanner.nextInt();
       
      if(Escolha==1 ||Escolha== 2 ||Escolha==  3 || Escolha== 4){
    	 TXT("\n\n" + NomePlayer + ": Que pergunta impecil � essa?", TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\nBalduin: hahahaha, estou s� brincando com voc�" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 TXT("\n\nBalduin: Como combinado vou responder sua duvida" ,TimeUnit.MILLISECONDS, temp_narrativa);
     	 Ending();	   
      }
 
 else{
 	System.out.println("****Op��o inv�lida*****");
 	Pergunta4();
 }
      
}
    public void PerguntaP() throws Exception{ 
        System.out.println("\n--------------------------------------------------------------\n");
        TXT("\n\nBalduin: O nome da primeira formula � Equa��o do primeiro grau" ,TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\nPara resolvermos umaa equa��o do primeiro grau, devemos achar o valor da inc�gnita (que vamos chamar de x) e, para que isso seja poss�vel, � s� isolar o valor do x na igualdade,\n Ou seja, o x deve ficar sozinho em um dos membros da equa��o.!",TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\n\n" + NomePlayer + ": Ah sim, agora entendi?", TimeUnit.MILLISECONDS, temp_narrativa);
        TXT("\n\nBalduin: Ent�o prove, vamos a um teste" ,TimeUnit.MILLISECONDS, temp_narrativa);
        
        TXT("\n\nBaduin: a) 4x + 2 = 38\r\n"
        		+ "\nb) 9x = 6x + 12\r\n"
        		+ "\nc) 5x � 1 = 3x + 11\r\n"
        		+ "\nd) 2x + 8 = x + 13??",TimeUnit.MILLISECONDS, temp_narrativa);
        System.out.println("1: x=13, x= 7, x = 10, x=14");
        System.out.println("2: x=9, x= 6, x = 6, x=8");
        System.out.println("3: x=9, x= 4, x = 6, x=5");
        System.out.println("4: x=14, x= 7, x = 10, x=14");
        System.out.println("\n--------------------------------------------------------------\n");

        Escolha = myScanner.nextInt();
         
        if(Escolha==3){
       	 TXT("\n\nBalduin: Parece que voc� pegou o jeito da equa��o de primeiro grau." ,TimeUnit.MILLISECONDS, temp_narrativa);
       	 TXT("\n\n" + NomePlayer + ": N�o � t�o dificil quanto parece" ,TimeUnit.MILLISECONDS, temp_narrativa);
       	 TXT("\n\nBalduin: Podemos passar para a pr�xima ent�o, para a equa��o de segundo grau.", TimeUnit.MILLISECONDS, temp_narrativa);
       	 PerguntaS();
       
  	   
   }
   else if(Escolha==1 || Escolha==2 || Escolha==4){
  	   TXT("\n\nBalduin: Pelo jeito voc� ainda n�o aprendeu." ,TimeUnit.MILLISECONDS, temp_narrativa);
  	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - N�o");
  	   Escolha = myScanner.nextInt();
  	   if(Escolha==1){
  		 PerguntaP();
  	   }
  	   else if(Escolha==2){
  		   System.exit(0); 
  	   }
  	   else {
  		   System.out.println("****Op��o inv�lida*****");
  		 PerguntaP();
  	   }
   }  
    }
        public void PerguntaS() throws Exception{ 
            System.out.println("\n--------------------------------------------------------------\n");
            TXT("\n\nBalduin: Primeiro passo: Escreva os valores num�ricos dos coeficientes a, b e c."
            		+ "\nSegundo passo: Calcule o valor de delta(DELTA = b2 � 4ac)"
            		+ "\nTerceiro passo: calcule os valores de x da equa��o(x = � b +- Raiz de DELTA/2.A\n)", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Consegui, acho que entendi tudo agora", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Dito isto, vamos ao seu �ltimo teste." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Determine o conjunto solu��o da equa��o � 3x elevado a 2 + 18x � 15 = 0." ,TimeUnit.MILLISECONDS, temp_narrativa);
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
         	   TXT("\n\nBalduin: Pelo jeito voc� ainda n�o aprendeu." ,TimeUnit.MILLISECONDS, temp_narrativa);
         	   System.out.println("\n\n Continuar? \n 1 - Sim \n 2 - N�o");
         	   Escolha = myScanner.nextInt();
         	   if(Escolha==1){
         		 PerguntaS();
         	   }
         	   else if(Escolha==2){
         		   System.exit(0); 
         	   }
         	   else {
         		   System.out.println("****Op��o inv�lida*****");
         		 PerguntaS();
         	   }
          }   
        }
            public void Ending() throws Exception{
            TXT("\n\nBalduin: Bom, meu papel foi feito aqui." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Obrigado, mas por que fez tudo isso para me ensinar ?", TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Pelo jeito voc� s� e bom em matem�tica mesmo n�, por que eu precisava de um sucessor." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Algu�m que assim como eu, respira e vive pela matem�tica, e um dia voc� sera esse meu sucessor." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: N�o pense que acabou, este � so o come�o de sua jornada, ali�s" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Te ensinei matem�tica, conversamos, mas eu nem perguntei o seu nome jovem, afinal de contas." ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\nBalduin: Qual seu nome nobre matem�tico?" ,TimeUnit.MILLISECONDS, temp_narrativa);
            TXT("\n\n" + NomePlayer + ": Meu nome �:", TimeUnit.MILLISECONDS, temp_narrativa);  
         
            TXT("\n- Mesmo sendo essa a idade das trevas, nada o impediu de escrever nas areias atemporais, sua pr�pria jornada de her�i, seu nome �:",TimeUnit.MILLISECONDS, temp_narrativa); 
            TXT("\n\n............::" + NomePlayer.toUpperCase() + "::............" ,TimeUnit.MILLISECONDS, temp_transicao);
            System.out.println("\n----------- THE JOURNEY -----------");
            TXT("\n------------------ THE END ------------------", TimeUnit.MILLISECONDS, temp_narrativa);  
           }
                
          
          
 }
 
 
        
        
        

 
