package Projeto;

import javax.swing.JOptionPane;;

public class ProjetoScript {
	
	static int dado(int a) {	
	
		a = 1 +(int) (Math.random() * 6);
		return a;
			
	}

	static void MenuInicial(){
	
		
	
	}
	

	public static void main(String[] args) {
		
		String nick;
		String raca;
		String TipoHumano;
		String TipoET;
		String dado2;
		String somaAtributos;
		String opcao;
		
		do {
			
			opcao = JOptionPane.showInputDialog("Bem-vindo ao Jogo �Batalha estelar�\n\n\r"
					+ "Digite:\n\r1 - Instru��es\n\r2 - Jogar\n\r3 - Cr�ditos\n\r4 - Sair\n\r");
			
			
		
			switch(opcao) {
		
			case "1":
			
				JOptionPane.showMessageDialog(null, "Como jogar:\r\n\n" + 
					"1 - Nosso RPG consiste em um desenvolvimento da nave, os personagens s�o utilizados\n\r"
					+ "para dar diferentes caracter�sticas a ela, por parte dos atributos que podem tanto ser \n\r"
					+ "adicionados quanto retirados.\r\n\n" + 
					"2 - Voc� deve escolher entre as ra�as Humano ou Extraterrestre, dentre essas duas ra�as \n\r"
					+ "voc� tamb�m escolher� entre 4 classes, duas delas s�o humanos e as outras duas s�o \n\r"
					+ "extraterrestres.\r\n" + 
					"");
			break;
		
		case "2":	
		
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");				
	    JOptionPane.showMessageDialog( null, "Bem vindo " + nick );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave " + nick + "! voc� j� come�a com:\n"
	    		+ "2-For�a \n2-Agilidade \n2-Resist�ncia \n"
	    		+ "Obs: N�o se esque�a de anotar os ganhos e perdas de atributos\n"
	    		+ "isto ser� essencial no seu desenvolvimento!!!" );
	    
	    
	    raca = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Humano: \n 2-Extraterrestre:");
	    
	    
	   		if(raca.equalsIgnoreCase("1")) {
	   		
	   			JOptionPane.showMessageDialog( null, "Voc� escolheu 'Humano' ");
	   	  
	   			JOptionPane.showMessageDialog( null, "Fac��o �Vermelha� \n\n" + 
				"Humanos movidos pelo dinheiro, os comandantes dessa fac��o buscam \n"
				+ "pelo dom�nio absoluto para controlar todos pontos econ�micos \n"
				+ "do planeta �-B� para buscar melhorias tecnol�gicas em suas naves.");
		
	   	  
	   	TipoHumano = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Cientista: \n 2-Engenheiro:");
	   
	   	
	   		if(TipoHumano.equalsIgnoreCase("1")) {
			
	   			JOptionPane.showMessageDialog( null, "Humano - Cientista\r\n\r\n"
	   					+ "Ap�s perder sua fam�lia na guerra, decidiu juntar-se a um lado para acabar com a infind�vel guerra.");
			
	   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
					    "Forca = +1\n" + 
				  		"Agilidade = +2\r\n" + 
				  		"Resist�ncia = -1");
			  
	   		}
	   		else if(TipoHumano.equalsIgnoreCase("2")) {
			 
	   			JOptionPane.showMessageDialog( null, "Humano-Engenheiro\r\n\r\n"
	   					+ "Um g�nio incompreendido cujo desejo � se tornar o mais renomado estrategista da gal�xia.");
			  
	   			JOptionPane.showMessageDialog( null, "Atributos \n" + 
				  		"Forca = +1\n" + 
				  		"Agilidade = -1\n" + 
				  		"Resist�ncia = +2");
			  
	   		}
	   		else {
			 JOptionPane.showMessageDialog( null, "Valor invalido, tente novamente" );		
	   		}
		
	   		}
	   		else if(raca.equalsIgnoreCase("2")) {
	   		
	   			JOptionPane.showMessageDialog( null, "Voc� escolheu 'Extraterrestre' ");
	   		
	   			JOptionPane.showMessageDialog( null, "Fac��o �Azul�\n\n" + 
					"Extraterrestes ligados aos seus valores, os l�deres querem \n"
					+ "retomar o poder completo do planeta e dar \n"
					+ "continuidade ao trabalho feito por seus ancestrais. " );
	   		
	   			TipoET = JOptionPane.showInputDialog("Digite qual op��o desejada:  \n 1-Ca�ador: \n 2-Mercenario:");
		  
		   	if(TipoET.equalsIgnoreCase("1")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Ca�ador\r\n\r\n"
		   				+ "Criatura especialista em rastreamento e combates a longa dist�ncia.");
		   		
		   		JOptionPane.showMessageDialog( null, "Atributos \n" + 
					    "Forca = +2\n" + 
				  		"Agilidade = +1\n" + 
				  		"Resist�ncia = -1");
		   	}
		   	else if(TipoET.equalsIgnoreCase("2")) {
		   		
		   		JOptionPane.showMessageDialog( null, "Extraterrestre - Mercen�rio\r\n\n"
		   				+ "Criatura corrupta sedenta por riquezas.");
		   		
		   		JOptionPane.showMessageDialog( null, "Atributos \n" + 
					    "Forca = +2\n" + 
				  		"Agilidade = -2\n" + 
				  		"Resist�ncia = +1");
		   	}
		   	else {
		   		JOptionPane.showMessageDialog( null, "Valor invalido, tente novamente" );		
		   	}
	   		
	   		}
	   		else {
	   			JOptionPane.showMessageDialog( null, "Valor invalido, tente novamente" );			 
	   		}
	   	
