public class Familia {

    private String encarregadoEducacao = "Pessoa";
    private String parentescoEncEducacao = "Pai";
    private String aluno = "Pessoa";

    public String getEncarregadoEducacao() {
        return encarregadoEducacao;
    }
    public void setEncarregadoEducacao(String encarregadoEducacao) {
        this.encarregadoEducacao = encarregadoEducacao;
    }
    public String getParentescoEncEducacao() {
        return parentescoEncEducacao;
    }
    public void setParentescoEncEducacao(String parentescoEncEducacao) {
        this.parentescoEncEducacao = parentescoEncEducacao;
    }
    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Familia [encarregadoEducacao=" + encarregadoEducacao + ", parentescoEncEducacao="
                + parentescoEncEducacao + ", aluno=" + aluno + "]";
    }

    public Familia() {
    }

    public Familia(String encarregadoEducacao, String parentescoEncEducacao, String aluno) {
        this.encarregadoEducacao = encarregadoEducacao;
        this.parentescoEncEducacao = parentescoEncEducacao;
        this.aluno = aluno;
    }

    public String getInfoEncEducacao(){
        return encarregadoEducacao + parentescoEncEducacao;     
    }

    public String getInfoFamilia(){
        return 0;
        
    }

    
}
