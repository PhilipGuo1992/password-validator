import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorUnitTest {

    static String s1 = "password";
    static String s2 = "qaz123Q123";

    static Validator validator;

    @BeforeClass
    public static void init(){
       // validator = new Validator();

    }

    @Test
    public void passRule1(){
        assertEquals(2, Validator.validatePassword(s1));
    }
    @Test
    public void passRules2(){
        assertEquals(5, Validator.validatePassword(s2));
    }
    @Test
    public void passRules3(){
        assertEquals(4, Validator.validatePassword("fhry22345"));
    }
    @Test
    public void passRules4(){
        assertEquals(3, Validator.validatePassword("9028f3345"));
    }
    
}
