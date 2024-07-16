package one.digitalinnovation;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Eduardo", LocalDate.of(2019, 02,20));
        Assertions.assertEquals( 5, pessoa.getIdade());
    }
}
