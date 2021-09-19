import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaTest {

    @Test
    void deveRetornarSessaoDaSala(){
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        sala.setSessao(sessao);
        assertEquals(sessao,sala.getSessao());
    }

    @Test
    void deveRetornarExcecaoSalaSemSessao() {
        try {
            Sala sala = new Sala();
            sala.getSessao();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sala não possui Sessão", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetSessaoDaSala(){
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao1 = new Sessao(sala, filme);
        Sessao sessao2 = new Sessao(sala, filme);
        sala.setSessao(sessao2);
        assertEquals(sessao2,sala.getSessao());
    }


}