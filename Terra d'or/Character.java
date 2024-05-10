package Adventuregame;

public class Character extends GameElement<Character> {
    private int level;
    private int healthPoints;
    private int manaPoints;
    private String weapon;
    private String armor;

    public Character(String name, int level, int healthPoints, int manaPoints, Strin weapon, String armor) {
        super(name, null);
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.weapon = weapon;
        this.armor = armor;
    }

    
}