package polymorphism_and_Inheritance;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack() {
        return name +" attacks with Stones.";
    }
}
