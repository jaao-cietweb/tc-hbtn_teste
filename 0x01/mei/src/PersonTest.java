import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PersonTest {

    static Person pessoa = new Person();
    @BeforeAll
    public static void setup(){
        pessoa.setName("Paul");
        pessoa.setSurname("McCartney");
        pessoa.setBirthDate(new Date(2000));
        pessoa.setAnotherCompanyOwner(true);
        pessoa.setPensioner(true);
        pessoa.setPublicServer(true);
    }

    @Test
    public void show_full_name(){
        Assertions.assertEquals("Paul McCartney", pessoa.fullName());
    }

    @Test
    public void test_calculateYearlySalary(){
        pessoa.setSalary(1200);
        Assertions.assertEquals(pessoa.calculateYearlySalary(), 14400);
    }

    @Test
    public void person_is_MEI (){
        pessoa.setSalary(10000);
        pessoa.setAnotherCompanyOwner(false);
        pessoa.setPensioner(false);
        pessoa.setPublicServer(false);
        Assertions.assertTrue(pessoa.isMEI());
    }

    @Test
    public void person_is_not_MEI(){
        Assertions.assertFalse(pessoa.isMEI());
    }
}
