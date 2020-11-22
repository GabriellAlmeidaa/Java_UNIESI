package testeinterface;

public class Pessoa implements imprimivel{
    private String nome;
    private String email;
    private String telefone;
                    
    @Override
    public void imprimir(String dados){
        Impressora imp = new Impressora("LexMark da diretoria");
        System.out.println("Imprimindo na impressora" + imp.getNomeImp());
        imp.print(dados);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da Pessoa: ").append(getNome()).append("\n");
        sb.append("Email: ").append(getEmail()).append("\n");
        sb.append("Telefone: ").append(getTelefone()).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

