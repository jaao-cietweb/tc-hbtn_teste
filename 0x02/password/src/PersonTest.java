import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

public class PersonTest extends Person {

    static Person pessoa = new Person();
    List<String> strings = new ArrayList<>();
    @BeforeAll
    public static void setup(){
        pessoa.setUser("Paul McCartney");
        pessoa.setPassword("Senha@1");
    }

    @ParameterizedTest(name = "O número cliente {0} é valido?")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid (String valor){
        pessoa.setUser(valor);
        Assertions.assertTrue(pessoa.checkUser());
    }

    @ParameterizedTest(name = "O nome do cliente {0} é invalido?")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid (String valor){
        pessoa.setUser(valor);
        Assertions.assertFalse(pessoa.checkUser());
    }

    @ParameterizedTest(name = "A senha {0} não contém letras?")
    @ValueSource(strings = {"123456789" , "#$%1234"})
    public void does_not_have_letters (String valor){
        pessoa.setPassword(valor);
        Assertions.assertFalse(pessoa.checkPassword());
    }

    @ParameterizedTest(name = "O número {0} é primo?")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers (String valor){
        pessoa.setPassword(valor);
        Assertions.assertFalse(pessoa.checkPassword());
    }

    @ParameterizedTest(name = "A senha {0} contém 8 caracteres?")
    @ValueSource(strings = {"Abc@123", "12$@hb"})
    public void does_not_have_eight_chars(String valor){
        pessoa.setPassword(valor);
        Assertions.assertFalse(pessoa.checkPassword());
    }

    @ParameterizedTest(name = "A senha {0} é valida?")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String valor){
        pessoa.setPassword(valor);
        Assertions.assertTrue(pessoa.checkPassword());
    }
}
