import army.Sub;
import army.Tank;
import monster.Kraken;
import monster.RubberDuck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubTest {

    Sub sub;
    Tank tank;
    RubberDuck rubberDuck;
    Kraken kraken;

    @Before
    public void before(){
        sub = new Sub("Sub", 100, 1);
        rubberDuck = new RubberDuck("RubberDuck", 100, 10);
        kraken = new Kraken("Kraken", 100, 5);
    }
    @Test
    public void canGetHealth(){
        sub.setHealthValue(90);
        assertEquals(90, sub.getHealthValue());
    }
    @Test
    public void canTakeDamageFromRubberDuck(){
        rubberDuck.attack(sub);
        assertEquals(90, sub.getHealthValue());
    }@Test
    public void canTakeDamageFromKraken(){
        kraken.attack(sub);
        assertEquals(95, sub.getHealthValue());
    }
    @Test
    public void canAttackRubberDuck(){
        sub.attack(rubberDuck);
        assertEquals(99, rubberDuck.getHealthValue());
    }
    @Test
    public void canAttackKraken(){
        sub.attack(kraken);
        assertEquals(99, kraken.getHealthValue());
    }
    @Test
    public void canDie() {
        assertEquals("Boom!", sub.die("Boom!"));
    }
    @Test
    public void canBeDestroyedByRubberDuck(){
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        rubberDuck.attack(sub);
        assertEquals("Boom!", sub.die("Boom!"));
        assertEquals(0, sub.getHealthValue());
    }

}
