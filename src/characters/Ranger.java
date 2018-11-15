package characters;

public class Ranger implements Characters{
	
	private Statistique statistique;
	
	
	public Ranger() {
		statistique = new Statistique();
	}
	
	String cry = "Bouyachaka";
	

	@Override
	public void basicAttack() {
		System.out.println(" utilise Tir à l'arc et inflige " + statistique.getAgility() + " dommages");
		
	}

	@Override
	public void specialAttack() {
		System.out.println(" utilise Concentration et gagne "  + statistique.getAgility()/2 + " en agilité");
		
	}

	@Override
	public void description() {
		System.out.println(cry + " je suis le Rôdeur niveau " + statistique.getLvl() + " je possède " + statistique.getLife() + " de vitalité, " 
				+ statistique.getForce() + " de force, " + statistique.getAgility() + " d'agilité et " + statistique.getIntelligence() + " d'intelligence !");
		
	}

	@Override
	public void setStatistique(Statistique s) {
		statistique = s;
	}

	@Override
	public Statistique getStatistique() {
		return statistique;
	}
	
	

}
