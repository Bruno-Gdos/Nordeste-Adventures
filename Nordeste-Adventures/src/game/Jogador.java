package game;

public class Jogador extends Personagem {

	protected String imagem;
	protected String classe;
	protected int Exp = 0;
	protected static int proxLevel = 100;
	protected String arma = "";	
	
	public int getExp() {
		return Exp;
	}
	
	public int getProxLevel() {
		return proxLevel;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public String getArma() {
		return arma;
	}
	
	public String getImagem() {
		return imagem;
	}
	
	public Jogador() {
	}
	
	public Jogador(String classe, String nome, int nivel, int vida, int forca, int magia, int velocidade, int defesa, String arma, String imagem) {
		
		this.imagem = imagem;
		this.arma = arma;
		this.classe = classe;
		super.nome = nome;
		super.nivel = nivel;
		super.vidas = vida;
		super.forca = forca;
		super.magia = magia;
		super.velocidade = velocidade;
		super.defesa = defesa;
		super.vidamax = vida;
		
	}
	
	public void ganharNivel() {
				this.nivel++;
				this.forca ++;
				this.defesa ++;
				this.magia ++;
				this.velocidade ++;	
			System.out.println("\n" + this.getNome() + " upou e está nivel: " + this.getNivel());
	}
	
	public String equiparArma(String nome,int dano) {
		int oldForca = this.forca;
		this.forca += dano;
		this.arma = nome;
		
		return "\nVc equipou " + this.arma + " e sua nova força é: "
				+ "\n\tForça: " + oldForca + " + " + dano + " ----> " + (oldForca + dano);
		
		
	}
	
	public String ganharMagia(String nomemagia, int magia) {
		int oldmagia = this.magia;
		this.magia += magia;
		
		return "\nVc equipou " + nomemagia + " e sua nova magia é: "
				+ "\n\tMagia: " + oldmagia + " + " + magia + " ----> " + (oldmagia + magia);
		
		
	}
	
	public void ganharXP(int xp) {
		
		System.out.println("\n "+ this.getNome() + " ganhou " + xp + " de xp\n");
		
		
		do {
			
			if(this.Exp + xp > proxLevel) {
			
				xp = this.Exp + xp;
				this.Exp = 0;
				this.ganharNivel();
				
				xp = xp - 100;
				
			
				
			}if(this.Exp + xp == proxLevel) {
				this.Exp = 0;
				this.ganharNivel();
				xp = 0;
				
			}if(this.Exp + xp < 100) {
				this.Exp = this.Exp +  xp;
				xp = 0;
			}
			
			
		}while(xp!=0);
		

		
		
	}
	
	
	@Override
	public String toString() {
		return this.getImagem() + "\n\n\t" + this.getClasse() + "\nNome: " + super.getNome() + "\nNivel: " + super.getNivel()
		+ "\tExp atual: " + this.getExp() + "/100" + "\nArma: " + this.getArma()
		+ "\n\nVida: " + super.getVidas() + "/" + super.getVidamax() + "\tForça: " + super.getForca() + "\nMagia: " + super.getMagia() +
		"\tVelocidade: " + super.getVelocidade() + "\nDefesa: " + super.getDefesa();
	}
	
	
}
