package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		int life, attack, armor;
		
		Champion fighterA, fighterB;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida Inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		fighterA = new Champion(name,life,attack,armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.next();
		System.out.print("Vida Inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		fighterB = new Champion(name,life,attack,armor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		
	
		for (int i = 1; i <= rounds; i++) {
			if (fighterA.getLife() > 0 && fighterB.getLife() > 0) {
				fighterA.champion(fighterA.getName(), fighterA.getLife(), fighterB.getAttack(), fighterA.getArmor());
				fighterB.takeDamage(fighterB.getName(), fighterB.getLife(), fighterA.getAttack(), fighterB.getArmor());
				
				System.out.println();
				System.out.printf("Resultado do turno %d:\n", i);
				System.out.println(fighterA);
				System.out.println(fighterB);
			}
		}
		System.out.println();
		System.out.println("FIM DO COMBATE");
	
		sc.close();

	}

}
