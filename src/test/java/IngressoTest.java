import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;
import org.junit.jupiter.api.Test;
import static org.easymock.EasyMock.*;

import java.rmi.ConnectIOException;

import static org.junit.jupiter.api.Assertions.*;

class IngressoTest {

    @Test
    void deveRetornarSalaIngresso() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = new Cliente("Tadeu", "19817867856");
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        assertEquals(sala, ingresso.getSala());
    }

    @Test
    void deveRetornarExcecaoSalaIngressoNula() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            Cliente cliente = new Cliente("Tadeu", "19817867856");
            Ingresso ingresso = new Ingresso(null, sessao, cliente);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sala é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarSessaoIngresso() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = new Cliente("Tadeu", "19817867856");
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        assertEquals(sessao, ingresso.getSessao());
    }

    @Test
    void deveRetornarExcecaoSessaoIngressoNula() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            Cliente cliente = new Cliente("Tadeu", "19817867856");
            Ingresso ingresso = new Ingresso(sala, null, cliente);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sessão é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarClienteIngresso() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = new Cliente("Tadeu", "19817867856");
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        assertEquals(cliente, ingresso.getCliente());
    }

    @Test
    void deveRetornarExcecaoClienteIngressoNulo() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            Cliente cliente = new Cliente("Tadeu", "19817867856");
            Ingresso ingresso = new Ingresso(sala, sessao, null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cliente é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetSalaIngresso() {
        Filme filme = new Filme("Madagascar");
        Sala sala1 = new Sala();
        Sessao sessao = new Sessao(sala1, filme);
        Cliente cliente = new Cliente("Tadeu", "19817867856");
        Ingresso ingresso = new Ingresso(sala1, sessao, cliente);
        Sala sala2 = new Sala();
        ingresso.setSala(sala2);
        assertEquals(sala2, ingresso.getSala());
    }

    @Test
    void deveRetornarExcecaoSetSalaIngressoNula() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala1 = new Sala();
            Sessao sessao = new Sessao(sala1, filme);
            Cliente cliente = new Cliente("Tadeu", "19817867856");
            Ingresso ingresso = new Ingresso(sala1, sessao, cliente);
            ingresso.setSala(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sala é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetSessaoIngresso() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao1 = new Sessao(sala, filme);
        Cliente cliente = new Cliente("Tadeu", "19817867856");
        Ingresso ingresso = new Ingresso(sala, sessao1, cliente);
        Sessao sessao2 = new Sessao(sala, filme);
        ingresso.setSessao(sessao2);
        assertEquals(sessao2, ingresso.getSessao());
    }

    @Test
    void deveRetornarExcecaoSetSessaoIngressoNula() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            Cliente cliente = new Cliente("Tadeu", "19817867856");
            Ingresso ingresso = new Ingresso(sala, sessao, cliente);
            ingresso.setSessao(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Sessão é obrigatória", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetClienteIngresso() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente1 = new Cliente("Tadeu", "19817867856");
        Ingresso ingresso = new Ingresso(sala, sessao, cliente1);
        Cliente cliente2 = new Cliente("Antonio", "19817867858");
        ingresso.setCliente(cliente2);
        assertEquals(cliente2, ingresso.getCliente());
    }

    @Test
    void deveRetornarExcecaoSetClienteIngressoNulo() {
        try {
            Filme filme = new Filme("Madagascar");
            Sala sala = new Sala();
            Sessao sessao = new Sessao(sala, filme);
            Cliente cliente = new Cliente("Tadeu", "19817867856");
            Ingresso ingresso = new Ingresso(sala, sessao, cliente);
            ingresso.setCliente(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cliente é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeClienteDoIngressoMock() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = createMock(Cliente.class);
        expect(cliente.getNome()).andReturn("Tadeu");
        replay(cliente);
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        assertEquals("Tadeu", ingresso.getNomeCliente());
    }

    @Test
    void deveRetornarCPFClienteDoIngressoMock() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Sessao sessao = new Sessao(sala, filme);
        Cliente cliente = createMock(Cliente.class);
        expect(cliente.getCpf()).andReturn("19768967545");
        replay(cliente);
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        assertEquals("19768967545", ingresso.getCpfCliente());
    }

    @Test
    void deveRetornarFilmeSessaoDoIngressoMock() {
        Filme filme = new Filme("Madagascar");
        Sala sala = new Sala();
        Cliente cliente = new Cliente("Tadeu", "19817867856");
        Sessao sessao = createMock(Sessao.class);
        expect(sessao.getFilme()).andReturn(filme);
        replay(sessao);
        Ingresso ingresso = new Ingresso(sala, sessao, cliente);
        assertEquals(filme, ingresso.getFilmeSessaoIngresso());
    }
}