package pack;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Warrior w = new Warrior("Warrior", 100,100,
                new Armor(100, 100), new Sword("Sword", 100, 100));
        Warrior ww = w.clone();
        ww.getSword().setAttack(50);
        System.out.println(w);
        System.out.println("\n\n");
        System.out.println(ww);

    }
}
