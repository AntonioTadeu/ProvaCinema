public class Ingresso {
    private Sala sala;
    private Sessao sessao;
    private Cliente cliente;

    public Ingresso(Sala sala, Sessao sessao, Cliente cliente) {
        if (sala == null) {
            throw new NullPointerException("Sala é obrigatória");
        }
        else {
            if (sessao == null) {
                throw new NullPointerException("Sessão é obrigatória");
            }
            else {
                if (cliente == null) {
                    throw new NullPointerException("Cliente é obrigatório");
                } else {
                    this.sala = sala;
                    this.sessao = sessao;
                    this.cliente = cliente;
                }
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

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        if (sessao == null) {
            throw new NullPointerException("Sessão é obrigatória");
        }
        this.sessao = sessao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new NullPointerException("Cliente é obrigatório");
        }
        this.cliente = cliente;
    }
}
