import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorUnitTest {

    static String s1 = "password";
    //static String s2 = "qaz123Q123";

    static Validator validator;

    @BeforeClass
    public static void init(){
       // validator = new Validator();

    }

    @Test
    public void passRule1(){
        assertEquals(2, Validator.validatePassword(s1));
    }
    
}
