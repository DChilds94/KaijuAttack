import army.Sub;
import army.Tank;
import monster.Kraken;
import monster.RubberDuck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    RubberDuck rubberDuck;
    Kraken kraken;

    @Before
    public void before(){
        tank = new Tank("Tank", 100, 2);
        rubberDuck = new RubberDuck("RubberDuck", 100, 10);
        kraken = new Kraken("Kraken", 100, 5);
    }
    @Test
    public void canGetHealth(){
        tank.setHealthValue(90);
        assertEquals(90, tank.getHealthValue());
    }
    @Test
    public void canTakeDamageFromRubberDuck(){
        rubberDuck.attack(tank);
        assertEquals(90, tank.getHealthValue());
    }
    @Test
    public void canAttackRubberDuck(){
        tank.attack(rubberDuck);
        assertEquals(98, rubberDuck.getHealthValue() );
    } @Test
    public void canAttackKraken(){
        tank.attack(kraken);
        tank.attack(kraken);
        tank.attack(kraken);
        tank.attack(kraken);
        tank.attack(kraken);
        assertEquals(90, kraken.getHealthValue() );
    }

}