	   	JOptionPane.showMessageDialog( null, nick +" era habitante do planeta �-B -B -B� por�m\r\n" 
	   			+ "uma grande guerra entre duas fac��es, que buscavam o poder\r\n" 
	   			+ "absoluto, acabou com a destrui��o do planeta por completo. \r\n"
	   			+ "Agora ele viaja pela gal�xia buscando trazer a paz aos planetas que \r\n"
	   			+ "est�o em guerra para que os inocentes n�o acabem pagando pela\r\n" 
	   			+ "ignor�ncia de seus comandantes.");
		
	     int countBatalha01 = 0;
		 int dado3 = 0;
		 
		 do {
			 JOptionPane.showMessageDialog( null, "Voc� desperta do que parecia ser um sono profundo, por�m percebe que esta deitado no ch�o \n"
			 		+ "onde parece ser um deserto, n�o faz a menor ideia do que est� acontecendo, logo se depara de que \n"
			 		+ "sua cabe�a est� sangrando, voc� ent�o estanca o sangramento, n�o fazendo ideia nem de qual era \n"
			 		+ "seu pr�prio nome, voc� procura em seus bolsos qualquer coisa que o fa�a lembrar, enfim encontra \n"
			 		+ "um documento, nele est� escrito seu nome "+ nick +", junto deste documento se encontra um "
			 		+ "emblema \nnele est� escrito �General das for�as armadas -b-b-b�.");
			 
			 JOptionPane.showMessageDialog( null, "Ap�s uma longa caminhada pelo deserto, voc� finalmente avista o que parece ser um nave, \n"
			 		+ "junto dela  uma pessoa, com as vestimentas parecidas com a sua, ao se aproximar esta \npessoa fica "
			 		+ "totalmente espantada, ele o chama de general, e diz que todos no planeta \nachavam que voc� estava "
			 		+ "morto, completamente confuso voc� explica que n�o se \nlembra de nada, e pede para que possa lhe "
			 		+ "lembrar sobre tudo o que estava acontecendo!");
			 
			 JOptionPane.showMessageDialog( null, "Ap�s lembrar-se de seu passado, voc�s saem para voltar ao planeta, logo ap�s levantar \n"
			 		+ "voo, voc� avista um planeta completamente destru�do, e ao se distra�rem com ele, a nave � atingida \n"
			 		+ "por algo, e seu companheiro � obrigado a fazer um pouso for�ado, ao olhar o que os atingiu, havia \n"
			 		+ "uma nave que efetuou mais alguns disparos, por sorte a nave n�o teve grandes estragos, e ainda \n"
			 		+ "est� funcionando, ao ver que � uma nave inimiga, voc� ent�o sai com o objetivo de destru�-la... ");
		
			 dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
			 dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 somaAtributos =  JOptionPane.showInputDialog("Digite o total de seus atributos ");	
			 int totalSoma = Integer.parseInt(somaAtributos);
			
		
		
				
			 switch (dado3) {
			
			 	case 1:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Seu ataque n�o surtiu efeito e o inimigo contra-atacou com mais for�a e sua nave foi danificada. \nVoc� teve que recuar. (agilidade-1)" );		
				break;
			 	case 2:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Falha no sistema de armas, o inimigo atacou primeiro e sua nave foi danificada. \nVoc� teve que recuar. (resist�ncia-1)" );		
				break;
			 	case 3:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Ataque cr�tico, voc� adquiriu uma nova tecnologia, defesa contra misseis (resist�ncia+2)" );		
				break;
			 	case 4:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Ataque cr�tico, voc� adquiriu uma nova tecnologia, motor(agilidade+1)" );		
				break;
			 	case 5:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Ataque cr�tico, voc� adquiriu uma nova tecnologia, escudo (resist�ncia+1)" );		
				break;
			 	case 6:
				JOptionPane.showMessageDialog( null,"Dano de "+ (dado3 + totalSoma) + "Ataque cr�tico, voc� adquiriu uma nova tecnologia, metralhadora (for�a+1)" );		
				break;

			 	default: JOptionPane.showMessageDialog( null, " morreu" );	
				break;	
			 }
			 
			 countBatalha01++;
			
			 }while((dado3 == 1 && dado3 == 2) && countBatalha01 !=3 );
			
		 if(dado3 >2) {
			 JOptionPane.showMessageDialog( null,"efefgeugye" );		
		 }
				 
		 else {
			 JOptionPane.showMessageDialog( null,"Voc� " );	
		 }
		
		break; 
		 
		case "3":
			
			JOptionPane.showMessageDialog(null, "Feito por Gabriel Moraes e Leonardo Alves fodase");
		break;
		
		case "4":
			
			JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
		break; 
		 
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
		break;	
		}
		
		}while(!opcao.equalsIgnoreCase("4"));
	}

}
