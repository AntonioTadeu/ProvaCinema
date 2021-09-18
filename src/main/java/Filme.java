public class Filme {
    private String nome;

    public Filme(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório");
        }
        else {
            this.nome = nome;
        }
    }
}
