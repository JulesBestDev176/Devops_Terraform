package groupeisi;

import com.groupeisi.Factoriel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorielTest {
    @Test
    public void calculateFactorial0() {
        Factoriel factoriel = new Factoriel();
        assertEquals(1, factoriel.calculate(0));
    }
    @Test
    public void calculateFactorial1() {
        Factoriel factoriel = new Factoriel();
        assertEquals(1, factoriel.calculate(1));
    }

    @Test
    public void calculateFactorialPositive() {
        Factoriel factoriel = new Factoriel();
        assertEquals(120, factoriel.calculate(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateFactorialNegative() {
        Factoriel factoriel = new Factoriel();
        factoriel.calculate(-5);
    }


}
