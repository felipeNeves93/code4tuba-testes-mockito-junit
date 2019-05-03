package com.pd.cliente;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.doAnswer;

@RunWith(MockitoJUnitRunner.class)
public class PessoaJuridicaTest {

    @Spy
    private PessoaJuridica pessoaJuridica;

    @Test
    public void testAdicionarCapital() {
        pessoaJuridica.setCapital(100.0);

        doAnswer((Answer) invocation -> {
            Object[] parametros = invocation.getArguments();
            Assert.assertTrue((double) parametros[0] > 10.0);
            invocation.callRealMethod();

            Assert.assertTrue(pessoaJuridica.getCapital().equals(200.0));
            
            return null;
        }).when(pessoaJuridica).adicionarCapital(100.0);

        pessoaJuridica.adicionarCapital(100.0);
    }
}
