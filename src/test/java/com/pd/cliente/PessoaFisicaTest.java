package com.pd.cliente;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PessoaFisicaTest {

    @Test
    public void testIsNomeCompletoFalse() throws Exception {
        var pessoa = PessoaFisica.builder().build();

        //usando o powermock para chamar a execução do método pridado
        Boolean isNomeCompleto = Whitebox.invokeMethod(pessoa, "isNomeCompleto");
        assertFalse(isNomeCompleto);
    }

    @Test
    public void testIsNomeCompletoTrue() throws Exception {
        var pessoa = PessoaFisica.builder()
                .nome("Felipe")
                .sobrenome("Neves")
                .build();

        Boolean isNomeCompleto = Whitebox.invokeMethod(pessoa, "isNomeCompleto");
        assertTrue(isNomeCompleto);
    }
}
