
package monster;

import army.Vehicle;

public class Kraken extends Kaiju implements Roarable {

    private String name;
    private int healthValue = 100;
    private int attackPower;

    public Kraken(String name, int healthValue, int attackPower){
        super(name, healthValue, attackPower);
    }
    public String roar(String roar){
        return roar;
    }

    public void attack(Vehicle vehicle){
        vehicle.setHealthValue(vehicle.getHealthValue() -  getAttackPower());
    }

}
