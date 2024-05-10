package terra_or;

public class Character extends GameElement<Character> {
    private int level;
    private int healthPoints;
    private int manaPoints;
    private String weapon;
    private String armor;

    public Character(String name, int level, int healthPoints, int manaPoints, String weapon, String armor) {
        super(name, null);
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }
}