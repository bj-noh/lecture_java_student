package assignment07_04;

public class GameCharacterTest {
    public static void main(String[] args) {
    	
    	/*
    	 * 본 프로그램은 기본 게임 캐릭터(base character)와 일부 직업(전사(warrior), 마법사(mage))에 대해 구현하고,
    	 * 두 캐릭터가 배틀을 하는 상황을 구현한 프로그램이다.
    	 * 
    	 * 본 프로그램은 다음과 같은 구조의 클래스/인터페이스 상속관계를 갖도록 구성된다.
    	 *  
    	 * GameCharacter (interface) <- implements <- BaseCharacter
    	 * BaseCharacter <- extends <- Warrior
    	 * BaseCharacter <- extends <- Mage
    	 * 
    	 * 다음과 같은 결과가 나타나도록 BaseCharacter, Warior, Mage 클래스 내 메소드를 완성하여라. 각 클래스의 설명은 각 클래스 파일을 참조하라.
    	 * 
    	 * 결과 예시) 
    	 * 	Warrior: Conan, Health: 100, Attack: 20, Defense: 10
			Mage: Gandalf, Health: 80, Attack: 10, Defense: 5, Mana: 50
			Battle Start!!
			Conan attacks Gandalf for 20 damage!
			==> Gandalf (Health: 65), Conan (Health: 100)
			Gandalf attacks Conan for 60 damage!
			==> Conan (Health: 50), Gandalf (Health: 65)
			Gandalf casts a spell on Conan!
			==> Conan (Health: 20), Gandalf (Health: 65)
			Conan attacks Gandalf for 20 damage!
			==> Gandalf (Health: 50), Conan (Health: 20)
			Gandalf casts a spell on Conan!
			==> Conan (Health: 0), Gandalf (Health: 50)
			Warrior after battle: Conan, Health: 0
			Mage after battle: Gandalf, Health: 50, Mana: 20

    	 */
    	
    	
        Warrior warrior = new Warrior("Conan", 100, 20, 10);
        Mage mage = new Mage("Gandalf", 80, 10, 5, 50);
        
        System.out.println("Warrior: " + warrior.getName() + ", Health: " + warrior.getHealth() +
                ", Attack: " + warrior.getAttack() + ", Defense: " + warrior.getDefense());
        System.out.println("Mage: " + mage.getName() + ", Health: " + mage.getHealth() + ", Attack: " + mage.getAttack() + ", Defense: " + mage.getDefense() + ", Mana: " + mage.getMana());
        
        System.out.println("Battle Start!!");
       
        warrior.attack(mage);
        mage.attack(warrior);
        mage.castSpell(warrior);
        warrior.attack(mage);
        mage.restoreMana(20);
        mage.castSpell(warrior);
        
        System.out.println("Warrior after battle: " + warrior.getName() + ", Health: " + warrior.getHealth());
        System.out.println("Mage after battle: " + mage.getName() + ", Health: " + mage.getHealth() + ", Mana: " + mage.getMana());
    }
}
