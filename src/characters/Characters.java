package characters;


public interface Characters {
	
	public void setStatistique(Statistique s);
	
	public Statistique getStatistique();
	
	int basicAttack(String str, String str2);
	
	int specialAttack(String str, String str2);
	
	void description(String str);
}
