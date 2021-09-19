import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {

    @Test
    void deveRetornarListaVaziaDeSalasDoCinema() {
        Cinema cinema = new Cinema();
        List<Sala> lista = Arrays.asList();
        assertEquals(lista, cinema.getSalas());
    }

    @Test
    void deveRetornarListaDeSalasDoCinema() {
        Sala sala = new Sala();
        Cinema cinema = new Cinema();
        cinema.adicionarSala(sala);
        List<Sala> lista = Arrays.asList(sala);
        assertEquals(lista, cinema.getSalas());
    }

    @Test
    void deveRemoverSalaDaListaDeSalas() {
        Sala sala = new Sala();
        Cinema cinema = new Cinema();
        cinema.adicionarSala(sala);
        cinema.removerSala(sala);
        List<Sala> lista = Arrays.asList();
        assertEquals(lista, cinema.getSalas());
    }

    @Test
    void deveRetornarListaVaziaDeFuncionariosDoCinema() {
        Cinema cinema = new Cinema();
        List<Sala> lista = Arrays.asList();
        assertEquals(lista, cinema.getfuncionarios());
    }

    @Test
    void deveRetornarListaDeFuncionariosDoCinema() {
        Funcionario funcionario = new Funcionario("Tadeu");
        Cinema cinema = new Cinema();
        cinema.adicionarFuncionario(funcionario);
        List<Funcionario> lista = Arrays.asList(funcionario);
        assertEquals(lista, cinema.getfuncionarios());
    }

    @Test
    void deveRemoverFuncionarioDaListaDeFuncionarios() {
        Funcionario funcionario = new Funcionario("Tadeu");
        Cinema cinema = new Cinema();
        cinema.adicionarFuncionario(funcionario);
        cinema.removerFuncionario(funcionario);
        List<Sala> lista = Arrays.asList();
        assertEquals(lista, cinema.getfuncionarios());
    }
}