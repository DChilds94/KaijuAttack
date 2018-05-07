import army.Sub;
import army.Tank;
import monster.Kraken;
import monster.RubberDuck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KrakenTest {

    Kraken kraken;
    Sub sub;
    Tank tank;

    @Before
    public void before(){
        kraken = new Kraken("Kranen", 100, 10);
        sub = new Sub("Sub", 10, 1);
        tank = new Tank("Tank", 100, 2);
    }
    @Test
    public void canRoar(){
        assertEquals("Huba Huba", kraken.roar("Huba Huba"));
    }
    @Test
    public void canDive() { assertEquals("Dive", kraken.move("Dive"));}
    @Test
    public void canAttackSub(){
        kraken.attack(sub);
        assertEquals(0, sub.getHealthValue());
    } @Test
    public void canAttackTank(){
        kraken.attack(tank);
        assertEquals(90, tank.getHealthValue());
    }
    @Test
    public void canTakeDamageFromSub() {
        sub.attack(kraken);
        assertEquals(99, kraken.getHealthValue());
    }@Test
    public void canTakeDamageFromTank() {
        tank.attack(kraken);
        assertEquals(98, kraken.getHealthValue());
    }
    @Test
    public void canDie(){
        assertEquals("I gotta bounce, see yars afffter!", kraken.die("I gotta bounce, see yars afffter!"));
    }
    @Test
    public void canBeDefeatedBySub(){
        kraken = new Kraken("Late kraken", 1, 15);
        sub.attack(kraken);
        assertEquals(0, kraken.getHealthValue());
        assertEquals("I gotta bounce, see yar afffter!", kraken.die("I gotta bounce, see yar afffter!"));
    }@Test
    public void canBeDefeatedByTank(){
        kraken = new Kraken("Late kraken", 1, 15);
        tank.attack(kraken);
        assertEquals(-1, kraken.getHealthValue());
        assertEquals("I gotta bounce, see yar afffter!", kraken.die("I gotta bounce, see yar afffter!"));
    }






}
