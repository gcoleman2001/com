import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesterTest {
    Tester test = new Tester();

    @Test
    public void testAddition_A(){
        int c = test.multiple(1,2);
        assertEquals(3,c);
    }
    @Test
    public void testAddition_B(){
        int c = test.multiple(5,5);
        assertEquals(10,c);
    }
}
