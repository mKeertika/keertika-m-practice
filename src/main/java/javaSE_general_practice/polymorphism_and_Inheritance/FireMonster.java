package javaSE_general_practice.polymorphism_and_Inheritance;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return name+" attacks with Fire";
    }
}
