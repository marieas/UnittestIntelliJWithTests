import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTester {
    @Test
    public void testSum(){
        int expectedSum = 2;
        var mathClass = new MathClass();
        int actual = mathClass.Sum(1,1);
        assertEquals(expectedSum,actual);
    }

    @Test
    public void testDouble(){
        int expectedSum = 8;
        var mathClass = new MathClass();
        int actual = mathClass.Double(4);
        assertEquals(expectedSum,actual);
    }
}
