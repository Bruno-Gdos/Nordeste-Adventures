package game;

public class Personagem {


	protected String nome;
	protected int nivel;
	protected int vidas;
	protected int forca;
	protected int magia;
	protected int velocidade;
	protected int defesa;
	protected int vidamax;
	
	
	public int getVidamax() {
		return vidamax;
	}
	
	public int getDefesa() {
		return defesa;
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getMagia() {
		return magia;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public String getNome() {
		return nome;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public int getVidas() {
		return vidas;
	}
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public String atacar(Personagem ataca, Personagem recebe) {
		
		if(ataca.getForca() > recebe.getDefesa()) {
			recebe.vidas = recebe.getVidas() - (ataca.getForca() - recebe.getDefesa());
			return "\nO personagem " + ataca.getNome() + " Causou " + (ataca.getForca() - recebe.getDefesa()) + " De dano";
		}else {
			ataca.vidas = ataca.getVidas() - (recebe.getDefesa() - ataca.getForca());
			return "\nO personagem " + ataca.getNome() + " Recebeu " + (recebe.getDefesa() - ataca.getForca()) + " De dano"  ;
		}

	}
	
	public String defesa(Personagem defende, Personagem ataca) {
		
		if(defende.getDefesa() > ataca.getForca()) {
			ataca.vidas = ataca.getVidas() - (defende.getDefesa() - ataca.getForca());
			return "\nO personagem " + defende.getNome() + " Defendeu e causou " + (defende.getDefesa() - ataca.getForca()) + " De dano";
		}else {
			defende.vidas = defende.getVidas() - (ataca.getForca() - defende.getDefesa());
			return "\nO personagem " + defende.getNome() + " não defendeu e tomou " + (ataca.getForca() - defende.getDefesa()) + " De dano";
		}

	}
	
	public String usarMagia(Personagem ataca, Personagem defende) {
		
		if(ataca.getMagia() > defende.getMagia()) {
			defende.vidas = defende.getVidas() - (ataca.getMagia() - defende.getDefesa());
			return "\nO personagem " + ataca.getNome() + " Causou " + (ataca.getMagia() - defende.getDefesa()) + " De dano";
		}else {
			ataca.vidas = ataca.getVidas() - (defende.getDefesa() - ataca.getMagia());
			return "\nO personagem " + ataca.getNome() + " Recebeu " + (defende.getDefesa() - ataca.getMagia()) + " De dano";
			
		}
	}
		
	public String usarItem(Personagem usuario, int recupera) {
		
			usuario.vidas = usuario.getVidas()	+ recupera;	
			
			if(usuario.getVidas() > usuario.getVidamax()) {
				
				int oldvidas = usuario.getVidas();
				usuario.vidas = usuario.getVidas() - (usuario.getVidas()-usuario.getVidamax());	
				return "\nO personagem " + this.getNome() + " ganhou " + (oldvidas -usuario.getVidamax()) + " de vida";
				
			}else {
			return "\nO personagem " + this.getNome() + " ganhou " + recupera + " de vida";
			}
						

		}
	
	
	
	
}
