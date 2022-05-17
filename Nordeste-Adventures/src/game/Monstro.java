package game;

public class Monstro extends Personagem {
	
	protected String imagem;
	
	public String getImagem() {
		return imagem;
	}
	
	public Monstro() {
	}
	
	public Monstro(String nome, int nivel, int vida, int forca, int magia, int velocidade, int defesa, String imagem) {
		
		this.imagem = imagem;
		super.nome = nome;
		super.nivel = nivel;
		super.vidas = vida;
		super.forca = forca;
		super.magia = magia;
		super.velocidade = velocidade;
		super.defesa = defesa;
		super.vidamax = vida;
		
	}
	
	public String exibeStatus() {
		return this.getImagem() + "\nVida: " + super.getVidas() + "/" + super.getVidamax() + "\tForça: " + super.getForca() + "\nMagia: " + super.getMagia() +
		"\tVelocidade: " + super.getVelocidade() + "\nDefesa: " + super.getDefesa();
	}
	
	@Override
	public String toString() {
		
		return "\t" + this.getNome() + "\t" + this.getNivel() + " LVL\n\tHP: " + this.getVidas() + "/" + super.getVidamax() 
		+ "\n\n" + this.getImagem();
	}

}
