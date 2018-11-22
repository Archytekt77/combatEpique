package characters;

public class Ranger implements Characters{
	
	private Statistique statistique;
	
	
	public Ranger() {
		statistique = new Statistique();
	}
	
	String cry = "Bouyachaka";
	

	@Override
	public int basicAttack(String str, String str2) {
		System.out.println(str + " utilise Tir � l'arc et inflige " + statistique.getAgility() + " dommages");
		System.out.println(str2 + " perds " + statistique.getAgility() + " points de vie");
		return statistique.getAgility();
	}

	@Override
	public int specialAttack(String str, String str2) {
		System.out.println(str + " utilise Concentration et gagne "  + statistique.getAgility()/2 + " en agilit�");
		return statistique.getAgility()/2;
	}
	
	@Override
	public void description(String str) {
		System.out.println(cry + " je suis le R�deur " + str + " niveau " + statistique.getLvl() + " je poss�de " + statistique.getLife() + " de vitalit�, " 
				+ statistique.getForce() + " de force, " + statistique.getAgility() + " d'agilit� et " + statistique.getIntelligence() + " d'intelligence !");
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
