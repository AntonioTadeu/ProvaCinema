import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveRetornarNomeFilme() {
        Filme filme = new Filme("Madagascar");
        assertEquals("Madagascar", filme.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeFilmeNulo() {
        try {
            Filme filme = new Filme(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomeFilmeVazio() {
        try {
            Filme filme = new Filme("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomeFilme() {
        Filme filme = new Filme("Madagascar");
        filme.setNome("Vingadores");
        assertEquals("Vingadores", filme.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomeFilmeNulo() {
        try {
            Filme filme = new Filme("Madagascar");
            filme.setNome(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeFilmeVazio() {
        try {
            Filme filme = new Filme("Madagascar");
            filme.setNome("");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }
}