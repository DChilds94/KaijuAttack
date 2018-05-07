package monster;

import army.Vehicle;

public abstract class Kaiju {

    String name;
    int healthValue;
    int attackPower;

    public Kaiju(String name, int healthValue, int attackPower){
        this.name = name;
        this.healthValue = healthValue;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackPower() {
        return attackPower;
    }
    public String move(String movement){
        return movement;
    }



}
