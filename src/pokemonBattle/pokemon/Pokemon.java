package pokemonBattle.pokemon;

import java.util.ArrayList;

import pokemonBattle.skill.BodySlam;
import pokemonBattle.skill.Skill;

public class Pokemon {

	String name;
	int hp;
	int mp;
	boolean alive = true;
	int lvl =1;
	int exp;
	ArrayList<Skill> sklList = new ArrayList<>();
	
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Pokemon() {
		super();
		sklList.add(new BodySlam());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public ArrayList<Skill> getSklList() {
		return sklList;
	}

	public void setSklList(ArrayList<Skill> sklList) {
		this.sklList = sklList;
	}
	
	public boolean damage(int dmg) {
		this.hp -= dmg;
		if(this.hp < 0) {
			this.alive = false;
			return false;
		}
		return true;
	}
	
}
