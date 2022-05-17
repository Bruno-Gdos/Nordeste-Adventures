package game;
import java.util.Scanner;


public class Main {
	
	public static void continuar() {
		System.out.println("\n\n\tPressione ENTER para continuar");
		Scanner input = new Scanner(System.in);
		input.nextLine();
	}
	
	public static void Escrevendo(String Texto, int tempo) {
		
		String text = "\n" + Texto;
		int i;
		for(i = 0; i < text.length(); i++){
		    System.out.printf("%c", text.charAt(i));
		    try{
		        Thread.sleep(tempo);
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Escrevendo("\r\n"
				+ "          _   _   ___   _____   _____  ____   ______   _____  _______  ____       \r\n"
				+ "         | \\ | | / _ \\ |  __ \\ |  __ \\|___ \\ |  ____| / ____||__   __||___ \\      \r\n"
				+ "         |  \\| || | | || |__) || |  | | __) || |__   | (___     | |     __) |     \r\n"
				+ "         | . ` || | | ||  _  / | |  | ||__ < |  __|   \\___ \\    | |    |__ <      \r\n"
				+ "         | |\\  || |_| || | \\ \\ | |__| |___) || |____  ____) |   | |    ___) |     \r\n"
				+ "         |_| \\_| \\___/ |_|  \\_\\|_____/|____/ |______||_____/    |_|   |____/      \r\n"
				+ "                                                                                  \r\n"
				+ "                                                                                  \r\n"
				+ "            _____ __      __ ____   _   _  _______  _    _  _____   ____    _____ \r\n"
				+ "     /\\    |  __ \\\\ \\    / /|___ \\ | \\ | ||__   __|| |  | ||  __ \\ |___ \\  / ____|\r\n"
				+ "    /  \\   | |  | |\\ \\  / /   __) ||  \\| |   | |   | |  | || |__) |  __) || (___  \r\n"
				+ "   / /\\ \\  | |  | | \\ \\/ /   |__ < | . ` |   | |   | |  | ||  _  /  |__ <  \\___ \\ \r\n"
				+ "  / ____ \\ | |__| |  \\  /    ___) || |\\  |   | |   | |__| || | \\ \\  ___) | ____) |\r\n"
				+ " /_/    \\_\\|_____/    \\/    |____/ |_| \\_|   |_|    \\____/ |_|  \\_\\|____/ |_____/ \r\n"
				+ "                                                                                  \r\n"
				+ "                                                                                  \r\n"
				+ "========================================================================================\n\n",2);

		System.out.println("\tBem vindo ao NORDESTE ADVENTURES\n");
		System.out.println("\tEssa Sera uma aventura de 5 minutos, espero que se divirta");
		
		Jogador jogador = null;
		
		int opcao;
		do {
			System.out.println("\t\nVocê quer entrar no jogo?");
			System.out.println("[1] Sim"
					+ "\n[2] Claro");
			System.out.println("\n\nOpssaum: ");
			opcao = Integer.parseInt(input.nextLine());
			switch(opcao) {
			
			case 1:
				
				System.out.println("VAMOS!");
				break;
				
			case 2:
				System.out.println("Vejo que está muito animado(a)");	
				break;
				
			default:
				System.out.println("VAMOS JOGAR, VAMO.");
			}
			
		}while(opcao !=  1 & opcao != 2);

		System.out.println("\n##################################\n");
		System.out.println("Agora iremos escolher sua classe: ");
		
		
		boolean confirm = false;
		do {
			System.out.println("\n\nEscolha sua classe: \n");
			System.out.println("[1] Cara normal\t\t [2] Pulica\t\t [3] Nerd\n");
			System.out.println("      ////^\\\\\\\\                  ,                 __\r\n"
					+ "      | ^   ^ |             _.-\"` `'-.           .'  `'.\r\n"
					+ "     @ (o) (o) @            '._ __{}_(          /  _    |\r\n"
					+ "      |   <   |              |'--.__\\          #_/.\\==/.\\\r\n"
					+ "      |  ___  |             (   ^_\\^          (, \\_/ \\\\_/\r\n"
					+ "       \\_____/               |   _ |            |    -' |\r\n"
					+ "     ____|  |____            )\\___/             \\   '=  /\r\n"
					+ "    /    \\__/    \\       .--'`:._]              /`-.__.'\r\n"
					+ "                        /  \\      '-.        .-'`-.___|__\r\n"
					+ "  Equilibrado\t|\t   Forte\t|\tInteligente");
			
			System.out.println("\n\nEscolha: ");
			opcao = Integer.parseInt(input.nextLine());
			switch(opcao) {
			
			case 1:
				
				System.out.println("Pessima escolha, você escolheu ser um humano sofredor num mundo injusto");
				System.out.println("\nVocê tem certeza?"
						+ "\n[1] SIM"
						+ "\n[2] NÃO SEI OQ QUERO DA MINHA VIDA");
				System.out.println("\n\nEscolha: ");
				opcao = Integer.parseInt(input.nextLine());
				switch(opcao) {
				
					case 1:
						System.out.println("Boa sorte na vida sofrida");
						System.out.println("Qual o nome desse fi do canso?");
						String nome = input.nextLine();
						String imagem = ("      ////^\\\\\\\\\r\n"
								+ "      | ^   ^ |\r\n"
								+ "     @ (o) (o) @\r\n"
								+ "      |   <   |\r\n"
								+ "      |  ___  |\r\n"
								+ "       \\_____/\r\n"
								+ "     ____|  |____\r\n"
								+ "    /    \\__/    \\");
						jogador = new Jogador("Humano Fulero", nome , 1, 100, 5, 5, 5, 5, "Pedaco de taba", imagem );
						
						confirm = true;
						break;
					
					case 2:
						break;
					default:
						System.out.println("Escolha uma opcaum valida");
						
					}
					break;

			case 2:
				
				System.out.println("Pessima escolha, você escolheu ser um pulica corrupto");
				System.out.println("\nVocê tem certeza?"
						+ "\n[1] SIM"
						+ "\n[2] NÃO SEI OQ QUERO DA MINHA VIDA");
				System.out.println("\n\nEscolha: ");
				opcao = Integer.parseInt(input.nextLine());
				switch(opcao) {
				
					case 1:
						System.out.println("Boa sorte na vida sofrida");
						System.out.println("\n Qual o nome do pulica fulero?");
						String nome = input.nextLine();
						String imagem = ("             ,\r\n"
								+ "        _.-\"` `'-.\r\n"
								+ "       '._ __{}_(\r\n"
								+ "         |'--.__\\\r\n"
								+ "        (   ^_\\^\r\n"
								+ "         |   _ |\r\n"
								+ "         )\\___/\r\n"
								+ "     .--'`:._]\r\n"
								+ "    /  \\      '-.\r\n"
								+ "");
						
						jogador = new Jogador("Pulica Corruptu", nome , 1, 100, 7, 3, 4, 5, "Pedaco de taba", imagem );
						
						confirm = true;
						break;
					
					case 2:
						break;
					default:
						System.out.println("Escolha uma opcaum valida");
						
					}
				break;
			case 3:
				
				System.out.println("Pessima escolha, você escolheu ser um nerd que joga lol");
				System.out.println("\nVocê tem certeza?"
						+ "\n[1] SIM"
						+ "\n[2] NÃO SEI OQ QUERO DA MINHA VIDA");
				System.out.println("\n\nEscolha: ");
				opcao = Integer.parseInt(input.nextLine());
				switch(opcao) {
				
					case 1:
						System.out.println("Boa sorte na vida sofrida");
						System.out.println("\nQual o nome do nerd fuleru");
						String nome = input.nextLine();
						String imagem = ("             __\r\n"
								+ "           .'  `'.\r\n"
								+ "          /  _    |\r\n"
								+ "          #_/.\\==/.\\\r\n"
								+ "         (, \\_/ \\\\_/\r\n"
								+ "          |    -' |\r\n"
								+ "          \\   '=  /\r\n"
								+ "          /`-.__.'\r\n"
								+ "       .-'`-.___|__\r\n"
								+ "");
						
						jogador = new Jogador("Jogador de lol", nome , 1, 100, 2, 7, 5, 5, "Pedaco de taba", imagem );
						confirm = true;
						break;
					
					case 2:
						break;
					default:
						System.out.println("Escolha uma opcaum valida");
						
					}
				break;
			}
		}while(!confirm);
		
		System.out.println("\n\n##########################");
		System.out.println("Criamos o seu personagem ele se chama: " + jogador.getNome()+ "\nEsses são seus status: ");
		System.out.println(jogador.toString());
		
		continuar();
		
		Escrevendo("\r\n"
				+ "                 _    _  _____   _____  _______  ____   _____   _____           \r\n"
				+ "     /\\         | |  | ||_   _| / ____||__   __|/ __ \\ |  __ \\ |_   _|    /\\    \r\n"
				+ "    /  \\        | |__| |  | |  | (___     | |  | |  | || |__) |  | |     /  \\   \r\n"
				+ "   / /\\ \\       |  __  |  | |   \\___ \\    | |  | |  | ||  _  /   | |    / /\\ \\  \r\n"
				+ "  / ____ \\      | |  | | _| |_  ____) |   | |  | |__| || | \\ \\  _| |_  / ____ \\ \r\n"
				+ " /_/    \\_\\     |_|  |_||_____||_____/    |_|   \\____/ |_|  \\_\\|_____|/_/    \\_\\\r\n"
				+ "               _____  ____   __  __  ______  _____                              \r\n"
				+ "              / ____|/ __ \\ |  \\/  ||  ____|/ ____|    /\\                       \r\n"
				+ "             | |    | |  | || \\  / || |__  | |        /  \\                      \r\n"
				+ "             | |    | |  | || |\\/| ||  __| | |       / /\\ \\                     \r\n"
				+ "             | |____| |__| || |  | || |____| |____  / ____ \\  _  _  _           \r\n"
				+ "              \\_____|\\____/ |_|  |_||______|\\_____|/_/    \\_\\(_)(_)(_)          \r\n"
				+ "                                              )_)                               \r\n"
				+ "                                                                                \r\n"
				+ ""
				+ ""
				+ ""
				+ "", 3);
		
		Escrevendo("A historia, se passa no nordeste e você, " + jogador.getNome() + ", tava cagado de fome"
				+ " e queria bater uma feijoada,\n curiosamente, tinha de tudo na geladeira menos a linguica e tu, " +
				jogador.getNome() + " decidiu ir atrás da comida\n milagrosa que cura qualquer fome e te deixa forte.\n"
				+ "Voce UM caba safado, como um " + jogador.getClasse() + " decide ir atrás do igrediente secreto\n"
						+ " e se aventurar contra o calor de lascar do nordeste.",20);
		
		continuar();
		
		Escrevendo("\n" + jogador.getNome() + ": HMMMM, calor do caraio, tou cagado de fome,\n"
				+ "Queria bater um rango daquele jeito, vou ver a geladeira, esse canso",20);
		
		continuar();
		
		Escrevendo("\n" + jogador.getNome() + ": *Abro a geladeira*\n"
				+ "HMMM, achei sorvete, tou doido para tomar uma colher nesse calor do canso.",20);
		continuar();
		
		Escrevendo("\n" + jogador.getNome() + ": PUTA QUE PARIU, era feijao, mae é foda, fica me enganando essa mulesta.",20);
		continuar();
		
		Escrevendo("\n" + jogador.getNome() + ": Vou é fazer uma feijoada, tem jabah, legume e umas carne veia",20);
		continuar();
		
		Escrevendo("\n" + jogador.getNome() + ": Vou atras da linguica, para botar nessa feijoada do canso",20);
		continuar();
		
		Escrevendo("\n" + jogador.getNome() + " decide ir ate a venda do Levi da batata... o Maior mentiroso da historia e otimo com armas" ,20);
		continuar();
		
		Escrevendo("\nLevi o mentiroso: Opa " + jogador.getNome() + ", tu eh u fi de mariazinha ne? Dei uns beijo na sua prima",20);
		continuar();
		
		Monstro levi = new Monstro("Levi", 99, 999, 999, 999, 999, 999, "o\r\n"
				+ " \\_/\\o\r\n"
				+ "( Oo)                    \\|/\r\n"
				+ "(_=-)  .===O-  ~~Z~A~P~~ -O-\r\n"
				+ "/   \\_/U'                /|\\\r\n"
				+ "||  |_/\r\n"
				+ "\\\\  |\r\n"
				+ "{K ||\r\n"
				+ " | PP\r\n"
				+ " | ||\r\n"
				+ " (__\\\\");
		
		do {
			Escrevendo("Você tem duas escolhas\n"
					+ "[1] Atacar\n"
					+ "[2] Ignorar",20);
			
			System.out.println("\n\nOpssaum: ");
			
			opcao = Integer.parseInt(input.nextLine());
			switch(opcao) {
			
			case 1:
				
				System.out.println("Essa foi uma pessima escolha!");
				Escrevendo("Esses são os status de levi\n\n" + levi.exibeStatus() ,20);			
				Escrevendo(jogador.atacar(jogador, levi),20);
				
				Escrevendo("Levi te encheu de porrada e você morreu\n\n",20);
				
				Escrevendo("\r\n"
						+ "   _____            __  __  ______  ____ __      __ ______  _____  \r\n"
						+ "  / ____|    /\\    |  \\/  ||  ____|/ __ \\\\ \\    / /|  ____||  __ \\ \r\n"
						+ " | |  __    /  \\   | \\  / || |__  | |  | |\\ \\  / / | |__   | |__) |\r\n"
						+ " | | |_ |  / /\\ \\  | |\\/| ||  __| | |  | | \\ \\/ /  |  __|  |  _  / \r\n"
						+ " | |__| | / ____ \\ | |  | || |____| |__| |  \\  /   | |____ | | \\ \\ \r\n"
						+ "  \\_____|/_/    \\_\\|_|  |_||______|\\____/    \\/    |______||_|  \\_\\\r\n"
						+ "                                                                   \r\n"
						+ "                                                                   \r\n"
						+ "\t  _____\r\n"
						+ "\t /     \\\r\n"
						+ "\t| () () |\r\n"
						+ "\t \\  ^  /\r\n"
						+ "\t  |||||\r\n"
						+ "\t  |||||",6);
				
				System.exit(0); 
				
				break;
				
			case 2:
				Escrevendo("\nEssa foi uma otima escolha, ninguem se machucou, levi e mentiroso e n beijou sua prima.",15);
				continuar();
				
				Escrevendo("\n" + jogador.getNome() + ": Oi levi, preciso de uma linguica, voce teria? Quero bater uma feijoada",20);
				continuar();
				
				Escrevendo("\nLevi o mentiroso: Vou ter nao meu querido.\nSe vc me ajudar a matar o boi Bila, ele tem a linguiça encantada, pode ser toda sua.\n"
						+ "mas cuidado, Tavin o burro é doido para matar o boi Bila ",20);
				continuar();
				
				Escrevendo("\r\n"
						+ "  __  __  _____   _____  _____   /\\/|   ____     \r\n"
						+ " |  \\/  ||_   _| / ____|/ ____| |/\\/   / __ \\    \r\n"
						+ " | \\  / |  | |  | (___ | (___    / \\  | |  | |   \r\n"
						+ " | |\\/| |  | |   \\___ \\ \\___ \\  / _ \\ | |  | |   \r\n"
						+ " | |  | | _| |_  ____) |____) |/ ___ \\| |__| |   \r\n"
						+ " |_|  |_||_____||_____/|_____//_/   \\_\\\\____/    \r\n"
						+ "            _____  ______  _____  _______        \r\n"
						+ "     /\\    / ____||  ____||_   _||__   __| /\\    \r\n"
						+ "    /  \\  | |     | |__     | |     | |   /  \\   \r\n"
						+ "   / /\\ \\ | |     |  __|    | |     | |  / /\\ \\  \r\n"
						+ "  / ____ \\| |____ | |____  _| |_    | | / ____ \\ \r\n"
						+ " /_/    \\_\\\\_____||______||_____|   |_|/_/    \\_\\\r\n"
						+ "                                                 \r\n"
						+ "                                                 \r\n"
						+ ""
						+ ""
						+ "\r\n"
						+ "  __  __         _                  ____          _    ____   _  _          \r\n"
						+ " |  \\/  |       | |                |  _ \\        (_)  |  _ \\ (_)| |         \r\n"
						+ " | \\  / |  __ _ | |_  ___    ___   | |_) |  ___   _   | |_) | _ | |  __ _   \r\n"
						+ " | |\\/| | / _` || __|/ _ \\  / _ \\  |  _ <  / _ \\ | |  |  _ < | || | / _` |  \r\n"
						+ " | |  | || (_| || |_|  __/ | (_) | | |_) || (_) || |  | |_) || || || (_| |  \r\n"
						+ " |_|  |_| \\__,_| \\__|\\___|  \\___/  |____/  \\___/ |_|  |____/ |_||_| \\__,_|  \r\n"
						+ "                            ___      __ __                                  \r\n"
						+ "                           / _ \\    / //_ |                                 \r\n"
						+ "                          | | | |  / /  | |                                 \r\n"
						+ "                          | | | | / /   | |                                 \r\n"
						+ "                          | |_| |/ /    | |                                 \r\n"
						+ "                           \\___//_/     |_|                                 \r\n"
						+ "                                                                            \r\n"
						+ "                                                                            \r\n"
						+ ""
						+ "",2);
				continuar();
				
				Escrevendo(jogador.getNome() + " bastante motivado decide dar inicio definitivamente a sua jornada e buscar\n"
						+ "a linguica encantada para fazer sua belissima feijoada e matar a sua fome, Levi, o mentiroso"
						+ " ainda foi caridoso\n e te deu um pote de EXP contendo 100 pontos de EXP.\n",12);
				continuar();
				jogador.ganharXP(100);
				
				break;
				
			default:
				System.out.println("Escolha uma opção valida!");
			}
			
		}while(opcao !=  1 & opcao != 2);
		
		do {
			
			Escrevendo("Vc deseja ver os seus novos status?\n[1]Sim\n[2]Nao\n\nOpssaum:",12);
			opcao = Integer.parseInt(input.nextLine());
			
			
			switch(opcao) {
			
			case 1:
				
				System.out.println(jogador.toString());		
				continuar();
				break;
			
		
			case 2: 
				break;
				
			default:
				System.out.println("Escolha uma opção valida!");
				
			}
			
		}while(opcao !=  1 & opcao != 2);
		
		Monstro inseto = new Monstro("Rola bosta", 1, 1, 5, 0, 99, 1,"          \\ /\r\n"
				+ "          oVo\r\n"
				+ "      \\___XXX___/\r\n"
				+ "       __XXXXX__\r\n"
				+ "      /__XXXXX__\\\r\n"
				+ "      /   XXX   \\\r\n"
				+ "           V" );
		
		Escrevendo("\nEm sua primeira caminhada ate o pasto, " + jogador.getNome() +"\n"
				+ "encontrou um bug...\n"
				+ "Ufa! Dessa vez não foi um bug no programa, mas sim um inseto violento\n"
				+ "\n\n\t\t##A BATALHA COMEÇA##\n\n",12);
		continuar();
		
		do{
			System.out.println(inseto.toString());
			
			System.out.println("\nSeu hp: " + jogador.getVidas()+ "/" + jogador.getVidamax());
			Escrevendo("Você tem tres escolhas\n"
					+ "[1] Atacar\n"
					+ "[2] Defender\n"
					+ "[3] Exibe status inimigo\n\n"
					+ "Opssaum: ",20);
			
			opcao = Integer.parseInt(input.nextLine());
			
			switch(opcao) {
			
			case 1:
				
				Escrevendo(jogador.atacar(jogador, inseto), 20);
				break;
				
			case 2:
				
				Escrevendo(jogador.defesa(jogador, inseto),20);
				break;
				
			case 3:
				
				Escrevendo(inseto.exibeStatus(),5);
				continuar();
				break;
				
			default:
				
				System.out.println("Escolha uma opção válida");
				
			}
			
		}while(inseto.getVidas() > 0);
		
		Escrevendo("\n\nVoce esperava o que? Um boss? Obviamente que ele morreria com um golpe\n"
				+ "é apenas um inseto, e essa e sua recompensa: \n",10);
		
		Escrevendo(jogador.getNome() + " Ganhou 200 de xp e dropou a arma:\n"
				+ "\tBaleadeira\n",10);
		
		jogador.ganharXP(200);
		
		continuar();
		
		Escrevendo(jogador.equiparArma("Baleadeira", 10),12);
		
		
		do {
			
			Escrevendo("Vc deseja ver os seus novos status?\n[1]Sim\n[2]Nao\n\nOpssaum:",12);
			opcao = Integer.parseInt(input.nextLine());
			
			
			switch(opcao) {
			
			case 1:
				
				System.out.println(jogador.toString());		
				continuar();
				break;
			
		
			case 2: 
				break;
				
			default:
				System.out.println("Escolha uma opção valida!");
				
			}
			
		}while(opcao !=  1 & opcao != 2);
		
		Escrevendo("Após derrotar o rola bosta, você se enche de esperança e decidir ir atrás de bila\n"
				+ "\tVocê caminha em direção a bila, o boi.",10);
		continuar();
		
		Escrevendo("  ,--./,-.\r\n"
				+ " / #      \\\r\n"
				+ "|          |\r\n"
				+ " \\        /\r\n"
				+ "  `._,._,'\n\n"
				+ "No caminho você encontra uma fruta, e acha ela util\n"
				+ "nunca se sabe quanto vai bater a fome\n",10);
		
		Escrevendo("\t" + jogador.getNome() + " ganhou uma fruta",20);
		continuar();
		
		
		Escrevendo("Após uma longa caminhada você encontra bila o boi: \n",20);
		Escrevendo("\\|/          (__)    \r\n"
				+ "     `\\------(oo)\r\n"
				+ "       ||    (__)\r\n"
				+ "       ||w--||     \\|/\r\n"
				+ "   \\|/",10);
		
		continuar();
		
		Escrevendo("Ao ver bila o boi na sua frente " + jogador.getNome() + " se enche de garra\n"
				+ "vc nunca esteve tão perto da feijoada e adquiriu a magia:\n"
				+ "\t ASA BRANCA",20);
		
		
		Escrevendo(jogador.ganharMagia("Asa Branca", 10),20);
		
		Monstro bila = new Monstro("Bila o boi", 4, 20, 28, 5 , 2, 7, "           __n__n__\r\n"
				+ "    .------`-\\00/-'\r\n"
				+ "   /  ##  ## (oo)\r\n"
				+ "  / \\## __   ./\r\n"
				+ "     |//YY \\|/\r\n"
				+ "     |||   |||");
		
		continuar();
		
		boolean item = true;
		
		Escrevendo("\t### A BATALHA FINAL COMEÇA ###\n",20);
		
		do{
			System.out.println("\n"+bila.toString());
			
			System.out.println("\n Seu hp: " + jogador.getVidas() + "/100");
			Escrevendo("Você tem cinco escolhas\n\n"
					+ "[1] Atacar\n"
					+ "[2] Defender\n"
					+ "[3] Exibe status inimigo\n"
					+ "[4] Comer fruta\n"
					+ "[5] Usar Magia\n\n"
					+ "Opssaum: ",20);
			
			opcao = Integer.parseInt(input.nextLine());
			
			switch(opcao) {
			
			case 1:
				
				Escrevendo(jogador.atacar(jogador, bila), 20);
				break;
				
			case 2:
				
				Escrevendo(jogador.defesa(jogador, bila),20);
				break;
				
			case 3:
				
				Escrevendo(bila.exibeStatus(),5);
				continuar();
				break;
			
			
			case 4:
				
				if(item == true && jogador.getVidas() == 100){
					Escrevendo("Sua vida já esta cheia",20);
					break;
					
				}
				
				if(item == true) {
					
					Escrevendo(" ,--./,-.\r\n"
							+ "/,-._.--~\\\r\n"
							+ " __}  {\r\n"
							+ "\\`-._,-`-,\r\n"
							+ " `._,._,'\n",6);
					
		
					Escrevendo(jogador.usarItem(jogador, 20),20);
					item = false;
					break;
					
				}else {
					
					System.out.println("Vc ja comeu a fruta");
					break;
				}
			
			case 5:
				
				Escrevendo(jogador.getNome() + "\nSe encheu de vontade e começou a cantar: "
						+ "\n\nQue braseiro, que fornaia'\r\n"
						+ "Nenhum pé de prantação'\r\n"
						+ "Por farta' d'água perdi meu gado\r\n"
						+ "Morreu de sede meu alazão\r\n"
						+ "Por farta' d'água perdi meu gado\r\n"
						+ "Morreu de sede meu alazão\n",30);
				
				Escrevendo(jogador.usarMagia(jogador, bila),20);
				break;
				
			default:		
				System.out.println("Escolha uma opção válida");
				
			}
		
			
		}while(bila.getVidas() > 0);
		
	Escrevendo("           __n__n__\r\n"
			+ "    .------`-\\XX/-'\r\n"
			+ "   /  ##  ## (oo)\r\n"
			+ "  / \\## __   ./\r\n"
			+ "     |//YY \\|/\r\n"
			+ "     |||   |||",6);
	Escrevendo("\nO boi bila foi derrotado e finalmente voce\n conseguiu a linguica sagrada para a sua feijoada. ",20);
	continuar();
	
	Escrevendo(jogador.getNome() + " retornou para casa e decidiu fazer a sua linda feijoada.\n",10);
	Escrevendo("    (\\\r\n"
			+ "     \\ \\\r\n"
			+ " __    \\/ ___,.-------..__        __\r\n"
			+ "//\\\\ _,-'\\\\               `'--._ //\\\\\r\n"
			+ "\\\\ ;'      \\\\                   `: //\r\n"
			+ " `(          \\\\                   )'\r\n"
			+ "   :.          \\\\,----,         ,;\r\n"
			+ "    `.`--.___   (    /  ___.--','\r\n"
			+ "      `.     ``-----'-''     ,'\r\n"
			+ "         -.               ,-\r\n"
			+ "            `-._______.-'",6);
	
	continuar();
	
	Escrevendo("\r\n"
			+ "                                    ______  _____  __  __   _                                         \r\n"
			+ "                                   |  ____||_   _||  \\/  | | |                                        \r\n"
			+ "                                   | |__     | |  | \\  / | | |                                        \r\n"
			+ "                                   |  __|    | |  | |\\/| | | |                                        \r\n"
			+ "                                   | |      _| |_ | |  | | |_|                                        \r\n"
			+ "                                   |_|     |_____||_|  |_| (_)                                        \r\n"
			+ "                                                                                                      \r\n"
			+ "                                                                                                      \r\n"
			+ "                 ____   ____   _____   _____  _____            _____    ____                          \r\n"
			+ "                / __ \\ |  _ \\ |  __ \\ |_   _|/ ____|    /\\    |  __ \\  / __ \\                         \r\n"
			+ "               | |  | || |_) || |__) |  | | | |  __    /  \\   | |  | || |  | |                        \r\n"
			+ "               | |  | ||  _ < |  _  /   | | | | |_ |  / /\\ \\  | |  | || |  | |                        \r\n"
			+ "               | |__| || |_) || | \\ \\  _| |_| |__| | / ____ \\ | |__| || |__| |                        \r\n"
			+ "                \\____/ |____/ |_|  \\_\\|_____|\\_____|/_/    \\_\\|_____/  \\____/                         \r\n"
			+ "                                                                                                      \r\n"
			+ "                                                                                                      \r\n"
			+ "  _____    ____   _____    _______  ______  _____         _   ____    _____            _____    ____  \r\n"
			+ " |  __ \\  / __ \\ |  __ \\  |__   __||  ____||  __ \\       | | / __ \\  / ____|    /\\    |  __ \\  / __ \\ \r\n"
			+ " | |__) || |  | || |__) |    | |   | |__   | |__) |      | || |  | || |  __    /  \\   | |  | || |  | |\r\n"
			+ " |  ___/ | |  | ||  _  /     | |   |  __|  |  _  /   _   | || |  | || | |_ |  / /\\ \\  | |  | || |  | |\r\n"
			+ " | |     | |__| || | \\ \\     | |   | |____ | | \\ \\  | |__| || |__| || |__| | / ____ \\ | |__| || |__| |\r\n"
			+ " |_|      \\____/ |_|  \\_\\    |_|   |______||_|  \\_\\  \\____/  \\____/  \\_____|/_/    \\_\\|_____/  \\____/ \r\n"
			+ "                                                                                                      \r\n"
			+ "                                                                                                      \r\n"
			+ "",2);
	
	Escrevendo("\r\n\n"
			+"==================================================================================\n\n"
			+ "                            _   ____    _____   ____                                \r\n"
			+ "                           | | / __ \\  / ____| / __ \\                               \r\n"
			+ "                           | || |  | || |  __ | |  | |                              \r\n"
			+ "                       _   | || |  | || | |_ || |  | |                              \r\n"
			+ "                      | |__| || |__| || |__| || |__| |                              \r\n"
			+ "                       \\____/  \\____/  \\_____| \\____/                               \r\n"
			+ "                                                                                    \r\n"
			+ "                                                                                    \r\n"
			+ "                           _____    ____   _____                                    \r\n"
			+ "                          |  __ \\  / __ \\ |  __ \\  _                                \r\n"
			+ "                          | |__) || |  | || |__) |(_)                               \r\n"
			+ "                          |  ___/ | |  | ||  _  /                                   \r\n"
			+ "                          | |     | |__| || | \\ \\  _                                \r\n"
			+ "                          |_|      \\____/ |_|  \\_\\(_)                               \r\n"
			+ "                                                                                    \r\n"
			+ "                                                                                    \r\n"
			+ "    ____   _____   _    _  _   _   ____        _____  ____    _____  _______        \r\n"
			+ "   |  _ \\ |  __ \\ | |  | || \\ | | / __ \\      / ____|/ __ \\  / ____||__   __| /\\    \r\n"
			+ "   | |_) || |__) || |  | ||  \\| || |  | |    | |    | |  | || (___     | |   /  \\   \r\n"
			+ "   |  _ < |  _  / | |  | || . ` || |  | |    | |    | |  | | \\___ \\    | |  / /\\ \\  \r\n"
			+ "   | |_) || | \\ \\ | |__| || |\\  || |__| |    | |____| |__| | ____) |   | | / ____ \\ \r\n"
			+ "   |____/ |_|  \\_\\ \\____/ |_| \\_| \\____/      \\_____|\\____/ |_____/    |_|/_/    \\_\\\r\n"
			+ "                                                                                    \r\n"
			+ "                                                                                    \r\n"
			+ "",2);
	
	Escrevendo("AJUDA NO ROTEIRO POR: RENIER E LEVI",20);

	}
}
