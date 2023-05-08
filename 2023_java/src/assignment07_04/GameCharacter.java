package assignment07_04;

public interface GameCharacter {
    public String getName();
    public int getHealth();
    public void setHealth(int health);
    public int getAttack();
    public void setAttack(int attack);
    public int getDefense();
    public void setDefense(int defense);
    public void attack(GameCharacter target);
    public void defend(int damage);

}
