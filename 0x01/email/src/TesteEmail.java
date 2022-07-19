import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TesteEmail extends Pessoa{

    @Test
    public void testar_email_com_arroba(){
        Assert.assertTrue(emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba(){
        Assert.assertFalse(emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres(){
        Assert.assertFalse(emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
}
