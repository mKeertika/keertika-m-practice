package javaSE_general_practice.polymorphism_and_Inheritance;

public class WaterMonster extends Monster {


    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return name+ " attacks with water. ";
    }
}
