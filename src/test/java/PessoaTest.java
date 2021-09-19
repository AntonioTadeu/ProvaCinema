import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarNomePessoa() {
        Pessoa pessoa = new Pessoa("Tadeu");
        assertEquals("Tadeu", pessoa.getNome());
    }

    @Test
    void deveRetornarExcecaoNomePessoaNulo() {
        try {
            Pessoa pessoa = new Pessoa(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomePessoaVazio() {
        try {
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomePessoa() {
        Pessoa pessoa = new Pessoa("Tadeu");
        pessoa.setNome("Antonio");
        assertEquals("Antonio", pessoa.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomePessoaNulo() {
        try {
            Pessoa pessoa = new Pessoa("Tadeu");
            pessoa.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomePessoaVazio() {
        try {
            Pessoa pessoa = new Pessoa("Tadeu");
            pessoa.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }
}