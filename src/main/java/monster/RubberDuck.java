package monster;

import army.Vehicle;

public class RubberDuck extends Kaiju implements Attackable {

    private String name;
    private int healthValue = 100;
    private int attackPower;

    public RubberDuck(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    public String roar(String roar){
        return roar;
    }
    public void attack(Vehicle vehicle){
        vehicle.setHealthValue(vehicle.getHealthValue() -  getAttackPower());
    }
}
