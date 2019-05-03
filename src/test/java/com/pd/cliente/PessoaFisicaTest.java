package com.pd.cliente;

import com.pd.base.exception.CampoObrigatorioException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PessoaFisicaTest {

    @Test
    public void testGetNomeCompleto() {
        final var NOME_FINAL_ESPERADO = "Felipe Neves";

        var pessoa = PessoaFisica.builder()
                .nome("Felipe")
                .sobrenome("Neves")
                .build();

        assertEquals(NOME_FINAL_ESPERADO, pessoa.getNomeCompleto());
    }

    @Test(expected = CampoObrigatorioException.class)
    public void testGetNomeCompletoNomeESobreNomeNulo() {
        var pessoa = PessoaFisica.builder().build();

        var nomeCompleto = pessoa.getNomeCompleto();
    }

    @Test(expected = CampoObrigatorioException.class)
    public void testExceptionEmIsNomeCompleto() throws Exception {
        var pessoa = PessoaFisica.builder().build();

        var nomeCompleto = pessoa.getNomeCompleto();
        Boolean isNomeCompleto = Whitebox.invokeMethod(pessoa, "isNomeCompleto");
        assertFalse(isNomeCompleto);
    }

    @Test
    public void testIsNomeCompleto() throws Exception {
        var pessoa = PessoaFisica.builder()
                .nome("Felipe")
                .sobrenome("Neves")
                .build();

        Boolean isNomeCompleto = Whitebox.invokeMethod(pessoa, "isNomeCompleto");
        assertTrue(isNomeCompleto);
    }
}
