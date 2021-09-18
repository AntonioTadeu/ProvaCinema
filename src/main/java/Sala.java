public class Sala {
    private Sessao sessao;

    public Sala() {
    }

    public Sala(Sessao sessao) {
        this.sessao = sessao;
    }

    public Sessao getSessao() {
        if (sessao == null) {
            throw new NullPointerException("Sala não possui Sessão");
        }
        return this.sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
