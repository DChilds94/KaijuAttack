package army;

import monster.Kaiju;

public abstract class Vehicle {

    private String type;
    private int healthValue;
    private int attackPower;

    public Vehicle(String type, int healthValue, int attackPower) {
        this.type = type;
        this.healthValue = healthValue;
        this.attackPower = attackPower;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }


}


