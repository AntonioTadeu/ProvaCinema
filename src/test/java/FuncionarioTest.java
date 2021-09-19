import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarNomeFuncionario() {
        Funcionario funcionario = new Funcionario("Tadeu");
        assertEquals("Tadeu", funcionario.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeFuncionarioNulo() {
        try {
            Funcionario funcionario = new Funcionario(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomeFuncionarioVazio() {
        try {
            Funcionario funcionario = new Funcionario("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomeFuncionario() {
        Funcionario funcionario = new Funcionario("Tadeu");
        funcionario.setNome("Antonio");
        assertEquals("Antonio", funcionario.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomeFuncionarioNulo() {
        try {
            Funcionario funcionario = new Funcionario("Tadeu");
            funcionario.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeFuncionarioVazio() {
        try {
            Funcionario funcionario = new Funcionario("Tadeu");
            funcionario.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }
}