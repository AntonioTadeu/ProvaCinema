import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarNomeCliente() {
        Cliente cliente = new Cliente("Tadeu", "15768544590");
        assertEquals("Tadeu", cliente.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeClienteNulo() {
        try {
            Cliente cliente = new Cliente(null, "15768544590");
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoNomeClienteVazio() {
        try {
            Cliente cliente = new Cliente("", "15768544590");
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarCpfCliente() {
        Cliente cliente = new Cliente("Tadeu","15768544590");
        assertEquals("15768544590",cliente.getCpf());
    }

    @Test
    void deveRetornarExcecaoCpfClienteNulo() {
        try {
            Cliente cliente = new Cliente("Tadeu", null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoCpfClienteVazio() {
        try {
            Cliente cliente = new Cliente("Tadeu", "");
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomeCliente() {
        Cliente cliente = new Cliente("Tadeu", "15768544590");
        cliente.setNome("Antonio");
        assertEquals("Antonio", cliente.getNome());
    }

    @Test
    void deveRetornarExcecaoSetNomeClienteNulo() {
        try {
            Cliente cliente = new Cliente("Tadeu", "15768544590");
            cliente.setNome(null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetNomeClienteVazio() {
        try {
            Cliente cliente = new Cliente("Tadeu", "15768544590");
            cliente.setNome("");
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nome é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarSetNomeCPFCliente() {
        Cliente cliente = new Cliente("Tadeu", "15768544590");
        cliente.setCpf("18225986899");
        assertEquals("18225986899", cliente.getCpf());
    }

    @Test
    void deveRetornarExcecaoSetCPFClienteNulo() {
        try {
            Cliente cliente = new Cliente("Tadeu", "15768544590");
            cliente.setCpf(null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoSetCPFClienteVazio() {
        try {
            Cliente cliente = new Cliente("Tadeu", "15768544590");
            cliente.setCpf("");
            fail();
        } catch (NullPointerException e) {
            assertEquals("CPF é obrigatório", e.getMessage());
        }
    }
}