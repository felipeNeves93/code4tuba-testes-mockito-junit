package com.pd.conta;

import com.pd.base.exception.OperacaoNaoPermitidaException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ContaPoupancaTest {

    // Nesse teste, estamos esperando que ocorra uma exceção de operação não permitida em virtude do tipo de conta.
    @Test(expected = OperacaoNaoPermitidaException.class)
    public void testTransferir() throws Exception {
        ContaPoupanca conta = ContaPoupanca.builder().build();
        conta.transferir(10.0, conta);
    }

}
