package characters;

public class Wizard implements Characters {
	
	private Statistique statistique;
	
	
	public Wizard() {
		statistique = new Statistique();
	}
	
	String cry = "Abracadabra";


	@Override
	public void basicAttack() {
		System.out.println(" utilise Boule de Feu et inflige " + statistique.getIntelligence() + " dommages");

	}

	@Override
	public void specialAttack() {
		System.out.println(" utilise Soin et gagne " + statistique.getIntelligence()*2 + " en vitalité.");

	}

	@Override
	public void description() {
		System.out.println(
				cry + " je suis le Mage niveau " + statistique.getLvl() + " je possède " + statistique.getLife() + " de vitalité, "
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
