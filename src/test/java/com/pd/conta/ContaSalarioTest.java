package com.pd.conta;


import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContaSalarioTest {


    //Testando o mmetodo privado na classe abstrata
    @Test
    public void podeTransFerir() throws Exception {

        ContaSalario salario = ContaSalario.builder()
                .taxaTransferencia(10.0)
                .valorAtual(0.0)
                .build();

        // chamando o metodo privato
        Boolean podeTransferir = Whitebox.invokeMethod(salario, "podeTransferir", 10.0);
        assertFalse(podeTransferir);

        salario.setValorAtual(25.0);
        podeTransferir = Whitebox.invokeMethod(salario, "podeTransferir", 10.0);
        assertTrue(podeTransferir);
    }

}
