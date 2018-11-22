package characters;

public class Wizard implements Characters {
	
	private Statistique statistique;
	
	
	public Wizard() {
		statistique = new Statistique();
	}
	
	String cry = "Abracadabra";

	@Override
	public int basicAttack(String str, String str2) {
		System.out.println(str + " utilise Boule de Feu et inflige " + statistique.getIntelligence() + " dommages");
		System.out.println(str2 + " perds " + statistique.getIntelligence() + " points de vie");
		return statistique.getIntelligence();
	}
	
	@Override
	public int specialAttack(String str, String str2) {
		System.out.println(str + " utilise Soin et gagne " + statistique.getIntelligence()*2 + " en vitalité.");
		return statistique.getIntelligence()*2;
	}
	
	@Override
	public void description(String str) {
		System.out.println(
				cry + "je suis le  Mage " + str + " niveau " + statistique.getLvl() + " je possède " + statistique.getLife() + " de vitalité, "
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
