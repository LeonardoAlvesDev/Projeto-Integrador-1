package Projeto;

import javax.swing.JOptionPane;;

public class projeto {
    
static int dado(int a) {	
	
	a = 1 +(int) (Math.random() * 6 );
	return a;
			
	}

static void EscolhaPersonagem(){
	
	
}
	
	public static void main(String[] args) {
		
		String nick;
		String raca;
		String TipoHumano;
		String TipoET;
                
                
		nick =  JOptionPane.showInputDialog("Digite seu nick: ");				
	    JOptionPane.showMessageDialog( null, " Bem vindo  " + nick );
	    JOptionPane.showMessageDialog( null, "Atributos de sua nave  " + nick+ "! você ja começa com:\n 2-Força "
	    		+ "\n 2-Agilidade \n 2-Resistência \n Obs:Não esqueça de anotar os ganhos e perdas de atributos"
	    		+ "\n isto sera essencial no seu desenvolvimento!!!" );
	   
			  
	    //do {                  IGNORAR 
	    
                
	   raca= JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Humano: \n 2-Extra-terrestre:");
	  
	   
	   	if(raca.equalsIgnoreCase("1")) {
	   	  JOptionPane.showMessageDialog( null, " Você escolheu 'Humano' ");
	   	  
	   	TipoHumano = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Cientista: \n 2-Engenheiro:");
	   
	   	
		if(TipoHumano.equalsIgnoreCase("1")) {
			
			  JOptionPane.showMessageDialog( null, " Atributos \r\n" + 
					  "Forca = +1\r\n" + 
				  		"Agilidade = +2\r\n" + 
				  		"Resistência = -1");
			  
		}
		 else if(TipoHumano.equalsIgnoreCase("2")) {
			  
			  JOptionPane.showMessageDialog( null, " Atributos \r\n" + 
				  		"Forca = +1\r\n" + 
				  		"Agilidade = -1\r\n" + 
				  		"Resistência = +2");
			  
		  }
		 else {
			 System.out.println("valor incorreto tente novamente");
		 }
		
	 	}
	   	else if(raca.equalsIgnoreCase("2")) {
	  	  JOptionPane.showMessageDialog( null, " Você escolheu 'Extra terrestre' ");
		   	TipoET = JOptionPane.showInputDialog("Digite qual opção desejada:  \n 1-Caçador: \n 2-Mercenario:");
		  
		   	if(TipoET.equalsIgnoreCase("1")) {
		   	 JOptionPane.showMessageDialog( null, " Atributos \r\n" + 
					  "Forca = +2\r\n" + 
				  		"Agilidade = +1\r\n" + 
				  		"Resistência = -1");
		   	}
		   	else if(TipoET.equalsIgnoreCase("2")) {
		   	 JOptionPane.showMessageDialog( null, " Atributos \r\n" + 
					  "Forca = +2\r\n" + 
				  		"Agilidade = -1\r\n" + 
				  		"Resistência = +1");
		   	}
		   	else {
				 System.out.println("valor incorreto tente novamente");
			 }
	   		
	   	}
	    else {
			  JOptionPane.showMessageDialog( null, " Valor invalido, tente novamente" );			 
	 }
		
		 JOptionPane.showMessageDialog( null, " Logo após se lembrar de seu passado e entender seu povo, você se depara \n"
		 		                            + " com a aproximação de uma guerra que pode por um fim a sua raça e seu planeta. \n "
		 		                            + "\n"
		 		                            + "Sua missão é infiltrar-se em território inimigo e descobrir possíveis fraquezas....\n"
		 		                            + "\n"
		 		                            + "Seu general então lhe entrega documentos , neles contém um dispositivo capaz de cortar a \n"
		 		                            + "comunicação das naves inimigas e uma rota que demonstra uma pequena passagem para \n"
		 		                            + "entrar em território inimigo sem ser descoberto, porem essa passagem esta sob vigia de guardiões ..... ");
	
			dado2 =  JOptionPane.showInputDialog("Digite '1' para rodar o dado: ");	
			int dado3 = Integer.parseInt(dado2);
			 dado3 = dado(dado3);
			 
			 switch (dado3) {
			case 1:
				JOptionPane.showMessageDialog( null, " morreu1" );		
				break;
			case 2:
				JOptionPane.showMessageDialog( null, " morreu2" );		
				break;
			case 3:
				JOptionPane.showMessageDialog( null, " morreu3" );		
				break;
			case 4:
				JOptionPane.showMessageDialog( null, " morreu4" );		
				break;
			case 5:
				JOptionPane.showMessageDialog( null, " morreu5" );		
				break;
			case 6:
				JOptionPane.showMessageDialog( null, " morreu6" );		
				break;

			default: JOptionPane.showMessageDialog( null, " morreu" );	
				break;
			}
			
 	    //}while((!raca.equalsIgnoreCase("1") && !raca.equalsIgnoreCase("2"))                 IGNORAR
                    //|| (!TipoHumano.equalsIgnoreCase("1") && !TipoHumano.equalsIgnoreCase("2")) FODASE	
                    //|| (!TipoET.equalsIgnoreCase("1") && !TipoET.equalsIgnoreCase("2")) );      .
		
		
		
	//	System.out.println("Digite '1' para rodar o dado");
	//	int b = sc.nextInt();
		
		
	//	int dado2 = dado(b);
	//	System.out.println(dado2);
		

	}

}
