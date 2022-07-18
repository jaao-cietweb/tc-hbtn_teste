import org.junit.jupiter.api.Test;

public class TesteEmail extends Pessoa {

    @Test
    public static boolean testar_email_com_arroba (){
        return emailValid("email_teste@dominio.com.br");
    }

    @Test
    public static boolean testar_email_sem_arroba () {
        return emailValid("email_testedominio.com.br");
    }

    @Test
    public static boolean testar_email_mais_50_caracteres () {
        return emailValid("email_teste_muito_longo_nao_deve_ser_valido@dominio.com.br");
    }
}
