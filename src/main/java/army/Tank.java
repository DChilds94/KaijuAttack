package army;

import monster.Kaiju;

public class Tank extends Vehicle {

    private String type;
    private int healthValue;
    private int attackPower;

    Tank tank;

    public Tank(String type, int healthValue, int attackPower) {
        super(type, healthValue, attackPower);
    }
    public void attack (Kaiju kaiju) {
        kaiju.setHealthValue(kaiju.getHealthValue() - getAttackPower());
    }
}
