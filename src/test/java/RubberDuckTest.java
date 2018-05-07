import army.Sub;
import army.Tank;
import monster.RubberDuck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RubberDuckTest {

    RubberDuck rubberDuck;
    Sub sub;
    Tank tank;

    @Before
    public void before() {
        rubberDuck = new RubberDuck("Rubberduck", 100, 15);
        sub = new Sub("sub", 100, 1);
        tank = new Tank("tank", 100, 2);

    }

    @Test
    public void canRoar() {
        assertEquals("Quack", rubberDuck.roar("Quack"));
    }

    @Test
    public void canFly() {
        assertEquals("Fly", rubberDuck.move("Fly"));
    }
    @Test
    public void canGetHealthValue(){
        assertEquals(100, rubberDuck.getHealthValue());
    }

    @Test
    public void canAttackSub() {
        rubberDuck.attack(sub);
        assertEquals(85, sub.getHealthValue());
    }

    @Test
    public void canAttackTank() {
        rubberDuck.attack(tank);
        assertEquals(85, tank.getHealthValue());
    }

    @Test
    public void canTakeDamageFromSub() {
        sub.attack(rubberDuck);
        assertEquals(99, rubberDuck.getHealthValue());
    }@Test
    public void canTakeDamageFromTank() {
        tank.attack(rubberDuck);
        assertEquals(98, rubberDuck.getHealthValue());
    }
    @Test
    public void canDie(){
        assertEquals("Final Quack", rubberDuck.die("Final Quack"));
    }
    @Test
    public void canBeDefeatedBySub(){
        rubberDuck = new RubberDuck("Dead Duck", 1, 15);
        sub.attack(rubberDuck);
        assertEquals(0, rubberDuck.getHealthValue());
        assertEquals("Final Quack", rubberDuck.die("Final Quack"));
    }@Test
    public void canBeDefeatedByTank(){
        rubberDuck = new RubberDuck("Dead Duck", 1, 15);
        tank.attack(rubberDuck);
        assertEquals(-1, rubberDuck.getHealthValue());
        assertEquals("Final Quack", rubberDuck.die("Final Quack"));
    }
}

