package characters;

public class Statistique {
	
	private int lvl;
	private int life;
	private int force;
	private int agility;
	private int intelligence;
	
	public Statistique() {
		lvl = 0;
		life = 0;
		force = 0;
		agility = 0;
		intelligence = 0;
	}
	
	public Statistique(int lvl, int force, int agility, int intelligence) {
		this.lvl = lvl;
		this.life = this.lvl * 5;
		this.force = force;
		this.agility = agility;
		this.intelligence = intelligence;
	}
	

	/**
	 * @return the lvl
	 */
	public int getLvl() {
		return lvl;
	}
	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}
	/**
	 * @return the force
	 */
	public int getForce() {
		return force;
	}
	/**
	 * @return the agility
	 */
	public int getAgility() {
		return agility;
	}
	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param lvl the lvl to set
	 */
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}
	/**
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}
	/**
	 * @param agility the agility to set
	 */
	public void setAgility(int agility) {
		this.agility = agility;
	}
	/**
	 * @param intelligence
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	

}
