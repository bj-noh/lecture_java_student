package assignment07_04_answer;

public abstract class BaseCharacter implements GameCharacter {
    protected String name; // 캐릭터의 이름
    protected int health; // 체력
    protected int attack; // 공격력
    protected int defense; // 방어력
    
    public BaseCharacter(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    public void defend(int damage) {
    	
    	int actualDamage = Math.max(0, damage - defense);
        health = Math.max(0, health - actualDamage);
        
        
    }
}
