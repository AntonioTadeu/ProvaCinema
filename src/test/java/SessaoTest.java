import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

class SessaoTest {

    @Test
    void deveRetornarSalaSessao() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        assertEquals(sala, sessao.getSala());
    }

    @Test
    void deveRetornarExcecaoSalaSessaoNula() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(null, filme);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sala é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetSalaSessao() {
        Filme filme = new Filme("Madagascar");
        Sala sala1 = new Sala();
        Sala sala2 = new Sala();
        Sessao sessao = new Sessao(sala1, filme);
        sessao.setSala(sala2);
        assertEquals(sala2, sessao.getSala());
    }

    @Test
    void deveRetornarExcecaoSetSalaSessaoNula() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            sessao.setSala(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sala é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarFilmeSessao() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        assertEquals(filme, sessao.getFilme());
    }

    @Test
    void deveRetornarExcecaoFilmeSessaoNulo() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Filme é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetFilmeSessao() {
        Filme filme1 = new Filme("Madagascar");
        Filme filme2 = new Filme("Vingadores");
        Sala sala1 = new Sala();
        Sessao sessao = new Sessao(sala1, filme1);
        sessao.setFilme(filme2);
        assertEquals(filme2, sessao.getFilme());
    }

    @Test
    void deveRetornarExcecaoSetFilmeSessaoNulo() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            sessao.setFilme(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Filme é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarListaVaziaDeIngressosDaSessao() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        List<Ingresso> lista = Arrays.asList();
        assertEquals(lista, sessao.getIngressos());
    }

    @Test
    void deveRetornarListaDeIngressosDaSessao() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = new Cliente("Tadeu", "19675847736");
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        sessao.adicionarIngresso(ingresso);
        List<Ingresso> lista = Arrays.asList(ingresso);
        assertEquals(lista, sessao.getIngressos());
    }

    @Test
    void deveRemoverIngressoDaListaDeIngressos() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = new Cliente("Tadeu", "19675847736");
        Ingresso ingresso1 = new Ingresso(sala, sessao, cliente);
        Ingresso ingresso2 = new Ingresso(sala, sessao, cliente);
        sessao.adicionarIngresso(ingresso1);
        sessao.adicionarIngresso(ingresso2);
        sessao.removerIngresso(ingresso1);
        List<Ingresso> lista = Arrays.asList(ingresso2);
        assertEquals(lista, sessao.getIngressos());
    }

    @Test
    void deveRetornarNomeFilmeDaSessaoMock() {
        Filme filme = createMock(Filme.class);
        expect(filme.getNome()).andReturn("Madagascar");
        replay(filme);
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        assertEquals("Madagascar", sessao.getNomeFilme());
    }
}