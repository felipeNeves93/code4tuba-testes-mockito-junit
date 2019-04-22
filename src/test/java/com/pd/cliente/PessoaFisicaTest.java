package com.pd.cliente;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PessoaFisicaTest {

    @Test
    public void testGetNomeCompleto(){
        final String NOME_FINAL_ESPERADO = "Felipe Neves";

        PessoaFisica pessoa = PessoaFisica.builder()
                .nome("Felipe")
                .sobrenome("Neves")
                .build();

        Assert.assertEquals(NOME_FINAL_ESPERADO, pessoa.getNomeCompleto());
    }
}
