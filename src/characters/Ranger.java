package characters;

public class Ranger implements Characters{
	
	private Statistique statistique;
	
	
	public Ranger() {
		statistique = new Statistique();
	}
	
	String cry = "Bouyachaka";
	

	@Override
	public int basicAttack(String str, String str2) {
		System.out.println(str + " utilise Tir à l'arc et inflige " + statistique.getAgility() + " dommages");
		System.out.println(str2 + " perds " + statistique.getAgility() + " points de vie");
		return statistique.getAgility();
	}

	@Override
	public int specialAttack(String str, String str2) {
		System.out.println(str + " utilise Concentration et gagne "  + statistique.getAgility()/2 + " en agilité");
		return statistique.getAgility()/2;
	}
	
	@Override
	public void description(String str) {
		System.out.println(cry + " je suis le Rôdeur " + str + " niveau " + statistique.getLvl() + " je possède " + statistique.getLife() + " de vitalité, " 
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
