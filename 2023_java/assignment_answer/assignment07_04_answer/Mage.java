package assignment07_04_answer;

public class Mage extends BaseCharacter {
    private int mana;
    private int maxMana;
    
    public Mage(String name, int health, int attack, int defense, int maxMana) {
    	/*
    	 * Mage 생성자 구현 부분
    	 */
        super(name, health, attack, defense);
        this.mana = maxMana;
        this.maxMana = maxMana;
    }
    
    public void attack(GameCharacter target) {
    	/*
    	 *  Mage의 공격(attack) 메소드 구현 부분
    	 *  Mage의 공격력은 기본 공격력(attack)과 마나 공격력(mana)을 합쳐서 공격하고, 마나를 10만큼 소모함. 
    	 *  만약 남은 마나가 없으면 기본 공격력만으로 공격함.
    	 *  예) 기본 공격력: 5, 남은 마나: 20 -> 공격력: 25, 남은 마나: 10  
    	 */
    	
        int damage = attack + mana;
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage!");
        target.defend(damage);

        System.out.println("==> " + target.getName() + " (Health: " + target.getHealth() + "), " + this.getName() + " (Health: " + this.getHealth() + ")");
        mana = Math.max(0, mana - 10);
    }

    public int getMana() {
        return mana;
    }
    
    public void castSpell(GameCharacter target) {
    	/*
    	 * Mage 스킬 공격 (castSpell) 메소드 구현 부분
    	 * 
    	 * Mage는 기본 공격외에 마나를 소비하여 스킬 공격을 할 수 있다.
    	 * 스킬 공격 시 마나 20을 소모하며, 20만큼의 데미지를 입힌다.
    	 * 마나가 20이하인 경우 스킬을 사용하지 않고 다음 턴으로 넘어간다.
    	 * 
    	 */
        if (mana >= 20) {
            System.out.println(name + " casts a spell on " + target.getName() + "!");
            int damage = mana;
            target.defend(damage);
            mana = Math.max(0, mana - 20);
            System.out.println("==> " + target.getName() + " (Health: " + target.getHealth() + "), " + this.getName() + " (Health: " + this.getHealth() + ")");
            
        } else {
            System.out.println(name + " does not have enough mana to cast a spell!");
            System.out.println("==> " + target.getName() + " (Health: " + target.getHealth() + "), " + this.getName() + " (Health: " + this.getHealth() + ")");
        }
    }
    
    public void restoreMana(int amount) {
    	/*
    	 * 마나 회복 메소드 구현 부분
    	 * amount에서 받은 값 만큼 마나를 회복한다.
    	 */
        mana = Math.min(maxMana, mana + amount);
    }
    
}