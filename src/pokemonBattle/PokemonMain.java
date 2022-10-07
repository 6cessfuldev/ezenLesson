package pokemonBattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat.Field;

import pokemonBattle.pokemon.Bulbasaur;
import pokemonBattle.pokemon.Charmander;
import pokemonBattle.pokemon.Pokemon;
import pokemonBattle.pokemon.Squirtle;
import pokemonBattle.skill.Skill;

public class PokemonMain {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PokemonManager pm = new PokemonManager();
	static Pokemon fightPokemon = new Pokemon();
	static Pokemon fieldMon = new Pokemon();
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		
		System.out.println("---게임 시작---");
		System.out.println("본인의 이름을 무엇인가요");
		String trainerName = br.readLine();
		
		System.out.println("어떤 포켓몬으로 시작하시겠습니까?");
		System.out.println("1. 이상해씨 2. 파이리 3. 꼬부기");
		int choice = Integer.parseInt(br.readLine());
		
		do {
			switch (choice) {
			case 1 : 
				Pokemon bulbasaur = new Bulbasaur();
				pm.setTrainer(new Trainer(trainerName, bulbasaur) );
				break;
			case 2 : 
				Pokemon charmander = new Charmander();
				pm.setTrainer(new Trainer(trainerName, charmander) );
				break;
			case 3 : 
				Pokemon squirtle = new Squirtle();
				pm.setTrainer(new Trainer(trainerName, squirtle) );
				break;			
				
				default : 
					System.out.println("잘못된 입력입니다.");
			}
		} while(choice !=1&&choice !=2&&choice !=3);
		
		do {
			System.out.println("어디로 가시겠습니까?");
			System.out.println("1. 야생 들판");
			System.out.println("2. 포켓몬 병원");
			System.out.println("3. 상점");
			choice = Integer.parseInt(br.readLine());
			
			switch (choice){
				case 1 :
					field(); break;
				case 2 :
					hospital(); break;
				case 3 :
					store(); break;
					
			}
			
		} while(true);
		
	}
	
	public static void field() throws NumberFormatException, IOException {
		
		System.out.println("들판으로 나왔습니다.......");
		fieldMon = pm.randomPokemon();
		System.out.println("!!!!야생의 " + fieldMon.getName()+ " 나타났다!!!!");
		System.out.println("어떤 포켓몬을 꺼내시겠습니까?");
		
		Pokemon[] arr = pm.getTrainer().getPokemonArr();
		
		int choice = 0;
		do {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == null) continue;
				System.out.println((i+1) + " " + arr[i].getName());
			}
			
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: fightPokemon = arr[0]; break;
			case 2: fightPokemon = arr[1]; break;
			case 3: fightPokemon = arr[2]; break;
			case 4: fightPokemon = arr[3]; break;
			case 5: fightPokemon = arr[4]; break;
			case 6: fightPokemon = arr[5]; break;
				default : System.out.println("잘못된 입력입니다.");
			}
		} while(choice < 1 || choice >5);
		System.out.println("가랏! "+ fightPokemon.getName()+"!!!" );
		
		choice = 0;
		do {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 포켓몬 기술");
			System.out.println("2. 포켓몬 바꾸기");
			System.out.println("3. 도구 이용하기");
			System.out.println("4. 도망치기");
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: 
				boolean victory = activateSkill(); 
				if(victory)	return;
				break;
			case 2: 
				changePokemon(); 
				break;
			case 3: 
				useTool(); 
				break;
			case 4: 
				System.out.println(pm.getTrainer().getName()+"은 도망쳤다."); return;
				default : System.out.println("잘못된 입력입니다.");
			}
		} while(choice < 1 || choice >3);
		
	}
	
	public static boolean activateSkill() throws NumberFormatException, IOException {
		
		int choice = 0;
		while(true) {
			System.out.println("어떤 기술을 사용하시겠습니까?");
			int i = 1;
			for ( Skill skill : fightPokemon.getSklList()) {
				System.out.println(i++ + " : "+ skill.getName());
			}
			choice = Integer.parseInt(br.readLine());
			if(choice > fightPokemon.getSklList().size()) {
				System.out.println("잘못된 입력입니다.");
				continue;
			} else {
				int dmg = fightPokemon.getSklList().get(choice-1).getDmg();
				if(fieldMon.damage(dmg)) {
					System.out.println("데미지를 " + dmg+"만큼 주었습니다.");
					int emenyDmg = fieldMon.getSklList().get((int)Math.random()*fieldMon.getSklList().size()).getDmg();
					fightPokemon.damage(emenyDmg));
					if(fightPokemon.)
					
				} else {
					System.out.println("상대 "+fieldMon.getName()+"이 기절했습니다. 승리!");
					System.out.println("경험치를 10 얻었습니다.");
					fightPokemon.setExp(fightPokemon.getExp()+10);
					return true;
				}
			}
		}		
	}
	
	public static void changePokemon() {
		
	}
	
	public static void useTool() {
		
	}
	
	public static void hospital() {
		
	}
	
	public static void store() {
		
	}

}
