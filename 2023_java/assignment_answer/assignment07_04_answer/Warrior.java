package assignment07_04_answer;

public class Warrior extends BaseCharacter {
	
    public Warrior(String name, int health, int attack, int defense) {
    	/*
    	 * Warrior 생성자 구현 부분
    	 */
        super(name, health, attack, defense);
    }
    
    public void attack(GameCharacter target) {
    	/*
    	 *  Warrior의 공격(attack) 메소드 구현 부분
    	 *  Warrior의 공격력은 기본 공격력(attack)과 같다.  
    	 */
    	
        int damage = attack;
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");
        target.defend(damage);
        System.out.println("==> " + target.getName() + " (Health: " + target.getHealth() + "), " + this.getName() + " (Health: " + this.getHealth() + ")");
    }
}

