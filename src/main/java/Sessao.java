import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private Sala sala;
    private Filme filme;
    private List<Ingresso> ingressos;

    public Sessao(Sala sala, Filme filme) {
        if (sala == null) {
            throw new NullPointerException("Sala é obrigatória");
        }
        else {
            if (filme == null) {
                throw new NullPointerException("Filme é obrigatório");
            }
            else {
                this.sala = sala;
                this.filme = filme;
                this.ingressos = new ArrayList<Ingresso>();
            }
        }
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        if (sala == null) {
            throw new NullPointerException("Sala é obrigatória");
        }
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getNomeFilme() {
        return this.filme.getNome();
    }

    public void setFilme(Filme filme) {
        if (filme == null) {
            throw new NullPointerException("Filme é obrigatório");
        }
        else {
            this.filme = filme;
        }
    }

    public List<Ingresso> getIngressos() {
        return this.ingressos;
    }

    public void adicionarIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }

    public void removerIngresso(Ingresso ingresso) {
        this.ingressos.remove(ingresso);
    }
}
