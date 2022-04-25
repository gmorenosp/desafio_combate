package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	private int round;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public Champion(int round) {
		this.round = round;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	
	
 	
	public void champion(String name, int life, int damage, int armor) {
		if (armor < damage) {
			this.life = life + armor - damage;
		}
		else {
			this.life = life - 1;
		}
	}
	
	public void takeDamage(String name, int life, int damage, int armor) {
		if (armor < damage) {
			this.life = life + armor - damage;
		}
		else {
			this.life = life - 1;
		}
	}
	
	public String status() {
		if (life <= 0) {
			life = 0;
			return String.format("%d", life) + " (morreu)";
		}
		return String.format("%d", life) + " de vida";
	}
	
	public String toString() {
		return  name
			   + ": "
			   + status();
	}

}
