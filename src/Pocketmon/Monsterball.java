package Pocketmon;

import java.util.HashSet;

public class Monsterball {

	private String name;
	private int str;
	private int dex;
	private int intel;
	private int luk;
	private String type;
	private HashSet<String> skill = new HashSet<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}
	public int getLuk() {
		return luk;
	}
	public void setLuk(int luk) {
		this.luk = luk;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HashSet<String> getSkill() {
		return skill;
	}
	public void setSkill(HashSet<String> skill) {
		this.skill = skill;
	}
	
	@Override
	public String toString() {
		return "Monsterball [name=" + name + ", str=" + str + ", dex=" + dex + ", intel=" + intel + ", luk=" + luk
				+ ", type=" + type + ", skill=" + skill + "]";
	}
	
	public Monsterball(String name, int str, int dex, int intel, int luk, String type) {
		super();
		this.name = name;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.luk = luk;
		this.type = type;
		
		String[] tmp = {"몸통박치기", "단단해지기", "짓밟기"};
		int rdm1 = (int)(Math.random()*3);
		
		for (int i = 0; i <= rdm1; i++) {
			int rdm2 = (int)(Math.random()*3);
			this.skill.add(tmp[rdm2]);
		}
	}
	
}
