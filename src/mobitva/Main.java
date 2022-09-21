package mobitva;

public class Main {
    public static void main(String[] args) {

        Magic magic = new Magic(400,30,"magical");
        Warrior warrior = new Warrior(450,40,"berserk");
        Medic medic = new Medic(350,12,"health");
        Hero[] heroes = { magic,warrior,medic};
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Medic) {
                System.out.println(medic.increaseExperience());
            }
            heroes[i].applySuperAbility();
        }
    }
}