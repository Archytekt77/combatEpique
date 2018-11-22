package characters;

public class Warrior implements Characters{
	
	private Statistique statistique;
	
	
	public Warrior() {
		statistique = new Statistique();
	}
	
	String cry = "Woarg";
	

	@Override
	public int basicAttack(String str, String str2) {
		System.out.println(str + " utilise Coup d'épée et inflige " + statistique.getForce() + " dommages");
		System.out.println(str2 + " perds " + statistique.getForce() + " points de vie");
		return statistique.getForce();
	}
	
	@Override
	public int specialAttack(String str, String str2) {
		System.out.println(str + " utilise Coup de Rage et inflige "  + statistique.getForce()*2 + " dommages");
		System.out.println(str2 + " perds " + statistique.getForce()*2 + " points de vie");
		System.out.println(str + " perds " + statistique.getForce()/2 + " points de vie");
		return statistique.getForce()*2;
	}

	@Override
	public void description(String str) {
		System.out.println(cry + " je suis le Warrior " + str + " niveau " + statistique.getLvl() + " je possède " + statistique.getLife() + " de vitalité, " 
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
