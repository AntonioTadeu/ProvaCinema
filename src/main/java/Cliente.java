public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, String cpf) {
        super(nome);
        if ((cpf == null) || (cpf.trim().equals(""))) {
            throw new NullPointerException("CPF é obrigatório");
        }
        else {
            this.cpf = cpf;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if ((cpf == null) || (cpf.trim().equals(""))) {
            throw new NullPointerException("CPF é obrigatório");
        }
        else {
            this.cpf = cpf;
        }
    }
}
