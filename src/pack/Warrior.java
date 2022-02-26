package pack;

public class Warrior implements Cloneable{
    private String Name;
    private int health;
    private int attack;
    private Armor armor;
    private Sword sword;

    public Warrior(String name, int health, int attack, Armor armor, Sword sword) {
        Name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
        this.sword = sword;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "Name='" + Name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                ", sword=" + sword +
                '}';
    }

    @Override
    protected Warrior clone() throws CloneNotSupportedException {
        Warrior w = (Warrior) super.clone();
        w.sword = sword.clone();
        w.armor = armor.clone();
        return w;
    }
}
