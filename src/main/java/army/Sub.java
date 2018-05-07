package army;

import monster.Kaiju;


public class Sub extends Vehicle implements VehicleAttackable {

    private String type;
    private int healthValue;
    private int attackPower;

    public Sub(String type, int healthValue, int attackPower) {
        super(type, healthValue, attackPower);

    }
    public void attack (Kaiju kaiju) {
        kaiju.setHealthValue(kaiju.getHealthValue() - getAttackPower());
    }

}
