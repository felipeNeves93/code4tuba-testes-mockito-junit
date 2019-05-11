package com.pd.cliente;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;

@RunWith(MockitoJUnitRunner.class)
public class PessoaFisicaServiceTest {

    @Mock
    private PessoaFisicaService pessoaFisicaService;

    @Spy
    private EnderecoServiceImpl enderecoService;

    @Before
    public void setUp() {
        // Mockando o comportamento do metodo buscar por id para retornar esse objeto pessoa
        Mockito.when(pessoaFisicaService.buscarPorId(1L)).thenReturn(PessoaFisica.builder()
                .id(1L)
                .nome("Felipe")
                .endereco(Endereco.builder().build())
                .build());
    }

    @Test
    public void testBuscarPorId() {
        var pessoaFisica = pessoaFisicaService.buscarPorId(1L);
        assertEquals(1L, pessoaFisica.getId().longValue());
        assertEquals("Felipe", pessoaFisica.getNome());
    }

    @Test
    public void testIsEnderecoCompleto() {
        // Aqui usamos o mock da classe pessoaService para retornar a pessoa que construimos no @Before
        var pessoaSemEndereco = pessoaFisicaService.buscarPorId(1L);
        assertFalse(pessoaSemEndereco.getEndereco().isEnderecoCompleto());

        // Aqui, utilizando @spy, estamos recebendo o retorno do método implmentado na classe, sem mockar seu comportamento.
        var endereco = enderecoService.buscarEnderecoPorPessoa(pessoaSemEndereco.getId());
        assertEquals(1L, endereco.getId().longValue());

        // Aproveitando da vantagem do @spy, não precisamos simular o comportamento de todos os metodos da classe,
        // e sim, apenas dos que quisermos.
        Mockito.when(enderecoService.atualizarEndereco(anyLong())).thenReturn(Endereco.builder()
                .id(100L)
                .bairro("bairro 123")
                .cep("888888")
                .cidade("Tubarão")
                .estado("Sc")
                .rua("rua teste")
                .build());

        // Aqui, mockando o comportamento do metodo atualizarEndereco, ele deve retornar o objeto com todos os campos
        // e passar no teste.
        endereco = enderecoService.atualizarEndereco(1L);
        assertEquals(100L, endereco.getId().longValue());
        assertTrue(endereco.isEnderecoCompleto());

        // Lembrando que essa opção de mockar apenas alguns metodos, é apenas possível com o @Spy.
    }

    @Test
    public void testSpy() {
        // aqui estamos usar o spy do metodo statico do mockito
        PessoaFisicaServiceImpl service = Mockito.spy(new PessoaFisicaServiceImpl());


        PessoaFisica teste = PessoaFisica.builder()
                .id(1L)
                .nome("Teste")
                .build();


        teste = service.salvar(teste);

        assertEquals(1L, teste.getId().longValue());

        // usando o mockito para retornar o objeto teste quando chamar o método buscarPorId
        Mockito.when(service.buscarPorId(any())).thenReturn(teste);

        PessoaFisica pessoaBuscada = service.buscarPorId(2L);

        assertNotNull(pessoaBuscada);
        assertEquals(1L, pessoaBuscada.getId().longValue());

    }

    @Test
    public void testMock() {
        // aqui estamos usar o mock do metodo statico do mockito
        PessoaFisicaService service = Mockito.mock(PessoaFisicaService.class);


        PessoaFisica teste = PessoaFisica.builder()
                .id(1L)
                .nome("Teste")
                .build();

        // usando o mockito para quando chamar o salvar retornar o objeto teste
        Mockito.when(service.salvar(any())).thenReturn(teste);

        teste = service.salvar(teste);

        assertEquals(1L, teste.getId().longValue());

        // novamente usando o mockito para quando chamar o buscarPorId retornar o objeto teste
        Mockito.when(service.buscarPorId(any())).thenReturn(teste);

        PessoaFisica pessoaBuscada = service.buscarPorId(2L);

        assertNotNull(pessoaBuscada);
        assertEquals(1L, pessoaBuscada.getId().longValue());

    }
}
